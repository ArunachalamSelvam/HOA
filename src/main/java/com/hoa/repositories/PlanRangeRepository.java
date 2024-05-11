package com.hoa.repositories;

import com.hoa.entities.PlanRange;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanRangeRepository extends JpaRepository<PlanRange, Integer> {
    // You can define custom query methods here if needed
}
