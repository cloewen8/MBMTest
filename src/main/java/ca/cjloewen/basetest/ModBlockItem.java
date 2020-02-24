package ca.cjloewen.basetest;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;

public class ModBlockItem extends BlockItem {
	public ModBlockItem(Block blockIn) {
		super(blockIn, new Properties().group(Test.ITEM_GROUP));
	}
}
