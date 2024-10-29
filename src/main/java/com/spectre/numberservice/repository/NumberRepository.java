package com.spectre.numberservice.repository;

import com.spectre.numberservice.entity.NumberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NumberRepository extends JpaRepository<NumberEntity, Long> {
}
