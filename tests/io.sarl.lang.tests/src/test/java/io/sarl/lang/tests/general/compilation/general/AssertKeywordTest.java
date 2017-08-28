/*
 * Copyright (C) 2014-2017 the original authors or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.sarl.lang.tests.general.compilation.general;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import io.sarl.lang.SARLVersion;
import io.sarl.lang.sarl.SarlAction;
import io.sarl.lang.sarl.SarlAgent;
import io.sarl.lang.sarl.SarlPackage;
import io.sarl.lang.sarl.SarlScript;
import io.sarl.lang.validation.IssueCodes;
import io.sarl.tests.api.AbstractSarlTest;

import org.eclipse.xtext.serializer.ISerializer;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotationsPackage;
import org.eclipse.xtext.xbase.testing.CompilationTestHelper;
import org.eclipse.xtext.xtype.XtypePackage;
import org.junit.Test;

import com.google.common.base.Strings;
import com.google.inject.Inject;

/**
 * @author $Author: sgalland$
 * @version $Name$ $Revision$ $Date$
 * @mavengroupid $GroupId$
 * @mavenartifactid $ArtifactId$
 */
@SuppressWarnings("all")
public class AssertKeywordTest extends AbstractSarlTest {

	@Inject
	private CompilationTestHelper compiler;

	@Test
	public void assertTrue() throws Exception {
		String source = multilineString(
				"agent A1 {",
				"  def fct(x : int) : int {",
				"    assert true",
				"    return x + 1",
				"  }",
				"}"
				);
		final String expected = multilineString(
				"import io.sarl.lang.annotation.SarlElementType;",
				"import io.sarl.lang.annotation.SarlSpecification;",
				"import io.sarl.lang.annotation.SyntheticMember;",
				"import io.sarl.lang.core.Agent;",
				"import io.sarl.lang.core.BuiltinCapacitiesProvider;",
				"import java.util.UUID;",
				"import javax.inject.Inject;",
				"import org.eclipse.xtext.xbase.lib.Pure;",
				"",
				"@SarlSpecification(\"" + SARLVersion.SPECIFICATION_RELEASE_VERSION_STRING + "\")",
				"@SarlElementType(" + SarlPackage.SARL_AGENT + ")",
				"@SuppressWarnings(\"all\")",
				"public class A1 extends Agent {",
				"  @Pure",
				"  protected int fct(final int x) {",
				"    assert true;",
				"    return (x + 1);",
				"  }",
				"  ",
				"  @SyntheticMember",
				"  public A1(final UUID arg0, final UUID arg1) {",
				"    super(arg0, arg1);",
				"  }",
				"  ",
				"  @SyntheticMember",
				"  @Inject",
				"  public A1(final BuiltinCapacitiesProvider arg0, final UUID arg1, final UUID arg2) {",
				"    super(arg0, arg1, arg2);",
				"  }",
				"}",
				"");
		this.compiler.assertCompilesTo(source, expected);
	}

	@Test
	public void assertBooleanTrue() throws Exception {
		String source = multilineString(
				"agent A1 {",
				"  def fct(x : int) : int {",
				"    assert Boolean::TRUE",
				"    return x + 1",
				"  }",
				"}"
				);
		final String expected = multilineString(
				"import io.sarl.lang.annotation.SarlElementType;",
				"import io.sarl.lang.annotation.SarlSpecification;",
				"import io.sarl.lang.annotation.SyntheticMember;",
				"import io.sarl.lang.core.Agent;",
				"import io.sarl.lang.core.BuiltinCapacitiesProvider;",
				"import java.util.UUID;",
				"import javax.inject.Inject;",
				"import org.eclipse.xtext.xbase.lib.Pure;",
				"",
				"@SarlSpecification(\"" + SARLVersion.SPECIFICATION_RELEASE_VERSION_STRING + "\")",
				"@SarlElementType(" + SarlPackage.SARL_AGENT + ")",
				"@SuppressWarnings(\"all\")",
				"public class A1 extends Agent {",
				"  @Pure",
				"  protected int fct(final int x) {",
				"    assert true;",
				"    return (x + 1);",
				"  }",
				"  ",
				"  @SyntheticMember",
				"  public A1(final UUID arg0, final UUID arg1) {",
				"    super(arg0, arg1);",
				"  }",
				"  ",
				"  @SyntheticMember",
				"  @Inject",
				"  public A1(final BuiltinCapacitiesProvider arg0, final UUID arg1, final UUID arg2) {",
				"    super(arg0, arg1, arg2);",
				"  }",
				"}",
				"");
		this.compiler.assertCompilesTo(source, expected);
	}

