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

    // CriteriaBuilder 선언
    private val criteriaBuilder = sessionFactory.criteriaBuilder

    override fun findById(id: Long): Mono<Customer> {
        val query = criteriaBuilder.createQuery(Customer::class.java)
        val from = query.from(Customer::class.java)
        val idEquals = criteriaBuilder.equal(from.get<Long>("id"), id)

        query.select(from)
            .where(idEquals)

        val future = sessionFactory.withSession { session ->
            session.createQuery(query).singleResult
        }.toCompletableFuture()

        return Mono.fromFuture(future)
    }
}