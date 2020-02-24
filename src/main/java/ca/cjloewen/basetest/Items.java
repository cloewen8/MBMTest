package ca.cjloewen.basetest;

import ca.cjloewen.base.BaseRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ObjectHolder;

public class Items extends BaseRegistry<Item> {
	@ObjectHolder(Test.MODID + ":" + TestItem.name)
	public static TestItem TEST_ITEM;
	
	public Items() {
		super(ForgeRegistries.ITEMS, Test.MODID);
		register("test_item", TestItem.class);
	}
	
	public class TestItem extends Item {
		protected static final String name = "test_item";
		
		public TestItem() {
			super(new Item.Properties());
		}
	}
}
