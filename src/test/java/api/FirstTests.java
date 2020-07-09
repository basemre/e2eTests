package api;

import api.BaseTest;
import org.json.simple.JSONObject;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class FirstTests extends BaseTest {

    @BeforeTest
    public void setUp(){
        utilRequest();
        utilResponse();
    }

    @Test
    public void StatusCheckTest(){
        given().
                spec(REQUEST).
                when().
                get("/2").
                then().
                spec(RESPONSE);
    }
    @Test
    public void ShouldCreateAUser(){
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("name", "morpheus");
        jsonObj.put("job", "leader");
        given().
                spec(REQUEST).
                and().body(jsonObj.toJSONString()).
                post().
                then().
                statusCode(201);
    }

}
