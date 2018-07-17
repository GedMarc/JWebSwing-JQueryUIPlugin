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
package com.jwebmp.plugins.jqueryui.menu.options;

import com.jwebmp.htmlbuilder.javascript.JavaScriptPart;

import javax.validation.constraints.NotNull;

/**
 * @author GedMarc
 * @version 1.0
 * 		<p>
 * 		<p>
 * @since Mar 8, 2015
 */
public class JQUIMenuIconSet<J extends JQUIMenuIconSet<J>>
		extends JavaScriptPart<J>
{

	private static final long serialVersionUID = 1L;

	/**
	 * Sets the sub menu string
	 */
	private String subMenu;

	/**
	 * Returns the class for the sub menu icon
	 * <p>
	 *
	 * @return
	 */
	public String getSubMenu()
	{
		return subMenu;
	}

	/**
	 * Sets the class name for the sub menu icon set
	 * <p>
	 *
	 * @param subMenu
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setSubMenu(String subMenu)
	{
		this.subMenu = subMenu;
		return (J) this;
	}

}