package day11_demo02;

import day11_demo01.User;

public class AccessUser implements IUser
{
	public void insert1(User user)
	{
		System.out.println("在Access中给User表增加一条记录");
	}

	public User getUser1(int id)
	{
		System.out.println("在Access中根据ID得到User表一条记录");
		return null;
	}

	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
