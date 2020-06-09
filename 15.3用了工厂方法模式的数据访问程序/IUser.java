package day11_demo02;

import day11_demo01.User;

public interface IUser
{
	void insert(User user);

	User getUser(int id);
}

