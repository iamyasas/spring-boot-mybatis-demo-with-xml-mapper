package com.iamyasas.springbootmybatisdemo.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.iamyasas.springbootmybatisdemo.models.Post;

@Mapper
public interface PostMapper {

	public Post[] getPosts(@Param("pageNo") int pageNo);

}
