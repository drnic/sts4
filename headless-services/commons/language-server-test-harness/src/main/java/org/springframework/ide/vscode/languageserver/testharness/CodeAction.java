/*******************************************************************************
 * Copyright (c) 2017 Pivotal, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Pivotal, Inc. - initial API and implementation
 *******************************************************************************/
package org.springframework.ide.vscode.languageserver.testharness;

import org.eclipse.lsp4j.Command;

/**
 * Wrapper for the test harness to refer to and manipulate a
 * CodeAction.
 */
public class CodeAction {

	private final Command command;
	private LanguageServerHarness harness;

	public CodeAction(LanguageServerHarness harness, Command command) {
		super();
		this.harness = harness;

		this.command = command;
	}

	@Override
	public String toString() {
		return command.toString();
	}

	public String getLabel() {
		return command.getTitle();
	}

	public void perform() throws Exception {
		harness.perform(command);
	}

}
