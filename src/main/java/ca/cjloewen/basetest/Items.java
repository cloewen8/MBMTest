package ca.cjloewen.basetest;

import java.util.List;

import javax.annotation.Nullable;

import ca.cjloewen.base.BaseRegistry;
import ca.cjloewen.basetest.Blocks.TestBlock;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ObjectHolder;

/**
 * Registers a test item and test block item.
 */
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
		
		@Override
		public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
			ClientConfig config = Test.CONFIG.CONFIG_CLIENT;
			tooltip.add(new StringTextComponent(config.testBool.get().toString()));
		}
	}
}