	@Test
	public void assertFalse() throws Exception {
		String source = multilineString(
				"agent A1 {",
				"  def fct(x : int) : int {",
				"    assert false",
				"    return x + 1",
				"  }",
				"}"
				);
		final String expected = multilineString(
				"import io.sarl.lang.annotation.SarlElementType;",
				"import io.sarl.lang.annotation.SarlSpecification;",
				"import io.sarl.lang.annotation.SyntheticMember;",
				"import io.sarl.lang.core.Agent;",
				"import io.sarl.lang.core.BuiltinCapacitiesProvider;",
				"import java.util.UUID;",
				"import javax.inject.Inject;",
				"import org.eclipse.xtext.xbase.lib.Pure;",
				"",
				"@SarlSpecification(\"" + SARLVersion.SPECIFICATION_RELEASE_VERSION_STRING + "\")",
				"@SarlElementType(" + SarlPackage.SARL_AGENT + ")",
				"@SuppressWarnings(\"all\")",
				"public class A1 extends Agent {",
				"  @Pure",
				"  protected int fct(final int x) {",
				"    assert false;",
				"    return (x + 1);",
				"  }",
				"  ",
				"  @SyntheticMember",
				"  public A1(final UUID arg0, final UUID arg1) {",
				"    super(arg0, arg1);",
				"  }",
				"  ",
				"  @SyntheticMember",
				"  @Inject",
				"  public A1(final BuiltinCapacitiesProvider arg0, final UUID arg1, final UUID arg2) {",
				"    super(arg0, arg1, arg2);",
				"  }",
				"}",
				"");
		this.compiler.assertCompilesTo(source, expected);
	}

	@Test
	public void assertBooleanFalse() throws Exception {
		String source = multilineString(
				"agent A1 {",
				"  def fct(x : int) : int {",
				"    assert Boolean::FALSE",
				"    return x + 1",
				"  }",
				"}"
				);
		final String expected = multilineString(
				"import io.sarl.lang.annotation.SarlElementType;",
				"import io.sarl.lang.annotation.SarlSpecification;",
				"import io.sarl.lang.annotation.SyntheticMember;",
				"import io.sarl.lang.core.Agent;",
				"import io.sarl.lang.core.BuiltinCapacitiesProvider;",
				"import java.util.UUID;",
				"import javax.inject.Inject;",
				"import org.eclipse.xtext.xbase.lib.Pure;",
				"",
				"@SarlSpecification(\"" + SARLVersion.SPECIFICATION_RELEASE_VERSION_STRING + "\")",
				"@SarlElementType(" + SarlPackage.SARL_AGENT + ")",
				"@SuppressWarnings(\"all\")",
				"public class A1 extends Agent {",
				"  @Pure",
				"  protected int fct(final int x) {",
				"    assert false;",
				"    return (x + 1);",
				"  }",
				"  ",
				"  @SyntheticMember",
				"  public A1(final UUID arg0, final UUID arg1) {",
				"    super(arg0, arg1);",
				"  }",
				"  ",
				"  @SyntheticMember",
				"  @Inject",
				"  public A1(final BuiltinCapacitiesProvider arg0, final UUID arg1, final UUID arg2) {",
				"    super(arg0, arg1, arg2);",
				"  }",
				"}",
				"");
		this.compiler.assertCompilesTo(source, expected);
	}

