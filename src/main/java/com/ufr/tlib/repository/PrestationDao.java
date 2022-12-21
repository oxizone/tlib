package com.ufr.tlib.dao;

import com.ufr.tlib.models.Prestation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrestationDao extends JpaRepository<Prestation, Long> {
}
