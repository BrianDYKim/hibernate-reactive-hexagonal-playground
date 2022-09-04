package com.example.domain.entity

import javax.persistence.*

@Entity
@Table(name = "customer")
data class Customer(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Long? = null,
    var name: String,
    var email: String
)