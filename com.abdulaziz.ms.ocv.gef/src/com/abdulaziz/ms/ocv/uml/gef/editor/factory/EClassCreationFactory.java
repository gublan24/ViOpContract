package com.abdulaziz.ms.ocv.uml.gef.editor.factory;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gef.requests.CreationFactory;

public class EClassCreationFactory implements CreationFactory {
	private EClass template;

	public EClassCreationFactory(EClass t) {
		this.template = t;
	}

	@Override
	public Object getNewObject() {
		if (template == null)
			return null;
		return EcoreUtil.create(template);
	}

	@Override
	public Object getObjectType() {
		return template;
	}
}