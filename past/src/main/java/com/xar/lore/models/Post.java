package com.xar.lore.models;

import com.google.firebase.database.Exclude;

import java.util.HashMap;
import java.util.Map;

public class Post {

	public String uid;
	public String author;
	public String title;
	public String body;
	public int starCount = 0;
	public Map<String, Boolean> stars = new HashMap<>();

	public Post() {
		// Required empty constructor
	}

	public Post(String uid, String author, String title, String body) {
		this.uid = uid;
		this.author = author;
		this.title = title;
		this.body = body;
	}

	// [Start post to map]
	@Exclude
	public Map<String, Object> toMap() {
		HashMap<String, Object> result = new HashMap<>();
		result.put("uid", uid);
		result.put("author", author);
		result.put("title", title);
		result.put("body", body);
		result.put("starCount", starCount);
		result.put("stars", stars);

		return result;
	}
	// [End post to map]
}
