package com.geekforgeeks.problemsolutions.others;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Result {

	/*
	 * 
	 * Complete the 'getArticleTitles' function below.
	 * 
	 * 
	 * 
	 * The function is expected to return a STRING_ARRAY.
	 * 
	 * The function accepts STRING author as parameter.
	 * 
	 * 
	 * 
	 * Base urls:
	 * 
	 * https://jsonmock.hackerrank.com/api/article_users?username=
	 * 
	 * https://jsonmock.hackerrank.com/api/articles?author=
	 * 
	 * 
	 * 
	 */

	public static List<String> getArticleTitles(String author) {

		String url1 = String.format("https://jsonmock.hackerrank.com/api/article_users?username=%s", author);

		String response1 = getData(url1);

		List<String> articleTitles = new ArrayList<>();

		Pattern aboutPattern = Pattern.compile("\"about\".*:.*\"(?<about>.*)\",\"submitted\"");

		Matcher abouMatcher = aboutPattern.matcher(response1);

		String about = "";

		while (abouMatcher.find()) {

			about = abouMatcher.group("about");

			if (about != null) {

				articleTitles.add(about);

			}

		}

		String url2 = String.format("https://jsonmock.hackerrank.com/api/articles?author=%s", author);

		String response2 = getData(url2);

		// System.out.println(response2);

		Pattern titlePattern = Pattern.compile(
				"(?:\\\"|\\')([^\"]*)(?:\\\"|\\')(?=:)(?:\\:\\s*)(?:\\\")?(true|false|[-0-9]+[\\.]*[\\d]*(?=,)|[0-9a-zA-Z\\(\\)\\@\\:\\,\\/\\!\\+\\-\\.\\$\\ \\\\\\'“”’]*)(?:\\\")?");

		Matcher titleMatcher = titlePattern.matcher(response2);

		String title = "";

		while (titleMatcher.find()) {

			title = titleMatcher.group(1);

			if (title.equals("title")) {

				if (titleMatcher.group(2) != null) {

					articleTitles.add(titleMatcher.group(2));

				}

			}

		}

		return articleTitles;

	}

	public static String getData(String urlString) {

		String response = "";

		try {

			URL url = new URL(urlString);

			HttpURLConnection connection = (HttpURLConnection) url.openConnection();

			connection.setRequestMethod("GET");

			connection.setRequestProperty("Accept", "application/json");

			if (connection.getResponseCode() != 200) {

				throw new RuntimeException("Failed: HTTP error code:" + connection.getResponseCode());

			}

			BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));

			String line = "";

			while ((line = br.readLine()) != null) {

				response += line;

			}

			br.close();

		} catch (IOException ex2) {

			ex2.printStackTrace();

		}

		return response;

	}

}