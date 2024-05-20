package com.hoa.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * JPA entity class for "Clientaddress"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="ClientAddress", schema="public" )
public class ClientAddress implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY PRIMARY KEY 
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="clientAddressId", nullable=false)
    private Integer    clientAddressId ;

    //--- ENTITY DATA FIELDS 
    @Column(name="addressId", nullable=false)
    private Integer    addressId ;

    @Column(name="isRented")
    private Boolean    isRented ;

    @Column(name="tenantId")
    private Integer    tenantId ;

    @Column(name="activeStatus")
    private Boolean    activeStatus ;

    @Column(name="clientId", nullable=false)
    private Integer    clientId ;


    //--- ENTITY LINKS ( RELATIONSHIP )
    @ManyToOne
    @JoinColumn(name="addressId", referencedColumnName="addressId", insertable=false, updatable=false)
    private Address    address ; 

    @ManyToOne
    @JoinColumn(name="clientId", referencedColumnName="clientId", insertable=false, updatable=false)
    private Client     client ; 

    @ManyToOne
    @JoinColumn(name="tenantId", referencedColumnName="userId", insertable=false, updatable=false)
    private User       user ; 


    /**
     * Constructor
     */
    public ClientAddress() {
		super();
    }
    
    
   


	//--- GETTERS & SETTERS FOR FIELDS
    public void setClientaddressid( Integer clientaddressid ) {
        this.clientAddressId = clientaddressid ;
    }
    public Integer getClientaddressid() {
        return this.clientAddressId;
    }

    public void setAddressid( Integer addressid ) {
        this.addressId = addressid ;
    }
    public Integer getAddressid() {
        return this.addressId;
    }

    public void setIsrented( Boolean isrented ) {
        this.isRented = isrented ;
    }
    public Boolean getIsrented() {
        return this.isRented;
    }

    public void setTenantid( Integer tenantid ) {
        this.tenantId = tenantid ;
    }
    public Integer getTenantid() {
        return this.tenantId;
    }

    public void setActivestatus( Boolean activestatus ) {
        this.activeStatus = activestatus ;
    }
    public Boolean getActivestatus() {
        return this.activeStatus;
    }

    public void setClientid( Integer clientid ) {
        this.clientId = clientid ;
    }
    public Integer getClientid() {
        return this.clientId;
    }

    //--- GETTERS FOR LINKS
    public Address getAddress() {
        return this.address;
    } 

    public Client getClient() {
        return this.client;
    } 

    public User getUser() {
        return this.user;
    } 

    //--- toString specific method
	@Override
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append(clientAddressId);
        sb.append("|");
        sb.append(addressId);
        sb.append("|");
        sb.append(isRented);
        sb.append("|");
        sb.append(tenantId);
        sb.append("|");
        sb.append(activeStatus);
        sb.append("|");
        sb.append(clientId);
        return sb.toString(); 
    } 

}
