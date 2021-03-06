/*
 * $Id$
 *
 * SARL is an general-purpose agent programming language.
 * More details on http://www.sarl.io
 *
 * Copyright (C) 2014-2018 the original authors or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.sarl.docs.doclet.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.sarl.docs.doclet.utils.Utils;
import io.sarl.lang.annotation.DefaultValue;

/**
 * @author $Author: sgalland$
 * @version $FullVersion$
 * @mavengroupid $GroupId$
 * @mavenartifactid $ArtifactId$
 * @since 0.7
 */
@SuppressWarnings("all")
public final class UtilsTest {

	@Test
	public void isHiddenMember() {
		assertEquals(Utils.isHiddenMember("abc"), Utils.isHiddenMember("abc"));
		assertEquals(Utils.isHiddenMember("$abc"), Utils.isHiddenMember("$abc"));
	}

	@Test
	public void fixHiddenMember() {
		assertEquals(Utils.fixHiddenMember("abc"), Utils.fixHiddenMember("abc"));
		assertEquals(Utils.fixHiddenMember("$abc"), Utils.fixHiddenMember("$abc"));
	}

	@Test
	public void createNameForHiddenDefaultValueAttribute() {
		assertEquals(Utils.createNameForHiddenDefaultValueAttribute("abc"), Utils.createNameForHiddenDefaultValueAttribute("abc"));
	}

	@Test
	public void isSARLAnnotation() {
		assertEquals(Utils.fixHiddenMember("abc"), Utils.fixHiddenMember("abc"));
		assertEquals(Utils.fixHiddenMember(DefaultValue.class.getName()), Utils.fixHiddenMember(DefaultValue.class.getName()));
	}

}
