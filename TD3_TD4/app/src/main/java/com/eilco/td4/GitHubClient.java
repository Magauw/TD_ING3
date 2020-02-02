package com.eilco.td4;

import com.eilco.td4.RepoList;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GitHubClient {

    @GET("users/{username}/repos")
    Call<List<RepoList>> UserRepositories(@Path("username") String userName);
}
