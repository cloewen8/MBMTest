package ca.cjloewen.basetest;

import ca.cjloewen.base.BaseMod;
import ca.cjloewen.base.ConfigHolder;
import net.minecraftforge.fml.common.Mod;

@Mod(Test.MODID)
public class Test extends BaseMod {
	public static final String MODID = "test";
	public ConfigHolder<ClientConfig, ServerConfig> CONFIG;
	
	public Test() {
		LOGGER.debug("Starting MBM Test mod!");
		CONFIG = new ConfigHolder<ClientConfig, ServerConfig>(new ClientConfig(), new ServerConfig()).register(this);
		LOGGER.debug("Registered ConfigHolder.");
	}
}
