package cn.hm.bean;

/**
 * �ͳ���
 * @author ASUS
 *
 */
public class Passenger extends Car {
	//�ͳ�����(����)
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
