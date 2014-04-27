package net.teufel.di.functions;

import net.teufel.di.services.CountBy10Service;

import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;

public class SimpleCounterServiceFunction extends ContextFunction {

	@Override
	public Object compute(IEclipseContext context, String contextKey) {
		
		return ContextInjectionFactory.make(CountBy10Service.class, context);
	
	}
	
}
