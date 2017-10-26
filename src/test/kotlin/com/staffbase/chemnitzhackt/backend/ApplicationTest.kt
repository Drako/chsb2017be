package com.staffbase.chemnitzhackt.backend

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext
import org.springframework.test.context.junit.jupiter.SpringExtension
import kotlin.test.assertTrue

@ExtendWith(SpringExtension::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class ApplicationTest {
  @field:Autowired
  private lateinit var ctx: ApplicationContext

  @Test
  @DisplayName("DI context contains required beans")
  fun contextHasRequiredBeans() {
    assertTrue(ctx.containsBean("application"))
  }
}
