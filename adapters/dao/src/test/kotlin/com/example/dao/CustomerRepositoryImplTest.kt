package com.example.dao

import com.example.repository.CustomerRepository
import io.kotest.common.runBlocking
import kotlinx.coroutines.reactor.awaitSingleOrNull
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
internal class CustomerRepositoryImplTest @Autowired constructor(
    private val customerRepository: CustomerRepository
) {

    @Test
    @DisplayName("findById 테스트")
    fun testFindById(): Unit = runBlocking {
        val id = 1L
        val result = customerRepository.findById(id).awaitSingleOrNull()

        assertNotNull(result)
        result?.let {
            assertEquals(result.id, id)
        }

        println(result)
    }
}