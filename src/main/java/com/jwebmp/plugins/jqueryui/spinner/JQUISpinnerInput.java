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
package com.jwebmp.plugins.jqueryui.spinner;

import com.jwebmp.core.base.html.Input;
import com.jwebmp.core.base.html.interfaces.AttributeDefinitions;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.plugins.jqueryui.spinner.interfaces.JQUISpinnerChildren;

/**
 * @author GedMarc
 * @since 28 Feb 2017
 */
public class JQUISpinnerInput<J extends JQUISpinnerInput<J, A>, A extends Enum<?> & AttributeDefinitions>
		extends Input<A, J>
		implements JQUISpinnerChildren
{


	/**
	 * The spinner input
	 */
	public JQUISpinnerInput()
	{
		//Nothing Needed
	}
}
