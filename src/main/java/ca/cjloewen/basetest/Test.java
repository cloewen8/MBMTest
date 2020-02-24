package ca.cjloewen.basetest;

import ca.cjloewen.base.BaseMod;
import ca.cjloewen.base.ConfigHolder;
import net.minecraftforge.fml.common.Mod;

@Mod(Test.MODID)
public class Test extends BaseMod {
	public static final String MODID = "test";
	public ConfigHolder<ClientConfig, ServerConfig> CONFIG;
	public static TestItemGroup ITEM_GROUP;
	public static Items ITEMS;
	public static Blocks BLOCKS;
	
	public Test() {
		LOGGER.debug("Starting MBM Test mod!");
		LOGGER.debug("Registering ConfigHolder.");
		CONFIG = new ConfigHolder<ClientConfig, ServerConfig>(new ClientConfig(), new ServerConfig()).register(this);
		LOGGER.debug("Creating item group.");
		ITEM_GROUP = new TestItemGroup();
		LOGGER.debug("Registering items.");
		ITEMS = (Items) new Items().register();
		LOGGER.debug("Registering blocks.");
		BLOCKS = (Blocks) new Blocks().register();
	}
}
