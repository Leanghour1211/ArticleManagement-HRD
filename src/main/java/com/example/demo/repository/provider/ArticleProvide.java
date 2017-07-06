/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.repository.provider;

import com.example.demo.model.filter.ArticleFilter;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Repository;

/**
 *
 * @author User
 */
@Repository
public class ArticleProvide {
    
    public String getAllArticles()        
    {
        return new SQL(){{
            SELECT("a.id,a.title,a.description,a.author,a.thumbnail");
            SELECT("c.id as category_id, c.name");
            FROM("articles a");
            INNER_JOIN("category c on a.category_id=c.id order by a.id");
        }}.toString();
    }
    public String getArticle()        
    {
        return new SQL(){{
            SELECT("a.id,a.title,a.description,a.author,a.thumbnail");
            SELECT("c.id as category_id, c.name");
            FROM("articles a");
            INNER_JOIN("category c on a.category_id=c.id");
            WHERE("a.id=#{id}");
        }}.toString();
    }
    public String getFilteredArticles(ArticleFilter filter)
    {
        return new SQL(){{
            SELECT("a.id,a.title,a.description,a.author,a.thumbnail");
            SELECT("c.id as category_id, c.name");
            FROM("articles a");
            INNER_JOIN("category c on a.category_id=c.id");
            if(filter.getCategory_id()!=null)
            WHERE("c.id=#{category_id}");
            if(filter.getTitle()!=null)   
            WHERE("a.title ILIKE '%'||#{title}||'%'");
               
            ORDER_BY("a.id limit #{limit} offset #{offset}");
                 
            //if(filter.getPage()!=null)
            
        }}.toString();
    }
    public String getRowCount()
    {
        return new SQL(){{
            SELECT("count(*)");
            FROM("articles");
        }}.toString();
    }
    public String getArticlesAt()        
    {
        return new SQL(){{
            SELECT("a.id,a.title,a.description,a.author,a.thumbnail");
            SELECT("c.id as category_id, c.name");
            FROM("articles a");
            INNER_JOIN("category c on a.category_id=c.id order by a.id limit #{limit} offset #{offset}");
        }}.toString();
    }
    public String getFilteredRowCount(ArticleFilter filter)
    {
        return new SQL(){{
            SELECT("count(*)");
            FROM("articles a");
            INNER_JOIN("category c on a.category_id=c.id");
            if(filter.getCategory_id()!=null)
            WHERE("c.id=#{category_id}");
            if(filter.getTitle()!=null)   
            WHERE("a.title ILIKE '%'||#{title}||'%'");
            
        }}.toString();
    }

}
