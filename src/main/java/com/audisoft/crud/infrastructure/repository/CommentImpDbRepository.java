package com.audisoft.crud.infrastructure.repository;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.audisoft.crud.application.repository.CommentRepository;
import com.audisoft.crud.domain.Comment;
import com.audisoft.crud.infrastructure.entity.CommentsEntity;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class CommentImpDbRepository implements CommentRepository {

	private final CommentDbRepository commentDbRepository;
	ModelMapper modelMapper = new ModelMapper();
	
	
	@Override
	public void saveComment(Comment comment) {
		commentDbRepository.save(modelMapper.map(comment, CommentsEntity.class));
		
	}

	@Override
	public List<Comment> getAllComment() {
		List<CommentsEntity> pe = commentDbRepository.findAll();
		List<Comment> p = new ArrayList<>();
		pe.forEach(pep-> p.add(modelMapper.map(pep, Comment.class)));
		return p;
	}

}
