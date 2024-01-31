package UsingJavaNet;


import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class Unirest_Example {

	public void getRequest() throws UnirestException
	{
		HttpResponse<JsonNode> JsonResponse =  Unirest.get("https://dummy.restapiexample.com/api/v1/employees").asJson();
		System.out.println(JsonResponse.getStatus());
		System.out.println(JsonResponse.getStatusText());
		System.out.println(JsonResponse.getBody());
	}

	public void PostRequest() throws UnirestException
	{
		HttpResponse<JsonNode> JsonResponse =Unirest.post("https://dummy.restapiexample.com/api/v1/create").body("\"{\\\"name\\\":\\\"Hemasri\\\",\\\"salary\\\":\\\"25000000\\\",\\\"age\\\":\\\"2\\\"}\"").asJson();
		System.out.println(JsonResponse.getStatus());
		System.out.println(JsonResponse.getStatusText());
		System.out.println(JsonResponse.getBody()); //39
	}

	public void PutRequest() throws UnirestException
	{
		HttpResponse<JsonNode> JsonResponse = Unirest.put("https://dummy.restapiexample.com/api/v1/update/39").body("\"{\\\"name\\\":\\\"Hemasri\\\",\\\"salary\\\":\\\"25000000\\\",\\\"age\\\":\\\"25\\\"}\"").asJson();;
		System.out.println(JsonResponse.getStatus());
		System.out.println(JsonResponse.getStatusText());
		System.out.println(JsonResponse.getBody()); 
	}
	
	public void DeleteRequest() throws UnirestException
	{
		HttpResponse<JsonNode> JsonResponse = Unirest.delete("https://dummy.restapiexample.com/api/v1/delete/39").asJson();
		System.out.println(JsonResponse.getStatus());
		System.out.println(JsonResponse.getStatusText());
		System.out.println(JsonResponse.getBody()); 
	}



	public static void main(String[] args) throws UnirestException {
		// TODO Auto-generated method stub

		Unirest_Example example = new Unirest_Example();
		//example.getRequest();
		//example.PostRequest();
		//example.PutRequest();
		example.DeleteRequest();
	}
}
