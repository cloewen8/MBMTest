package ca.cjloewen.basetest;

import ca.cjloewen.base.BaseMod;
import ca.cjloewen.base.ConfigHolder;
import net.minecraftforge.fml.common.Mod;

@Mod(Test.MODID)
public class Test extends BaseMod {
	public static final String MODID = "test";
	public ConfigHolder<ClientConfig, ServerConfig> CONFIG;
	public static Items ITEMS;
	public static Blocks BLOCKS;
	
	public Test() {
		LOGGER.debug("Starting MBM Test mod!");
		LOGGER.debug("Registering ConfigHolder.");
		CONFIG = new ConfigHolder<ClientConfig, ServerConfig>(new ClientConfig(), new ServerConfig()).register(this);
		LOGGER.debug("Registering items.");
		ITEMS = new Items();
		LOGGER.debug("Registering blocks.");
		BLOCKS = new Blocks();
	}
}
