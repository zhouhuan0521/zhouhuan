package cn.hm.dao;


public interface UserDao {
	/**
	 * -输入天数
	 * @param day
	 * @return
	 */
	void intDay(int day);
	/**
	 * 根据品牌型号查询车牌号
	 * @param brank
	 * @param type
	 * @return
	 */
	String selectLicense(String brank,String type);

    /**
     * 根据天数，价格，品牌型号查询花费金额
     * @param money
     * @param day
     * @param type
     * @param brank
     * @return
     */
    double costMoney(double money,int day,String type,String brank);
}    