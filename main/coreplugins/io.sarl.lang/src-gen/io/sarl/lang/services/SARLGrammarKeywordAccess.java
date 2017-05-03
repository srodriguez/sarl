/*
 * $Id$
 *
 * File is automatically generated by the Xtext language generator.
 * Do not change it.
 *
 * SARL is an general-purpose agent programming language.
 * More details on http://www.sarl.io
 *
 * Copyright (C) 2014-2017 the original authors or authors.
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
package io.sarl.lang.services;

import com.google.inject.Inject;
import java.lang.ref.SoftReference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import org.eclipse.xtext.util.Strings;

/** Set of SARL keywords that are not directly supported by the
 * {@link SARLGrammarAccess} or hardly accessible.
 */
@SuppressWarnings("all")
public class SARLGrammarKeywordAccess {

	@Inject
	private SARLGrammarAccess grammarAccess;

	/** Keyword: {@code def}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getDefKeyword() {
		return this.grammarAccess.getInnerVarIDAccess().getDefKeyword_5().getValue();
	}

	/** Keyword: {@code artifact}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getArtifactKeyword() {
		return this.grammarAccess.getTypeAccess().getArtifactKeyword_2_6_2().getValue();
	}

	/** Keyword: {@code protected}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getProtectedKeyword() {
		return this.grammarAccess.getInnerVarIDAccess().getProtectedKeyword_17().getValue();
	}

	/** Keyword: {@code else}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getElseKeyword() {
		return this.grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0().getValue();
	}

	/** Keyword: {@code catch}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getCatchKeyword() {
		return this.grammarAccess.getXCatchClauseAccess().getCatchKeyword_0().getValue();
	}

	/** Keyword: {@code if}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getIfKeyword() {
		return this.grammarAccess.getXIfExpressionAccess().getIfKeyword_1().getValue();
	}

	/** Keyword: {@code case}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getCaseKeyword() {
		return this.grammarAccess.getXCasePartAccess().getCaseKeyword_2_0().getValue();
	}

	/** Keyword: {@code val}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getValKeyword() {
		return this.grammarAccess.getFieldModifierAccess().getValKeyword_0().getValue();
	}

	/** Keyword: {@code !}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getExclamationMarkKeyword() {
		return this.grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0().getValue();
	}

	/** Keyword: {@code #}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getNumberSignKeyword() {
		return this.grammarAccess.getXListLiteralAccess().getNumberSignKeyword_1().getValue();
	}

	/** Keyword: {@code %}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getPercentSignKeyword() {
		return this.grammarAccess.getOpMultiAccess().getPercentSignKeyword_3().getValue();
	}

	/** Keyword: {@code var}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getVarKeyword() {
		return this.grammarAccess.getFieldModifierAccess().getVarKeyword_1().getValue();
	}

	/** Keyword: {@code &}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getAmpersandKeyword() {
		return this.grammarAccess.getJvmLowerBoundAndedAccess().getAmpersandKeyword_0().getValue();
	}

	/** Keyword: {@code (}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getLeftParenthesisKeyword() {
		return this.grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0().getValue();
	}

	/** Keyword: {@code )}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getRightParenthesisKeyword() {
		return this.grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2().getValue();
	}

	/** Keyword: {@code *}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getWildcardAsteriskKeyword() {
		return this.grammarAccess.getXImportDeclarationAccess().getWildcardAsteriskKeyword_1_0_3_0_0().getValue();
	}

	/** Keyword: {@code +}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getPlusSignKeyword() {
		return this.grammarAccess.getOpUnaryAccess().getPlusSignKeyword_2().getValue();
	}

	/** Keyword: {@code ,}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getCommaKeyword() {
		return this.grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_4_2_2_0().getValue();
	}

	/** Keyword: {@code -}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getHyphenMinusKeyword() {
		return this.grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1().getValue();
	}

	/** Keyword: {@code enum}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getEnumKeyword() {
		return this.grammarAccess.getInnerVarIDAccess().getEnumKeyword_7().getValue();
	}

	/** Keyword: {@code .}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getFullStopKeyword() {
		return this.grammarAccess.getQualifiedNameInStaticImportAccess().getFullStopKeyword_1().getValue();
	}

	/** Keyword: {@code /}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getSolidusKeyword() {
		return this.grammarAccess.getOpMultiAccess().getSolidusKeyword_2().getValue();
	}

	/** Keyword: {@code as}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getAsKeyword() {
		return this.grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1().getValue();
	}

	/** Keyword: {@code fires}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getFiresKeyword() {
		return this.grammarAccess.getMemberAccess().getFiresKeyword_2_2_8_1_0().getValue();
	}

	/** Keyword: {@code transient}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getTransientKeyword() {
		return this.grammarAccess.getInnerVarIDAccess().getTransientKeyword_24().getValue();
	}

	/** Keyword: {@code :}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getColonKeyword() {
		return this.grammarAccess.getXCasePartAccess().getColonKeyword_3_0_0().getValue();
	}

	/** Keyword: {@code ;}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getSemicolonKeyword() {
		return this.grammarAccess.getXImportDeclarationAccess().getSemicolonKeyword_2().getValue();
	}

	/** Keyword: {@code <}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getLessThanSignKeyword() {
		return this.grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_4_2_0().getValue();
	}

	/** Keyword: {@code !=}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getExclamationMarkEqualsSignKeyword() {
		return this.grammarAccess.getOpEqualityAccess().getExclamationMarkEqualsSignKeyword_1().getValue();
	}

	/** Keyword: {@code =}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getEqualsSignKeyword() {
		return this.grammarAccess.getOpCompareAccess().getEqualsSignKeyword_1_1().getValue();
	}

	/** Keyword: {@code >}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getGreaterThanSignKeyword() {
		return this.grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_4_2_3().getValue();
	}

	/** Keyword: {@code requires}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getRequiresKeyword() {
		return this.grammarAccess.getAOPMemberAccess().getRequiresKeyword_2_2_1().getValue();
	}

	/** Keyword: {@code ?}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getQuestionMarkKeyword() {
		return this.grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1().getValue();
	}

	/** Keyword: {@code @}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getCommercialAtKeyword() {
		return this.grammarAccess.getXAnnotationAccess().getCommercialAtKeyword_1().getValue();
	}

	/** Keyword: {@code **}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getAsteriskAsteriskKeyword() {
		return this.grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1().getValue();
	}

	/** Keyword: {@code ::}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getColonColonKeyword() {
		return this.grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1().getValue();
	}

	/** Keyword: {@code extension}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getExtensionExtensionKeyword() {
		return this.grammarAccess.getXImportDeclarationAccess().getExtensionExtensionKeyword_1_0_1_0().getValue();
	}

	/** Keyword: {@code capacity}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getCapacityKeyword() {
		return this.grammarAccess.getTypeAccess().getCapacityKeyword_2_1_2().getValue();
	}

	/** Keyword: {@code default}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getDefaultKeyword() {
		return this.grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_5_0().getValue();
	}

	/** Keyword: {@code *=}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getAsteriskEqualsSignKeyword() {
		return this.grammarAccess.getOpMultiAssignAccess().getAsteriskEqualsSignKeyword_2().getValue();
	}

	/** Keyword: {@code native}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getNativeKeyword() {
		return this.grammarAccess.getInnerVarIDAccess().getNativeKeyword_21().getValue();
	}

	/** Keyword: {@code [}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getLeftSquareBracketKeyword() {
		return this.grammarAccess.getArrayBracketsAccess().getLeftSquareBracketKeyword_0().getValue();
	}

	/** Keyword: {@code override}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getOverrideKeyword() {
		return this.grammarAccess.getInnerVarIDAccess().getOverrideKeyword_13().getValue();
	}

	/** Keyword: {@code event}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getEventKeyword() {
		return this.grammarAccess.getTypeAccess().getEventKeyword_2_0_2().getValue();
	}

	/** Keyword: {@code behavior}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getBehaviorKeyword() {
		return this.grammarAccess.getTypeAccess().getBehaviorKeyword_2_3_2().getValue();
	}

	/** Keyword: {@code ]}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getRightSquareBracketKeyword() {
		return this.grammarAccess.getArrayBracketsAccess().getRightSquareBracketKeyword_1().getValue();
	}

	/** Keyword: {@code typeof}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getTypeofKeyword() {
		return this.grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1().getValue();
	}

	/** Keyword: {@code annotation}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getAnnotationKeyword() {
		return this.grammarAccess.getInnerVarIDAccess().getAnnotationKeyword_2().getValue();
	}

	/** Keyword: {@code ++}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getPlusSignPlusSignKeyword() {
		return this.grammarAccess.getOpPostfixAccess().getPlusSignPlusSignKeyword_0().getValue();
	}

	/** Keyword: {@code break}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getBreakKeyword() {
		return this.grammarAccess.getBreakExpressionAccess().getBreakKeyword_1().getValue();
	}

	/** Keyword: {@code abstract}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getAbstractKeyword() {
		return this.grammarAccess.getInnerVarIDAccess().getAbstractKeyword_1().getValue();
	}

	/** Keyword: {@code +=}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getPlusSignEqualsSignKeyword() {
		return this.grammarAccess.getOpMultiAssignAccess().getPlusSignEqualsSignKeyword_0().getValue();
	}

	/** Keyword: {@code throw}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getThrowKeyword() {
		return this.grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1().getValue();
	}

	/** Keyword: {@code {}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getLeftCurlyBracketKeyword() {
		return this.grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1().getValue();
	}

	/** Keyword: {@code ..<}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getFullStopFullStopLessThanSignKeyword() {
		return this.grammarAccess.getOpOtherAccess().getFullStopFullStopLessThanSignKeyword_1().getValue();
	}

	/** Keyword: {@code |}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getExplicitSyntaxVerticalLineKeyword() {
		return this.grammarAccess.getXShortClosureAccess().getExplicitSyntaxVerticalLineKeyword_0_0_2_0().getValue();
	}

	/** Keyword: {@code }}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getRightCurlyBracketKeyword() {
		return this.grammarAccess.getXBlockExpressionAccess().getRightCurlyBracketKeyword_3().getValue();
	}

	/** Keyword: {@code return}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getReturnKeyword() {
		return this.grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1().getValue();
	}

	/** Keyword: {@code ||}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getVerticalLineVerticalLineKeyword() {
		return this.grammarAccess.getOpOrAccess().getVerticalLineVerticalLineKeyword().getValue();
	}

	/** Keyword: {@code synchronized}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getSynchronizedKeyword() {
		return this.grammarAccess.getXSynchronizedExpressionAccess().getSynchronizedKeyword_0_0_1().getValue();
	}

	/** Keyword: {@code !==}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getExclamationMarkEqualsSignEqualsSignKeyword() {
		return this.grammarAccess.getOpEqualityAccess().getExclamationMarkEqualsSignEqualsSignKeyword_3().getValue();
	}

	/** Keyword: {@code agent}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getAgentKeyword() {
		return this.grammarAccess.getTypeAccess().getAgentKeyword_2_2_2().getValue();
	}

	/** Keyword: {@code <>}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getLessThanSignGreaterThanSignKeyword() {
		return this.grammarAccess.getOpOtherAccess().getLessThanSignGreaterThanSignKeyword_7().getValue();
	}

	/** Keyword: {@code dispatch}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getDispatchKeyword() {
		return this.grammarAccess.getInnerVarIDAccess().getDispatchKeyword_6().getValue();
	}

	/** Keyword: {@code do}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getDoKeyword() {
		return this.grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1().getValue();
	}

	/** Keyword: {@code while}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getWhileKeyword() {
		return this.grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3().getValue();
	}

	/** Keyword: {@code space}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getSpaceKeyword() {
		return this.grammarAccess.getTypeAccess().getSpaceKeyword_2_5_2().getValue();
	}

	/** Keyword: {@code ===}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getEqualsSignEqualsSignEqualsSignKeyword() {
		return this.grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignEqualsSignKeyword_2().getValue();
	}

	/** Keyword: {@code ==}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getEqualsSignEqualsSignKeyword() {
		return this.grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0().getValue();
	}

	/** Keyword: {@code --}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getHyphenMinusHyphenMinusKeyword() {
		return this.grammarAccess.getOpPostfixAccess().getHyphenMinusHyphenMinusKeyword_1().getValue();
	}

	/** Keyword: {@code new}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getNewKeyword() {
		return this.grammarAccess.getXbaseConstructorCallAccess().getNewKeyword_1().getValue();
	}

	/** Keyword: {@code =>}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getEqualsSignGreaterThanSignKeyword() {
		return this.grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1().getValue();
	}

	/** Keyword: {@code package}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getPackageKeyword() {
		return this.grammarAccess.getInnerVarIDAccess().getPackageKeyword_14().getValue();
	}

	/** Keyword: {@code static}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getStaticStaticKeyword() {
		return this.grammarAccess.getXImportDeclarationAccess().getStaticStaticKeyword_1_0_0_0().getValue();
	}

	/** Keyword: {@code finally}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getFinallyKeyword() {
		return this.grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0().getValue();
	}

	/** Keyword: {@code strictfp}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getStrictfpKeyword() {
		return this.grammarAccess.getInnerVarIDAccess().getStrictfpKeyword_20().getValue();
	}

	/** Keyword: {@code throws}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getThrowsKeyword() {
		return this.grammarAccess.getInnerVarIDAccess().getThrowsKeyword_19().getValue();
	}

	/** Keyword: {@code -=}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getHyphenMinusEqualsSignKeyword() {
		return this.grammarAccess.getOpMultiAssignAccess().getHyphenMinusEqualsSignKeyword_1().getValue();
	}

	/** Keyword: {@code ->}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getHyphenMinusGreaterThanSignKeyword() {
		return this.grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0().getValue();
	}

	/** Keyword: {@code extends}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getExtendsKeyword() {
		return this.grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0().getValue();
	}

	/** Keyword: {@code null}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getNullKeyword() {
		return this.grammarAccess.getXNullLiteralAccess().getNullKeyword_1().getValue();
	}

	/** Keyword: {@code final}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getFinalKeyword() {
		return this.grammarAccess.getInnerVarIDAccess().getFinalKeyword_9().getValue();
	}

	/** Keyword: {@code %=}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getPercentSignEqualsSignKeyword() {
		return this.grammarAccess.getOpMultiAssignAccess().getPercentSignEqualsSignKeyword_4().getValue();
	}

	/** Keyword: {@code true}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getIsTrueTrueKeyword() {
		return this.grammarAccess.getXBooleanLiteralAccess().getIsTrueTrueKeyword_1_1_0().getValue();
	}

	/** Keyword: {@code try}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getTryKeyword() {
		return this.grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1().getValue();
	}

	/** Keyword: {@code >=}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getGreaterThanSignEqualsSignKeyword() {
		return this.grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0().getValue();
	}

	/** Keyword: {@code implements}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getImplementsKeyword() {
		return this.grammarAccess.getInnerVarIDAccess().getImplementsKeyword_10().getValue();
	}

	/** Keyword: {@code &&}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getAmpersandAmpersandKeyword() {
		return this.grammarAccess.getOpAndAccess().getAmpersandAmpersandKeyword().getValue();
	}

	/** Keyword: {@code ..}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getFullStopFullStopKeyword() {
		return this.grammarAccess.getOpOtherAccess().getFullStopFullStopKeyword_3().getValue();
	}

	/** Keyword: {@code private}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getPrivateKeyword() {
		return this.grammarAccess.getInnerVarIDAccess().getPrivateKeyword_16().getValue();
	}

	/** Keyword: {@code import}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getImportKeyword() {
		return this.grammarAccess.getXImportDeclarationAccess().getImportKeyword_0().getValue();
	}

	/** Keyword: {@code for}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getForKeyword() {
		return this.grammarAccess.getXBasicForLoopExpressionAccess().getForKeyword_1().getValue();
	}

	/** Keyword: {@code interface}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getInterfaceKeyword() {
		return this.grammarAccess.getInnerVarIDAccess().getInterfaceKeyword_12().getValue();
	}

	/** Keyword: {@code switch}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getSwitchKeyword() {
		return this.grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1().getValue();
	}

	/** Keyword: {@code ?.}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getNullSafeQuestionMarkFullStopKeyword() {
		return this.grammarAccess.getXMemberFeatureCallAccess().getNullSafeQuestionMarkFullStopKeyword_1_1_0_0_1_1_0().getValue();
	}

	/** Keyword: {@code public}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getPublicKeyword() {
		return this.grammarAccess.getInnerVarIDAccess().getPublicKeyword_15().getValue();
	}

	/** Keyword: {@code skill}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getSkillKeyword() {
		return this.grammarAccess.getTypeAccess().getSkillKeyword_2_4_2().getValue();
	}

	/** Keyword: {@code ?:}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getQuestionMarkColonKeyword() {
		return this.grammarAccess.getOpOtherAccess().getQuestionMarkColonKeyword_8().getValue();
	}

	/** Keyword: {@code class}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getClassKeyword() {
		return this.grammarAccess.getInnerVarIDAccess().getClassKeyword_3().getValue();
	}

	/** Keyword: {@code on}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getOnKeyword() {
		return this.grammarAccess.getAOPMemberAccess().getOnKeyword_2_0_1().getValue();
	}

	/** Keyword: {@code false}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getFalseKeyword() {
		return this.grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0().getValue();
	}

	/** Keyword: {@code volatile}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getVolatileKeyword() {
		return this.grammarAccess.getInnerVarIDAccess().getVolatileKeyword_22().getValue();
	}

	/** Keyword: {@code /=}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getSolidusEqualsSignKeyword() {
		return this.grammarAccess.getOpMultiAssignAccess().getSolidusEqualsSignKeyword_3().getValue();
	}

	/** Keyword: {@code instanceof}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getInstanceofKeyword() {
		return this.grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1().getValue();
	}

	/** Keyword: {@code super}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getSuperKeyword() {
		return this.grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0().getValue();
	}

	/** Keyword: {@code with}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getWithKeyword() {
		return this.grammarAccess.getMemberAccess().getWithKeyword_2_2_8_2_0().getValue();
	}

	/** Keyword: {@code uses}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getUsesKeyword() {
		return this.grammarAccess.getAOPMemberAccess().getUsesKeyword_2_1_1().getValue();
	}

	private static final String VOID = "void";

	/** Keyword: {@code void}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getVoidKeyword() {
		return VOID;
	}

	private static final String THIS = "this";

	/** Keyword: {@code this}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getThisKeyword() {
		return THIS;
	}

	private static final String IT = "it";

	/** Keyword: {@code it}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getItKeyword() {
		return IT;
	}

	private static final String OCCURRENCE = "occurrence";

	/** Keyword: {@code occurrence}.
	 * Source: io.sarl.lang.SARL
	 */
	public String getOccurrenceKeyword() {
		return OCCURRENCE;
	}

