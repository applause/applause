package org.applause.lang.scoping

import org.applause.lang.applauseDsl.DataSourceCall
import org.applause.lang.applauseDsl.DataType
import org.applause.lang.applauseDsl.Entity
import org.applause.lang.applauseDsl.EntityMemberCall
import org.applause.lang.applauseDsl.ListItemCell
import org.applause.lang.applauseDsl.UIComponentDeclaration
import org.applause.lang.applauseDsl.UIComponentMemberCall
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider

import static org.eclipse.xtext.scoping.Scopes.*
import org.applause.lang.applauseDsl.Section
import org.applause.lang.applauseDsl.DataSourceOutletCall

class ApplauseDslScopeProvider extends AbstractDeclarativeScopeProvider {
	
	def scope_DataSourceOutletCall_outlet(DataSourceCall ctx, EReference ref) {
		scopeFor(ctx.datasource.outlets)
	}
	
//	def scope_ListItemCell_configuration(ListItemCell ctx, EReference ref) {
//		scopeFor(ctx.type.members)
//	}
	
	def scope_UIComponentMemberCall_component(ListItemCell ctx, EReference ref) {
		scopeFor(ctx.type.members)
	}
	
	def private dispatch membersScope(UIComponentDeclaration type) {
		scopeFor(type.members)
	}
	
	def private dispatch membersScope(DataType type) {
		null
	}
	
	def scope_UIComponentMemberCall_member(UIComponentMemberCall ctx, EReference ref) {
		val type = ctx.component.type
		type.membersScope
	}
	
	def private dispatch attributesScope(DataType type) {
		null
	}
	
	def private dispatch attributesScope(Entity entity) {
		scopeFor(entity.attributes)
	}
	
	// TODO: still needed? yields correct?
	def scope_EntityMemberCall_head(ListItemCell ctx, EReference ref) {
		val type = ctx.datasource.outlet.yields.type
		type.attributesScope
	}
	
	def scope_EntityMemberCallTail_head(EntityMemberCall ctx, EReference ref) {
		val type = ctx.head.type
		type.attributesScope
	}
	
	def scope_ListItemCell_datasource(Section ctx, EReference ref) {
		scopeFor(newArrayList(ctx.datasource))
	}
	
	def scope_DataSourceOutletCall_outlet(DataSourceOutletCall ctx, EReference ref) {
		scopeFor(ctx.datasource.datasource.outlets);
	}
	
	// TODO seems to be superfluous
//	def scope_UIComponentMemberConfiguration_type(ListItemCell ctx, EReference ref) {
//		val members = ctx.type.members
//		val outer = scopeFor(members)
//		val inner = members.map[it]
//		scopeFor(inner, outer)
//	}

	// TODO seems to be superfluous 
//	def scope_AttributeReference_value(ListItemCell ctx, EReference ref) {
//		val type = ctx.nearestDataSource.yields.type
//		type.attributesScope
//	}
	
}