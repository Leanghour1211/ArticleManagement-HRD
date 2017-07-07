/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model.filter;

/**
 *
 * @author User
 */
public class ArticleFilter {
    private Integer category_id;
    private String title;
    private Integer page;
    private Integer limit;
    private Integer offset;
    

    public Integer getOffset() {
        return offset;
    }
    public void initOffset()
    {
//        if(this.page==0)page=null;
//        if(this.category_id==0)category_id=null;
        try{
        this.offset=(page-1)*limit;
        }
        catch(NullPointerException e)
        {
            this.offset=0;
        }
    }
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
        this.initOffset();
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
        initOffset();
    }

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "ArticleFilter{" + "category_id=" + category_id + ", title=" + title + ", page=" + page + ", limit=" + limit + ", offset=" + offset + '}';
    }
    
    
}