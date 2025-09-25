package es.unizar.webeng.hello.controller

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.mockito.Mockito.*
import org.springframework.context.MessageSource
import org.springframework.ui.ConcurrentModel
import java.util.*

class HelloControllerUnitTests {

    @Test
    fun `welcome returns default message`() {
        val messageSource = mock(MessageSource::class.java)
        val controller = HelloController(messageSource)
        val model = ConcurrentModel()
        val locale = Locale.getDefault()

        // Mock para mensaje por defecto
        `when`(messageSource.getMessage("app.default", null, locale))
            .thenReturn("Welcome to the Modern Web App!")

        val viewName = controller.welcome(model, "", locale)

        assertEquals("welcome", viewName)
        assertEquals("Welcome to the Modern Web App!", model.getAttribute("message"))
        assertEquals("", model.getAttribute("name"))
    }

    @Test
    fun `welcome returns personalized message`() {
        val messageSource = mock(MessageSource::class.java)
        val controller = HelloController(messageSource)
        val model = ConcurrentModel()
        val locale = Locale.getDefault()

        // Mock para mensaje personalizado
        `when`(messageSource.getMessage("app.greeting", arrayOf("Dev"), locale))
            .thenReturn("Hello, Dev!")

        val viewName = controller.welcome(model, "Dev", locale)

        assertEquals("welcome", viewName)
        assertEquals("Hello, Dev!", model.getAttribute("message"))
        assertEquals("Dev", model.getAttribute("name"))
    }
}