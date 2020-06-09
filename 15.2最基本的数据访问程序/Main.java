package day11_demo01;

public class Main
{
	public static void main(String[] args)
	{
		User user = new User();

		SqlServerUser su = new SqlServerUser();

		su.insert(user);

		su.getUser(1);
	}
}

