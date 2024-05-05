/*
*  Copyright (c) 2019. All right reserved
* Created on 2024-04-22 ( Date ISO 2024-04-22 - Time 21:42:04 )
* Generated by Telosys Tools Generator ( version 3.3.0 )
*/
package com.hoa.service;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.hoa.repositories.StateRepository;
import com.hoa.dto.StateDTO;
import com.hoa.entities.State;
import com.hoa.service.StateService;

import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;


import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Service Implementation for managing {@link State}.
 * @author aek
 */
@Service
@Transactional
public class StateServiceImpl implements StateService {


    private final StateRepository repository;

    public StateServiceImpl(StateRepository repo) {
         this.repository = repo;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public State create(State d) {
        try {
            return repository.save(d);

        } catch (Exception ex) {
            return null;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public State update(State d) {
        try {
            return repository.saveAndFlush(d);

        } catch (Exception ex) {
            return null;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public State getOne(Integer id) {
        try {
            return repository.findById(id).orElse(null);

        } catch (Exception ex) {
            return null;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<State> getAll() {
        try {
            return repository.findAll();

        } catch (Exception ex) {
            return Collections.emptyList();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public long getTotal() {
        try {
            return repository.count();
        } catch (Exception ex) {
            return 0;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }

    /**
     * {@inheritDoc}
     */
   	@Override
	public Page<State> findAllPaginate(Pageable pageable) {

		return repository.findAll(pageable);
	}

    /**
     * {@inheritDoc}
     */
    @Override
	public Page<State> findAllSpecification(Specification<State> specs, Pageable pageable) {
		return repository.findAll(specs, pageable);
	}
    
    @Override
    public void addStates(List<StateDTO> stateDTOList) {
        List<State> states = stateDTOList.stream()
                .map(this::convertToEntity)
                .collect(Collectors.toList());
        repository.saveAll(states);
    }

    private State convertToEntity(StateDTO stateDTO) {
        State state = new State();
        BeanUtils.copyProperties(stateDTO, state);
        return state;
    }

}
