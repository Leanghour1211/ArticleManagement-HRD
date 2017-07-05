/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller.restController;

import com.example.demo.model.Article;
import com.example.demo.model.Category;
import com.example.demo.model.filter.ArticleFilter;
import com.example.demo.service.ArticleService;
import com.example.demo.service.CategoryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author User
 */
@RestController
public class restArticle {
    @Autowired
    private ArticleService articleService;  
    @Autowired
    private CategoryService categoryService;
    
    @GetMapping("/rest/articles")
    public List<Article> getAllArticles()
    {
        return articleService.getAllArticles();
    }
    @GetMapping("/rest/articles/get")
    public List<Article> getFilteredArticles(ArticleFilter filter)
    {
        return articleService.getFilteredArticles(filter);
    }
    @GetMapping("/rest/categories")
    public List<Category> getAllCategories()
    {
        return categoryService.getAllCategory();
    }
//    public List<Article> getFilterArticlesAt()
//    {
//        return articleService;
//    };
}
