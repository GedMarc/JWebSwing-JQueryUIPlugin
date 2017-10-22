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
package za.co.mmagon.jwebswing.plugins.jqueryui.tabs;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.base.html.ListItem;
import za.co.mmagon.jwebswing.base.html.attributes.NoAttributes;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;

/**
 * This class implements the JQuery UI implementation of a normal button
 *
 * @author MMagon
 * @version 1.0
 * @since 09 Mar 2013
 */
@ComponentInformation(name = "JQuery UI Tabs",
		description = "Tabs are generally used to break content into multiple sections that can be swapped to save space, much like an accordion",
		url = "http://jqueryui.com/tabs/", wikiUrl = "https://github.com/GedMarc/JWebSwing-JQueryUIPlugin/wiki")
public class JQUITabs extends Div<JQUITabsChildren, NoAttributes, JQUITabsFeatures, JQUITabsEvents, JQUITabs> implements IJQUITabs
{

	private static final long serialVersionUID = 1L;
	/**
	 * the feature list
	 */
	private JQUITabsFeature feature;

	/**
	 * The Unordered List
	 */
	private JQUITabList unorderedList;

	/**
	 * A list of all the tabs
	 */
	private java.util.List<JQUITab> tabs;

	/**
	 * Constructs a new JQUI Tab/** Constructs a new JQUI Tab
	 */
	/**
	 * Constructs a new JQUI JQUITab/** Constructs a new JQUI JQUITab
	 */
	public JQUITabs()
	{
		super();
		addFeature(getFeature());
	}

	/**
	 * As Me
	 *
	 * @return
	 */
	public IJQUITabs asMe()
	{
		return this;
	}

	@Override
	public void init()
	{
		if (!isInitialized())
		{
			add(getUnorderedList());
			getTabs().forEach(next ->
			                  {
				                  getUnorderedList().add(next.getTabHeader());
				                  add(next.getTabDisplayComponent());
			                  });
		}
		super.init();
	}

	/**
	 * Adds a tab to the collection
	 * <p>
	 *
	 * @param tab
	 *
	 * @return
	 */
	@Override
	public JQUITab addTab(JQUITab tab)
	{
		getTabs().add(tab);
		return tab;
	}

	@Override
	public JQUITab addTab(String title, JQUITabContent displayComponent)
	{
		return addTab(new JQUITab(new ListItem(title), displayComponent));
	}

	/**
	 * Retrieves this unordered list
	 *
	 * @return
	 */
	@NotNull
	protected JQUITabList getUnorderedList()
	{
		if (unorderedList == null)
		{
			unorderedList = new JQUITabList();
		}
		return unorderedList;
	}

	/**
	 * Sets the unordered list
	 *
	 * @param unorderedList
	 */
	protected void setUnorderedList(JQUITabList unorderedList)
	{
		this.unorderedList = unorderedList;
	}

	/**
	 * Returns the options fields for the tab
	 * <p>
	 *
	 * @return
	 */
	@Override
	public JQUITabOptions getOptions()
	{
		return feature.getOptions();
	}

	/**
	 * Returns a list of tabs
	 *
	 * @return
	 */
	@Override
	@NotNull
	public java.util.List<JQUITab> getTabs()
	{
		if (tabs == null)
		{
			tabs = new ArrayList<>();
		}
		return tabs;
	}

	/**
	 * Sets the list of tabs
	 *
	 * @param tabs
	 */
	@Override
	public void setTabs(java.util.List<JQUITab> tabs)
	{
		this.tabs = tabs;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof JQUITabs))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}

		JQUITabs jquiTabs = (JQUITabs) o;

		if (!getFeature().equals(jquiTabs.getFeature()))
		{
			return false;
		}
		if (!getUnorderedList().equals(jquiTabs.getUnorderedList()))
		{
			return false;
		}
		return getTabs().equals(jquiTabs.getTabs());
	}

	/**
	 * Returns the feature for the JQUITabs object
	 * <p>
	 *
	 * @return
	 */
	@NotNull
	public final JQUITabsFeature getFeature()
	{
		if (feature == null)
		{
			feature = new JQUITabsFeature(this);
		}
		return feature;
	}

	@Override
	public int hashCode()
	{
		int result = super.hashCode();
		result = 31 * result + getFeature().hashCode();
		result = 31 * result + getUnorderedList().hashCode();
		result = 31 * result + getTabs().hashCode();
		return result;
	}
}
