/* 
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package za.co.mmagon.jwebswing.plugins.jqueryui.draggable;

import za.co.mmagon.jwebswing.Component;
import za.co.mmagon.jwebswing.Feature;
import za.co.mmagon.jwebswing.plugins.pools.jqueryui.JQUIReferencePool;

/**
 * Implements the JQuery Draggable functionality on an object
 *
 * @author MMagon
 * 		<p>
 * 		1.0 Complete API implemented
 * @version 1.0
 * @since 2014/04/13
 */
public class JQUIDraggableFeature extends Feature<JQUIDraggableOptions, JQUIDraggableFeature> implements JQUIDraggableFeatures
{

	private static final long serialVersionUID = 1L;
	private JQUIDraggableOptions draggableOptions = new JQUIDraggableOptions();

	/**
	 * Add the draggable to a component
	 * <p>
	 * Used to group sets of draggable and droppable items, in addition to droppable's accept option.
	 * A draggable with the same scope value as a droppable will be accepted by the droppable.
	 * <p>
	 *
	 * @param component
	 * 		The component that must get the feature
	 * @param scope
	 * 		The scope of this component.
	 */
	public JQUIDraggableFeature(Component component, String scope)
	{
		super("JWDraggableFeature");

		getJavascriptReferences().add(JQUIReferencePool.Core.getJavaScriptReference());
		getJavascriptReferences().add(JQUIReferencePool.Widget.getJavaScriptReference());
		getCssReferences().add(JQUIReferencePool.Core.getCssReference());
		getCssReferences().add(JQUIReferencePool.Widget.getCssReference());

		getJavascriptReferences().add(JQUIReferencePool.Mouse.getJavaScriptReference());
		getJavascriptReferences().add(JQUIReferencePool.Draggable.getJavaScriptReference());
		getCssReferences().add(JQUIReferencePool.Draggable.getCssReference());
		setComponent(component);
		getOptions().setScope(scope);
		getComponent().addFeature(this);
	}

	/**
	 * Creates the JQuery String for this feature
	 * <p>
	 */
	@Override
	public void assignFunctionsToComponent()
	{
		String draggableString = component.getJQueryID() + "draggable(";
		draggableString += draggableOptions;
		draggableString += ");" + getNewLine();
		addQuery(draggableString);
	}

	/**
	 * Gets this features available options
	 * <p>
	 *
	 * @return
	 */
	@Override
	public final JQUIDraggableOptions getOptions()
	{
		if (draggableOptions == null)
		{
			draggableOptions = new JQUIDraggableOptions();
		}
		return draggableOptions;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof JQUIDraggableFeature))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}

		JQUIDraggableFeature that = (JQUIDraggableFeature) o;

		if (!getComponent().equals(that.getComponent()))
		{
			return false;
		}
		return draggableOptions != null ? draggableOptions.equals(that.draggableOptions) : that.draggableOptions == null;
	}

	@Override
	public int hashCode()
	{
		int result = super.hashCode();
		result = 31 * result + getComponent().hashCode();
		result = 31 * result + (draggableOptions != null ? draggableOptions.hashCode() : 0);
		return result;
	}
}
