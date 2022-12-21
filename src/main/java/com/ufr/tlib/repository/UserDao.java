package com.ufr.tlib.dao;

import com.ufr.tlib.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {
}
