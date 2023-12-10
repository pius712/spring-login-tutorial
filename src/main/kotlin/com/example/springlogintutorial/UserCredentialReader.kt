package com.example.springlogintutorial

import com.example.springlogintutorial.storage.UserRepository
import org.springframework.stereotype.Component

@Component
class UserCredentialReader(private val userRepository: UserRepository) {


    fun readByUserId(userId: String): UserCredential {
        val found = userRepository.findByUserId(userId) ?: throw RuntimeException("oo")
        return UserCredential(
            found.userId,
            found.userPassword,
        )
    }
}