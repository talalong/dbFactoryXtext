/**
 * generated by Xtext 2.12.0
 */
package dbFactory.dbFactory.util;

import dbFactory.dbFactory.Attribute;
import dbFactory.dbFactory.AttributeType;
import dbFactory.dbFactory.Command;
import dbFactory.dbFactory.DbFactoryPackage;
import dbFactory.dbFactory.ElementType;
import dbFactory.dbFactory.Model;
import dbFactory.dbFactory.ObjectType;
import dbFactory.dbFactory.StandartType;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see dbFactory.dbFactory.DbFactoryPackage
 * @generated
 */
public class DbFactoryAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DbFactoryPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DbFactoryAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = DbFactoryPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DbFactorySwitch<Adapter> modelSwitch =
    new DbFactorySwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseCommand(Command object)
      {
        return createCommandAdapter();
      }
      @Override
      public Adapter caseObject(dbFactory.dbFactory.Object object)
      {
        return createObjectAdapter();
      }
      @Override
      public Adapter caseAttribute(Attribute object)
      {
        return createAttributeAdapter();
      }
      @Override
      public Adapter caseAttributeType(AttributeType object)
      {
        return createAttributeTypeAdapter();
      }
      @Override
      public Adapter caseElementType(ElementType object)
      {
        return createElementTypeAdapter();
      }
      @Override
      public Adapter caseStandartType(StandartType object)
      {
        return createStandartTypeAdapter();
      }
      @Override
      public Adapter caseObjectType(ObjectType object)
      {
        return createObjectTypeAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link dbFactory.dbFactory.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dbFactory.dbFactory.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dbFactory.dbFactory.Command <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dbFactory.dbFactory.Command
   * @generated
   */
  public Adapter createCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dbFactory.dbFactory.Object <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dbFactory.dbFactory.Object
   * @generated
   */
  public Adapter createObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dbFactory.dbFactory.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dbFactory.dbFactory.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dbFactory.dbFactory.AttributeType <em>Attribute Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dbFactory.dbFactory.AttributeType
   * @generated
   */
  public Adapter createAttributeTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dbFactory.dbFactory.ElementType <em>Element Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dbFactory.dbFactory.ElementType
   * @generated
   */
  public Adapter createElementTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dbFactory.dbFactory.StandartType <em>Standart Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dbFactory.dbFactory.StandartType
   * @generated
   */
  public Adapter createStandartTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dbFactory.dbFactory.ObjectType <em>Object Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dbFactory.dbFactory.ObjectType
   * @generated
   */
  public Adapter createObjectTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //DbFactoryAdapterFactory