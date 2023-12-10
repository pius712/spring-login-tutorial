package com.example.springlogintutorial

//@Component
//class CustomAuthProvider : AuthenticationProvider {
//    override fun authenticate(authentication: Authentication?): Authentication {
//
//        val username = authentication?.name
//        val password = authentication?.credentials
//
//
//        // TODO: user detail service, password encoder 가 처리해야함.
//        if (("user1" == username) and ("user1Password" == password)) {
//            return UsernamePasswordAuthenticationToken(username, password, listOf())
//        } else {
//            throw RuntimeException("hRahahaha")
//        }
//    }
//
//    override fun supports(authentication: Class<*>?): Boolean {
//        return true
//    }
//}