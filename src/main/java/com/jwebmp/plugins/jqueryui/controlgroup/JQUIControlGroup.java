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
package com.jwebmp.plugins.jqueryui.controlgroup;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.plugins.ComponentInformation;

/**
 * @author GedMarc
 * @since 27 Feb 2017
 */
@ComponentInformation(name = "JQuery UI Control Group",
		description = "Groups multiple buttons and other widgets into one visual set.",
		url = "http://jqueryui.com/controlgroup/#default",
		wikiUrl = "https://github" + ".com/GedMarc/JWebSwing-JQueryUIPlugin/wiki")
public class JQUIControlGroup<J extends JQUIControlGroup<J>>
		extends DivSimple<J>
{


	/**
	 * Constructs a new control group div
	 */
	public JQUIControlGroup()
	{
		addFeature(new JQUIControlGroupFeature<>(this));
	}
}
