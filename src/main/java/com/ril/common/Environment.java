package com.ril.common;

import netscape.javascript.JSObject;
import org.json.JSONObject;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Environment {
    private JSONObject env;
//we need jason dependency to read
    private Environment () throws FileNotFoundException {
         env = new JSONObject(new FileReader("src/main/resources/env.json"));
    }
    public static Environment envVariables;

    static {
        try {
            envVariables = new Environment();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
    public JSONObject getEnvData() {
        return this.env;
    }
    public String getSegment(){
        return System.getProperty("segment");
    }
}
