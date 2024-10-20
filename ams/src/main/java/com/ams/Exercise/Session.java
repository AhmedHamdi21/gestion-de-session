package com.ams.Exercise;

public class Session {
	
	String nom;
	String desc;
	String img;
	public Session(String nom, String desc, String img) {
		super();
		this.nom = nom;
		this.desc = desc;
		this.img = img;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	
	
	

}
