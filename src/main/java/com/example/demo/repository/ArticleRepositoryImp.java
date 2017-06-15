/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.repository;

import com.example.demo.model.Article;
import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author User
 */
@Repository
public class ArticleRepositoryImp implements ArticleRepository{

    private List<Article> articles=new ArrayList<Article>();
    public ArticleRepositoryImp()
    {

        for(int i=1;i<=20;i++)
        {   Faker faker=new Faker();
            Article art=new Article();
            art.setId(i);
            art.setTitle(faker.book().title());
            art.setDescription(faker.lorem().sentences(1).toString());
            art.setAuthor(faker.book().author());
            art.setThumbnail(faker.internet().image());
            articles.add(art);
        }
    }
    @Override
    public List<Article> getAllArticles() {
        List<Article> tmp=articles;
        return tmp;
    }

    @Override
    public Article getArticle(int id) {
        for(Article art:getAllArticles())
        {
            if(art.getId()==id)
            {
                return art;
            }
        }
        return null;
    }

    @Override
    public boolean removeArticle(int id) {
        for(Article art:this.articles)
        {
            if(art.getId()==id)
            {
                articles.remove(art);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean addArticle(Article article) {
        return this.articles.add(article);
        
    }

    @Override
    public boolean updateArticle(Article article) {
        for(int i=0;i<articles.size();i++)
        {
            if(articles.get(i).getId()==article.getId())
            {
                articles.set(i, article);
                return true;
            }
        }
        return false;
    }
    
}
