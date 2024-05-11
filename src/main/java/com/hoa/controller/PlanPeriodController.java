package com.hoa.controller;

import com.hoa.dto.PlanPeriodDTO;
import com.hoa.entities.PlanPeriod;
import com.hoa.service.PlanPeriodService;
import com.hoa.utils.EntityDTOMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/public/plan-period")
public class PlanPeriodController {

    private final PlanPeriodService planPeriodService;
    private final EntityDTOMapper entityDtoMapper;


    @Autowired
    public PlanPeriodController(PlanPeriodService planPeriodService, EntityDTOMapper entityDtoMapper) {
        this.planPeriodService = planPeriodService;
        this.entityDtoMapper = entityDtoMapper;
    }

    @GetMapping("/{id}")
    public PlanPeriod getPlanPeriodById(@PathVariable Integer id) {
        return planPeriodService.getPlanPeriodById(id);
    }

    @GetMapping("/all")
    public List<PlanPeriod> getAllPlanPeriods() {
        return planPeriodService.getAllPlanPeriods();
    }

    @PostMapping("/create")
    public PlanPeriod createPlanPeriod(@RequestBody PlanPeriodDTO planPeriodDto) {
    	PlanPeriod planPeriod = entityDtoMapper.toEntity(planPeriodDto);
        return planPeriodService.createPlanPeriod(planPeriod);
    }

    @PutMapping("/update/{id}")
    public PlanPeriod updatePlanPeriod(@PathVariable Integer id, @RequestBody PlanPeriodDTO planPeriodDto) {
    	PlanPeriod planPeriod = entityDtoMapper.toEntity(planPeriodDto);
        return planPeriodService.updatePlanPeriod(id, planPeriod);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePlanPeriod(@PathVariable Integer id) {
        planPeriodService.deletePlanPeriod(id);
    }
}
