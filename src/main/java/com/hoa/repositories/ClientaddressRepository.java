/*
 * Java domain class for entity "Clientaddress" 
 * Created on 2024-04-22 ( Date ISO 2024-04-22 - Time 21:42:02 )
 * Generated by Telosys Tools Generator ( version 3.3.0 )
 */
package com.hoa.repositories;
import com.hoa.entities.ClientAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * <h2>ClientaddressRepository</h2>
 *
 * createdAt : 2024-04-22 - Time 21:42:02
 * <p>
 * Description: Spring Data repository for the {@link ClientAddress} entity.
 * 
 * @author aek
 */
@Repository
public interface ClientaddressRepository  extends JpaRepository<ClientAddress, Integer> , JpaSpecificationExecutor<ClientAddress> {

}
