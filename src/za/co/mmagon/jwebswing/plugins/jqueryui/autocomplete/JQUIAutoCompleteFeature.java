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
package za.co.mmagon.jwebswing.plugins.jqueryui.autocomplete;

import com.fasterxml.jackson.annotation.JsonIgnore;
import za.co.mmagon.jwebswing.Feature;
import za.co.mmagon.jwebswing.base.html.Input;
import za.co.mmagon.jwebswing.plugins.jqueryui.autocomplete.interfaces.JQUIAutoCompleteFeatures;
import za.co.mmagon.jwebswing.plugins.jqueryui.autocomplete.options.JQUIAutoCompleteOptions;
import za.co.mmagon.jwebswing.plugins.pools.jqueryui.JQUIReferencePool;

import static za.co.mmagon.jwebswing.utilities.StaticStrings.STRING_CLOSING_BRACKET_SEMICOLON;

/**
 * @author MMagon
 * @version 1.0
 * @since 30 Mar 2013
 */
public class JQUIAutoCompleteFeature<J extends JQUIAutoCompleteFeature<J>> extends Feature<JQUIAutoCompleteOptions, J>
		implements JQUIAutoCompleteFeatures
{

	private static final long serialVersionUID = 1L;

	/**
	 * The component to display the list at
	 */
	@JsonIgnore
	private final Input menuDisplayAtComponent;
	/**
	 * Options
	 */
	@JsonIgnore
	private JQUIAutoCompleteOptions options;

	/**
	 * Constructs a new Auto Complete feature
	 *
	 * @param menuDisplayAtComponent
	 * 		The component to display at
	 */
	public JQUIAutoCompleteFeature(Input menuDisplayAtComponent)
	{
		super("JWAutoCompleteFeature");
		this.menuDisplayAtComponent = menuDisplayAtComponent;

		getJavascriptReferences().add(JQUIReferencePool.Core.getJavaScriptReference());
		getJavascriptReferences().add(JQUIReferencePool.Widget.getJavaScriptReference());
		getCssReferences().add(JQUIReferencePool.Core.getCssReference());
		getCssReferences().add(JQUIReferencePool.Widget.getCssReference());

		getJavascriptReferences().add(JQUIReferencePool.Position.getJavaScriptReference());
		getJavascriptReferences().add(JQUIReferencePool.Menu.getJavaScriptReference());
		getCssReferences().add(JQUIReferencePool.Menu.getCssReference());

		getJavascriptReferences().add(JQUIReferencePool.AutoComplete.getJavaScriptReference());
		getCssReferences().add(JQUIReferencePool.AutoComplete.getCssReference());

	}

	@Override
	public void assignFunctionsToComponent()
	{
		addQuery(menuDisplayAtComponent.getJQueryID() + "autocomplete(" + getOptions() + STRING_CLOSING_BRACKET_SEMICOLON + getNewLine());
	}

	/**
	 * Returns an instance of the auto complete options
	 * <p>
	 *
	 * @return
	 */
	@Override
	public JQUIAutoCompleteOptions getOptions()
	{
		if (options == null)
		{
			options = new JQUIAutoCompleteOptions();
		}
		return options;
	}

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}
}
