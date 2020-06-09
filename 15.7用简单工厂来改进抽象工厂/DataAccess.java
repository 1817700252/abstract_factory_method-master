package day11_demo04;

import day11_demo02.AccessUser;
import day11_demo02.IUser;
import day11_demo02.SqlServerUser;
import day11_demo03.AccessDepartment;
import day11_demo03.IDepartment;
import day11_demo03.SqlServerDepartment;

public class DataAccess
{
	private static final String	db	= "Sqlserver";

	public static IUser createUser()
	{
		IUser result = null;
		if ("Sqlserver".equals(db))
		{
			result = new SqlServerUser();
		}
		else if ("Access".equals(db))
		{
			result = new AccessUser();
		}

		return result;
	}

	public static IDepartment createDepartment()
	{
		IDepartment result = null;
		if ("Sqlserver".equals(db))
		{
			result = new SqlServerDepartment();
		}
		else if ("Access".equals(db))
		{
			result = new AccessDepartment();
		}

		return result;
	}
}
