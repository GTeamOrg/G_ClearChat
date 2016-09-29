package me.green.clearchat;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import me.green.clearchat.ccutil.CCUtil;
import me.green.clearchat.commands.Command_clearchat;

public class ClearChat extends JavaPlugin{
	
	public static ClearChat plugin;
	public static Server server;
	
	
	public void onLoad()
	{
		plugin = this;
	}
	
	@Override
	public void onEnable()
	{
		PluginDescriptionFile pdfFile = getDescription();
		Logger logger = getLogger();
		final PluginManager pm = plugin.getServer().getPluginManager();
        //pm.registerEvents(new ClearChat(), plugin);
		
		this.getCommand("clearchat").setExecutor(new Command_clearchat());

		logger.info(pdfFile.getName() + " has been enabled (V." + pdfFile.getVersion() + ")");
	}

	@Override
	public void onDisable()
	{
		PluginDescriptionFile pdfFile = getDescription();
		Logger logger = getLogger();
		
		logger.info(pdfFile.getName() + "has been disabled (V." + pdfFile.getVersion() + ")");
	}

}
