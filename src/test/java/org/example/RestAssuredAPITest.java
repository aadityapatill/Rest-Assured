package org.example;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RestAssuredAPITest {

    @Test
    public void GetBooksDetails() {
        RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.request(Method.GET, "");
        System.out.println("Status received => " + response.getStatusLine());
        System.out.println("Response=>" + response.prettyPrint());

    }

    @Test
    public void GetWeatherDetailsCondensed()
    {
        RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get("");
        System.out.println("Response Body is =>  " + response.asString());
    }

    @Test
    public void GetBookDetails()
    {
        RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get("");
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode /*actual value*/, 200 /*expected value*/,
                "Correct status code returned");
    }

    @Test
    public void GetPetDetails()
    {
        RestAssured.baseURI = "https://demoqa.com/Account/v1/User/";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get("test");
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode /*actual value*/, 401 /*expected value*/,
                "Correct status code returned");
    }
}