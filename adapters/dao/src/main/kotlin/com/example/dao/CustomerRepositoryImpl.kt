package com.example.dao

import com.example.domain.entity.Customer
import com.example.repository.CustomerRepository
import org.hibernate.reactive.stage.Stage
import org.springframework.stereotype.Repository
import reactor.core.publisher.Mono

@Repository
class CustomerRepositoryImpl(
    private val sessionFactory: Stage.SessionFactory
) : CustomerRepository {

    override fun findById(id: Long): Mono<Customer> {
        TODO("To be implemented!")
    }
}