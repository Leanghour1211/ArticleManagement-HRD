/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;

import com.example.demo.service.ArticleService;
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
    @GetMapping("/ajax/articles")
    public String getFiltered(ModelMap model)
    {
        model.addAttribute("category_id", 0);
        model.addAttribute("title", "");
        return "articlesFilter";
    }
}
