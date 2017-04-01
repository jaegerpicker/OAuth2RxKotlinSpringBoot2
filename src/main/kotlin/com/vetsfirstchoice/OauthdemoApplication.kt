package com.vetsfirstchoice

import javafx.application.Application
import org.slf4j.LoggerFactory
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.boot.CommandLineRunner


@SpringBootApplication
class OauthdemoApplication{
    private val log = LoggerFactory.getLogger(Application::class.java)

}

fun main(args: Array<String>) {
    SpringApplication.run(OauthdemoApplication::class.java, *args)
}
