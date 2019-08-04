package com.qa.util;

public class UrlFormatter {
	
	
    private static StringBuffer actualUrl = new StringBuffer();

    public static String readUrlByLonAndLat(String baseUrl,String serviceUrl,String longitude ,String latitude,String apiKey){

        actualUrl.setLength(0);
        return actualUrl.append(baseUrl).append(serviceUrl).append("lat=").append(longitude).append("&lon=").append(latitude).append("&").append(apiKey).toString();
        

    }
    
    public static String readUrlByPostalCode(String baseUrl,String serviceUrl,String postalUrl ,String postalCode, String apiKey){

        actualUrl.setLength(0);
        return actualUrl.append(baseUrl).append(serviceUrl).append(postalUrl).append(postalCode).append("&").append(apiKey).toString();
        

    }
}
