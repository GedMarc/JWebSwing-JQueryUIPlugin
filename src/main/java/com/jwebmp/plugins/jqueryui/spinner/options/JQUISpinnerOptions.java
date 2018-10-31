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
package com.jwebmp.plugins.jqueryui.spinner.options;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.plugins.globalize.cultures.GlobalizeCultures;

import javax.validation.constraints.NotNull;

/**
 * @author MXM3727
 */
public class JQUISpinnerOptions<J extends JQUISpinnerOptions<J>>
		extends JavaScriptPart<J>
{


	/**
	 * Sets the culture to use for parsing and formatting the value.<p>
	 * If null, the currently set culture in Globalize is used, see Globalize docs for available cultures.<p>
	 * Only relevant if the numberFormat option is set.<p>
	 * <p>
	 * Requires Globalize to be included.
	 */
	private GlobalizeCultures culture;
	/**
	 * Disables the spinner if set to true.
	 */
	private Boolean disabled;
	/**
	 * Icons to use for the button, matching an icon defined by the jQuery UI CSS Framework.<p>
	 * <p>
	 * button (string, default: "ui-icon-triangle-1-s")
	 */
	private SpinnerIconOptions<?> icons;
	/**
	 * <p>
	 * Controls the number of steps taken when holding down a spin button.
	 * <p>
	 * Multiple types supported:
	 * <p>
	 * Boolean: When set to true, the stepping delta will increase when spun incessantly.
	 * <p>
	 * When set to false, all steps are equal (as defined by the step option).
	 */
	private Boolean incremental;
	/**
	 * The maximum allowed value. The element's max attribute is used if it exists and the option is not explicitly set. If null, there is
	 * no maximum enforced.
	 */
	private Integer max;
	/**
	 * The maximum allowed value. The element's max attribute is used if it exists and the option is not explicitly set. If null, there is
	 * no maximum enforced.
	 */
	private Integer min;
	/**
	 * Format of numbers passed to Globalize, if available.
	 * <p>
	 * Most common are "n" for a decimal number and "C" for a currency value. Also see the culture option.
	 */
	private String numberFormat;
	/**
	 * The number of steps to take when paging via the pageUp/pageDown methods.
	 */
	private Integer page;
	/**
	 * The size of the step to take when spinning via buttons or via the stepUp()/stepDown() methods.
	 * <p>
	 * The element's step attribute is used if it exists and the option is not explicitly set.
	 */
	@JsonIgnore
	private Double step;
	/**
	 * If the value is an integer
	 */
	@JsonIgnore
	private boolean integer = true;

	/**
	 * Construct A Spinner
	 */
	public JQUISpinnerOptions()
	{
		//Nothing needed here
	}

	/**
	 * Sets the culture to use for parsing and formatting the value.
	 * <p>
	 * If null, the currently set culture in Globalize is used, see Globalize docs for available cultures.
	 * <p>
	 * Only relevant if the numberFormat option is set. Requires Globalize to be included.
	 *
	 * @return
	 */
	public GlobalizeCultures getCulture()
	{
		return culture;
	}

	/**
	 * Sets the culture to use for parsing and formatting the value.
	 * <p>
	 * If null, the currently set culture in Globalize is used, see Globalize docs for available cultures.<p>
	 * Only relevant if the numberFormat option is set. Requires Globalize to be included.
	 *
	 * @param culture
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setCulture(GlobalizeCultures culture)
	{
		this.culture = culture;
		return (J) this;
	}

	/**
	 * Disables the spinner if set to true.
	 *
	 * @return
	 */
	public Boolean getDisabled()
	{
		return disabled;
	}

	/**
	 * Disables the spinner if set to true.
	 *
	 * @param disabled
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setDisabled(Boolean disabled)
	{
		this.disabled = disabled;
		return (J) this;
	}

	/**
	 * Icons to use for the button, matching an icon defined by the jQuery UI CSS Framework.<p>
	 * <p>
	 * button (string, default: "ui-icon-triangle-1-s")
	 *
	 * @return
	 */
	public SpinnerIconOptions<?> getIcons()
	{
		return icons;
	}

	/**
	 * Icons to use for the button, matching an icon defined by the jQuery UI CSS Framework.<p>
	 * <p>
	 * button (string, default: "ui-icon-triangle-1-s")
	 *
	 * @param icons
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setIcons(SpinnerIconOptions<?> icons)
	{
		this.icons = icons;
		return (J) this;
	}

	/**
	 * <p>
	 * Controls the number of steps taken when holding down a spin button.
	 * <p>
	 * Multiple types supported:
	 * <p>
	 * Boolean: When set to true, the stepping delta will increase when spun incessantly.
	 * <p>
	 * When set to false, all steps are equal (as defined by the step option).
	 *
	 * @return
	 */
	public Boolean getIncremental()
	{
		return incremental;
	}

	/**
	 * <p>
	 * Controls the number of steps taken when holding down a spin button.
	 * <p>
	 * Multiple types supported:
	 * <p>
	 * Boolean: When set to true, the stepping delta will increase when spun incessantly.
	 * <p>
	 * When set to false, all steps are equal (as defined by the step option).
	 *
	 * @param incremental
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setIncremental(Boolean incremental)
	{
		this.incremental = incremental;
		return (J) this;
	}

	/**
	 * The maximum allowed value. The element's max attribute is used if it exists and the option is not explicitly set. If null, there is
	 * no maximum enforced.
	 *
	 * @return
	 */
	public Integer getMax()
	{
		return max;
	}

	/**
	 * The maximum allowed value. The element's max attribute is used if it exists and the option is not explicitly set. If null, there is
	 * no maximum enforced.
	 *
	 * @param max
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setMax(Integer max)
	{
		this.max = max;
		return (J) this;
	}

	/**
	 * The minimum allowed value. The element's minimum attribute is used if it exists and the option is not explicitly set. If null,
	 * there is no minimum enforced.
	 *
	 * @return
	 */
	public Integer getMin()
	{
		return min;
	}

	/**
	 * The minimum allowed value. The element's minimum attribute is used if it exists and the option is not explicitly set. If null,
	 * there is no minimum enforced.
	 *
	 * @param min
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setMin(Integer min)
	{
		this.min = min;
		return (J) this;
	}

	/**
	 * Format of numbers passed to Globalize, if available.
	 * <p>
	 * Most common are "n" for a decimal number and "C" for a currency value. Also see the culture option.
	 *
	 * @return
	 */
	public String getNumberFormat()
	{
		return numberFormat;
	}

	/**
	 * Format of numbers passed to Globalize, if available.
	 * <p>
	 * Most common are "n" for a decimal number and "C" for a currency value. Also see the culture option.
	 *
	 * @param numberFormat
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setNumberFormat(String numberFormat)
	{
		this.numberFormat = numberFormat;
		return (J) this;
	}

	/**
	 * The number of steps to take when paging via the pageUp/pageDown methods.
	 *
	 * @return
	 */
	public Integer getPage()
	{
		return page;
	}

	/**
	 * The number of steps to take when paging via the pageUp/pageDown methods.
	 *
	 * @param page
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setPage(Integer page)
	{
		this.page = page;
		return (J) this;
	}

	/**
	 * Sets the incremental stepping
	 *
	 * @return
	 */
	@JsonProperty(value = "step")
	public Object getStep()
	{
		if (getInteger())
		{
			return step.intValue();
		}
		else
		{
			return step;
		}
	}

	/**
	 * Returns if the spinner is changing integers or doubles Default true
	 *
	 * @return
	 */
	public Boolean getInteger()
	{
		return integer;
	}

	/**
	 * Sets if the spinner is rendering integers or doubles. Default true
	 *
	 * @param integer
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setInteger(Boolean integer)
	{
		this.integer = integer;
		return (J) this;
	}

	/**
	 * Sets the incremental stepping
	 *
	 * @param step
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setStep(Integer step)
	{
		this.step = new Double(step);
		setInteger(true);
		return (J) this;
	}

	/**
	 * Sets the incremental stepping
	 *
	 * @param step
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setStep(Double step)
	{
		this.step = step;
		setInteger(false);
		return (J) this;
	}

}
