package cn.hm.bean;

public class User {
	//租赁天数
	private int day;
	//花费的费用
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