package com.hoa.service;

import com.hoa.entities.PlanRange;
import java.util.List;

public interface PlanRangeService {

    PlanRange getPlanRangeById(Integer id);

    List<PlanRange> getAllPlanRanges();

    PlanRange createPlanRange(PlanRange planRange);

    PlanRange updatePlanRange(Integer id, PlanRange planRange);

    void deletePlanRange(Integer id);
}
