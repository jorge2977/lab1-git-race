package es.unizar.webeng.hello.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.MessageSource
import org.springframework.http.MediaType
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.*

// Web controller for handling web requests
@Controller
class HelloController(
    @Autowired private val messageSource: MessageSource
) {
    
    // Handle GET requests to the root URL
    @GetMapping("/")
    fun welcome(
        model: Model,
        @RequestParam(defaultValue = "") name: String,
        locale: Locale
    ): String {
        val greeting = if (name.isNotBlank()) {
            messageSource.getMessage("app.greeting", arrayOf(name), locale)
        } else {
            messageSource.getMessage("app.default", null, locale)
        }

        model.addAttribute("message", greeting)
        model.addAttribute("name", name)
        return "welcome"
    }
}

@RestController
class HelloApiController(
    @Autowired private val messageSource: MessageSource
) {

    // Handle GET requests to /api/hello
    @GetMapping("/api/hello", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun helloApi(
        @RequestParam(defaultValue = "") name: String,
        locale: Locale
    ): Map<String, String> {
        if (name.isBlank()) {
            throw IllegalArgumentException("name parameter is required")
        }
        val greeting = messageSource.getMessage("app.greeting", arrayOf(name), locale)
        return mapOf(
            "message" to greeting,
            "timestamp" to java.time.Instant.now().toString()
        )
    }
}

@RestController
class ByeApiController(
    @Autowired private val messageSource: MessageSource
) {

    // Handle GET requests to /api/bye
    @GetMapping("/api/bye", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun byeApi(
        @RequestParam(defaultValue = "") name: String,
        locale: Locale
    ): Map<String, String> {
        if (name.isBlank()) {
            throw IllegalArgumentException("name parameter is required")
        }
        val bye = messageSource.getMessage("app.bye", arrayOf(name), locale)
        return mapOf(
            "message" to bye,
            "timestamp" to java.time.Instant.now().toString()
        )
    }
}
