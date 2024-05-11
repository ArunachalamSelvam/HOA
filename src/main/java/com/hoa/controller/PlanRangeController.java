package com.hoa.controller;

import com.hoa.dto.PlanRangeDTO;
import com.hoa.entities.PlanRange;
import com.hoa.service.PlanRangeService;
import com.hoa.utils.EntityDTOMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/public/plan-range")
public class PlanRangeController {

    private final PlanRangeService planRangeService;
    private final EntityDTOMapper entityDtoMapper;

    @Autowired
    public PlanRangeController(PlanRangeService planRangeService,EntityDTOMapper entityDtoMapper ) {
        this.planRangeService = planRangeService;
        this.entityDtoMapper = entityDtoMapper;
    }

    @GetMapping("/{id}")
    public PlanRange getPlanRangeById(@PathVariable Integer id) {
        return planRangeService.getPlanRangeById(id);
    }

    @GetMapping("/all")
    public List<PlanRange> getAllPlanRanges() {
        return planRangeService.getAllPlanRanges();
    }

    @PostMapping("/create")
    public PlanRange createPlanRange(@RequestBody PlanRangeDTO planRangeDto) {
    	PlanRange planRange = entityDtoMapper.toEntity(planRangeDto);
        return planRangeService.createPlanRange(planRange);
    }

    @PutMapping("/update/{id}")
    public PlanRange updatePlanRange(@PathVariable Integer id, @RequestBody PlanRangeDTO planRangeDto) {
    	PlanRange planRange = entityDtoMapper.toEntity(planRangeDto);

        return planRangeService.updatePlanRange(id, planRange);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePlanRange(@PathVariable Integer id) {
        planRangeService.deletePlanRange(id);
    }
}
