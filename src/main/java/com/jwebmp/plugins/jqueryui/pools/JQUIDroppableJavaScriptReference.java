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
package com.jwebmp.plugins.jqueryui.pools;

import com.jwebmp.core.base.references.JavascriptReference;

/**
 * @author GedMarc
 * @version 1.0
 * 		<p>
 * 		<p>
 * @since Mar 8, 2015
 */
class JQUIDroppableJavaScriptReference
		extends JavascriptReference
{

	/**
	 *
	 */
	public JQUIDroppableJavaScriptReference()
	{
		super("JWDroppableJS", 1.121, "bower_components/jquery-ui/jquery-ui.js", "https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.js");
		setSortOrder(23);
	}
}
