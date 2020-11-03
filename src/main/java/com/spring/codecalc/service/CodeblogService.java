package com.spring.codecalc.service;

import com.spring.codecalc.model.Post;
import org.hibernate.sql.Delete;

import java.util.List;

public interface CodeblogService {
    List<Post> findAll();
    Post findById(long id);
    Post save(Post post);
    void delete(Post post);
}
