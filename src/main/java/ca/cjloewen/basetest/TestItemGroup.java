package ca.cjloewen.basetest;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

/**
 * What all test items are grouped to.
 */
public class TestItemGroup extends ItemGroup {
	public TestItemGroup() {
		super("test");
	}

	@Override
	public ItemStack createIcon() {
		return new ItemStack(Items.TEST_ITEM);
	}
}
