package com.wcc.intf.utils;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import java.net.URI;

public class BaseGetUtils {
    public void doGet(String path,String params){
        //创建HttpClient对象
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        //请求路径'
        URI uri = null;

    }
}
