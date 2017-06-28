/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.repository;

import com.example.demo.model.Article;
import java.util.List;
import org.apache.ibatis.annotations.*;


import org.springframework.stereotype.Repository;

/**
 *
 * @author User
 */
@Repository
public interface ArticleRepository
{
   
    @Select("Select id,title,description,author,thumbnail from articles order by id asc")
    List<Article> getAllArticles();
    @Select("Select id,title,description,author,thumbnail from articles where id=#{id}")
    Article getArticle(int id);
    @Delete("Delete from articles where id=#{id}")
    boolean removeArticle(@Param("id") int id);
    @Insert("Insert into articles(id,title,description,author,thumbnail) values(#{id},#{title},#{description},#{author},#{thumbnail})")
    boolean addArticle(Article article);
    @Update("Update articles set title=#{title},description=#{description},author=#{author},thumbnail=#{thumbnail} where id=#{id}")
    boolean updateArticle(Article article);
    @Select("Select id,title,description,author,thumbnail from articles order by id asc limit #{limit} offset #{offset}")
    List<Article> getArticles(@Param("limit")int limit,@Param("offset")int offset);
}
