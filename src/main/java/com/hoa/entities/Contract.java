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
    private Integer    contractId ;

    //--- ENTITY DATA FIELDS 
    @Column(name="salesPersonId")
    private Integer    salesPersonId ;

    @Column(name="clientId")
    private Integer    clientId ;

    @Column(name="contractCode", length=2147483647)
    private String     contractCode ;

    @Column(name="businessName", length=2147483647)
    private String     businessName ;

    @Column(name="businessAddressId")
    private Integer    businessAddressId ;

    @Column(name="communicationChannel", length=128)
    private String     communicationChannel ;

    @Column(name="planId")
    private Integer    planId ;

    @Column(name="annualRenewalFee")
    private Double     annualRenewalFee ;

    @Column(name="oneTimeSetUp")
    private Double     oneTimeSetUp ;

    @Column(name="sizeofthecommunity")
    private Integer    sizeofthecommunity ;

    @Column(name="renewalCycles", length=128)
    private String     renewalCycles ;

    @Column(name="isTermsAccepted")
    private Boolean    isTermsAccepted ;

    @Column(name="createdById", nullable=false)
    private Integer    createdById ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="createdDate", nullable=false)
    private Date       createdDate ;

    @Column(name="modifiedById")
    private Integer    modifiedById ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="modifiedDate")
    private Date       modifiedDate ;


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
        this.contractId = contractid ;
    }
    public Integer getContractid() {
        return this.contractId;
    }

    public void setSalespersonid( Integer salespersonid ) {
        this.salesPersonId = salespersonid ;
    }
    public Integer getSalespersonid() {
        return this.salesPersonId;
    }

    public void setClientid( Integer clientid ) {
        this.clientId = clientid ;
    }
    public Integer getClientid() {
        return this.clientId;
    }

    public void setContractcode( String contractcode ) {
        this.contractCode = contractcode ;
    }
    public String getContractcode() {
        return this.contractCode;
    }

    public void setBuisnessname( String buisnessname ) {
        this.businessName = buisnessname ;
    }
    public String getBuisnessname() {
        return this.businessName;
    }

    public void setBusinessaddressid( Integer businessaddressid ) {
        this.businessAddressId = businessaddressid ;
    }
    public Integer getBusinessaddressid() {
        return this.businessAddressId;
    }

    public void setCommunicationchannel( String communicationchannel ) {
        this.communicationChannel = communicationchannel ;
    }
    public String getCommunicationchannel() {
        return this.communicationChannel;
    }

    public void setPlanid( Integer planid ) {
        this.planId = planid ;
    }
    public Integer getPlanid() {
        return this.planId;
    }

    public void setAnnualrenewalfee( Double annualrenewalfee ) {
        this.annualRenewalFee = annualrenewalfee ;
    }
    public Double getAnnualrenewalfee() {
        return this.annualRenewalFee;
    }

    public void setOnetimesetup( Double onetimesetup ) {
        this.oneTimeSetUp = onetimesetup ;
    }
    public Double getOnetimesetup() {
        return this.oneTimeSetUp;
    }

    public void setSizeofthecommunity( Integer sizeofthecommunity ) {
        this.sizeofthecommunity = sizeofthecommunity ;
    }
    public Integer getSizeofthecommunity() {
        return this.sizeofthecommunity;
    }

    public void setRenewalcycles( String renewalcycles ) {
        this.renewalCycles = renewalcycles ;
    }
    public String getRenewalcycles() {
        return this.renewalCycles;
    }

    public void setIstermsaccepted( Boolean istermsaccepted ) {
        this.isTermsAccepted = istermsaccepted ;
    }
    public Boolean getIstermsaccepted() {
        return this.isTermsAccepted;
    }

    public void setCreatedbyid( Integer createdbyid ) {
        this.createdById = createdbyid ;
    }
    public Integer getCreatedbyid() {
        return this.createdById;
    }

    public void setCreateddate( Date createddate ) {
        this.createdDate = createddate ;
    }
    public Date getCreateddate() {
        return this.createdDate;
    }

    public void setModifiedbyid( Integer modifiedbyid ) {
        this.modifiedById = modifiedbyid ;
    }
    public Integer getModifiedbyid() {
        return this.modifiedById;
    }

    public void setModifieddate( Date modifieddate ) {
        this.modifiedDate = modifieddate ;
    }
    public Date getModifieddate() {
        return this.modifiedDate;
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
        sb.append(contractId);
        sb.append("|");
        sb.append(salesPersonId);
        sb.append("|");
        sb.append(clientId);
        sb.append("|");
        sb.append(contractCode);
        sb.append("|");
        sb.append(businessName);
        sb.append("|");
        sb.append(businessAddressId);
        sb.append("|");
        sb.append(communicationChannel);
        sb.append("|");
        sb.append(planId);
        sb.append("|");
        sb.append(annualRenewalFee);
        sb.append("|");
        sb.append(oneTimeSetUp);
        sb.append("|");
        sb.append(sizeofthecommunity);
        sb.append("|");
        sb.append(renewalCycles);
        sb.append("|");
        sb.append(isTermsAccepted);
        sb.append("|");
        sb.append(createdById);
        sb.append("|");
        sb.append(createdDate);
        sb.append("|");
        sb.append(modifiedById);
        sb.append("|");
        sb.append(modifiedDate);
        return sb.toString(); 
    } 

}
