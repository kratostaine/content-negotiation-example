package com.kratostaine.userservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ContentNegotiationExampleApplication

fun main(args: Array<String>) {
	runApplication<ContentNegotiationExampleApplication>(*args)
}
