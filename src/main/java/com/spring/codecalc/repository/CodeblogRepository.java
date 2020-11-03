package com.spring.codecalc.repository;

import com.spring.codecalc.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository faz com que métodos, como create, deleat, select, update, não precisem ser criados manualmente, pois
// este método já faz este trabalho
public interface CodeblogRepository extends JpaRepository<Post, Long> {

}
