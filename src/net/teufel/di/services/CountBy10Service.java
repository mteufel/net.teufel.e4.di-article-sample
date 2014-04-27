package net.teufel.di.services;

import net.teufel.di.ICounterService;

public class CountBy10Service implements ICounterService {

	private int count = 0;
	
	@Override
	public int getCounter() {
		return count;
	}

	@Override
	public void incrementCounter() {
		count = count + 10;
	}

}
