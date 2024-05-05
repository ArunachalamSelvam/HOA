package com.hoa.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 * JPA entity class for "Contract"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="Contract", schema="public" )
public class Contract implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY PRIMARY KEY 
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="contractId", nullable=false)
    private Integer    contractid ;

    //--- ENTITY DATA FIELDS 
    @Column(name="salesPersonId")
    private Integer    salespersonid ;

    @Column(name="clientId")
    private Integer    clientid ;

    @Column(name="contractCode", length=2147483647)
    private String     contractcode ;

    @Column(name="businessName", length=2147483647)
    private String     businessname ;

    @Column(name="businessAddressId")
    private Integer    businessaddressid ;

    @Column(name="communicationChannel", length=128)
    private String     communicationchannel ;

    @Column(name="planId")
    private Integer    planid ;

    @Column(name="annualRenewalFee")
    private Double     annualrenewalfee ;

    @Column(name="oneTimeSetUp")
    private Double     onetimesetup ;

    @Column(name="sizeofthecommunity")
    private Integer    sizeofthecommunity ;

    @Column(name="renewalCycles", length=128)
    private String     renewalcycles ;

    @Column(name="isTermsAccepted")
    private Boolean    istermsaccepted ;

    @Column(name="createdById", nullable=false)
    private Integer    createdbyid ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="createdDate", nullable=false)
    private Date       createddate ;

    @Column(name="modifiedById")
    private Integer    modifiedbyid ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="modifiedDate")
    private Date       modifieddate ;


    //--- ENTITY LINKS ( RELATIONSHIP )
    @ManyToOne
    @JoinColumn(name="planId", referencedColumnName="planId", insertable=false, updatable=false)
    private Plan       plan ; 

//    @OneToMany(mappedBy="contract")
//    private List<Community> listOfCommunity ; 

    @ManyToOne
    @JoinColumn(name="salesPersonId", referencedColumnName="employeeId", insertable=false, updatable=false)
    private Employee   employee ; 

    @ManyToOne
    @JoinColumn(name="businessAddressId", referencedColumnName="addressId", insertable=false, updatable=false)
    private Address    address ; 

    @ManyToOne
    @JoinColumn(name="createdById", referencedColumnName="userId", insertable=false, updatable=false)
    private User       user ; 

    @ManyToOne
    @JoinColumn(name="modifiedById", referencedColumnName="userId", insertable=false, updatable=false)
    private User       user2 ; 

    @ManyToOne
    @JoinColumn(name="clientId", referencedColumnName="clientId", insertable=false, updatable=false)
    private Client     client ; 


    /**
     * Constructor
     */
    public Contract() {
		super();
    }
    
    //--- GETTERS & SETTERS FOR FIELDS
    public void setContractid( Integer contractid ) {
        this.contractid = contractid ;
    }
    public Integer getContractid() {
        return this.contractid;
    }

    public void setSalespersonid( Integer salespersonid ) {
        this.salespersonid = salespersonid ;
    }
    public Integer getSalespersonid() {
        return this.salespersonid;
    }

    public void setClientid( Integer clientid ) {
        this.clientid = clientid ;
    }
    public Integer getClientid() {
        return this.clientid;
    }

    public void setContractcode( String contractcode ) {
        this.contractcode = contractcode ;
    }
    public String getContractcode() {
        return this.contractcode;
    }

    public void setBuisnessname( String buisnessname ) {
        this.businessname = buisnessname ;
    }
    public String getBuisnessname() {
        return this.businessname;
    }

    public void setBusinessaddressid( Integer businessaddressid ) {
        this.businessaddressid = businessaddressid ;
    }
    public Integer getBusinessaddressid() {
        return this.businessaddressid;
    }

    public void setCommunicationchannel( String communicationchannel ) {
        this.communicationchannel = communicationchannel ;
    }
    public String getCommunicationchannel() {
        return this.communicationchannel;
    }

    public void setPlanid( Integer planid ) {
        this.planid = planid ;
    }
    public Integer getPlanid() {
        return this.planid;
    }

    public void setAnnualrenewalfee( Double annualrenewalfee ) {
        this.annualrenewalfee = annualrenewalfee ;
    }
    public Double getAnnualrenewalfee() {
        return this.annualrenewalfee;
    }

    public void setOnetimesetup( Double onetimesetup ) {
        this.onetimesetup = onetimesetup ;
    }
    public Double getOnetimesetup() {
        return this.onetimesetup;
    }

    public void setSizeofthecommunity( Integer sizeofthecommunity ) {
        this.sizeofthecommunity = sizeofthecommunity ;
    }
    public Integer getSizeofthecommunity() {
        return this.sizeofthecommunity;
    }

    public void setRenewalcycles( String renewalcycles ) {
        this.renewalcycles = renewalcycles ;
    }
    public String getRenewalcycles() {
        return this.renewalcycles;
    }

    public void setIstermsaccepted( Boolean istermsaccepted ) {
        this.istermsaccepted = istermsaccepted ;
    }
    public Boolean getIstermsaccepted() {
        return this.istermsaccepted;
    }

    public void setCreatedbyid( Integer createdbyid ) {
        this.createdbyid = createdbyid ;
    }
    public Integer getCreatedbyid() {
        return this.createdbyid;
    }

    public void setCreateddate( Date createddate ) {
        this.createddate = createddate ;
    }
    public Date getCreateddate() {
        return this.createddate;
    }

    public void setModifiedbyid( Integer modifiedbyid ) {
        this.modifiedbyid = modifiedbyid ;
    }
    public Integer getModifiedbyid() {
        return this.modifiedbyid;
    }

    public void setModifieddate( Date modifieddate ) {
        this.modifieddate = modifieddate ;
    }
    public Date getModifieddate() {
        return this.modifieddate;
    }

    //--- GETTERS FOR LINKS
    public Plan getPlan() {
        return this.plan;
    } 

//    public List<Community> getListOfCommunity() {
//        return this.listOfCommunity;
//    } 

    public Employee getEmployee() {
        return this.employee;
    } 

    public Address getAddress() {
        return this.address;
    } 

    public User getUser() {
        return this.user;
    } 

    public User getUser2() {
        return this.user2;
    } 

    public Client getClient() {
        return this.client;
    } 

    //--- toString specific method
	@Override
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append(contractid);
        sb.append("|");
        sb.append(salespersonid);
        sb.append("|");
        sb.append(clientid);
        sb.append("|");
        sb.append(contractcode);
        sb.append("|");
        sb.append(businessname);
        sb.append("|");
        sb.append(businessaddressid);
        sb.append("|");
        sb.append(communicationchannel);
        sb.append("|");
        sb.append(planid);
        sb.append("|");
        sb.append(annualrenewalfee);
        sb.append("|");
        sb.append(onetimesetup);
        sb.append("|");
        sb.append(sizeofthecommunity);
        sb.append("|");
        sb.append(renewalcycles);
        sb.append("|");
        sb.append(istermsaccepted);
        sb.append("|");
        sb.append(createdbyid);
        sb.append("|");
        sb.append(createddate);
        sb.append("|");
        sb.append(modifiedbyid);
        sb.append("|");
        sb.append(modifieddate);
        return sb.toString(); 
    } 

}
