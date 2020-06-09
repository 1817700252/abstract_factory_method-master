package day11_demo03;

import day11_demo02.IUser;
import day11_demo02.SqlServerUser;

public class SqlServerFactory implements IFactory
{
	public IUser createUser()
	{
		return new SqlServerUser();
	}

	public IDepartment createDepartment()
	{
		return new SqlServerDepartment();
	}
}
