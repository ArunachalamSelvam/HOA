/*
*  Copyright (c) 2019. All right reserved
* Created on 2024-04-22 ( Date ISO 2024-04-22 - Time 21:42:03 )
* Generated by Telosys Tools Generator ( version 3.3.0 )
*/
package com.hoa.service;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.hoa.repositories.RolepageRepository;
import com.hoa.responseEntities.RolePageListResponse;
import com.hoa.entities.RolePage;
import com.hoa.service.RolepageService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;


import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Service Implementation for managing {@link RolePage}.
 * @author aek
 */
@Service
@Transactional
public class RolepageServiceImpl implements RolepageService {


    private final RolepageRepository repository;

    public RolepageServiceImpl(RolepageRepository repo) {
         this.repository = repo;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public RolePage create(RolePage d) {
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
    public RolePage update(RolePage d) {
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
    public RolePage getOne(Integer id) {
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
    public List<RolePage> getAll() {
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
	public Page<RolePage> findAllPaginate(Pageable pageable) {

		return repository.findAll(pageable);
	}

    /**
     * {@inheritDoc}
     */
    @Override
	public Page<RolePage> findAllSpecification(Specification<RolePage> specs, Pageable pageable) {
		return repository.findAll(specs, pageable);
	}

    @Override
    public List<RolePageListResponse> getRolePageByRoleId(Integer roleId) {
        return repository.getRolePageByRoleId(roleId).stream()
                .map(this::mapToRolePageResponse)
                .collect(Collectors.toList());
    }
    
//    private List<RolePageListResponse> mapToRolePageResponse(List<Map<String, Object>> rolePageMaps) {
//        return rolePageMaps.stream()
//                .map(this::mapToRolePageResponse)
//                .collect(Collectors.toList());
//    }

    private RolePageListResponse mapToRolePageResponse(Map<String, Object> rolePageMap) {
    	RolePageListResponse response = new RolePageListResponse();
        response.setRolePageId((Integer) rolePageMap.get("rolePageId"));
        response.setRoleId((Integer) rolePageMap.get("roleId"));
        response.setCreate((Boolean) rolePageMap.get("create"));
        response.setDelete((Boolean) rolePageMap.get("delete"));
        response.setRead((Boolean) rolePageMap.get("read"));
        response.setUpdate((Boolean) rolePageMap.get("update"));
        response.setPageId((Integer) rolePageMap.get("pageId"));
        response.setPageName((String) rolePageMap.get("pageName"));
        response.setComponentUrl((String) rolePageMap.get("componentUrl"));
        response.setPageIcon((String) rolePageMap.get("pageIcon"));
        response.setDisplayOrder((Integer) rolePageMap.get("displayOrder"));
        response.setPageActiveStatus((Boolean) rolePageMap.get("pageActiveStatus"));
        return response;
    }
}
