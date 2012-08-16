package org.applause.lang.validation

import org.applause.lang.applauseDsl.ApplauseDslPackage
import org.applause.lang.applauseDsl.Entity
import org.eclipse.xtext.validation.Check
import org.applause.lang.applauseDsl.ListItemCell
import org.applause.lang.applauseDsl.LoopKind

class ApplauseDslXtendValidator extends ApplauseDslJavaValidator {
	
	public static val ENTITY_NAME_MUST_BE_UPPERCASE = "org.applause.lang.validation.EntityNamesMustBeUppercase"
	public static val FOR_LOOP_SINGLE_INSTANCE = "org.applause.lang.validation.ForLoopSingleInstance"
	public static val FOREACH_LOOP_COLLECTION = "org.applause.lang.validation.ForLoopCollection"

	@Check
	def checkEntityStartsWithCapital(Entity entity) {
		if (!Character::isUpperCase(entity.name.charAt(0)))
			warning('Entity names must start with an uppercase letter.', ApplauseDslPackage::eINSTANCE.type_Name, ENTITY_NAME_MUST_BE_UPPERCASE)
	}
	
	@Check
	def	checkListItemCellForLoopOperatesOnSingleElement(ListItemCell cell) {
		if (cell.loop.value == LoopKind::FOR_VALUE)
			if (cell.datasource.outlet.yields.many)
				warning("'for' loops can not operate on collections. Please use 'foreach' instead.", ApplauseDslPackage::eINSTANCE.listItemCell_Loop, FOR_LOOP_SINGLE_INSTANCE)
				
		if (cell.loop.value == LoopKind::FOREACH_VALUE)
			if (!cell.datasource.outlet.yields.many)
				warning("'foreach' loops can not operate on single instances. Please use 'for' instead.", ApplauseDslPackage::eINSTANCE.listItemCell_Loop, FOREACH_LOOP_COLLECTION)
		
	}
}