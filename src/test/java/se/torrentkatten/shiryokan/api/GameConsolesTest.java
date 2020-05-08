package se.torrentkatten.shiryokan.api;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class GameConsolesTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/api/shiryokan/consoles")
          .then()
             .statusCode(200)
             .body(is("hello2"));
    }

}