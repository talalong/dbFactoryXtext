/*
 * generated by Xtext 2.12.0
 */
package dbFactory.formatting2

import com.google.inject.Inject
import dbFactory.dbFactory.Command
import dbFactory.dbFactory.CommandType
import dbFactory.dbFactory.Model
import dbFactory.services.DbFactoryGrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class DbFactoryFormatter extends AbstractFormatter2 {
	
	@Inject extension DbFactoryGrammarAccess

	def dispatch void format(Model model, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (CommandType commandType : model.getCmdTypes()) {
			//commandType.format;	
			
		}
		
	}

	def dispatch void format(Command command, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		command.getObj.format;
		command.getDb.format;
		command.getQuery.format;
	}
	
	
	// TODO: implement for Object, Attribute, AttributeType, Database, Connection, Query, Select, Delete, Update
}