	@Test
	public void assertOnParameter() throws Exception {
		String source = multilineString(
				"agent A1 {",
				"  def fct(x : int) : int {",
				"    assert x > 0",
				"    return x + 1",
				"  }",
				"}"
				);
		final String expected = multilineString(
				"import io.sarl.lang.annotation.SarlElementType;",
				"import io.sarl.lang.annotation.SarlSpecification;",
				"import io.sarl.lang.annotation.SyntheticMember;",
				"import io.sarl.lang.core.Agent;",
				"import io.sarl.lang.core.BuiltinCapacitiesProvider;",
				"import java.util.UUID;",
				"import javax.inject.Inject;",
				"import org.eclipse.xtext.xbase.lib.Pure;",
				"",
				"@SarlSpecification(\"" + SARLVersion.SPECIFICATION_RELEASE_VERSION_STRING + "\")",
				"@SarlElementType(" + SarlPackage.SARL_AGENT + ")",
				"@SuppressWarnings(\"all\")",
				"public class A1 extends Agent {",
				"  @Pure",
				"  protected int fct(final int x) {",
				"    class $AssertEvaluator$ {",
				"      final boolean $$result;",
				"      $AssertEvaluator$() {",
				"        this.$$result = (x > 0);",
				"      }",
				"    }",
				"    assert new $AssertEvaluator$().$$result;",
				"    return (x + 1);",
				"  }",
				"  ",
				"  @SyntheticMember",
				"  public A1(final UUID arg0, final UUID arg1) {",
				"    super(arg0, arg1);",
				"  }",
				"  ",
				"  @SyntheticMember",
				"  @Inject",
				"  public A1(final BuiltinCapacitiesProvider arg0, final UUID arg1, final UUID arg2) {",
				"    super(arg0, arg1, arg2);",
				"  }",
				"}",
				"");
		this.compiler.assertCompilesTo(source, expected);
	}

	@Test
	public void assertComplexBooleanExpression() throws Exception {
		String source = multilineString(
				"agent A1 {",
				"  def fct(x : int) : int {",
				"    var y = x + 1",
				"    assert x > 0 && y < 100",
				"    return x + 1",
				"  }",
				"}"
				);
		final String expected = multilineString(
				"import io.sarl.lang.annotation.SarlElementType;",
				"import io.sarl.lang.annotation.SarlSpecification;",
				"import io.sarl.lang.annotation.SyntheticMember;",
				"import io.sarl.lang.core.Agent;",
				"import io.sarl.lang.core.BuiltinCapacitiesProvider;",
				"import java.util.UUID;",
				"import javax.inject.Inject;",
				"import org.eclipse.xtext.xbase.lib.Pure;",
				"",
				"@SarlSpecification(\"" + SARLVersion.SPECIFICATION_RELEASE_VERSION_STRING + "\")",
				"@SarlElementType(" + SarlPackage.SARL_AGENT + ")",
				"@SuppressWarnings(\"all\")",
				"public class A1 extends Agent {",
				"  @Pure",
				"  protected int fct(final int x) {",
				"    int y = (x + 1);",
				"    class $AssertEvaluator$ {",
				"      final boolean $$result;",
				"      $AssertEvaluator$(final int y) {",
				"        this.$$result = ((x > 0) && (y < 100));",
				"      }",
				"    }",
				"    assert new $AssertEvaluator$(y).$$result;",
				"    return (x + 1);",
				"  }",
				"  ",
				"  @SyntheticMember",
				"  public A1(final UUID arg0, final UUID arg1) {",
				"    super(arg0, arg1);",
				"  }",
				"  ",
				"  @SyntheticMember",
				"  @Inject",
				"  public A1(final BuiltinCapacitiesProvider arg0, final UUID arg1, final UUID arg2) {",
				"    super(arg0, arg1, arg2);",
				"  }",
				"}",
				"");
		this.compiler.assertCompilesTo(source, expected);
	}

