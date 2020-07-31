package cn.hm.bean;

/**
 * 客车类
 * @author ASUS
 *
 */
public class Passenger extends Car {
	//客车属性(几座)
	private boolean SeatCount;

	public boolean isSeatCount() {
		return SeatCount;
	}

	public void setSeatCount(boolean seatCount) {
		SeatCount = seatCount;
	}
	public Passenger(String license,String brand,double money,boolean SeatCount,boolean Status) {
		this.setLicense(license);
		this.setBrand(brand);
		this.setMoney(money);
		this.setSeatCount(SeatCount);
		this.setStatus(Status);
	}

}
