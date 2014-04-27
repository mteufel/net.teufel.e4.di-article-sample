package net.teufel.di.services;

import net.teufel.di.ICounterService;

import org.eclipse.e4.core.di.annotations.Creatable;

// Wenn Sie nur eine einzige Instanz des CounterService wünschen, 
// aktivieren Sie nachfolgende Annotation:
//@Singleton
@Creatable
public class CounterService implements ICounterService {

	private int count = 0;
	
	public int getCounter() {
		return count;
	}

	@Override
	public void incrementCounter() {
		count = count + 1;
	}
		
}
