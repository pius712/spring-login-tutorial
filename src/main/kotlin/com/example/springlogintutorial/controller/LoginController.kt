package com.example.springlogintutorial.controller

import com.example.springlogintutorial.controller.request.RegisterRequestDto
import com.example.springlogintutorial.domain.UserService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/user")
class LoginController(
    private val userService: UserService
) {

    @PostMapping("/registration")
    fun register(@RequestBody dto:RegisterRequestDto) {
        userService.register(dto.toRequest())
    }
}