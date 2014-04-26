package net.teufel.di;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.inject.Inject;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

public class PartImpl {
	private Text text;
	@Inject CounterService counterService;

	@Inject
	public PartImpl(Composite parent) {

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
				counterService.increment();
				text.setText(""+counterService.getCounter());
			}
		});
	}
}
