package com.example.springlogintutorial

import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.stereotype.Component

@Component
class SecurityUserService(
    private val userCredentialReader: UserCredentialReader
) : UserDetailsService {
    override fun loadUserByUsername(username: String): UserDetails {
        val userCredential = userCredentialReader.readByUserId(username)

        return SecurityUserDetails(
            userCredential.userId,
            userCredential.userPassword
        )
    }
}