	@Test
	public void assertTrueWithMessage() throws Exception {
		String source = multilineString(
				"agent A1 {",
				"  def fct(x : int) : int {",
				"    assert true, \"Hello world!\"",
				"    return x + 1",
				"  }",
				"}"
				);
		final String expected = multilineString(
				"import io.sarl.lang.annotation.SarlElementType;",
				"import io.sarl.lang.annotation.SarlSpecification;",
				"import io.sarl.lang.annotation.SyntheticMember;",
				"import io.sarl.lang.core.Agent;",
				"import io.sarl.lang.core.BuiltinCapacitiesProvider;",
				"import java.util.UUID;",
				"import javax.inject.Inject;",
				"import org.eclipse.xtext.xbase.lib.Pure;",
				"",
				"@SarlSpecification(\"" + SARLVersion.SPECIFICATION_RELEASE_VERSION_STRING + "\")",
				"@SarlElementType(" + SarlPackage.SARL_AGENT + ")",
				"@SuppressWarnings(\"all\")",
				"public class A1 extends Agent {",
				"  @Pure",
				"  protected int fct(final int x) {",
				"    assert true : \"Hello world!\";",
				"    return (x + 1);",
				"  }",
				"  ",
				"  @SyntheticMember",
				"  public A1(final UUID arg0, final UUID arg1) {",
				"    super(arg0, arg1);",
				"  }",
				"  ",
				"  @SyntheticMember",
				"  @Inject",
				"  public A1(final BuiltinCapacitiesProvider arg0, final UUID arg1, final UUID arg2) {",
				"    super(arg0, arg1, arg2);",
				"  }",
				"}",
				"");
		this.compiler.assertCompilesTo(source, expected);
	}

	@Test
	public void assertComplexBooleanExpressionWithMessage() throws Exception {
		String source = multilineString(
				"agent A1 {",
				"  def fct(x : int) : int {",
				"    var y = x + 1",
				"    assert x > 0 && y < 100, \"That's all, folks!\"",
				"    return x + 1",
				"  }",
				"}"
				);
		final String expected = multilineString(
				"import io.sarl.lang.annotation.SarlElementType;",
				"import io.sarl.lang.annotation.SarlSpecification;",
				"import io.sarl.lang.annotation.SyntheticMember;",
				"import io.sarl.lang.core.Agent;",
				"import io.sarl.lang.core.BuiltinCapacitiesProvider;",
				"import java.util.UUID;",
				"import javax.inject.Inject;",
				"import org.eclipse.xtext.xbase.lib.Pure;",
				"",
				"@SarlSpecification(\"" + SARLVersion.SPECIFICATION_RELEASE_VERSION_STRING + "\")",
				"@SarlElementType(" + SarlPackage.SARL_AGENT + ")",
				"@SuppressWarnings(\"all\")",
				"public class A1 extends Agent {",
				"  @Pure",
				"  protected int fct(final int x) {",
				"    int y = (x + 1);",
				"    class $AssertEvaluator$ {",
				"      final boolean $$result;",
				"      $AssertEvaluator$(final int y) {",
				"        this.$$result = ((x > 0) && (y < 100));",
				"      }",
				"    }",
				"    assert new $AssertEvaluator$(y).$$result : \"That\\'s all, folks!\";",
				"    return (x + 1);",
				"  }",
				"  ",
				"  @SyntheticMember",
				"  public A1(final UUID arg0, final UUID arg1) {",
				"    super(arg0, arg1);",
				"  }",
				"  ",
				"  @SyntheticMember",
				"  @Inject",
				"  public A1(final BuiltinCapacitiesProvider arg0, final UUID arg1, final UUID arg2) {",
				"    super(arg0, arg1, arg2);",
				"  }",
				"}",
				"");
		this.compiler.assertCompilesTo(source, expected);
	}

