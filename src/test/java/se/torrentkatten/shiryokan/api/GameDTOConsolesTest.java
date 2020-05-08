package se.torrentkatten.shiryokan.api;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;
import se.torrentkatten.shiryokan.datastore.DataStore;

import javax.inject.Inject;
import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class GameDTOConsolesTest {

    @Inject
    DataStore dataStore;
    private static Jsonb jsonb = JsonbBuilder.create();

    @Test
    public void testHelloEndpoint() {
        given()
                .when().get("/shiryo-kan/api/consoles")
                .then()
                .statusCode(200)
                .body(is(jsonb.toJson(dataStore.findAllGameConsoles())));
    }


}