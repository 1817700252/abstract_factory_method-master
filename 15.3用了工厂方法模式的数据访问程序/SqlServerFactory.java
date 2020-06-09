package day11_demo02;

public class SqlServerFactory implements IFactory
{

	public IUser createUser()
	{
		return new SqlServerUser();
	}

}