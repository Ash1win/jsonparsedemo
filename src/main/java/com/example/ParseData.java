package com.example;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ParseData {
    public static void main(String[] args) throws IOException {
        String content = new String(Files.readString(Paths.get("F:/","intellijWorkspace", "jsonparsedemo", "data1.json")));
        JSONArray arr = new JSONArray(content);
        for(int i=0;i<arr.length();i++){
            JSONObject obj = arr.getJSONObject(i);
            String firstName = obj.getString("first_name");
            String lastName = obj.getString("last_name");
            System.out.println("name "+firstName+" "+lastName);
            JSONObject addressObj = obj.getJSONObject("address");
            String city = addressObj.getString("city");
            int zipcode = addressObj.getInt("zipcode");
            System.out.println(city+" "+zipcode);
        }
    }
}
