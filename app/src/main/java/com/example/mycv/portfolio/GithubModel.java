package com.example.mycv.portfolio;

import com.google.gson.annotations.SerializedName;

public class GithubModel {
    @SerializedName("name")
    private String nameRepo;

    @SerializedName("html_url")
    private String linkGithub;

    @SerializedName("language")
    private String languageRepo;

    @SerializedName("created_at")
    private String createdAtRepo;

    public String getNameRepo() {
        return nameRepo;
    }

    public String getLinkGithub() {
        return linkGithub;
    }

    public String getLanguageRepo() {
        return languageRepo;
    }

    public String getCreatedAtRepo() {
        return createdAtRepo;
    }
}
