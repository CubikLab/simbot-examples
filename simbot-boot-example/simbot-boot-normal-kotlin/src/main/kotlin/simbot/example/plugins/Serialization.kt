package simbot.example.plugins

import io.ktor.application.*
import io.ktor.gson.*
import io.ktor.features.*

fun Application.configureSerialization() {
    install(ContentNegotiation) {
        gson {
            setPrettyPrinting()
            disableHtmlEscaping()
        }
    }
}
