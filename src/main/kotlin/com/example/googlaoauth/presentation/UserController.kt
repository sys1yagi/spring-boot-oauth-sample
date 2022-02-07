package com.example.googlaoauth.presentation

import org.springframework.beans.factory.annotation.Value
import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.security.oauth2.core.user.OAuth2User
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*


@RestController
class UserController(
    @Value("\${sample.controller.hello.message}")
    val message: String
) {
    @GetMapping("/user")
    fun user(@AuthenticationPrincipal principal: OAuth2User): Map<String, Any?>? {
        return Collections.singletonMap("name", message + " " + principal.getAttribute("name"))
    }

}
