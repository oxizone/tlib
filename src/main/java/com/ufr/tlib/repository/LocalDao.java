package com.ufr.tlib.dao;

import com.ufr.tlib.models.Local;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocalDao extends JpaRepository<Local, Long> {
}
