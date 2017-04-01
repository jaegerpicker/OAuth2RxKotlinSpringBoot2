package com.vetsfirstchoice.routes

/**
 * Created by scampbell on 3/31/17.
 */
import com.vetsfirstchoice.handlers.*
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.DependsOn
import org.springframework.core.io.ClassPathResource
import org.springframework.http.MediaType.TEXT_HTML
import org.springframework.web.reactive.function.server.*
import org.springframework.web.reactive.function.server.RouterFunctions.resources
import reactor.core.publisher.toMono

@Configuration
class WebsiteRouter(val rootHandler: RootHandler) {
    @Bean
    fun websiteHTMLRouter() = router {
        accept(TEXT_HTML).nest {
            GET("/", rootHandler::root)
        }
    }.filter { request, next ->
        next.handle(request).then { response -> response.toMono()}
    }

    @Bean
    @DependsOn("websiteHTMLRouter")
    fun resourceRouter() = resources("/**", ClassPathResource("static/"))
}