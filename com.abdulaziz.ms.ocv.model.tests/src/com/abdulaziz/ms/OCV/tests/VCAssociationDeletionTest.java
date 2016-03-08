/**
 */
package com.abdulaziz.ms.OCV.tests;

import com.abdulaziz.ms.OCV.OCVFactory;
import com.abdulaziz.ms.OCV.VCAssociationDeletion;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>VC Association Deletion</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VCAssociationDeletionTest extends VCEntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VCAssociationDeletionTest.class);
	}

	/**
	 * Constructs a new VC Association Deletion test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VCAssociationDeletionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this VC Association Deletion test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected VCAssociationDeletion getFixture() {
		return (VCAssociationDeletion)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OCVFactory.eINSTANCE.createVCAssociationDeletion());
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

} //VCAssociationDeletionTest
