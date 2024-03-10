package com.audisoft.crud.application.repository;

import java.util.List;

import com.audisoft.crud.domain.Comment;

public interface CommentRepository {
	
	void saveComment(Comment comment);
	
	List<Comment> getAllComment();

}
