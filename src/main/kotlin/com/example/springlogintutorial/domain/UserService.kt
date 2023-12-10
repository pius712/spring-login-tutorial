package com.example.springlogintutorial.domain

import com.example.springlogintutorial.storage.UserEntity
import com.example.springlogintutorial.storage.UserRepository
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Service
class UserService(
    private val userRepository: UserRepository
) {

    @Transactional
    fun register(createUserRequest: CreateUserRequest): Long {
        val existingUser = userRepository.findByUserId(createUserRequest.id)
        if (existingUser != null) {
            throw RuntimeException("이미 회원가입")
        }

        return userRepository.save(UserEntity(createUserRequest.id, createUserRequest.password)).id!!
    }

    init {

        userRepository.save(UserEntity("user2", "user2Password"))
    }
}