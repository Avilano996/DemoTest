package com.example.demo.resource

import com.example.demo.model.User
import com.example.demo.service.UserService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/v1/api/usertest")
class UserResource(private val userService: UserService) {

    @GetMapping
    fun getUsers(): List<User> =
            userService.getUsers()

    @PostMapping
    fun addUser(@RequestBody user: User): ResponseEntity<User> =
            userService.addUser(user)

    @GetMapping("/{id}")
    @ExceptionHandler
    fun getUserById(@PathVariable(value = "id") userId: Long): ResponseEntity<User> =
            userService.getUserById(userId)

    @PutMapping("/{id}")
    fun updateUserById(
            @PathVariable(value = "id") userId: Long,
            @RequestBody newUser: User): ResponseEntity<User> =
            userService.putUser(userId, newUser)

    @DeleteMapping("/{id}")
    fun deleteUser(@PathVariable(value = "id") userId: Long): ResponseEntity<Void> =
            userService.deleteUser(userId)
}