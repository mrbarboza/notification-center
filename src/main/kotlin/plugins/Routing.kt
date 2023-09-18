package com.mrbarboza.plugins

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/health") {
            call.respond(HttpStatusCode.OK, "Ok")
        }

        route("/api") {
            route("v1") {}
        }
    }
}