	@Test
	public void assertWithNotFinalLocalVariable() throws Exception {
		String source = multilineString(
				"agent A1 {",
				"  def fct(b : boolean) : Object {",
				"    val x = 1",
				"    var y = x + 1",
				"    var node = new Object",
				"    if (b) {",
				"      node = new Integer(1)",
				"    }",
				"    assert node.toString !== null && b && x < 100 && y > 0",
				"    return node",
				"  }",
				"}"
				);
		final String expected = multilineString(
				"import io.sarl.lang.annotation.SarlElementType;",
				"import io.sarl.lang.annotation.SarlSpecification;",
				"import io.sarl.lang.annotation.SyntheticMember;",
				"import io.sarl.lang.core.Agent;",
				"import io.sarl.lang.core.BuiltinCapacitiesProvider;",
				"import java.util.UUID;",
				"import javax.inject.Inject;",
				"import org.eclipse.xtext.xbase.lib.Pure;",
				"",
				"@SarlSpecification(\"" + SARLVersion.SPECIFICATION_RELEASE_VERSION_STRING + "\")",
				"@SarlElementType(" + SarlPackage.SARL_AGENT + ")",
				"@SuppressWarnings(\"all\")",
				"public class A1 extends Agent {",
				"  @Pure",
				"  protected Object fct(final boolean b) {",
				"    final int x = 1;", 
				"    int y = (x + 1);", 
				"    Object node = new Object();", 
				"    if (b) {", 
				"      Integer _integer = new Integer(1);", 
				"      node = _integer;", 
				"    }", 
				"    class $AssertEvaluator$ {", 
				"      final boolean $$result;", 
				"      $AssertEvaluator$(final Object node, final int y) {", 
				"        this.$$result = ((((node.toString() != null) && b) && (x < 100)) && (y > 0));", 
				"      }", 
				"    }", 
				"    assert new $AssertEvaluator$(node, y).$$result;", 
				"    return node;",
				"  }",
				"  ",
				"  @SyntheticMember",
				"  public A1(final UUID arg0, final UUID arg1) {",
				"    super(arg0, arg1);",
				"  }",
				"  ",
				"  @SyntheticMember",
				"  @Inject",
				"  public A1(final BuiltinCapacitiesProvider arg0, final UUID arg1, final UUID arg2) {",
				"    super(arg0, arg1, arg2);",
				"  }",
				"}",
				"");
		this.compiler.assertCompilesTo(source, expected);
	}

	@Test
	public void multipleAssertsWithNotFinalLocalVariable() throws Exception {
		String source = multilineString(
				"agent A1 {",
				"  def fct(b : boolean) : Object {",
				"    val x = 1",
				"    var y = x + 1",
				"    var node = new Object",
				"    if (b) {",
				"      node = new Integer(1)",
				"    }",
				"    assert node.toString !== null && b",
				"    assert x < 100 && y > 0",
				"    return node",
				"  }",
				"}"
				);
		final String expected = multilineString(
				"import io.sarl.lang.annotation.SarlElementType;",
				"import io.sarl.lang.annotation.SarlSpecification;",
				"import io.sarl.lang.annotation.SyntheticMember;",
				"import io.sarl.lang.core.Agent;",
				"import io.sarl.lang.core.BuiltinCapacitiesProvider;",
				"import java.util.UUID;",
				"import javax.inject.Inject;",
				"import org.eclipse.xtext.xbase.lib.Pure;",
				"",
				"@SarlSpecification(\"" + SARLVersion.SPECIFICATION_RELEASE_VERSION_STRING + "\")",
				"@SarlElementType(" + SarlPackage.SARL_AGENT + ")",
				"@SuppressWarnings(\"all\")",
				"public class A1 extends Agent {",
				"  @Pure",
				"  protected Object fct(final boolean b) {",
				"    final int x = 1;", 
				"    int y = (x + 1);", 
				"    Object node = new Object();", 
				"    if (b) {", 
				"      Integer _integer = new Integer(1);", 
				"      node = _integer;", 
				"    }", 
				"    class $AssertEvaluator$ {", 
				"      final boolean $$result;", 
				"      $AssertEvaluator$(final Object node) {", 
				"        this.$$result = ((node.toString() != null) && b);", 
				"      }", 
				"    }", 
				"    assert new $AssertEvaluator$(node).$$result;", 
				"    class $AssertEvaluator$_1 {", 
				"      final boolean $$result;", 
				"      $AssertEvaluator$_1(final int y) {", 
				"        this.$$result = ((x < 100) && (y > 0));", 
				"      }", 
				"    }", 
				"    assert new $AssertEvaluator$_1(y).$$result;", 
				"    return node;",
				"  }",
				"  ",
				"  @SyntheticMember",
				"  public A1(final UUID arg0, final UUID arg1) {",
				"    super(arg0, arg1);",
				"  }",
				"  ",
				"  @SyntheticMember",
				"  @Inject",
				"  public A1(final BuiltinCapacitiesProvider arg0, final UUID arg1, final UUID arg2) {",
				"    super(arg0, arg1, arg2);",
				"  }",
				"}",
				"");
		this.compiler.assertCompilesTo(source, expected);
	}

}
