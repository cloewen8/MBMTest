package ca.cjloewen.basetest;

import ca.cjloewen.base.BaseRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ObjectHolder;

public class Blocks extends BaseRegistry<Block> {
	@ObjectHolder(Test.MODID + ":" + TestBlock.name)
	public static TestBlock TEST_BLOCK;
	
	public Blocks() {
		super(ForgeRegistries.BLOCKS, Test.MODID);
		register(TestBlock.name, TestBlock.class);
	}
	
	public class TestBlock extends Block {
		protected static final String name = "test_block";
		
		public TestBlock() {
			super(Block.Properties.create(Material.ROCK));
		}
	}
}
