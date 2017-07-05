/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;

import com.example.demo.model.Category;
import com.example.demo.repository.CategoryReposity;
import java.util.List;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author User
 */

@Service
public class CategoryServiceImp implements CategoryService {

    @Autowired
    private CategoryReposity categoryReposity;
    @Override
    public List<Category> getAllCategory() {
        return categoryReposity.getAllCategory();
    }
    
}
