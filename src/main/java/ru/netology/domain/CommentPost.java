package ru.netology.domain;

public class CommentPost {
    private String commentPost;
    private String replyCommentPost;
    private boolean shouldCloseCommentPost;
    private boolean shouldOpenCommentPost;

    public String getCommentPost() {
        return commentPost;
    }

    public void setCommentPost(String commentPost) {
        this.commentPost = commentPost;
    }

    public String getReplyCommentPost() {
        return replyCommentPost;
    }

    public void setReplyCommentPost(String replyCommentPost) {
        this.replyCommentPost = replyCommentPost;
    }

    public boolean isShouldCloseCommentPost() {
        return shouldCloseCommentPost;
    }

    public void setShouldCloseCommentPost(boolean shouldCloseCommentPost) {
        this.shouldCloseCommentPost = shouldCloseCommentPost;
    }

    public boolean isShouldOpenCommentPost() {
        return shouldOpenCommentPost;
    }

    public void setShouldOpenCommentPost(boolean shouldOpenCommentPost) {
        this.shouldOpenCommentPost = shouldOpenCommentPost;
    }
}
