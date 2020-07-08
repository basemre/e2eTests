import com.sun.org.apache.regexp.internal.RE;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class FirstTests extends BaseTest{

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
