package cn.hm.bean;

public class User {
	//��������
	private int day;
	//���ѵķ���
	private double cost;
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public User() {}
	public User(int day,double cost) {
		this.day = day;
		this.cost = cost;
	}

}