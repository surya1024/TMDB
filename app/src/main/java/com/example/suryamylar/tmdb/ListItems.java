package com.example.suryamylar.tmdb;

/**
 * Created by suryamylar on 7/14/15.
 */
public class ListItems {
    private String title;
    private String thumbnail;
    private String url;
    private String date;
    private Float rating;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail ="https://image.tmdb.org/t/p/w92/"+ thumbnail;
    }

    public String getUrl(){
        return url;
    }

    public void setUrl(String url) {
        this.url ="http://www.themoviedb.org/movie/"+ url;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date){
        this.date = date;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = Float.parseFloat(rating);
        this.rating=this.rating/2;
    }

}
