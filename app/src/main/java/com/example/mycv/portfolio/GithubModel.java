package com.example.mycv.portfolio;

import com.google.gson.annotations.SerializedName;

public class GithubModel {
    @SerializedName("name")
    private String nameRepo;

    @SerializedName("html_url")
    private String linkGithub;

    public String getNameRepo() {
        return nameRepo;
    }

    public String getLinkGithub() {
        return linkGithub;
    }
}
