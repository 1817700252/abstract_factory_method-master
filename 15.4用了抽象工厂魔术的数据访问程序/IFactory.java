package day11_demo03;

import day11_demo02.IUser;

public interface IFactory
{
	IUser createUser();

	IDepartment createDepartment();
}
