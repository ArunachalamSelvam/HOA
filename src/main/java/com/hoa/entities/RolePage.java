package com.hoa.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * JPA entity class for "Rolepage"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="RolePage", schema="public" )
public class RolePage implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY PRIMARY KEY 
    @Id
    @Column(name="rolepageId", nullable=false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer    rolepageId ;

    //--- ENTITY DATA FIELDS 
    @Column(name="roleId", nullable=false)
    private Integer    roleId ;

    @Column(name="pageId", nullable=false)
    private Integer    pageId ;

    @Column(name="creates")
    private Boolean    create ;

    @Column(name="read")
    private Boolean    read ;

    @Column(name="update")
    private Boolean    update ;

    @Column(name="delete")
    private Boolean    delete ;


    //--- ENTITY LINKS ( RELATIONSHIP )
    @ManyToOne
    @JoinColumn(name="pageId", referencedColumnName="pageId", insertable=false, updatable=false)
    private Page       page ; 

    @ManyToOne
    @JoinColumn(name="roleId", referencedColumnName="roleId", insertable=false, updatable=false)
    private Role       role ; 


    /**
     * Constructor
     */
    public RolePage() {
		super();
    }
    
    //--- GETTERS & SETTERS FOR FIELDS
    public void setRolepageid( Integer rolepageid ) {
        this.rolepageId = rolepageid ;
    }
    public Integer getRolepageid() {
        return this.rolepageId;
    }

    public void setRoleid( Integer roleid ) {
        this.roleId = roleid ;
    }
    public Integer getRoleid() {
        return this.roleId;
    }

    public void setPageid( Integer pageid ) {
        this.pageId = pageid ;
    }
    public Integer getPageid() {
        return this.pageId;
    }

    public void setCreate( Boolean create ) {
        this.create = create ;
    }
    public Boolean getCreate() {
        return this.create;
    }

    public void setRead( Boolean read ) {
        this.read = read ;
    }
    public Boolean getRead() {
        return this.read;
    }

    public void setUpdate( Boolean update ) {
        this.update = update ;
    }
    public Boolean getUpdate() {
        return this.update;
    }

    public void setDelete( Boolean delete ) {
        this.delete = delete ;
    }
    public Boolean getDelete() {
        return this.delete;
    }

    //--- GETTERS FOR LINKS
    public Page getPage() {
        return this.page;
    } 

    public Role getRole() {
        return this.role;
    } 

    //--- toString specific method
	@Override
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append(rolepageId);
        sb.append("|");
        sb.append(roleId);
        sb.append("|");
        sb.append(pageId);
        sb.append("|");
        sb.append(create);
        sb.append("|");
        sb.append(read);
        sb.append("|");
        sb.append(update);
        sb.append("|");
        sb.append(delete);
        return sb.toString(); 
    } 

}
