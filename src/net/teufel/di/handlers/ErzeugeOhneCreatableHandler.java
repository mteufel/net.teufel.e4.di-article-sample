package net.teufel.di.handlers;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.workbench.modeling.EPartService;

public class ErzeugeOhneCreatableHandler {
		
	@Inject EPartService partService;
	@Inject MApplication app;
	
	@Execute
	public void execute() {
		
		app.getChildren().get(0).getChildren().add(partService.createPart("di-article-sample.partdescriptor.ohne-creatable"));
		app.getChildren().get(0).getChildren().add(partService.createPart("di-article-sample.partdescriptor.ohne-creatable"));
		app.getChildren().get(0).getChildren().add(partService.createPart("di-article-sample.partdescriptor.ohne-creatable"));
		
	}
	
}
