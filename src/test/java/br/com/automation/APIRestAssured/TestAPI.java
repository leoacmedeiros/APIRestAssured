package br.com.automation.APIRestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import static org.hamcrest.Matchers.*;
import org.junit.Test;


public class TestAPI {
	
	@Test
	public void Teste() {
	String uriBase = "https://postman-echo.com/get";
	
	given() 	// dado
		.relaxedHTTPSValidation()
		.param("foo1", "bar1")
		.param("foo2", "bar2")
		
	.when()		//quando
		.get(uriBase)
	 
	.then()		//então
		.statusCode(200) // O status http retornado foi 200
		.contentType(ContentType.JSON) // O response foi retornado no formato JSON
		.body("headers.host", is("postman-echo.com")) // A chave "host" possui exatamente o valor "postman-echo.com"
		.body("args.foo1", containsString("bar")); //A chave "foo1" contém o valor "bar"
	}

}
