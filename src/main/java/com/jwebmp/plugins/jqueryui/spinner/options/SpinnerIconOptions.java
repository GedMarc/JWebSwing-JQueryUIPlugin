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
package com.jwebmp.plugins.jqueryui.spinner.options;

import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

import javax.validation.constraints.NotNull;

/**
 * Icons to use for buttons, matching an icon provided by the jQuery UI CSS Framework.
 * <p>
 * up (string, default: "ui-icon-triangle-1-n")
 * <p>
 * down (string, default: "ui-icon-triangle-1-s")
 *
 * @author GedMarc
 * @version 1.0
 * 		<p>
 * @since Mar 9, 2015
 */
public class SpinnerIconOptions<J extends SpinnerIconOptions<J>>
		extends JavaScriptPart<J>
{


	/**
	 * Icons to use for the button, matching an icon defined by the jQuery UI CSS Framework.<p>
	 * <p>
	 * button (string, default: "ui-icon-triangle-1-s")
	 */
	private String up;
	/**
	 * Icons to use for the button, matching an icon defined by the jQuery UI CSS Framework.<p>
	 * <p>
	 * button (string, default: "ui-icon-triangle-1-s")
	 */
	private String down;

	/**
	 * Icons to use for the button, matching an icon defined by the jQuery UI CSS Framework.<p>
	 * <p>
	 * button (string, default: "ui-icon-triangle-1-s")
	 *
	 * @return Returns the up icon class
	 */
	public String getUp()
	{
		return up;
	}

	/**
	 * Icons to use for the button, matching an icon defined by the jQuery UI CSS Framework.<p>
	 * <p>
	 * button (string, default: "ui-icon-triangle-1-s")
	 *
	 * @param up
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setUp(String up)
	{
		this.up = up;
		return (J) this;
	}

	/**
	 * Icons to use for the button, matching an icon defined by the jQuery UI CSS Framework.<p>
	 * <p>
	 * button (string, default: "ui-icon-triangle-1-s")
	 *
	 * @return
	 */
	public String getDown()
	{
		return down;
	}

	/**
	 * Icons to use for the button, matching an icon defined by the jQuery UI CSS Framework.<p>
	 * <p>
	 * button (string, default: "ui-icon-triangle-1-s")
	 *
	 * @param down
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setDown(String down)
	{
		this.down = down;
		return (J) this;
	}
}
