package cn.hm.bean;

public class Car {
	//���ƺ�
	private String license;
	//������Ʒ��
	private String brand;
    //�Ƿ�����
	private boolean Status;
	//���޽��
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
