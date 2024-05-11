package com.hoa.service;

import com.hoa.entities.PlanPeriod;
import java.util.List;

public interface PlanPeriodService {

    PlanPeriod getPlanPeriodById(Integer id);

    List<PlanPeriod> getAllPlanPeriods();

    PlanPeriod createPlanPeriod(PlanPeriod planPeriod);

    PlanPeriod updatePlanPeriod(Integer id, PlanPeriod planPeriod);

    void deletePlanPeriod(Integer id);
}
