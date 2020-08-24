package ru.netology.domain;

public class AttachmentPost {
    private String imagePost;
    private String videoPost;
    private String audioPost;
    private String articlePost;
    private String documentPost;


    public String getImagePost() {
        return imagePost;
    }

    public void setImagePost(String imagePost) {
        this.imagePost = imagePost;
    }

    public String getVideoPost() {
        return videoPost;
    }

    public void setVideoPost(String videoPost) {
        this.videoPost = videoPost;
    }

    public String getAudioPost() {
        return audioPost;
    }

    public void setAudioPost(String audioPost) {
        this.audioPost = audioPost;
    }

    public String getArticlePost() {
        return articlePost;
    }

    public void setArticlePost(String articlePost) {
        this.articlePost = articlePost;
    }

    public String getDocumentPost() {
        return documentPost;
    }

    public void setDocumentPost(String documentPost) {
        this.documentPost = documentPost;
    }
}
