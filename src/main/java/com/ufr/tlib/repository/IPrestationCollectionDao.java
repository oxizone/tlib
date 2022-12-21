package com.ufr.tlib.repository;

import com.ufr.tlib.models.PrestationCollection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPrestationCollectionDao extends JpaRepository<PrestationCollection, Long> {
}
