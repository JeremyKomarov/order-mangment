package com.firstProject.model;

public class ShowResponse {
    private String showUrl;
    private String showName;

    public ShowResponse(String showUrl, String showName) {
        this.showUrl = showUrl;
        this.showName = showName;
    }

    public String getShowUrl() {
        return this.showUrl;
    }

    public String getShowName() {
        return this.showName;
    }

    public void setShowUrl(String showUrl) {
        this.showUrl = showUrl;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }
}
