package net.jeeshop.services.manage.systemSetting.bean;import java.io.Serializable;public class SystemSetting extends net.jeeshop.services.common.SystemSetting implements Serializable {	private static final long serialVersionUID = 1L;	private java.util.List<String> imagesList;// 图集列表，页面显示	public void clear() {		super.clear();		clearList(imagesList);	}	public java.util.List<String> getImagesList() {		return imagesList;	}	public void setImagesList(java.util.List<String> imagesList) {		this.imagesList = imagesList;	}}