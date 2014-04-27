package net.teufel.di.handlers;

import net.teufel.di.services.CountBy10Service;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.workbench.lifecycle.PostContextCreate;

@SuppressWarnings("restriction")
public class StartupLifeCycleHandler {
	
	@PostContextCreate
	public void execute(IEclipseContext context) {
		
		context.set("counterService", new CountBy10Service());
		context.declareModifiable("counterService");
		
	}
	
}
