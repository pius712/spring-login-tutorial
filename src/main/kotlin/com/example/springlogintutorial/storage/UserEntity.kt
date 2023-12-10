package com.example.springlogintutorial.storage

import jakarta.persistence.Entity

@Entity
data class UserEntity(
    val userId:String,
    val userPassword:String
): BaseEntity()
