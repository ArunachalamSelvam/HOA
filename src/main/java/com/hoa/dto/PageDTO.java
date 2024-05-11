package com.hoa.dto;

import java.util.List;

public class PageDTO {

	    private Integer pageid;
	    private String name;
	    private String pageicon;
	    private String componenturl;
	    private Integer displayorder;
	    private Boolean activestatus;
//	    private List<RolePageDTO> listOfRolepage;

	    // Getters and Setters for all fields

	    public Integer getPageid() {
	        return pageid;
	    }

	    public void setPageid(Integer pageid) {
	        this.pageid = pageid;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getPageicon() {
	        return pageicon;
	    }

	    public void setPageicon(String pageicon) {
	        this.pageicon = pageicon;
	    }

	    public String getComponenturl() {
	        return componenturl;
	    }

	    public void setComponenturl(String componenturl) {
	        this.componenturl = componenturl;
	    }

	    public Integer getDisplayorder() {
	        return displayorder;
	    }

	    public void setDisplayorder(Integer displayorder) {
	        this.displayorder = displayorder;
	    }

	    public Boolean getActivestatus() {
	        return activestatus;
	    }

	    public void setActivestatus(Boolean activestatus) {
	        this.activestatus = activestatus;
	    }

//	    public List<RolePageDTO> getListOfRolepage() {
//	        return listOfRolepage;
//	    }
//
//	    public void setListOfRolepage(List<RolePageDTO> listOfRolepage) {
//	        this.listOfRolepage = listOfRolepage;
//	    }

		@Override
		public String toString() {
			return "PageDto [pageid=" + pageid + ", name=" + name + ", pageicon=" + pageicon + ", componenturl="
					+ componenturl + ", displayorder=" + displayorder + ", activestatus=" + activestatus
					+ ", listOfRolepage=" +  "]";
		}

		public PageDTO(Integer pageid, String name, String pageicon, String componenturl, Integer displayorder,
				Boolean activestatus) {
			super();
			this.pageid = pageid;
			this.name = name;
			this.pageicon = pageicon;
			this.componenturl = componenturl;
			this.displayorder = displayorder;
			this.activestatus = activestatus;
//			this.listOfRolepage = listOfRolepage;
		}

		public PageDTO() {
			super();
			// TODO Auto-generated constructor stub
		}

}
