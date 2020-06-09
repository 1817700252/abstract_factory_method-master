package day11_demo04;

import day11_demo01.User;
import day11_demo02.IUser;
import day11_demo03.Department;
import day11_demo03.IDepartment;

public class Main
{
	public static void main(String[] args)
	{
		User user = new User();
		Department department = new Department();

		IUser iu = DataAccess.createUser();

		iu.insert(user);
		iu.getUser(1);

		IDepartment id = DataAccess.createDepartment();

		id.insert(department);
		id.getDepartment(1);
	}
}
