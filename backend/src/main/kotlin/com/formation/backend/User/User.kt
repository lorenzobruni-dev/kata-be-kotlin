package com.formation.backend.User

import jakarta.persistence.*

@Entity
@Table(name = "user")
data class User(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,
    @Column(name = "user_name", unique = true, nullable = false)
    val userName: String,
    @Column(name = "password", nullable = false)
    val password: String,
    @Column(name = "email_user", nullable = false)
    val emailUser: String,
)
