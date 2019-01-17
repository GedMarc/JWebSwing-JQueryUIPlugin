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
package com.jwebmp.plugins.jqueryui.datepicker;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.attributes.NoAttributes;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.jqueryui.datepicker.interfaces.IJQUIDatePicker;
import com.jwebmp.plugins.jqueryui.datepicker.interfaces.JQUIDatePickerChildren;
import com.jwebmp.plugins.jqueryui.datepicker.interfaces.JQUIDatePickerEvents;
import com.jwebmp.plugins.jqueryui.datepicker.interfaces.JQUIDatePickerFeatures;
import com.jwebmp.plugins.jqueryui.datepicker.options.JQUIDatePickerOptions;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * The DatePicker is tied to a standard form input field.
 * <p>
 * Focus on the input (click, or use the tab key) to open an interactive calendar in a small overlay. Choose a date, click elsewhere on
 * the page (blur the input), or hit the Esc key to close.
 * <p>
 * If a date is chosen, feedback is shown as the input's value.
 * <p>
 *
 * @author mmagon
 */
@ComponentInformation(name = "JQuery UI Date Picker",
		description = "Select a date from a popup or inline calendar",
		url = "http://jqueryui.com/datepicker/",
		wikiUrl = "https://github.com/GedMarc/JWebMP-JQueryUIPlugin/wiki")
public class JQUIDatePicker<J extends JQUIDatePicker<J>>
		extends Div<JQUIDatePickerChildren, NoAttributes, JQUIDatePickerFeatures, JQUIDatePickerEvents, J>
		implements IJQUIDatePicker
{


	private JQUIDatePickerFeature<?> inputFeature;

	/**
	 * Constructs a new date picker
	 */
	public JQUIDatePicker()
	{
		this(new Date());
	}

	/**
	 * Creates a new JWDatePicker for the selected date
	 * <p>
	 *
	 * @param selectedDate
	 */
	public JQUIDatePicker(Date selectedDate)
	{
		super();
		inputFeature = new JQUIDatePickerFeature(this);
		if (selectedDate != null)
		{
			inputFeature.getOptions()
			            .setDefaultDate(selectedDate.toString());
		}
		addFeature(inputFeature);
	}

	/**
	 * A neater view
	 *
	 * @return
	 */
	public IJQUIDatePicker asMe()
	{
		return this;
	}

	/**
	 * Returns the options of an item
	 * <p>
	 *
	 * @return
	 */
	@Override
	@NotNull
	public JQUIDatePickerOptions<?> getOptions()
	{
		return getInputFeature().getOptions();
	}

	/**
	 * Returns the feature of this date picker
	 * <p>
	 *
	 * @return
	 */
	@Override
	@NotNull
	public JQUIDatePickerFeature<?> getInputFeature()
	{
		if (inputFeature == null)
		{
			inputFeature = new JQUIDatePickerFeature<>(this);
		}
		return inputFeature;
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}
}
