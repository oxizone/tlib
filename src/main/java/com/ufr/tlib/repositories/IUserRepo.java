package com.ufr.tlib.repositories;

import com.ufr.tlib.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<User, Integer> {
}
