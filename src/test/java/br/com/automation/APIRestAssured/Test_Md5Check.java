package br.com.automation.APIRestAssured;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import org.junit.Test;


public class Test_Md5Check {
	
	
	@Test
	public void test_Md5CheckSumForTest() {
	    
	    String originalText = "test";
	    String expectedMd5CheckSum = "098f6bcd4621d373cade4e832627b4f6";
	        
	    given().
	        param("text",originalText).
	    when().
	        get("http://md5.jsontest.com").
	    then().
	        assertThat().
	        body("md5",equalTo(expectedMd5CheckSum));
	}

}
