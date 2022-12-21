package com.ufr.tlib.repository;

import com.ufr.tlib.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRole extends JpaRepository<Role, Long> {
}
