package br.com.automation.APIRestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.junit.Test;
import io.restassured.http.ContentType;

public class ValorResposta200 {

	@Test
	public void verificaValorResposta() {
		
		 given().
		    when().
		        get("http://ergast.com/api/f1/2017/circuits.json").
		    then().
		        assertThat().
		        statusCode(200).
		    and().
		        contentType(ContentType.JSON).
		    and().
		        header("Content-Length",equalTo("4551"));
	}
}
