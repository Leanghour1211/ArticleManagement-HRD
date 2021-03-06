/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.repository;

import com.example.demo.model.Article;
import com.example.demo.model.filter.ArticleFilter;
import com.example.demo.repository.provider.ArticleProvide;
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
   
//    @Select("Select id,title,description,author,thumbnail from articles order by id asc")
    @SelectProvider(method = "getAllArticles",type = ArticleProvide.class)
            @Results({
                @Result(property = "category.id",column = "category_id"),
                @Result(property = "category.name",column = "name")
            })
    List<Article> getAllArticles();
    //@Select("Select id,title,description,author,thumbnail from articles where id=#{id}")
    @SelectProvider(method = "getArticle",type = ArticleProvide.class)
            @Results({
                @Result(property = "category.id",column = "category_id"),
                @Result(property = "category.name",column = "name")
            })
    Article getArticle(@Param("id")int id);
    @Delete("Delete from articles where id=#{id}")
    boolean removeArticle(@Param("id") int id);
    @Insert("Insert into articles(id,title,description,author,thumbnail,category_id) values(#{id},#{title},#{description},#{author},#{thumbnail},#{category.id})")
    boolean addArticle(Article article);
    @Update("Update articles set title=#{title},description=#{description},author=#{author},thumbnail=#{thumbnail},category_id=#{category.id} where id=#{id}")
    boolean updateArticle(Article article);
    //@Select("Select id,title,description,author,thumbnail from articles order by id asc limit #{limit} offset #{offset}")
    @SelectProvider(method = "getArticlesAt",type = ArticleProvide.class)
            @Results({
                @Result(property = "category.id",column = "category_id"),
                @Result(property = "category.name",column = "name")
            })
    List<Article> getArticles(@Param("limit")int limit,@Param("offset")int offset);
    @SelectProvider(method = "getFilteredArticles", type = ArticleProvide.class)
            @Results({
                @Result(property = "category.id",column = "category_id"),
                @Result(property = "category.name",column = "name")
            })
    List<Article> getFitleredArticles(ArticleFilter filter);
    @SelectProvider(method = "getFilteredRowCount",type = ArticleProvide.class)
    Integer getFilteredRowCount(ArticleFilter filter);
    
    @SelectProvider(method = "getRowCount",type = ArticleProvide.class)
    Integer getRowCount();

}
