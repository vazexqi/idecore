/*******************************************************************************
 * Copyright (c) 2014 Salesforce.com, inc..
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Salesforce.com, inc. - initial API and implementation
 ******************************************************************************/
package com.salesforce.ide.ui.wizards.components.letterhead;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;

import com.salesforce.ide.core.internal.components.letterhead.LetterheadComponentController;
import com.salesforce.ide.core.project.ForceProjectException;
import com.salesforce.ide.ui.wizards.components.ComponentWizardPage;
import com.salesforce.ide.ui.wizards.components.generic.GenericComponentWizard;

/**
 * Wizard to create new Custom Application.
 *
 * @author cwall
 */
public class LetterheadWizard extends GenericComponentWizard {

    public LetterheadWizard() throws ForceProjectException {
        super();
        controller = new LetterheadComponentController();
    }

    public LetterheadWizard(IFolder folder) {
        super(folder, folder.getProject());
    }

    public LetterheadWizard(IFolder folder, IProject project) {
        super(folder, project);
    }

    @Override
    protected ComponentWizardPage getComponentWizardPageInstance() {
        return new LetterheadWizardPage(this);
    }
}
