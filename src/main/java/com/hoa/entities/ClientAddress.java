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
    private Integer    clientaddressid ;

    //--- ENTITY DATA FIELDS 
    @Column(name="addressId", nullable=false)
    private Integer    addressid ;

    @Column(name="isRented")
    private Boolean    isrented ;

    @Column(name="tenantId")
    private Integer    tenantid ;

    @Column(name="activeStatus")
    private Boolean    activestatus ;

    @Column(name="clientId", nullable=false)
    private Integer    clientid ;


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
        this.clientaddressid = clientaddressid ;
    }
    public Integer getClientaddressid() {
        return this.clientaddressid;
    }

    public void setAddressid( Integer addressid ) {
        this.addressid = addressid ;
    }
    public Integer getAddressid() {
        return this.addressid;
    }

    public void setIsrented( Boolean isrented ) {
        this.isrented = isrented ;
    }
    public Boolean getIsrented() {
        return this.isrented;
    }

    public void setTenantid( Integer tenantid ) {
        this.tenantid = tenantid ;
    }
    public Integer getTenantid() {
        return this.tenantid;
    }

    public void setActivestatus( Boolean activestatus ) {
        this.activestatus = activestatus ;
    }
    public Boolean getActivestatus() {
        return this.activestatus;
    }

    public void setClientid( Integer clientid ) {
        this.clientid = clientid ;
    }
    public Integer getClientid() {
        return this.clientid;
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
        sb.append(clientaddressid);
        sb.append("|");
        sb.append(addressid);
        sb.append("|");
        sb.append(isrented);
        sb.append("|");
        sb.append(tenantid);
        sb.append("|");
        sb.append(activestatus);
        sb.append("|");
        sb.append(clientid);
        return sb.toString(); 
    } 

}
