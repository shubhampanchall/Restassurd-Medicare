package Medicare;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
public class Get {
	
	
	public static void main(String[] args) {
		
		
		RestAssured.baseURI="http://localhost:8081/medicare/show/all/products";
		
		
	   String Response= given().log().all().headers("Accept","*/*").when().get().then()
		.statusCode(200).extract().response().asString();
	   
	   
	   System.out.println("Status code =200");
	   
		System.out.println(Response);
		
			
	}

}
