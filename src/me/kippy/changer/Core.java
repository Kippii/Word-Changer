package me.kippy.changer;

import java.util.logging.Logger;

import org.apache.commons.lang3.StringEscapeUtils;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Core extends JavaPlugin implements Listener {
	public Logger logger = getLogger();
	
	
	@EventHandler
	public void onSignPlace(SignChangeEvent e) {
		for(int i = 0; i < 4; i++) {
			int x = 1;
			boolean go = true;
			do {
				String message = e.getLine(i);
				if(getConfig().getString("OriginMessage" + x) != null && getConfig().getString("ReplaceMessage" + x) != null) {
					String word = StringEscapeUtils.unescapeJava(getConfig().getString("OriginMessage" + x));
					String replacement = StringEscapeUtils.unescapeJava(getConfig().getString("ReplaceMessage" + x));
					if(message.contains(word)) {
						e.setLine(i, e.getLine(i).replaceAll(word, replacement));
					}
				x++;
				}else{
					go = false;
				}
			} while(go);
		}
	}
	
	@EventHandler
	public void onPlayerChat(AsyncPlayerChatEvent e) {
		int x = 1;
		boolean go = true;
		do {
			String msg = e.getMessage();
			if(getConfig().getString("OriginMessage" + x) != null && getConfig().getString("ReplaceMessage" + x) != null) {
				String word = StringEscapeUtils.unescapeJava(getConfig().getString("OriginMessage" + x));
				String replacement = StringEscapeUtils.unescapeJava(getConfig().getString("ReplaceMessage" + x));
				if(msg.contains(word)) {
					e.setMessage(e.getMessage().replaceAll(word, replacement));
				}
				x++;
			}else{
				go = false;
			}
		} while(go);
	}
	
	@Override
	public void onEnable() {
		this.logger.info("Word Changer has been enabled!");
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(this, this);
		saveDefaultConfig();
		reloadConfig();
	}
	
	@Override
	public void onDisable() {
		this.logger.info("Word Changer has been disabled!");
	}
	
}
