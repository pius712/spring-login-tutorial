package com.example.springlogintutorial.storage

import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<UserEntity, Long> {

    fun findByUserId(userId:String): UserEntity?
}