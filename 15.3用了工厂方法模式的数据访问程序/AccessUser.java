package day11_demo02;

import day11_demo01.User;

public class AccessUser implements IUser
{
	public void insert1(User user)
	{
		System.out.println("��Access�и�User������һ����¼");
	}

	public User getUser1(int id)
	{
		System.out.println("��Access�и���ID�õ�User��һ����¼");
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
