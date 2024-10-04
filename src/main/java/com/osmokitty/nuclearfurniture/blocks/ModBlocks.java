package com.osmokitty.nuclearfurniture.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.hbm.blocks.generic.BlockGeneric;
import com.osmokitty.nuclearfurniture.NuclearFurniture;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {

    public static Block brick_concrete_legacy;

    public static void init() {
        brick_concrete_legacy = new BlockGeneric(Material.rock).setBlockName("brick_concrete_legacy")
            .setHardness(15.0F)
            .setResistance(160.0F)
            .setBlockTextureName(NuclearFurniture.MODID + ":brick_concrete_legacy")
            .setCreativeTab(NuclearFurniture.blocksTab);
    }

    public static void register() {
        GameRegistry.registerBlock(brick_concrete_legacy, brick_concrete_legacy.getUnlocalizedName());
    }
}
