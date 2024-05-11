package com.hoa.repositories;

import com.hoa.entities.PlanType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanTypeRepository extends JpaRepository<PlanType, Integer> {
    // You can define custom query methods here if needed
}
