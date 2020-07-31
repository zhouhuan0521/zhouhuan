package cn.hm.bean;

public class Car {
	//³µÅÆºÅ
	private String license;
	//Æû³µµÄÆ·ÅÆ
	private String brand;
    //ÊÇ·ñ×âÁÞ
	private boolean Status;
	//×âÁÞ½ð¶î
	private double money;
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public boolean isStatus() {
		return Status;
	}
	public void setStatus(boolean status) {
		Status = status;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}

}
