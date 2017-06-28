/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;

import com.example.demo.model.Article;
import java.util.List;

/**
 *
 * @author User
 */
public interface ArticleService {
    List<Article> getAllArticles();
    Article getArticle(int id);
    boolean removeArticle(int id);
    boolean addArticle(Article article);
    boolean updateArticle(Article article);
    List<Article> getArticles(int limit,int page);
    int getMaxpage(int limit);
    
}
