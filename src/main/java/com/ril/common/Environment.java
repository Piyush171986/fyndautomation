package com.ril.common;

import org.apache.commons.io.IOUtils;
import org.json.JSONObject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;

public class Environment {
    private JSONObject envData;
    public final String SEGMENT=System.getProperty("segment");
    public final String ENVIRONMENT=System.getProperty("env");
    private Environment () throws IOException {
        envData = new JSONObject(IOUtils.toString(new FileInputStream("src/main/resources/env.json"),"UTF-8"));
    }
    public static Environment env;
    static {
        try {
            env = new Environment();
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
    public Map<String, Object> merchantData() {
        return envData.getJSONObject(ENVIRONMENT).getJSONObject("merchant").getJSONObject(SEGMENT).toMap();
    }
    public static void main(String[] args) throws IOException {
        JSONObject env = new JSONObject(IOUtils.toString(new FileInputStream("src/main/resources/env.json"),"UTF-8"));
        Map<String,Object> envData=env.getJSONObject("sit").getJSONObject("merchant").getJSONObject("institution").toMap();
        System.out.print(envData);
    }

}
