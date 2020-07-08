import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class BaseTest {
    public static RequestSpecification REQUEST;
    public static ResponseSpecification RESPONSE;
    public static void utilRequest(){
        REQUEST=new RequestSpecBuilder().
                setBaseUri("https://reqres.in/api").
                setBasePath("/users").
                build();
    }
    public static void utilResponse(){
        RESPONSE=new ResponseSpecBuilder().
                expectStatusCode(200).
                expectContentType(ContentType.JSON).
                build();
    }
}
