package services;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class LoadUserData {

	public List<UserData> getAuthorData(int page) throws Exception {
		List<UserData> users = new ArrayList<>();
		try {
			//make a get request to the url
			URL url = new URL("https://jsonmock.hackerrank.com/api/article_users/search?page="+page);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");
			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed with te error code: " + conn.getResponseCode());
			}
			
			BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String readLine;
			StringBuffer data = new StringBuffer();
			while ((readLine = in .readLine()) != null) {
                data.append(readLine);
            } in .close();
            
            //convert the data returned to json object
            JSONObject obj = new JSONObject(data.toString());
            //extract data array from the object
            JSONArray arr = obj.getJSONArray("data");
            
            for(int i=0; i < arr.length(); i++) {
            	// creating Date from millisecond
        		Date currentDate = new Date((int) arr.getJSONObject(i).get("created_at"));
            	users.add(new UserData((int) arr.getJSONObject(i).get("id"), arr.getJSONObject(i).get("username").toString(), arr.getJSONObject(i).get("about").toString(), (int) arr.getJSONObject(i).get("submitted"), arr.getJSONObject(i).get("updated_at").toString(), (int) arr.getJSONObject(i).get("submission_count"), (int) arr.getJSONObject(i).get("comment_count"), currentDate));
            }
			

		} catch (Exception e) {
			throw new Exception("Exception occurs:- " + e);
		}
		
		return users;
	}
}
