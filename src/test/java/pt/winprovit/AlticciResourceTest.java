package pt.winprovit;

import io.quarkus.test.junit.QuarkusTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

import io.restassured.response.Response;
import pt.winprovit.validation.AlticciValidator;

@QuarkusTest
public class AlticciResourceTest {

    @Test
    public void testGet() {
        Response response = given()
                .when().get("/alticci/2");
        response.then().statusCode(200);
        assertEquals("2", 
            response.jsonPath().getString("n"));
        assertEquals("1", 
            response.jsonPath().getString("result"));
    }

    @Test
    public void testGetUsingInvalidValue() {
        Response response = given()
                .when().get("/alticci/-10");
        response.then().statusCode(412);
        assertTrue(
            AlticciValidator.ONLY_POSITIVE_NUMBER_ARE_ALLOWED.equalsIgnoreCase(
                response.jsonPath().getString("message")),
            String.format("%s equals, ignoring case, to %s", 
                AlticciValidator.ONLY_POSITIVE_NUMBER_ARE_ALLOWED,
                response.jsonPath().getString("message"))
          );
    }

}