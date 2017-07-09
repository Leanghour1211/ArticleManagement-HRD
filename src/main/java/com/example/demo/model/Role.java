/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model;

import org.springframework.security.core.GrantedAuthority;

/**
 *
 * @author Leanghour
 */
public class Role implements GrantedAuthority{
    private int rid;
    private String role;

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String getAuthority() {
        return "ROLE_"+this.role;
    }

    @Override
    public String toString() {
        return "Role{" + "rid=" + rid + ", role=" + role + '}';
    }
    
    
}
