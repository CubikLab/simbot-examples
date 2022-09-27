package simbot.example

import simbot.example.plugins.configureRouting
import simbot.example.plugins.configureSerialization
import io.ktor.server.engine.*
import io.ktor.server.cio.*
import love.forte.simboot.core.*

@SimbootApplication
class Main

suspend fun main(args: Array<String>) {
    embeddedServer(CIO, port = 8080, host = "127.0.0.1") {
        configureRouting()
        configureSerialization()
    }.start(wait = false)
    SimbootApp.run(Main::class, *args).join()
}
