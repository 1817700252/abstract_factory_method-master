package day11_demo02;

public class AccessFactory implements IFactory
{
	public IUser createUser()
	{
		return new AccessUser();
	}
}
