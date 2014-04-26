package net.teufel.di;

import javax.inject.Singleton;

import org.eclipse.e4.core.di.annotations.Creatable;

@Creatable @Singleton
public class CounterService {

	private int count = 0;
	
	public int getCounter() {
		return count;
	}
	
	public void increment() {
		count = count + 1;
	}
		
}
