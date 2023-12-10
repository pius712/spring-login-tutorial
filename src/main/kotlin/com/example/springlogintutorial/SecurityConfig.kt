package com.example.springlogintutorial

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.crypto.password.NoOpPasswordEncoder
import org.springframework.security.crypto.password.PasswordEncoder

//@EnableWebSecurity
@Configuration
class SecurityConfig(
    private val securityUserService: SecurityUserService
) {


//    @Bean
//    fun filterChain(httpSecurity: HttpSecurity):SecurityFilterChain {
////        httpSecurity.csrf()
//        httpSecurity
//            .authorizeHttpRequests {
//                it.requestMatchers("/admin/**")
//                    .permitAll()
//                    .anyRequest()
//                    .authenticated()
//            }
//            .formLogin().loginPage()
//
//        return httpSecurity.build()
//            .authorizeRequests()
//            .antMatchers("/admin/**")
//            .hasRole("ADMIN")
//            .antMatchers("/anonymous*")
//            .anonymous()
//            .antMatchers("/login*")
//            .permitAll()
//            .anyRequest()
//            .authenticated()
//            .and()
//    }

//    @Bean
//    fun encryptor():PasswordEncoder {
//        return BCryptPasswordEncoder()
//    }


    // NOTE: 요거는 암호화가 없는 테스트 버전
    @Bean
    fun encryptor(): PasswordEncoder {
        return NoOpPasswordEncoder.getInstance()
    }
}