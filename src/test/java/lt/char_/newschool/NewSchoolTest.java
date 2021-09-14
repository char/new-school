package lt.char_.newschool;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class NewSchoolTest {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		ExternalPluginManager.loadBuiltin(NewSchoolPlugin.class);
		RuneLite.main(args);
	}
}