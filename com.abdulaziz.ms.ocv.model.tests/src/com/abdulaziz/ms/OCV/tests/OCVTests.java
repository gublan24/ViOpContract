/**
 */
package com.abdulaziz.ms.OCV.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>OCV</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class OCVTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new OCVTests("OCV Tests");
		suite.addTestSuite(VContractPreconditionTest.class);
		suite.addTestSuite(VContractPostconditionTest.class);
		suite.addTestSuite(VCValueTest.class);
		suite.addTestSuite(VCEqualityTest.class);
		suite.addTestSuite(VCInstanceTest.class);
		suite.addTestSuite(VCInstanceFieldTest.class);
		suite.addTestSuite(VCAssociationTest.class);
		suite.addTestSuite(VCParameterTest.class);
		suite.addTestSuite(VCOperationBoxTest.class);
		suite.addTestSuite(VCReturnTest.class);
		suite.addTestSuite(VCCollectionBoxTest.class);
		suite.addTestSuite(VCLoopTest.class);
		suite.addTestSuite(VCAlternativeBoxTest.class);
		suite.addTestSuite(VContractAlternativeBoxTest.class);
		suite.addTestSuite(VContractCollectionBoxTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCVTests(String name) {
		super(name);
	}

} //OCVTests
