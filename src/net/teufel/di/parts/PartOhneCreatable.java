package net.teufel.di.parts;


import javax.inject.Inject;
import javax.inject.Named;

import net.teufel.di.ICounterService;
import net.teufel.di.services.CounterService;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

public class PartOhneCreatable {
	
	private Text text;
	
	@Inject	@Named("counterService") ICounterService counterService;
	//@Inject	@Named("simpleCounterService") ICounterService counterService;
	@Inject IEclipseContext context;
	
	@Inject
	public PartOhneCreatable(Composite parent) {

		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new RowLayout(SWT.HORIZONTAL));
		text = new Text(composite, SWT.BORDER);
		Button anzeigenButton = new Button(composite, SWT.NONE);
		anzeigenButton.setText("Zeige");
		anzeigenButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				text.setText(""+counterService.getCounter());
			}
		});
		Button incrementButton = new Button(composite, SWT.PUSH);
		incrementButton.setText("Hochzaehlen");
		incrementButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				counterService.incrementCounter();
				text.setText(""+counterService.getCounter());
			}
		});
		Button changeCounterButton = new Button(composite, SWT.PUSH);
		changeCounterButton.setText("Implementierung wechseln");
		changeCounterButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				context.modify("counterService", new CounterService());
			}
		});
				
	}
}
