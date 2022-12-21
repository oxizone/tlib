package com.ufr.tlib.repository;

import com.ufr.tlib.models.Local;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILocalDao extends JpaRepository<Local, Long> {
}
