package com.example.demowebprojectee;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
public class MyBlogs {
    private String blogName;

    public MyBlogs() {
        this.blogName = "blog.icesi.edu.co";
    }

    public MyBlogs(String blogName) {
        this.blogName = blogName;
    }

    public String getBlogName() {
        return blogName;
    }

    public void setBlogName(String blogName) {
        this.blogName = blogName;
    }
}
