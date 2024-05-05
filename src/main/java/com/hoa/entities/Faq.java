package com.hoa.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * JPA entity class for "Faq"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="FAQ", schema="public" )
public class Faq implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY PRIMARY KEY 
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="faqId", nullable=false)
    private Integer    faqid ;

    //--- ENTITY DATA FIELDS 
    @Column(name="question", nullable=false, length=2147483647)
    private String     question ;

    @Column(name="answer", length=2147483647)
    private String     answer ;

    @Column(name="roleId", nullable=false)
    private Integer    roleid ;

    @Column(name="activeStatus")
    private Boolean    activestatus ;

    @Column(name="communityID", nullable=false)
    private Integer    communityid ;

    @Column(name="createdByID", nullable=false)
    private Integer    createdbyid ;

    @Column(name="modifiedByID")
    private Integer    modifiedbyid ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="createdDate", nullable=false)
    private Date       createddate ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="modifiedDate")
    private Date       modifieddate ;


    //--- ENTITY LINKS ( RELATIONSHIP )
    @ManyToOne
    @JoinColumn(name="modifiedByID", referencedColumnName="userId", insertable=false, updatable=false)
    private User       user2 ; 

    @ManyToOne
    @JoinColumn(name="roleId", referencedColumnName="roleId", insertable=false, updatable=false)
    private Role       role ; 

    @ManyToOne
    @JoinColumn(name="communityID", referencedColumnName="communityID", insertable=false, updatable=false)
    private Community  community ; 

    @ManyToOne
    @JoinColumn(name="createdByID", referencedColumnName="userId", insertable=false, updatable=false)
    private User       user ; 


    /**
     * Constructor
     */
    public Faq() {
		super();
    }
    
    //--- GETTERS & SETTERS FOR FIELDS
    public void setFaqid( Integer faqid ) {
        this.faqid = faqid ;
    }
    public Integer getFaqid() {
        return this.faqid;
    }

    public void setQuestion( String question ) {
        this.question = question ;
    }
    public String getQuestion() {
        return this.question;
    }

    public void setAnswer( String answer ) {
        this.answer = answer ;
    }
    public String getAnswer() {
        return this.answer;
    }

    public void setRoleid( Integer roleid ) {
        this.roleid = roleid ;
    }
    public Integer getRoleid() {
        return this.roleid;
    }

    public void setActivestatus( Boolean activestatus ) {
        this.activestatus = activestatus ;
    }
    public Boolean getActivestatus() {
        return this.activestatus;
    }

    public void setCommunityid( Integer communityid ) {
        this.communityid = communityid ;
    }
    public Integer getCommunityid() {
        return this.communityid;
    }

    public void setCreatedbyid( Integer createdbyid ) {
        this.createdbyid = createdbyid ;
    }
    public Integer getCreatedbyid() {
        return this.createdbyid;
    }

    public void setModifiedbyid( Integer modifiedbyid ) {
        this.modifiedbyid = modifiedbyid ;
    }
    public Integer getModifiedbyid() {
        return this.modifiedbyid;
    }

    public void setCreateddate( Date createddate ) {
        this.createddate = createddate ;
    }
    public Date getCreateddate() {
        return this.createddate;
    }

    public void setModifieddate( Date modifieddate ) {
        this.modifieddate = modifieddate ;
    }
    public Date getModifieddate() {
        return this.modifieddate;
    }

    //--- GETTERS FOR LINKS
    public User getUser2() {
        return this.user2;
    } 

    public Role getRole() {
        return this.role;
    } 

    public Community getCommunity() {
        return this.community;
    } 

    public User getUser() {
        return this.user;
    } 

    //--- toString specific method
	@Override
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append(faqid);
        sb.append("|");
        sb.append(question);
        sb.append("|");
        sb.append(answer);
        sb.append("|");
        sb.append(roleid);
        sb.append("|");
        sb.append(activestatus);
        sb.append("|");
        sb.append(communityid);
        sb.append("|");
        sb.append(createdbyid);
        sb.append("|");
        sb.append(modifiedbyid);
        sb.append("|");
        sb.append(createddate);
        sb.append("|");
        sb.append(modifieddate);
        return sb.toString(); 
    } 

}
