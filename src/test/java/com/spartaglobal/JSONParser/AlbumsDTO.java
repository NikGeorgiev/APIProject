package com.spartaglobal.JSONParser;

import java.util.Map;

public class AlbumsDTO {

    private int userId;
    private int id;
    private String title;
    private Map<String, Integer> Albums;

    public Map<String, Integer> getAlbums() {
        return Albums;
    }

    public void setAlbums(Map<String, Integer> albums) {
        Albums = albums;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
