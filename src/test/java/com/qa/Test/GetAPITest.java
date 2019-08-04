package com.qa.Test;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.BasePage;
import com.qa.util.ResponseStatusValidation;
import com.qa.util.UrlFormatter;

import restAPITest.TestBase;

public class GetAPITest extends BasePage {

	TestBase testBase;
	UrlFormatter urlFormat=new UrlFormatter();
	ResponseStatusValidation responseStatus=new ResponseStatusValidation();
	String URL;
	String serviceURL;
	String apiURL;
	String longitude;
	String latitude;
	String apiKey;
	String postalUrl;
	String postalCode;
	
	@BeforeMethod
	public void setUp() throws ClientProtocolException, IOException {
		testBase = new TestBase();

		serviceURL = prop.getProperty("URL");
		apiURL = prop.getProperty("locationUrl");
		longitude = prop.getProperty("longitude"); 
		latitude = prop.getProperty("latitude");
		apiKey = prop.getProperty("apiKey");
		postalUrl = prop.getProperty("postalUrl");
		postalCode = prop.getProperty("postalCode");

	}

	@Test
	public void getApiByLonandLat() throws ClientProtocolException, IOException {
		String URL=UrlFormatter.readUrlByLonAndLat(serviceURL, apiURL, longitude, latitude,apiKey);

	        HttpResponse response = getRequest(URL);
	        ResponseStatusValidation.getStatusValidation(response);

	    }
	@Test
	public void getApiByPostalCode() throws ClientProtocolException, IOException {
		String URL=UrlFormatter.readUrlByPostalCode(serviceURL, apiURL, postalUrl, postalCode, apiKey);

	        HttpResponse response = getRequest(URL);
	        ResponseStatusValidation.getStatusValidation(response);

	    }
		
	}
