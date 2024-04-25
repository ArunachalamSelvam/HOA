/*
 * Java domain class for entity "Vendor" 
 * Created on 2024-04-22 ( Date ISO 2024-04-22 - Time 21:42:04 )
 * Generated by Telosys Tools Generator ( version 3.3.0 )
 */
package com.hoa.repositories;
import com.hoa.entities.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * <h2>VendorRepository</h2>
 *
 * createdAt : 2024-04-22 - Time 21:42:04
 * <p>
 * Description: Spring Data repository for the {@link Vendor} entity.
 * 
 * @author aek
 */
@Repository
public interface VendorRepository  extends JpaRepository<Vendor, Integer> , JpaSpecificationExecutor<Vendor> {

}