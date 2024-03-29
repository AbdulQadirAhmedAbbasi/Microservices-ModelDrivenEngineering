/**
 */
package microservices.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>microservices</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class MicroservicesTests extends TestSuite {

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
		TestSuite suite = new MicroservicesTests("microservices Tests");
		suite.addTestSuite(EnvironmentTest.class);
		suite.addTestSuite(VirtualMachineTest.class);
		suite.addTestSuite(ContainerTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicroservicesTests(String name) {
		super(name);
	}

} //MicroservicesTests
