/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;

import com.example.demo.model.Article;
import com.example.demo.service.ArticleService;
import com.github.javafaker.Faker;
import javax.validation.Valid;
import javax.validation.constraints.Past;
import javax.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
//    @RequestMapping("/fillfakedatas")
//    @ResponseBody
//    public String fillfakedata()
//    {
//        for(int i=1;i<=60;i++)
//        {
//            Faker faker=new Faker();
//            Article art=new Article();
//            art.setId(i);
//            art.setTitle(faker.book().title());
//            art.setDescription(faker.lorem().sentences(1).toString());
//            art.setAuthor(faker.book().author());
//            art.setThumbnail(faker.internet().image());
//            articleService.addArticle(art);
//        }
//        return "success full";
//    }
    @RequestMapping(value="/")
    public String index()
    {
        return "redirect:/articles";
    }
    @RequestMapping(value="/articles")
    public String articles(ModelMap model)
    {
//        model.addAttribute("articles",articleService.getAllArticles());
//        return "articles";
        return "redirect:/articles/go?page=1";
    }
    @GetMapping("/articles/view")
    public String articledetails(ModelMap model,@PathParam("id") Integer id)
    {
        Article article=articleService.getArticle(id);
        model.addAttribute("article", article);
        return "articledetail";
    }
    @GetMapping("/articles/remove")
    public String removeArticle(@PathParam("id") Integer id,@PathParam("page") Integer page)
    {
        articleService.removeArticle(id);
        return "redirect:/articles/go?page="+page;
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
    public String updateArticle(@Valid Article article,BindingResult result,@PathParam("page") Integer page, ModelMap model)
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
        return "redirect:/articles/go?page="+page;
    }
    @GetMapping("/articles/update")
    public String updatenewArticle(Article article,@PathParam("id") Integer id,@PathParam("page") Integer page,ModelMap model)
    {
        model.addAttribute("article",articleService.getArticle(id));
        model.addAttribute("addStatus",false);
        model.addAttribute("page",page);
        return "saveArticle";
    }
    @GetMapping("/articles/go")
    public String getViews(@PathParam("page") Integer page,ModelMap model)
    {
        int maxpage=(int)articleService.getAllArticles().size()/5;
        if(articleService.getAllArticles().size()%5!=0)maxpage++;
        model.addAttribute("articles",articleService.getArticles(5,page));
        model.addAttribute("maxpage",maxpage);
        model.addAttribute("page",page);
        return "articles";
    }
    
}
