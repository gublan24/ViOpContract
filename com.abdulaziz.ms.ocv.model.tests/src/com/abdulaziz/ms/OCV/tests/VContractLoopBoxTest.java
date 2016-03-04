/**
 */
package com.abdulaziz.ms.OCV.tests;

import com.abdulaziz.ms.OCV.OCVFactory;
import com.abdulaziz.ms.OCV.VContractLoopBox;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>VContract Loop Box</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VContractLoopBoxTest extends VContractConditionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VContractLoopBoxTest.class);
	}

	/**
	 * Constructs a new VContract Loop Box test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VContractLoopBoxTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this VContract Loop Box test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected VContractLoopBox getFixture() {
		return (VContractLoopBox)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OCVFactory.eINSTANCE.createVContractLoopBox());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //VContractLoopBoxTest
