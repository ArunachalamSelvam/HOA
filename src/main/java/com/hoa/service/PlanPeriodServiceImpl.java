package com.hoa.service;

import com.hoa.entities.PlanPeriod;
import com.hoa.repositories.PlanPeriodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlanPeriodServiceImpl implements PlanPeriodService {

    private final PlanPeriodRepository planPeriodRepository;

    @Autowired
    public PlanPeriodServiceImpl(PlanPeriodRepository planPeriodRepository) {
        this.planPeriodRepository = planPeriodRepository;
    }

    @Override
    public PlanPeriod getPlanPeriodById(Integer id) {
        Optional<PlanPeriod> optionalPlanPeriod = planPeriodRepository.findById(id);
        return optionalPlanPeriod.orElse(null);
    }

    @Override
    public List<PlanPeriod> getAllPlanPeriods() {
        return planPeriodRepository.findAll();
    }

    @Override
    public PlanPeriod createPlanPeriod(PlanPeriod planPeriod) {
        return planPeriodRepository.save(planPeriod);
    }

    @Override
    public PlanPeriod updatePlanPeriod(Integer id, PlanPeriod planPeriod) {
        if (planPeriodRepository.existsById(id)) {
            planPeriod.setId(id);
            return planPeriodRepository.save(planPeriod);
        }
        return null;
    }

    @Override
    public void deletePlanPeriod(Integer id) {
        planPeriodRepository.deleteById(id);
    }
}
