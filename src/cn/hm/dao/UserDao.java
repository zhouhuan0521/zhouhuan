package cn.hm.dao;


public interface UserDao {
	/**
	 * -��������
	 * @param day
	 * @return
	 */
	void intDay(int day);
	/**
	 * ����Ʒ���ͺŲ�ѯ���ƺ�
	 * @param brank
	 * @param type
	 * @return
	 */
	String selectLicense(String brank,String type);

    /**
     * �����������۸�Ʒ���ͺŲ�ѯ���ѽ��
     * @param money
     * @param day
     * @param type
     * @param brank
     * @return
     */
    double costMoney(double money,int day,String type,String brank);
}    