	private SoftReference<Set<String>> allKeywords;

	/** Replies the SARL keywords.
	 * @return the SARL keywords.
	 * @see #getPureKeywords()
	 */
	public Set<String> getKeywords() {
		Set<String> kws = this.allKeywords == null ? null : this.allKeywords.get();
		if (kws == null) {
			kws = new TreeSet<>();
			kws.add(getAsKeyword());
			kws.add(getIfKeyword());
			kws.add(getSynchronizedKeyword());
			kws.add(getClassKeyword());
			kws.add(getVolatileKeyword());
			kws.add(getRequiresKeyword());
			kws.add(getFalseKeyword());
			kws.add(getWithKeyword());
			kws.add(getItKeyword());
			kws.add(getSwitchKeyword());
			kws.add(getExtendsKeyword());
			kws.add(getFinalKeyword());
			kws.add(getSuperKeyword());
			kws.add(getProtectedKeyword());
			kws.add(getArtifactKeyword());
			kws.add(getPrivateKeyword());
			kws.add(getAnnotationKeyword());
			kws.add(getFinallyKeyword());
			kws.add(getReturnKeyword());
			kws.add(getWhileKeyword());
			kws.add(getSpaceKeyword());
			kws.add(getInstanceofKeyword());
			kws.add(getBreakKeyword());
			kws.add(getPublicKeyword());
			kws.add(getIsTrueTrueKeyword());
			kws.add(getTryKeyword());
			kws.add(getOnKeyword());
			kws.add(getCapacityKeyword());
			kws.add(getEventKeyword());
			kws.add(getVarKeyword());
			kws.add(getImportKeyword());
			kws.add(getAgentKeyword());
			kws.add(getTransientKeyword());
			kws.add(getNullKeyword());
			kws.add(getCaseKeyword());
			kws.add(getInterfaceKeyword());
			kws.add(getThisKeyword());
			kws.add(getDispatchKeyword());
			kws.add(getEnumKeyword());
			kws.add(getAbstractKeyword());
			kws.add(getUsesKeyword());
			kws.add(getSkillKeyword());
			kws.add(getDefKeyword());
			kws.add(getFiresKeyword());
			kws.add(getOverrideKeyword());
			kws.add(getThrowKeyword());
			kws.add(getElseKeyword());
			kws.add(getForKeyword());
			kws.add(getDefaultKeyword());
			kws.add(getNativeKeyword());
			kws.add(getThrowsKeyword());
			kws.add(getCatchKeyword());
			kws.add(getDoKeyword());
			kws.add(getBehaviorKeyword());
			kws.add(getExtensionExtensionKeyword());
			kws.add(getStaticStaticKeyword());
			kws.add(getImplementsKeyword());
			kws.add(getValKeyword());
			kws.add(getNewKeyword());
			kws.add(getStrictfpKeyword());
			kws.add(getVoidKeyword());
			kws.add(getTypeofKeyword());
			kws.add(getPackageKeyword());
			kws.add(getOccurrenceKeyword());
			this.allKeywords = new SoftReference<>(kws);
		}
		return Collections.unmodifiableSet(kws);
	}

