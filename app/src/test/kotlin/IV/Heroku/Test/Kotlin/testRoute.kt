
package Heroku.Kotlin

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.DisplayName

import io.ktor.application.*
import io.ktor.http.*
import io.ktor.server.testing.*
import kotlin.test.*

class TestRoute {

    @Test
    @DisplayName("Test MainPage")
    fun testMainPage() = withTestApplication(Application::module) {
        with (
            handleRequest(HttpMethod.Get, "/")
        ) {
            assertEquals(response.content, "Despliegue funcionando !!")
        }
    }

}