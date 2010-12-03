public class Ag extends Plugin
{
	private static AgListener listener = new AgListener();

	@Override
	public void disable()
	{
		etc.getInstance().removeCommand("/t");
		etc.getInstance().removeCommand("/k");
		etc.getInstance().removeCommand("/b");
		etc.getInstance().removeCommand("/p");
		etc.getInstance().removeCommand("/save-all");
	}

	@Override
	public void enable()
	{
		etc.getInstance().addCommand("/t", "[player1] [player2] - teleports player1 to player 2");
		etc.getInstance().addCommand("/k", "[player] - Kicks a player");
		etc.getInstance().addCommand("/b", "[player] - Bans a player");
		etc.getInstance().addCommand("/p", "[player] - Pardons a player's ban");
		etc.getInstance().addCommand("/save-all"," - Saves the map");
	}
	
	public void initialize() {
		etc.getLoader().addListener(PluginLoader.Hook.COMMAND, listener, this, PluginListener.Priority.MEDIUM);
	}

}
