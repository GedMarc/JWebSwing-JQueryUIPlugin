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
package com.jwebmp.plugins.jqueryui.button.options;

import com.jwebmp.core.base.servlets.enumarations.ComponentTypes;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

import jakarta.validation.constraints.NotNull;

/**
 * @author GedMarc
 * @since 27 Apr 2015
 */
public class JQUIButtonGroupOptions<J extends JQUIButtonGroupOptions<J>>
		extends JavaScriptPart<J>
{


	/**
	 * The component type.
	 */
	private String items;

	/**
	 * The button group options for
	 */
	public JQUIButtonGroupOptions()
	{
		//Nothing Needed
	}

	@NotNull
	public String getItems()
	{
		if (items != null)
		{
			return items;
		}
		else
		{
			return "";
		}
	}

	/**
	 * Set the items the button group will apply for
	 * <p>
	 *
	 * @param items
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setItems(ComponentTypes items)
	{
		this.items = items.getComponentTag();
		return (J) this;
	}
}
