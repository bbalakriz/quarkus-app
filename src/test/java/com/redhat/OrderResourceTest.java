package com.redhat;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class OrderResourceTest {

    @Test
    public void testHelloEndpoint() {
        given().when().get("/order/getAll").then().statusCode(200);

    }

}