package ca.cjloewen.basetest;

import net.minecraftforge.common.ForgeConfigSpec.BooleanValue;
import net.minecraftforge.common.ForgeConfigSpec.Builder;
import net.minecraftforge.fml.config.ModConfig;

public class ClientConfig extends CommonConfig {
	public BooleanValue testBool;
	
	public void build(Builder builder) {
		testBool = builder.comment("A boolean that shows up on the test item.")
			.define("test", false);
	}
	
	public void bake(ModConfig config) {
		testBool.set(config.getConfigData().get("test"));
	}
}
