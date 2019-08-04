package com.qa.base;

import java.io.IOException;

import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import restAPITest.TestBase;

public class BasePage extends TestBase {

    public HttpClient client = HttpClientBuilder.create().build();

    public HttpResponse getRequest(String Url) throws IOException {

        System.out.println("URL : -> " + Url);
        HttpGet get = new HttpGet(Url);
        get.addHeader(HttpHeaders.CONTENT_TYPE, "application/json");
        return client.execute(get);
    }

}
