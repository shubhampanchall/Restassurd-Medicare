package Medicare;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class Get2 {
	
public static void main(String[] args) {
		
		
		RestAssured.baseURI="http://localhost:8081/medicare/show/category/2/products";
		
		
	   String Response= given().log().all().headers("Connection","keep-alive").when().get().then()
		.statusCode(200).extract().response().asString();
	   
	   // Validate response body contains "Analgesics" using JSON path
	   
       if (Response.contains("Analgesics")) {
           System.out.println("Response contains 'Analgesics'");
       } else {
           System.out.println("Response does not contain 'Analgesics'");
       }
	   System.out.println("Status code =200");
	   
		System.out.println(Response);
}

}
