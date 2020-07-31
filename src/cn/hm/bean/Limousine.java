package cn.hm.bean;

/**
 * ΩŒ≥µ¿‡
 * @author ASUS
 *
 */
public class Limousine extends Car {
	//–Õ∫≈
	private String type;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Limousine(String license,String brand,double money,String type,boolean Status) {
		this.setLicense(license);
		this.setBrand(brand);
		this.setMoney(money);
		this.setType(type);
		this.setStatus(Status);
	}

}
