package day11_demo02;

import day11_demo01.User;

public class Main
{
	public static void main(String[] args)
	{
		User user = new User();

		IFactory factory = new SqlServerFactory();

		IUser iu = factory.createUser();

		iu.insert(user);
		iu.getUser(1);
	}
}

