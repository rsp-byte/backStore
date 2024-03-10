package com.audisoft.crud.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.audisoft.crud.infrastructure.entity.CommentsEntity;


@Repository
public interface CommentDbRepository extends JpaRepository<CommentsEntity,Long> {
	


}
