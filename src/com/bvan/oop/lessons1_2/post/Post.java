package com.bvan.oop.lessons1_2.post;

import java.util.ArrayList;

/**
 * @author bvanchuhov
 */
public class Post {

    // fields

    private final String content;
    private final String author;
    private int likes;
    private final ArrayList<String> comments = new ArrayList<>();

    // constructors

    public Post(String content, String author, int likes) {
        checkLikes(likes);

        this.content = content;
        this.author = author;
        this.likes = likes;
    }

    private void checkLikes(int likes) {
        if (likes < 0) {
            throw new IllegalArgumentException("negative number of likes: " + likes);
        }
    }

    public Post(String content, String author) {
        this(content, author, 0);
    }

    // interface + implementations

    public void like() {
        likes++;
    }

    public String show() {
        return "\"" + content + "\" by " + author + ", "
                + likes + " likes, comments: " + comments;
    }

    public void addComment(String comment) {
        comments.add(comment);
    }

    // Getters

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }

    public int getLikes() {
        return likes;
    }

    public ArrayList<String> getComments() {
        return new ArrayList<>(comments);
    }

    // Post -> String

    @Override
    public String toString() {
        return "Post{" +
                "content='" + content + '\'' +
                ", author='" + author + '\'' +
                ", likes=" + likes +
                '}';
    }
}
