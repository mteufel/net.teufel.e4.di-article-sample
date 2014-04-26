package net.teufel.di;

import org.eclipse.e4.core.di.annotations.Creatable;

// Wenn Sie nur eine einzige Instanz des CounterService wünschen, 
// aktivieren Sie nachfolgende Annotation:
//@Singleton
@Creatable 
public class CounterService {

	private int count = 0;
	
	public int getCounter() {
		return count;
	}
	
	public void increment() {
		count = count + 1;
	}
		
}
