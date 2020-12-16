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
package com.jwebmp.plugins.jqueryui.events;

import com.jwebmp.core.Component;
import com.jwebmp.core.events.search.SearchAdapter;
import com.jwebmp.plugins.jqueryui.autocomplete.interfaces.JQUIAutoCompleteEvents;

/**
 * @author GedMarc
 * @since 27 Feb 2017
 */
public abstract class SearchEvent
		extends SearchAdapter<SearchEvent>
		implements JQUIAutoCompleteEvents
{


	public SearchEvent(Component component)
	{
		super(component);
	}
}
