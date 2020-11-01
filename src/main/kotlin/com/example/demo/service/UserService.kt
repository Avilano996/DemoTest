package com.example.demo.service

import com.example.demo.model.User
import com.example.demo.repository.UserRepository
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity

import org.springframework.stereotype.Service

@Service
class UserService(private val userRepository: UserRepository) {
    fun getUsers(): List<User> =
            userRepository.findAll()

    fun addUser(user: User): ResponseEntity<User> =
            ResponseEntity.ok(userRepository.save(user))

    fun getUserById(userId: Long): ResponseEntity<User> =
            userRepository.findById(userId).map { user ->
                ResponseEntity.ok(user)
            }.orElse(ResponseEntity.notFound().build())

    fun putUser(userId: Long, newUser: User): ResponseEntity<User> =
            userRepository.findById(userId).map { currentUser ->
                val updatedUser: User =
                        currentUser
                                .copy(
                                        id = newUser.id,
                                        name = newUser.name,
                                        email = newUser.email,
                                        createDate = newUser.createDate
                                )
                ResponseEntity.ok().body(userRepository.save(updatedUser))
            }.orElse(ResponseEntity.notFound().build())

    fun deleteUser(userId: Long): ResponseEntity<Void> =
            userRepository.findById(userId).map { user ->
                userRepository.delete(user)
                ResponseEntity<Void>(HttpStatus.ACCEPTED)
            }.orElse(ResponseEntity.notFound().build())
}