/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;

import com.example.demo.model.Article;
import com.example.demo.repository.ArticleRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author User
 */
@Service
public class ArticleServiceImp implements ArticleService{

    private ArticleRepository articleRepository;
    @Autowired
    public ArticleServiceImp(ArticleRepository articleRepository)
    {
        this.articleRepository=articleRepository;
    }
    @Override
    public List<Article> getAllArticles() {
        List<Article> tmp=
        articleRepository.getAllArticles();
        return tmp;
    }

    @Override
    public Article getArticle(int id) {
        return articleRepository.getArticle(id);
    }

    @Override
    public boolean removeArticle(int id) {
       return articleRepository.removeArticle(id);
    }

    @Override
    public boolean addArticle(Article article) {
        return articleRepository.addArticle(article);
    }

    @Override
    public boolean updateArticle(Article article) {
        return articleRepository.updateArticle(article);
    }

    @Override
    public List<Article> getArticles(int limit, int page) {
        int maxpage=getMaxpage(limit);
        if(limit<5)limit=5;
        if(page<1)page=1;
        page--;
        if(page>maxpage)page=maxpage;
        return articleRepository.getArticles(limit, page*limit);
    }

    @Override
    public int getMaxpage(int limit) {
        int maxpage=(int)getAllArticles().size()/limit;
        if(getAllArticles().size()%5!=0)maxpage++;
        return maxpage;
    }
    
}
