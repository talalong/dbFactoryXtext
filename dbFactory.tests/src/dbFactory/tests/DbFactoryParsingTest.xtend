/*
 * generated by Xtext 2.12.0
 */
package dbFactory.tests

import com.google.inject.Inject
import dbFactory.dbFactory.Model
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.eclipse.xtext.testing.validation.ValidationTestHelper

@RunWith(XtextRunner)
@InjectWith(DbFactoryInjectorProvider)
class DbFactoryParsingTest {
	@Inject
	ParseHelper<Model> parseHelper
	
	@Inject  ValidationTestHelper v
	
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
		Objekt Person 
				{
					Name:Text
					Alte: Zahl
				}
		Objekt Mitarbeiter{
			Person: Person
			
		}
		
		Objekt Student von Person{
			Matrikelnummer: Text
		}
			Objekt Person{
						Balh:Text
					}
		''')
		
		v.assertNoErrors(result)
//		Assert.assertNotNull(result)
//		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	@Test
	def void loadDatabase(){
		val result = parseHelper.parse(
		'''
	
						''')
		v.assertNoErrors(result)
//		Assert.assertNotNull(result)
//		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
}
