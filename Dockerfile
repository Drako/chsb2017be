FROM gradle:jdk8-alpine AS builder
RUN mkdir backend
WORKDIR /home/gradle/backend
COPY build.gradle ./
COPY src src/
RUN gradle build


FROM openjdk:8-jre-alpine AS runner
WORKDIR /root/
COPY --from=builder /home/gradle/backend/build/libs/backend.jar ./backend.jar
CMD java -jar backend.jar
EXPOSE 8080

