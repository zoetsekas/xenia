package com.tsekas.metamodel.ui.service;

import java.util.UUID;
import org.eclipse.emf.ecore.EObject;

public class General {

	public String getIdentifier(EObject eObject) {
		return UUID.randomUUID().toString();
	}
}
