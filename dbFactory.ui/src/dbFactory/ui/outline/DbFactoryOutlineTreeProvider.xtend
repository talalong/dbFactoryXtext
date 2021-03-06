/*
 * generated by Xtext 2.12.0
 */
package dbFactory.ui.outline

import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider
import dbFactory.dbFactory.Attribute
import org.eclipse.xtext.ui.editor.outline.impl.DocumentRootNode
import dbFactory.dbFactory.Model

/**
 * Customization of the default outline structure.
 *
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#outline
 */
class DbFactoryOutlineTreeProvider extends DefaultOutlineTreeProvider {
	def _isLeaf(Attribute att){true}
	
	def void _createChildren(DocumentRootNode outlineNode, Model model){
		model.cmdTypes.forEach[
			object | createNode(outlineNode,object);
		]
	}
}
