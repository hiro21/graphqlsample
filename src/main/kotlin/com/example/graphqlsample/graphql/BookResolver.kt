package com.example.graphqlsample.graphql

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component

@Component
class BookResolver: GraphQLQueryResolver {
    fun bookById(id: String): Book {
        return Book(
                id = id,
                name = "test"
        )
    }
}