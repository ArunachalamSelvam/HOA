package com.hoa.service;

import com.hoa.entities.PlanRange;
import com.hoa.repositories.PlanRangeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlanRangeServiceImpl implements PlanRangeService {

    private final PlanRangeRepository planRangeRepository;

    @Autowired
    public PlanRangeServiceImpl(PlanRangeRepository planRangeRepository) {
        this.planRangeRepository = planRangeRepository;
    }

    @Override
    public PlanRange getPlanRangeById(Integer id) {
        Optional<PlanRange> optionalPlanRange = planRangeRepository.findById(id);
        return optionalPlanRange.orElse(null);
    }

    @Override
    public List<PlanRange> getAllPlanRanges() {
        return planRangeRepository.findAll();
    }

    @Override
    public PlanRange createPlanRange(PlanRange planRange) {
        return planRangeRepository.save(planRange);
    }

    @Override
    public PlanRange updatePlanRange(Integer id, PlanRange planRange) {
        if (planRangeRepository.existsById(id)) {
            planRange.setId(id);
            return planRangeRepository.save(planRange);
        }
        return null;
    }

    @Override
    public void deletePlanRange(Integer id) {
        planRangeRepository.deleteById(id);
    }
}
