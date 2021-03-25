package br.com.automation.APIRestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

public class QuantidadeCircuitos {
	
	@Test
	public void verificaSeHa20Circuitos() {
	        
	    given().
	    when().
	    	get("http://ergast.com/api/f1/2017/circuits.json").
	    then().
	    	assertThat().
	    	body("MRData.CircuitTable.Circuits.circuitId",hasSize(20)).
	    and().
	    	assertThat().body("MRData.CircuitTable.season", equalTo("2017"));
	}
	
}
