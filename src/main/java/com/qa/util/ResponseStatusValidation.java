package com.qa.util;

import org.apache.http.HttpResponse;
import org.apache.http.util.Asserts;

public class ResponseStatusValidation {

	 private static int getStatusCode(HttpResponse response){

	        int statusCode = 0;
	        if(null != response){
	            return response.getStatusLine().getStatusCode();
	        }
	        return statusCode;
	    }

	 
	 public static void getStatusValidation(HttpResponse response){

	        int EXPECTED = 200;
	        System.out.println("Response Code: " + response.getStatusLine().getStatusCode());
	        Asserts.check(getStatusCode(response) == EXPECTED,"Response Code Mismatch. Expected %s code, actual %s code. ",
	                EXPECTED,getStatusCode(response));
	    }
}
