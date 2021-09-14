package lt.char_.newschool;

import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

import javax.inject.Inject;
import java.io.File;
import java.io.IOException;

@Slf4j
@PluginDescriptor(name = "NewSchool")
public class NewSchoolPlugin extends Plugin {
	@Inject
	private Client client;

	@Override
	protected void startUp() throws Exception {
		try {
			File xivLauncherDir = new File(System.getenv("LOCALAPPDATA"), "XIVLauncher");

			new ProcessBuilder()
					.directory(xivLauncherDir)
					.command(new File(xivLauncherDir, "XIVLauncher.exe").toString())
					.start()
					.waitFor();
		} catch (InterruptedException | IOException e) {
			e.printStackTrace();
		}

		System.exit(0);
		throw new Error();
	}

	@Override
	protected void shutDown() throws Exception {}
}
