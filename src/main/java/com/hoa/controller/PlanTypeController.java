package com.hoa.controller;

import com.hoa.dto.PlanTypeDTO;
import com.hoa.entities.PlanType;
import com.hoa.service.PlanTypeService;
import com.hoa.utils.EntityDTOMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/public/plan-type")
public class PlanTypeController {

    private final PlanTypeService planTypeService;
    private final EntityDTOMapper entityDtoMapper;


    @Autowired
    public PlanTypeController(PlanTypeService planTypeService, EntityDTOMapper entityDtoMapper) {
        this.planTypeService = planTypeService;
        this.entityDtoMapper = entityDtoMapper;
    }

    @GetMapping("/{id}")
    public PlanType getPlanTypeById(@PathVariable Integer id) {
        return planTypeService.getPlanTypeById(id);
    }

    @GetMapping("/all")
    public List<PlanType> getAllPlanTypes() {
        return planTypeService.getAllPlanTypes();
    }

    @PostMapping("/create")
    public PlanType createPlanType(@RequestBody PlanTypeDTO planTypeDto) {
    	PlanType planType = entityDtoMapper.toEntity(planTypeDto);
        return planTypeService.createPlanType(planType);
    }

    @PutMapping("/update/{id}")
    public PlanType updatePlanType(@PathVariable Integer id, @RequestBody PlanTypeDTO planTypeDto) {
    	PlanType planType = entityDtoMapper.toEntity(planTypeDto);
        return planTypeService.updatePlanType(id, planType);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePlanType(@PathVariable Integer id) {
        planTypeService.deletePlanType(id);
    }
}
