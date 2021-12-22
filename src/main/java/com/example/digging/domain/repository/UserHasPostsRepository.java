package com.example.digging.domain.repository;

import com.example.digging.domain.entity.UserHasPosts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserHasPostsRepository extends JpaRepository<UserHasPosts, Integer> {
    Optional<UserHasPosts> findByUser_UserIdAndPostsPostId(Integer userId, Integer postId);

    List<UserHasPosts> findAllByUser_UserId(Integer id);
}
