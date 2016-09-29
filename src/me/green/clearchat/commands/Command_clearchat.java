package me.green.clearchat.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.green.clearchat.ccutil.CCUtil;

public class Command_clearchat implements CommandExecutor{
		
		public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args){			

			if (args.length == 0){

				sender.sendMessage("");
				sender.sendMessage(CCUtil.cc("&8- [ &a+ &8] &cClearChat &8[ &a+ &8] -"));
				sender.sendMessage(CCUtil.cc("&e/clearchat global &8-&7 Clear the whole server's chat!"));
				sender.sendMessage(CCUtil.cc("&e/clearchat myself &8-&7 Clear your own chat!"));
				sender.sendMessage(CCUtil.cc("&e/clearchat information &8-&7 Check the authors!"));
				sender.sendMessage(CCUtil.cc("&8- [ &a+ &8] &cClearChat &8[ &a+ &8] -"));
				
			}
			
			else if (args.length == 1){
				
				if (null != args[0]){
					
					switch (args[0]){

					case "global":
							Player pg = (Player) sender;
							if (!pg.hasPermission("g.clearchat.global")){
								pg.sendMessage(CCUtil.cc("&a&oClearChat &8-> &cYou don't have permission g.clearchat.global"));
								}else{
						for (int cc = 0; cc <= 98; cc++){
							Bukkit.broadcastMessage("");
						}
						Bukkit.broadcastMessage(CCUtil.cc("&a" + sender.getName() + " &7cleared &c[GLOBAL] &7chat!"));
									}
							return true;

					case "myself":
						Player pm = (Player) sender;
						if (!pm.hasPermission("g.clearchat.myself")){
							pm.sendMessage(CCUtil.cc("&a&oClearChat &8-> &cYou don't have permission g.clearchat.global"));
							}else{
					for (int cc = 0; cc <= 98; cc++){
						sender.sendMessage("");
					}
					sender.sendMessage(CCUtil.cc("&a" + sender.getName() + " &7cleared &e[PERSONAL] &7chat!"));
				}	
						return true;
					case "information":
						Player pa = (Player) sender;
						if (!pa.hasPermission("g.clearchat.informartion")){
							pa.sendMessage(CCUtil.cc("&a&oClearChat &8-> &cYou don't have permission g.clearchat.global"));
							}else{
						sender.sendMessage("");
						sender.sendMessage(CCUtil.cc("&8- [ &a+ &8] &cClearChat &8[ &a+ &8] -"));
						sender.sendMessage(CCUtil.cc("&ePlugin made by&7:"));
						sender.sendMessage(CCUtil.cc("&aXGreenPlayz12"));
						sender.sendMessage(CCUtil.cc("&eVersion&7:"));
						sender.sendMessage(CCUtil.cc("&av1.1.0"));
						sender.sendMessage(CCUtil.cc("&eOrganization&7:"));
						sender.sendMessage(CCUtil.cc("&ahttps://github.com/GTeamOrg"));
						sender.sendMessage(CCUtil.cc("&8- [ &a+ &8] &cClearChat &8[ &a+ &8] -"));
							}
						return true;
						
					
					}
					
				}
				
			}	
			return false;
			
		}
	}		
		
