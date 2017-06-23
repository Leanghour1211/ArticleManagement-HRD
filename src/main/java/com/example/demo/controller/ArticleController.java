/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;

import com.example.demo.model.Article;
import com.example.demo.service.ArticleService;
import javax.validation.Valid;
import javax.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author User
 */
@Controller
public class ArticleController {
    private ArticleService articleService;
    @Autowired
    public ArticleController(ArticleService articleService)
    {
        this.articleService=articleService;
    }
    @RequestMapping(value="/")
    public String index()
    {
        return "redirect:/articles";
    }
    @RequestMapping(value="/articles")
    public String articles(ModelMap model)
    {
        model.addAttribute("articles",articleService.getAllArticles());
        return "articles";
    }
    @GetMapping("/articles/view")
    public String articledetails(ModelMap model,@PathParam("id") Integer id)
    {
        Article article=articleService.getArticle(id);
        model.addAttribute("article", article);
        return "articledetail";
    }
    @GetMapping("/articles/remove")
    public String removeArticle(@PathParam("id") Integer id)
    {
        articleService.removeArticle(id);
        return "redirect:/articles";
    }
    @GetMapping("/articles/add")
    public String addnewArticle(Article article, ModelMap model)
    {
        Article art=new Article();
        int id=1;
        if(articleService.getAllArticles().size()>0){
        id= articleService.getAllArticles().get(articleService.getAllArticles().size()-1).getId()+1;
        }
        art.setId(id);
        model.addAttribute("article",art);
        model.addAttribute("addStatus", true);
        return "saveArticle";
    }
    @PostMapping("/articles/saves")
    public String saveArticle(@Valid Article article,BindingResult result,ModelMap model)
    {
        if(result.hasErrors())
        {
            System.out.println("Error Binding");
            model.addAttribute("addStatus",true);
            return "saveArticle";
        }
        if(articleService.addArticle(article))
        {
            System.out.println("Success!");
        }
        return "redirect:/articles";
    }
    @PostMapping("/articles/updates") 
    public String updateArticle(@Valid Article article,BindingResult result, ModelMap model)
    {
       if(result.hasErrors())
        {
            System.out.println("Error Binding");
            model.addAttribute("addStatus", false);
            model.addAttribute("article",article);
            return "saveArticle";
        }
        if(articleService.updateArticle(article))
        {
            System.out.println("Success!");
        }
        return "redirect:/articles";
    }
    @GetMapping("/articles/update")
    public String updatenewArticle(Article article,@PathParam("id") Integer id,ModelMap model)
    {
        model.addAttribute("article",articleService.getArticle(id));
        model.addAttribute("addStatus",false);
        return "saveArticle";
    }
    
    
}
