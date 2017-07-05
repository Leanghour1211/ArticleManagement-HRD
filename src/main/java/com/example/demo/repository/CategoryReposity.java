/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.repository;

import com.example.demo.model.Category;
import java.util.List;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 *
 * @author User
 */
@Repository
public interface CategoryReposity {
    @Select("Select * from category order by id asc")
    List<Category> getAllCategory();
    
}
