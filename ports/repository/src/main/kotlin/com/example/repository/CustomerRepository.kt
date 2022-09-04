package com.example.repository

import com.example.domain.entity.Customer
import org.springframework.stereotype.Repository
import reactor.core.publisher.Mono

@Repository
interface CustomerRepository {

    /** find the customer using customer's id
     * @param id customer's id
     * @return Mono<Customer>
     */
    fun findById(id: Long): Mono<Customer>
}