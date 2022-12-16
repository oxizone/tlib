package com.ufr.tlib.repositories;

import com.ufr.tlib.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<User, Integer> {
}
