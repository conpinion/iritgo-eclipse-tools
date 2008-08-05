/*
    This file is part of the Iritgo Eclipse Tools project

    (C) 2008 Iritgo Technologies
 */

package de.iritgo.eclipse.tools;


import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;


/**
 * The activator class controls the plug-in life cycle
 */
public class IritgoToolsPlugin extends AbstractUIPlugin
{
	/** The plug-in ID */
	public static final String PLUGIN_ID = "de.iritgo.eclipse.tools";

	/** The shared instance */
	private static IritgoToolsPlugin plugin;

	/**
	 * 
	 */
	public IritgoToolsPlugin ()
	{
	}

	/**
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start (BundleContext context) throws Exception
	{
		super.start (context);
		plugin = this;
	}

	/**
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop (BundleContext context) throws Exception
	{
		plugin = null;
		super.stop (context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static IritgoToolsPlugin getDefault ()
	{
		return plugin;
	}
}
