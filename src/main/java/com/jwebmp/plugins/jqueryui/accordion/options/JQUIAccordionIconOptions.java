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
package com.jwebmp.plugins.jqueryui.accordion.options;

import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

import jakarta.validation.constraints.NotNull;

/**
 * @author GedMarc
 * @version 1.0
 * 		<p>
 * @since Mar 8, 2015
 */
public class JQUIAccordionIconOptions<J extends JQUIAccordionIconOptions<J>>
		extends JavaScriptPart<J>
{


	private String header;
	private String activeHeader;

	/**
	 * Constructs a blank Icon Options Class
	 */
	public JQUIAccordionIconOptions()
	{
	}

	/**
	 * Constructs a new Icon Options Class
	 *
	 * @param header
	 * 		The icon for closed
	 * @param activeHeader
	 * 		The icon for open
	 */
	public JQUIAccordionIconOptions(String header, String activeHeader)
	{
		this.header = header;
		this.activeHeader = activeHeader;
	}

	/**
	 * Returns the icon class for closed
	 * <p>
	 *
	 * @return
	 */
	public String getHeader()
	{
		return header;
	}

	/**
	 * Sets the icon class for closed
	 * <p>
	 *
	 * @param header
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setHeader(String header)
	{
		this.header = header;
		return (J) this;
	}

	/**
	 * Gets the open icon
	 * <p>
	 *
	 * @return
	 */
	public String getActiveHeader()
	{
		return activeHeader;
	}

	/**
	 * Sets the open icon
	 * <p>
	 *
	 * @param activeHeader
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setActiveHeader(String activeHeader)
	{
		this.activeHeader = activeHeader;
		return (J) this;
	}
}
