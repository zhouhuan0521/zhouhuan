package cn.hm.dao.impl;
import cn.hm.bean.Limousine;
import cn.hm.bean.Passenger;
import cn.hm.bean.User;
import cn.hm.dao.UserDao;

public class UserDaoImpl implements UserDao {
	private static Limousine limousine[] = new Limousine[3];
	private static Passenger passenger[] = new Passenger[2];
	private User user= new User();
	static {
		limousine[0] = new Limousine("��A12345","�γ�",600,"��������GL8",false);
		limousine[1] = new Limousine("��A23456","�γ�",500,"����550i",false);
		limousine[2] = new Limousine("��A34567","�γ�",300,"���������",false);
		passenger[0] = new Passenger("��A12345","�ͳ�",800,true,false);
		passenger[1] = new Passenger("��A12345","�ͳ�",1500,false,false);
	}


	@Override
	public void intDay(int day) {
		// TODO Auto-generated method stub
		user.setDay(day);

	}

	@Override
	public String selectLicense(String brank, String type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double costMoney(double money, int day, String type, String brank) {
		// TODO Auto-generated method stub
		return 0;
	}

}
