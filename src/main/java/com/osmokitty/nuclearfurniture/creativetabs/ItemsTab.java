package com.osmokitty.nuclearfurniture.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import com.osmokitty.nuclearfurniture.items.ModItems;

public class ItemsTab extends CreativeTabs {
    public ItemsTab(int p_i1853_1_, String p_i1853_2_) {
        super(p_i1853_1_, p_i1853_2_);
    }

    @Override
    public Item getTabIconItem() {

        if (ModItems.dusty_clay != null) return (ModItems.dusty_clay);
        return Items.iron_pickaxe;
    }

}
