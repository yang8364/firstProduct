package com.etoak.util;

import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;

public class JsonUtil {
	
	public static String getListToJson(List<String> list){
		JSONObject json = new JSONObject();
		try {
			json.append("state", "200");
			if(list != null && list.size() > 0){
				json.append("json", list);
			}
			return json.toString();
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
}
