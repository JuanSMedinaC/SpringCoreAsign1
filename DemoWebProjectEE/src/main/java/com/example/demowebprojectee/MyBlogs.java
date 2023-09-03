package com.example.demowebprojectee;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("blog")
public class MyBlogs {
    @Value("blog.icesi.edu.co")
    private String blogName;
    public String getBlogName() {
        return blogName;
    }

    public void setBlogName(String blogName) {
        this.blogName = blogName;
    }
}
