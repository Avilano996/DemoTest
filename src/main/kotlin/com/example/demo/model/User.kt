package com.example.demo.model

import java.time.LocalDateTime
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "usertest")
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val name: String,
    val email: String,
    val createDate: Date? = null,
    val createdAt: LocalDateTime? = LocalDateTime.now(),
    val updatedAt: LocalDateTime? = LocalDateTime.now()
)