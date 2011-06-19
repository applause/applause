package org.applause.lang.ui.wizard;

import java.util.Arrays;

import org.applause.lang.ui.builder.BuildStrategyRegistry;
import org.applause.lang.ui.builder.MobilePlatform;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;

public class GeneratorFragmentSelectionWizardPage extends WizardPage {
	private class TableLabelProvider extends LabelProvider implements ITableLabelProvider {
		public Image getColumnImage(Object element, int columnIndex) {
			return null;
		}
		public String getColumnText(Object element, int columnIndex) {
			if (element instanceof MobilePlatform) {
				MobilePlatform platform = (MobilePlatform) element;
				return platform.getName();
			}
			return element.toString();
		}
	}
	private Table table;
	private CheckboxTableViewer checkboxTableViewer;

	/**
	 * Create the wizard.
	 */
	public GeneratorFragmentSelectionWizardPage() {
		super("platformSelectionPage");
		setTitle("Target Platform Selection");
		setDescription("Choose one or more target platforms for your project.");
	}

	/**
	 * Create contents of the wizard.
	 * @param parent
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);

		setControl(container);
		container.setLayout(new GridLayout(1, false));
		
		checkboxTableViewer = CheckboxTableViewer.newCheckList(container, SWT.BORDER | SWT.FULL_SELECTION);
		table = checkboxTableViewer.getTable();
		GridData gd_table = new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1);
		gd_table.heightHint = 272;
		gd_table.widthHint = 581;
		table.setLayoutData(gd_table);
		checkboxTableViewer.setLabelProvider(new TableLabelProvider());
		checkboxTableViewer.setContentProvider(new ArrayContentProvider());
		checkboxTableViewer.setInput(BuildStrategyRegistry.getSupportedMobilePlatforms());
	}
	
	public MobilePlatform[] getSelectedPlatforms() {
		Object[] checkedElements = checkboxTableViewer.getCheckedElements();
		MobilePlatform[] platforms = Arrays.asList(checkedElements).toArray(new MobilePlatform[checkedElements.length]);
		return platforms;
	}
	
}