	/** Replies if the given string of characters is a SARL keyword.
	 * @param str the string of characters.
	 * @return <code>true</code> if the string of characters is a SARL keyword.
	 */
	public boolean isKeyword(String str) {
		assert !Strings.isEmpty(str);
		return getKeywords().contains(str);
	}

	private SoftReference<Set<String>> pureSarlKeywords;

	/** Replies the pure SARL keywords.
	 * Pure SARL keywords are SARL keywords that are not Java keywords.
	 * @return the pure SARL keywords.
	 */
	public Set<String> getPureKeywords() {
		Set<String> kws = this.pureSarlKeywords == null ? null : this.pureSarlKeywords.get();
		if (kws == null) {
			kws = new HashSet<>();
			kws.add(getAsKeyword());
			kws.add(getRequiresKeyword());
			kws.add(getWithKeyword());
			kws.add(getItKeyword());
			kws.add(getArtifactKeyword());
			kws.add(getAnnotationKeyword());
			kws.add(getSpaceKeyword());
			kws.add(getOnKeyword());
			kws.add(getCapacityKeyword());
			kws.add(getEventKeyword());
			kws.add(getVarKeyword());
			kws.add(getAgentKeyword());
			kws.add(getDispatchKeyword());
			kws.add(getUsesKeyword());
			kws.add(getSkillKeyword());
			kws.add(getDefKeyword());
			kws.add(getFiresKeyword());
			kws.add(getOverrideKeyword());
			kws.add(getBehaviorKeyword());
			kws.add(getExtensionExtensionKeyword());
			kws.add(getValKeyword());
			kws.add(getTypeofKeyword());
			kws.add(getOccurrenceKeyword());
			this.pureSarlKeywords = new SoftReference<>(kws);
		}
		return Collections.unmodifiableSet(kws);
	}

	/** Replies if the given string of characters is a pure SARL keyword.
	 * Pure SARL keywords are SARL keywords that are not Java keywords.
	 * @param str the string of characters.
	 * @return <code>true</code> if the string of characters is a SARL keyword.
	 */
	public boolean isPureKeyword(String str) {
		assert !Strings.isEmpty(str);
		return getPureKeywords().contains(str);
	}

	/** Protect the given text if it is a keyword.
	 * @param text the text to protect.
	 * @return the protected text.
	 */
	public String protectKeyword(String text) {
		if (!Strings.isEmpty(text) && isKeyword(text)) {
			return "^" + text;
		}
		return text;
	}

}

