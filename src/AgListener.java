public class AgListener extends PluginListener
{
	public boolean onCommand(Player player, String command[])
	{
		if (command[0].equalsIgnoreCase("/save-all")) {
			if (player.canUseCommand("/save-all")) {
				etc.getServer().useConsoleCommand("say World save in Progress");
				etc.getServer().useConsoleCommand("save-all");
				etc.getServer().useConsoleCommand("say World save complete");
				return true;
			}
		}
		return false;
	}
}
