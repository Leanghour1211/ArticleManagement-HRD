package com.example.demo.repository;

import com.example.demo.model.Role;
import com.example.demo.model.User;
import java.util.List;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;



@Repository
public interface UserRepository {
	
	@Select("Select uid, username, password, status From users  Where username=#{username}")
	@Results({
		
		@Result(property="roles", column="uid", many=@Many(select="findRoleByUserId"))
	})
	User loadUserByUsername(String username);
	
	@Select("Select r.rid, r.role From roles r Inner Join user_role ur on r.rid=ur.rid Where ur.uid=#{id}")
	List<Role> findRoleByUserId(int id);	
}
