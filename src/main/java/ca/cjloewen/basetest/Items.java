package ca.cjloewen.basetest;

import ca.cjloewen.base.BaseRegistry;
import ca.cjloewen.basetest.Blocks.TestBlock;
import net.minecraft.item.Item;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(Test.MODID)
public class Items extends BaseRegistry<Item> {
	@ObjectHolder(TestItem.name)
	public static TestItem TEST_ITEM;
	
	public Items() {
		super(ForgeRegistries.ITEMS, Test.MODID);
		register(TestItem.name, TestItem.class);
		
		// Block items.
		register(TestBlock.name, () -> new ModBlockItem(Blocks.TEST_BLOCK));
	}
	
	public static class TestItem extends Item {
		protected static final String name = "test_item";
		
		public TestItem() {
			super(new Item.Properties().group(Test.ITEM_GROUP));
		}
	}
}
