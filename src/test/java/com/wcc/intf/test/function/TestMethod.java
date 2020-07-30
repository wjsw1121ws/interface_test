package com.wcc.intf.test.function;


import com.alibaba.fastjson.JSON;
import org.testng.annotations.Test;

public class TestMethod {

    @Test
    public void testJson(){
        String jsonStr = "{\n" +
                "    \"employees\": [\n" +
                "        {\n" +
                "            \"firstName\": \"Bill\",\n" +
                "            \"lastName\": \"Gates\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"firstName\": \"George\",\n" +
                "            \"lastName\": \"Bush\"\n" +
                "        },\n" +
                "    ]\n" +
                "}";
        String s = JSON.parseObject(jsonStr).toString();
        System.out.println(s);
    }
}
