/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;

import com.example.demo.model.filter.ArticleFilter;
import com.example.demo.service.ArticleService;
import com.example.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author User
 */
@Controller
public class AjaxController {
    @Autowired
    private ArticleService articleService;
    @Autowired
    private CategoryService categoryService;
    @GetMapping("/articles/filter/")
    public String getDefault()
    {
        return "redirect:/articles/filter/go?page=1";
    }
    @GetMapping("/articles/filter/go")
    public String getFiltered(ArticleFilter articleFilter,ModelMap model)
    {
        if(articleFilter.getPage()>articleService.getFilteredMaxpage(articleFilter))articleFilter.setPage(articleService.getFilteredMaxpage(articleFilter));
        else if(articleFilter.getPage()<=0)
            articleFilter.setPage(1);
        model.addAttribute("categories",categoryService.getAllCategory());
        model.addAttribute("articles", articleService.getFilteredArticles(articleFilter));
        model.addAttribute("maxpage",articleService.getFilteredMaxpage(articleFilter));
        model.addAttribute("articleFilter",articleFilter);
        return "articlesSearch";
    }
}
