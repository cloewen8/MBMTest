package ca.cjloewen.basetest;

import net.minecraftforge.common.ForgeConfigSpec.BooleanValue;
import net.minecraftforge.common.ForgeConfigSpec.Builder;
import net.minecraftforge.fml.config.ModConfig;

public class ClientConfig extends CommonConfig {
	/**
	 * A configuration displayed from the test item tooltip.
	 */
	public BooleanValue testBool;
	
	public void build(Builder builder) {
		testBool = builder.comment("A boolean that shows up on the test item.")
			.define("test", false);
	}
	
	public void bake(ModConfig config) {
		testBool.set(config.getConfigData().get("test"));
	}
}
