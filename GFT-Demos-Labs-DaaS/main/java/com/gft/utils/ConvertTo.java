package com.gft.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

import org.json.JSONArray;
import org.json.JSONObject;

public class ConvertTo {

	public void stringFromFile() {
		String fileName = System.getProperty("user.dir").concat("/src/main/resources/com/gft/files/results.json");
		String content = "";
		try {
			content = Files.lines(Paths.get(fileName)).collect(Collectors.joining("\n"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		JSONArray jsonA = new JSONArray(content);
		System.out.println(jsonA.length());

		for (int i = 0; i < jsonA.length(); i++) {
			JSONObject jsonObject = new JSONObject(jsonA.get(i).toString().replaceAll("\\{\\}", ""));
			String errors = jsonObject.getJSONArray("Errors").toString().replaceAll("\\[", "").replaceAll("\"", "")
					.replaceAll("\\]", "");
			System.out.println(jsonObject.getString("File") + "\t" + errors + "\t" + jsonObject.getInt("Lines") + "\t"
					+ jsonObject.getInt("TotalFileSize"));
			String file = jsonObject.optString("File");
			int lines = jsonObject.optInt("Lines");
			int totalFileSize = jsonObject.optInt("TotalFileSize");

		}
	}
	
}
