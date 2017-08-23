/*
 * Copyright (c) 2014 by Axway Software All brand or product names are
 * trademarks or registered trademarks of their respective holders. This
 * document and the software described in this document are the property of
 * Axway Software and are protected as Axway Software trade secrets. No part of
 * this work may be reproduced or disseminated in any form or by any means,
 * without the prior written permission of Axway Software.
 */
package com.axway.dojo.cdi.producer1;

public class Bar {

	private final String id;

	public Bar(final String id) {
		this.id = id;
	}

	public void execute() {
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "Bar [id=" + id + "]";
	}
}
