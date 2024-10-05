package com.osmokitty.nuclearfurniture.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import com.osmokitty.nuclearfurniture.blocks.ModBlocks;

public class BlocksTab extends CreativeTabs {

    public BlocksTab(int p_i1853_1_, String p_i1853_2_) {
        super(p_i1853_1_, p_i1853_2_);
    }

    @Override
    public Item getTabIconItem() {

        if (ModBlocks.brick_concrete_legacy != null) return Item.getItemFromBlock(ModBlocks.brick_concrete_legacy);
        return Items.iron_pickaxe;
    }

}
