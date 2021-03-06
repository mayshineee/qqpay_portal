package com.base.pojo.vo;

import java.util.List;

/**
 * θεζ¨‘εη±?
 * @author mrt
 *
 */
public class Menu implements java.io.Serializable{

	//δΊηΊ§θε
	private List<Menu> menus;
	//θεidγζ¨‘εid
	private String menuid;
	//εΎζ 
	private String icon;
	//θεεη§°/ζ¨‘εεη§°
	private String menuname;
	//θειΎζ₯
	private String url;
	
	//θεδΈηεεζδ½ιΎζ₯δΈΊδΊζιιΎζ₯
	private List<Operation> operations;

	public List<Menu> getMenus() {
		return menus;
	}

	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}

	public String getMenuid() {
		return menuid;
	}

	public void setMenuid(String menuid) {
		this.menuid = menuid;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getMenuname() {
		return menuname;
	}

	public void setMenuname(String menuname) {
		this.menuname = menuname;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	
	public List<Operation> getOperations() {
		return operations;
	}

	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}

	@Override
	public String toString() {
		return "Menu [menus=" + menus + ", menuid=" + menuid + ", icon=" + icon
				+ ", menuname=" + menuname + ", url=" + url + "]";
	}
	
	
	
	
	
	
}
