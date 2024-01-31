package UsingJavaNet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class API_Automation {

	public void GetMethodAutomation() throws IOException {

		URL url = new URL("https://dummy.restapiexample.com/api/v1/employees");
		HttpURLConnection connection = (HttpURLConnection)url.openConnection();
		connection.setRequestMethod("GET");
		connection.connect();

		int statuscode = connection.getResponseCode();
		System.out.println(statuscode);
		String message = connection.getResponseMessage();
		System.out.println(message);

		InputStream inputstream = connection.getInputStream();
		InputStreamReader inputstreamreader = new InputStreamReader(inputstream);
		BufferedReader bufferreader = new BufferedReader(inputstreamreader);
		String readline;
		StringBuffer buffer = new StringBuffer();
		while((readline = bufferreader.readLine())!=null)
		{
			buffer.append(readline);
		}
		System.out.println(buffer);
	}

	public void PostMethodExample() throws IOException
	{
		URL url = new URL("https://dummy.restapiexample.com/api/v1/create");
		HttpURLConnection connection = (HttpURLConnection)url.openConnection();
		connection.setRequestMethod("POST");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);
		String jsonBody = "{\"name\":\"Hema\",\"salary\":\"25000000\",\"age\":\"2\"}";
		byte[] Inputjson = jsonBody.getBytes();
		OutputStream outputstream = connection.getOutputStream();
		outputstream.write(Inputjson);
		System.out.println(connection.getResponseCode());
		System.out.println(connection.getResponseMessage());

		InputStream inputstream = connection.getInputStream();
		InputStreamReader inputstreamreader = new InputStreamReader(inputstream);
		BufferedReader bufferreader = new BufferedReader(inputstreamreader);
		String readline;
		StringBuffer buffer = new StringBuffer();
		while((readline = bufferreader.readLine())!=null)
		{
			buffer.append(readline);
		}
		System.out.println(buffer);
	}

	public void putrequest() throws IOException 
	{
		URL url = new URL("https://dummy.restapiexample.com/api/v1/update/5481");
		HttpURLConnection connection = (HttpURLConnection)url.openConnection();
		connection.setRequestMethod("PUT");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);
		String jsonBody = "{\"name\":\"Hema\",\"salary\":\"25000000\",\"age\":\"25\"}";
		byte[] Inputjson = jsonBody.getBytes();
		OutputStream outputstream = connection.getOutputStream();
		outputstream.write(Inputjson);
		System.out.println(connection.getResponseCode());
		System.out.println(connection.getResponseMessage());

		InputStream inputstream = connection.getInputStream();
		InputStreamReader inputstreamreader = new InputStreamReader(inputstream);
		BufferedReader bufferreader = new BufferedReader(inputstreamreader);
		String readline;
		StringBuffer buffer = new StringBuffer();
		while((readline = bufferreader.readLine())!=null)
		{
			buffer.append(readline);
		}
		System.out.println(buffer);
	}
	public void DeleteRequest() throws IOException
	{
		URL url = new URL("https://dummy.restapiexample.com/api/v1/delete/5481");
		HttpURLConnection connection = (HttpURLConnection)url.openConnection();
		connection.setRequestMethod("DELETE");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);
		
		System.out.println(connection.getResponseCode());
		System.out.println(connection.getResponseMessage());

		InputStream inputstream = connection.getInputStream();
		InputStreamReader inputstreamreader = new InputStreamReader(inputstream);
		BufferedReader bufferreader = new BufferedReader(inputstreamreader);
		String readline;
		StringBuffer buffer = new StringBuffer();
		while((readline = bufferreader.readLine())!=null)
		{
			buffer.append(readline);
		}
		System.out.println(buffer);
		
	}
	public static void main(String[] args) throws IOException
	{
		API_Automation automation = new API_Automation();
		//automation.GetMethodAutomation();
		//automation.PostMethodExample();
		//automation.putrequest();
		automation.DeleteRequest();

	}

}
