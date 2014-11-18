package com.semeureka.rcp.p101;

import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.part.ViewPart;

public class ProxyView extends ViewPart {
	public ProxyView() {
	}

	@Override
	public void createPartControl(Composite parent) {
		TreeViewer treeViewer = new TreeViewer(parent, SWT.BORDER);
		Tree proxyTree = treeViewer.getTree();
		hookContextMenu(treeViewer);
	}

	private void hookContextMenu(Viewer viewer) {
		MenuManager menuManager = new MenuManager();
		menuManager.setRemoveAllWhenShown(true);
		Menu contextMenu = menuManager.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(contextMenu);
		getSite().registerContextMenu(menuManager, viewer);
	}

	@Override
	public void setFocus() {
	}
}
