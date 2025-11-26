package com.firstProject.tvMaze;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.firstProject.model.ShowResponse;

public class TVMazeResponse {

    @JsonProperty("id")
    private Long tvShowId;

    @JsonProperty("url")
    private String imageUrl;

    private String name;

    public TVMazeResponse() {
    }

    public TVMazeResponse(Long tvShowId, String imageUrl, String name) {
        this.tvShowId = tvShowId;
        this.imageUrl = imageUrl;
        this.name = name;
    }

    public Long getTvShowId() {
        return this.tvShowId;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public ShowResponse toShowResponse() {
        return new ShowResponse(
                this.imageUrl,
                this.name
        );
    }
}
