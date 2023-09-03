package com.example.demowebprojectee;

public class Arte {
    private String art_id;
    private String art_title;
    private String artista_name;

    public Arte(){
        art_id="";
        art_title="";
        artista_name="";
    }

    public Arte(String art_id, String art_title, String artista_name){
        this.art_id=art_id;
        this.art_title=art_title;
        this.artista_name=artista_name;
    }

    public String getArt_id() {
        return art_id;
    }

    public void setArt_id(String art_id) {
        this.art_id = art_id;
    }

    public String getArt_title() {
        return art_title;
    }

    public void setArt_title(String art_title) {
        this.art_title = art_title;
    }

    public String getArtista_name() {
        return artista_name;
    }

    public void setArtista_name(String artista_name) {
        this.artista_name = artista_name;
    }

    @Override
    public String toString() {
        return art_id +": "+art_title+"-"+artista_name;
    }
}
