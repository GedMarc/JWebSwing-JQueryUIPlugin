/*
 * Copyright (C) 2017 GedMarc
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
package com.jwebmp.plugins.jqueryui.controlgroup.options;

import com.jwebmp.core.base.servlets.enumarations.Orientation;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

import jakarta.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.Map;

/**
 * @author GedMarc
 * @since 27 Feb 2017
 */
public class JQUIControlGroupOptions<J extends JQUIControlGroupOptions<J>>
		extends JavaScriptPart<J>
{
	/**
	 * A map of the classes
	 */
	private Map<String, String> classes;
	/**
	 * The given direction
	 */
	private Orientation direction;
	/**
	 * If is disabled
	 */
	private Boolean disabled;
	/**
	 * The items class map
	 */
	private String items;
	/**
	 * If only the visible items are considered
	 */
	private Boolean onlyVisible;

	/**
	 * Constructs a new instance of the control group options
	 */
	public JQUIControlGroupOptions()
	{
		//Nothing needed
	}

	/**
	 * Specify additional classes to add to the widget's elements. Any of classes specified in the Theming section can be used as keys to
	 * override their value. To learn more about this option, check
	 * out the learn article about the classes option.
	 *
	 * @return
	 */
	public Map<String, String> getClasses()
	{
		if (classes == null)
		{
			classes = new HashMap<>();
		}
		return classes;
	}

	/**
	 * Specify additional classes to add to the widget's elements. Any of classes specified in the Theming section can be used as keys to
	 * override their value. To learn more about this option, check
	 * out the learn article about the classes option.
	 *
	 * @param classes
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setClasses(Map<String, String> classes)
	{
		this.classes = classes;
		return (J) this;
	}

	/**
	 * By default, controlgroup displays its controls in a horizontal layout. Use this option to use a vertical layout instead.
	 *
	 * @return
	 */
	public Orientation getDirection()
	{
		return direction;
	}

	/**
	 * By default, controlgroup displays its controls in a horizontal layout. Use this option to use a vertical layout instead.
	 *
	 * @param direction
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setDirection(Orientation direction)
	{
		this.direction = direction;
		return (J) this;
	}

	/**
	 * Disables the controlgroup if set to true.
	 *
	 * @return
	 */
	public Boolean getDisabled()
	{
		return disabled;
	}

	/**
	 * Disables the controlgroup if set to true.
	 *
	 * @param disabled
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setDisabled(Boolean disabled)
	{
		this.disabled = disabled;
		return (J) this;
	}

	/**
	 * Which descendant elements to initialize as their respective widgets. Two elements have special behavior: controlgroupLabel: Any
	 * elements matching the selector for this will be wrapped in a span
	 * with the ui-controlgroup-label-contents class. spinner: This uses a class selector as the value. Requires either adding the class
	 * manually or initializing the spinner manually. Can be
	 * overridden to use input[type=number], but that also requires custom CSS to remove the native number controls.
	 *
	 * @return
	 */
	public String getItems()
	{
		return items;
	}

	/**
	 * Which descendant elements to initialize as their respective widgets. Two elements have special behavior: controlgroupLabel: Any
	 * elements matching the selector for this will be wrapped in a span
	 * with the ui-controlgroup-label-contents class. spinner: This uses a class selector as the value. Requires either adding the class
	 * manually or initializing the spinner manually. Can be
	 * overridden to use input[type=number], but that also requires custom CSS to remove the native number controls.
	 *
	 * @param items
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setItems(String items)
	{
		this.items = items;
		return (J) this;
	}

	/**
	 * Sets whether to exclude invisible children in the assignment of rounded corners. When set to false, all children of a controlgroup
	 * are taken into account when assigning rounded corners,
	 * including hidden children. Thus, if, for example, the controlgroup's first child is hidden and the default horizontal layout is
	 * applied, the controlgroup will, in effect, not have rounded
	 * corners on the left edge. Likewise, if the controlgroup has a vertical layout and its first child is hidden, the controlgroup will
	 * not have rounded corners on the top edge.
	 *
	 * @return
	 */
	public Boolean getOnlyVisible()
	{
		return onlyVisible;
	}

	/**
	 * Sets whether to exclude invisible children in the assignment of rounded corners. When set to false, all children of a controlgroup
	 * are taken into account when assigning rounded corners,
	 * including hidden children. Thus, if, for example, the controlgroup's first child is hidden and the default horizontal layout is
	 * applied, the controlgroup will, in effect, not have rounded
	 * corners on the left edge. Likewise, if the controlgroup has a vertical layout and its first child is hidden, the controlgroup will
	 * not have rounded corners on the top edge.
	 *
	 * @param onlyVisible
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setOnlyVisible(Boolean onlyVisible)
	{
		this.onlyVisible = onlyVisible;
		return (J) this;
	}

}
