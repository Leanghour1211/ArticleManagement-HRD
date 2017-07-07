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
        
        try{
        this.offset=(page-1)*limit;
        }
        catch(NullPointerException e)
        {
            this.offset=0;
        }
    }

    public ArticleFilter()
    {
        this(null,null,1,5,null);
    }
    public ArticleFilter(Integer category_id, String title, Integer page, Integer limit, Integer offset) {
        this.category_id = category_id;
        this.title = title;
        this.page = page;
        this.limit = limit;
        this.offset = offset;
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
