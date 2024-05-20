/*
 * Java domain class for entity "Rolepage" 
 * Created on 2024-04-22 ( Date ISO 2024-04-22 - Time 21:42:03 )
 * Generated by Telosys Tools Generator ( version 3.3.0 )
 */
package com.hoa.repositories;
import com.hoa.entities.RolePage;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * <h2>RolepageRepository</h2>
 *
 * createdAt : 2024-04-22 - Time 21:42:03
 * <p>
 * Description: Spring Data repository for the {@link RolePage} entity.
 * 
 * @author aek
 */
@Repository
public interface RolepageRepository  extends JpaRepository<RolePage, Integer> , JpaSpecificationExecutor<RolePage> {

	@Query(value = "SELECT rp.rolepage_id AS rolePageId,\n"
			+ "	rp.role_id As roleId,\n"
			+ "	rp.creates As \"create\",\n"
			+ "	rp.delete AS \"delete\",\n"
			+ "	rp.read As \"read\",\n"
			+ "	rp.update As \"update\",\n"
			+ "	p.page_id As pageId,\n"
			+ "	p.name As pageName,\n"
			+ "	p.component_url As componentUrl,\n"
			+ "	p.page_icon As pageIcon,\n"
			+ "	p.display_order As displayOrder,\n"
			+ "	p.active_Status As pageActiveStatus\n"
			+ "	\n"
			+ "FROM role_page rp\n"
			+ "JOIN page p ON rp.page_id = p.page_id\n"
			+ "\n"
			+ "WHERE rp.role_id = :roleId", nativeQuery = true)
	List<Map<String,Object>> getRolePageByRoleId(@Param("roleId") Integer roleId);
}
