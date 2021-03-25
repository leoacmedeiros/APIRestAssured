package br.com.automation.APIRestAssured;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import org.junit.Test;

public class CircuitoEspecifico {
	
	//https://techbeacon.com/app-dev-testing/how-perform-api-testing-rest-assured
	
	@Test
	public void verificaCircuitoEspecifico() {
	        
	    given().
	    when().
	    	get("http://ergast.com/api/f1/2017/2/circuits.json").
	    then().
	    	assertThat().body("MRData.CircuitTable.season", equalTo("2017")). 
	    and().
	    	assertThat().body("MRData.CircuitTable.round", equalTo("2"));	
	}

}
