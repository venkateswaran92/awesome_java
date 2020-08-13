package com.venkat.OpenFeign.restClient;

import java.io.IOException;
import java.util.List;
import retrofit2.Call;
import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;

import retrofit2.http.GET;
import retrofit2.http.Path;


//https://github.com/OpenFeign/feign

public final class ServiceClient {
	public static final String API_URL = "https://api.github.com";

	public static class Contributor {
		public final String login;
		public final int contributions;

		public Contributor(String login, int contributions) {
			this.login = login;
			this.contributions = contributions;
		}
	}

	public interface GitHub {
		@GET("/repos/{owner}/{repo}/contributors")
		Call<List<Contributor>> contributors(@Path("owner") String owner, @Path("repo") String repo);
	}

	public static void main(String... args) throws IOException {
		// Create a very simple REST adapter which points the GitHub API.
		Retrofit retrofit = new Retrofit.Builder().baseUrl(API_URL).addConverterFactory(GsonConverterFactory.create())
				.build();

		GitHub github = retrofit.create(GitHub.class);

		Call<List<Contributor>> call = github.contributors("square", "retrofit");

	
		List<Contributor> contributors = call.execute().body();
		for (Contributor contributor : contributors) {
			System.out.println(contributor.login + " (" + contributor.contributions + ")");
		}
	}
}