package com.hoa.service;

import com.hoa.entities.PlanType;
import com.hoa.repositories.PlanTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlanTypeServiceImpl implements PlanTypeService {

    private final PlanTypeRepository planTypeRepository;

    @Autowired
    public PlanTypeServiceImpl(PlanTypeRepository planTypeRepository) {
        this.planTypeRepository = planTypeRepository;
    }

    @Override
    public PlanType getPlanTypeById(Integer id) {
        Optional<PlanType> optionalPlanType = planTypeRepository.findById(id);
        return optionalPlanType.orElse(null);
    }

    @Override
    public List<PlanType> getAllPlanTypes() {
        return planTypeRepository.findAll();
    }

    @Override
    public PlanType createPlanType(PlanType planType) {
        return planTypeRepository.save(planType);
    }

    @Override
    public PlanType updatePlanType(Integer id, PlanType planType) {
        if (planTypeRepository.existsById(id)) {
            planType.setId(id);
            return planTypeRepository.save(planType);
        }
        return null;
    }

    @Override
    public void deletePlanType(Integer id) {
        planTypeRepository.deleteById(id);
    }
}
