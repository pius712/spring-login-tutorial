package com.example.springlogintutorial.controller.request

import com.example.springlogintutorial.domain.CreateUserRequest

data class RegisterRequestDto(
    val userId: String,
    val password:String
) {
    fun toRequest() :CreateUserRequest{
        return CreateUserRequest(
            userId,
            password
        )
    }
}