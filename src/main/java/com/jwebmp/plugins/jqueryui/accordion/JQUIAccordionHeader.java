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
package com.jwebmp.plugins.jqueryui.accordion;

import com.jwebmp.core.base.html.H3;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.plugins.jqueryui.accordion.interfaces.JQUIAccordionChildren;

/**
 * @author GedMarc
 * @since 26 Feb 2017
 */
public class JQUIAccordionHeader<J extends JQUIAccordionHeader<J>>
		extends H3<J>
		implements JQUIAccordionChildren
{


	/**
	 * An accordion header
	 */
	public JQUIAccordionHeader()
	{

	}

	/**
	 * Constructs with a text
	 *
	 * @param text
	 */
	public JQUIAccordionHeader(String text)
	{
		super(text);
	}

}
