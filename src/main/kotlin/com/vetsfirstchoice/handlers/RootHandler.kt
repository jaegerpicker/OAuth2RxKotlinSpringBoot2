package com.vetsfirstchoice.handlers

import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.BodyInserters
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.ServerResponse.ok
import reactor.core.publisher.Mono

/**
 * Created by scampbell on 3/31/17.
 */

@Component
class RootHandler {
    fun root(req: ServerRequest) = ok().body(BodyInserters.fromObject("Hello World!"))
}