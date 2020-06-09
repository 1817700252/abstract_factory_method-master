package day11_demo03;

import day11_demo02.AccessUser;
import day11_demo02.IUser;

public class AccessFactory implements IFactory
{
	public IUser createUser()
	{
		return new AccessUser();
	}

	public IDepartment createDepartment()
	{
		return new AccessDepartment();
	}
}
