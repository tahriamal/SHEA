/**
 */
package org.xtext.example.mydsl.myDsl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.example.mydsl.myDsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage
 * @generated
 */
public class MyDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MyDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = MyDslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case MyDslPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.CONFIGURATION:
      {
        configuration configuration = (configuration)theEObject;
        T result = caseconfiguration(configuration);
        if (result == null) result = caseModel(configuration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.NODE:
      {
        node node = (node)theEObject;
        T result = casenode(node);
        if (result == null) result = casehostedBy(node);
        if (result == null) result = casenotHostedBy(node);
        if (result == null) result = caserelationship(node);
        if (result == null) result = caseModel(node);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.COMPONENT:
      {
        component component = (component)theEObject;
        T result = casecomponent(component);
        if (result == null) result = casecollocated(component);
        if (result == null) result = caseseparated(component);
        if (result == null) result = caserelationship(component);
        if (result == null) result = caseModel(component);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.RELATIONSHIP:
      {
        relationship relationship = (relationship)theEObject;
        T result = caserelationship(relationship);
        if (result == null) result = caseModel(relationship);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.HOSTED_BY:
      {
        hostedBy hostedBy = (hostedBy)theEObject;
        T result = casehostedBy(hostedBy);
        if (result == null) result = caserelationship(hostedBy);
        if (result == null) result = caseModel(hostedBy);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.NOT_HOSTED_BY:
      {
        notHostedBy notHostedBy = (notHostedBy)theEObject;
        T result = casenotHostedBy(notHostedBy);
        if (result == null) result = caserelationship(notHostedBy);
        if (result == null) result = caseModel(notHostedBy);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.COLLOCATED:
      {
        collocated collocated = (collocated)theEObject;
        T result = casecollocated(collocated);
        if (result == null) result = caserelationship(collocated);
        if (result == null) result = caseModel(collocated);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.SEPARATED:
      {
        separated separated = (separated)theEObject;
        T result = caseseparated(separated);
        if (result == null) result = caserelationship(separated);
        if (result == null) result = caseModel(separated);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>configuration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseconfiguration(configuration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenode(node object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>component</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>component</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecomponent(component object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>relationship</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>relationship</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caserelationship(relationship object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>hosted By</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>hosted By</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casehostedBy(hostedBy object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>not Hosted By</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>not Hosted By</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenotHostedBy(notHostedBy object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>collocated</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>collocated</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecollocated(collocated object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>separated</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>separated</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseseparated(separated object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //MyDslSwitch
