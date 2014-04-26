package net.teufel.di;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.workbench.modeling.EPartService;


public class ErzeugeMitCreatableHandler {

	@Inject EPartService partService;
	@Inject MApplication app;
	
	@Execute
	public void execute() {
		
		app.getChildren().get(0).getChildren().clear();
		app.getChildren().get(0).getChildren().add(partService.createPart("test.partdescriptor.0"));
		app.getChildren().get(0).getChildren().add(partService.createPart("test.partdescriptor.0"));
		app.getChildren().get(0).getChildren().add(partService.createPart("test.partdescriptor.0"));
		
		
	}
	
}
