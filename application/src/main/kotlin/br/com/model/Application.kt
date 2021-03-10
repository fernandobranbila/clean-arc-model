package br.com.model

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["br.com.model"])
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}


