package com.spring.codecalc.service.serviceImplement;

import com.spring.codecalc.model.Post;
import com.spring.codecalc.repository.CodeblogRepository;
import com.spring.codecalc.service.CodeblogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodeblogServiceImplement implements CodeblogService {

    @Autowired
    CodeblogRepository codeblogRepository;

    @Override
    public List<Post> findAll() {
        return codeblogRepository.findAll();
    }

    @Override
    public Post findById(long id) {
        return codeblogRepository.findById(id).get();
    }

    @Override
    public Post save(Post post) {
        return codeblogRepository.save(post);
    }

    @Override
    public void delete(Post post) {
        codeblogRepository.delete(post);
    }


}
