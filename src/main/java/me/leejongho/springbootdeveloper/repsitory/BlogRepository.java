package me.leejongho.springbootdeveloper.repsitory;

import me.leejongho.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
