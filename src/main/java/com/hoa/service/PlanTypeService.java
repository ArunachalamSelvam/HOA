package com.hoa.service;

import com.hoa.entities.PlanType;
import java.util.List;

public interface PlanTypeService {

    PlanType getPlanTypeById(Integer id);

    List<PlanType> getAllPlanTypes();

    PlanType createPlanType(PlanType planType);

    PlanType updatePlanType(Integer id, PlanType planType);

    void deletePlanType(Integer id);
}
