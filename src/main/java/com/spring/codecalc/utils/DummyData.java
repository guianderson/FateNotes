package com.spring.codecalc.utils;

import com.spring.codecalc.model.Post;
import com.spring.codecalc.repository.CodeblogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class DummyData {

    @Autowired
    CodeblogRepository codeblogRepository;

    //Esta classe criar estes valores no banco, se estiver ativa, no caso como está comentada
    // não vai criar, para ativar a classe, basta descomentar a linha de baixo
    //@PostConstruct
    public void savePosts(){
        List<Post> postList = new ArrayList<>();
        Post post1 = new Post();
        post1.setAutor("Guilherme Anderson");
        post1.setData(LocalDate.now());
        post1.setTitulo("Inserção Teste");
        post1.setTexto("Primeira inserção - insersão teste");

        Post post2 = new Post();
        post2.setAutor("Guilherme Anderson");
        post2.setData(LocalDate.now());
        post2.setTitulo("Inserção Teste 2");
        post2.setTexto("Segunda inserção - insersão teste");

        postList.add(post1);
        postList.add(post2);

        for (Post post: postList){
            Post postSaved = codeblogRepository.save(post);
            System.out.println(postSaved.getId());
        }

    }
}
