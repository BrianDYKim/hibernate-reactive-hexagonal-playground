package com.example.dao.config

import org.hibernate.reactive.stage.Stage
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component
import javax.persistence.EntityManagerFactory
import javax.persistence.Persistence
import javax.persistence.criteria.CriteriaBuilder

@Component
class HibernateConfig {

    // entityManagerFactory
    @Bean
    fun entityManagerFactory(): EntityManagerFactory {
        return Persistence.createEntityManagerFactory("hibernate-reactive-example")
    }

    // criteriaBuilder
    @Bean
    fun criteriaBuilder(entityManagerFactory: EntityManagerFactory): CriteriaBuilder {
        return entityManagerFactory.criteriaBuilder
    }

    // session factory
    @Bean
    fun sessionFactory(entityManagerFactory: EntityManagerFactory): Stage.SessionFactory {
        return entityManagerFactory
            .unwrap(Stage.SessionFactory::class.java)
    }
}