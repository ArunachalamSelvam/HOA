package com.hoa.responseEntities;

public class RolePageListResponse {
	
	private Integer rolePageId;
    private Integer roleId;
    private Boolean create;
    private Boolean delete;
    private Boolean read;
    private Boolean update;
    private Integer pageId;
    private String pageName;
    private String componentUrl;
    private String pageIcon;
    private Integer displayOrder;
    private Boolean pageActiveStatus;
    
    public RolePageListResponse() {}
    
	public Integer getRolePageId() {
		return rolePageId;
	}
	public void setRolePageId(Integer rolePageId) {
		this.rolePageId = rolePageId;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public Boolean getCreate() {
		return create;
	}
	public void setCreate(Boolean create) {
		this.create = create;
	}
	public Boolean getDelete() {
		return delete;
	}
	public void setDelete(Boolean delete) {
		this.delete = delete;
	}
	public Boolean getRead() {
		return read;
	}
	public void setRead(Boolean read) {
		this.read = read;
	}
	public Boolean getUpdate() {
		return update;
	}
	public void setUpdate(Boolean update) {
		this.update = update;
	}
	public Integer getPageId() {
		return pageId;
	}
	public void setPageId(Integer pageId) {
		this.pageId = pageId;
	}
	public String getPageName() {
		return pageName;
	}
	public void setPageName(String pageName) {
		this.pageName = pageName;
	}
	public String getComponentUrl() {
		return componentUrl;
	}
	public void setComponentUrl(String componentUrl) {
		this.componentUrl = componentUrl;
	}
	public String getPageIcon() {
		return pageIcon;
	}
	public void setPageIcon(String pageIcon) {
		this.pageIcon = pageIcon;
	}
	public Integer getDisplayOrder() {
		return displayOrder;
	}
	public void setDisplayOrder(Integer displayOrder) {
		this.displayOrder = displayOrder;
	}
	public Boolean getPageActiveStatus() {
		return pageActiveStatus;
	}
	public void setPageActiveStatus(Boolean pageActiveStatus) {
		this.pageActiveStatus = pageActiveStatus;
	}
    
    

}
