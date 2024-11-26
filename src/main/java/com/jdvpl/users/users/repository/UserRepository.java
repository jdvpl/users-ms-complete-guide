package com.jdvpl.users.users.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jdvpl.users.users.models.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findAllByEnabledTrue();

    Optional<User> findByIdAndEnabledTrue(Long id);

    @Modifying
    @Transactional
    @Query("UPDATE User u SET u.enabled = FALSE WHERE u.id = ?1")
    int setEnabledFalseById(Long id);
}
