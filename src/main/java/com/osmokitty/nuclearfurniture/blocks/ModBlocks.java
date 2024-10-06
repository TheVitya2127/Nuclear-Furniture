package com.osmokitty.nuclearfurniture.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.hbm.blocks.generic.BlockGeneric;
import com.hbm.blocks.generic.BlockGenericStairs;
import com.hbm.items.block.ItemModSlab;
import com.hbm.blocks.generic.BlockMultiSlab;
import com.hbm.blocks.generic.BlockDecoModel;
import com.hbm.items.block.ItemBlockBlastInfo;
import com.osmokitty.nuclearfurniture.NuclearFurniture;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {

    public static Block brick_concrete_legacy;
    public static Block brick_concrete_stairs_legacy;
    public static Block brick_concrete_mossy_legacy;
    public static Block brick_concrete_mossy_stairs_legacy;

    public static Block brick_slab;
    public static Block brick_double_slab;

    public static Block plutonium_stool;

    public static void init() {
        brick_concrete_legacy = new BlockGeneric(Material.rock).setBlockName("brick_concrete_legacy")
                .setCreativeTab(NuclearFurniture.blocksTab)
                .setHardness(15.0F)
                .setResistance(160.0F)
                .setBlockTextureName(NuclearFurniture.MODID + ":brick_concrete_legacy");
        brick_concrete_stairs_legacy = new BlockGenericStairs(brick_concrete_legacy, 0).setBlockName("brick_concrete_stairs_legacy")
                .setCreativeTab(NuclearFurniture.blocksTab);
        brick_concrete_mossy_legacy = new BlockGeneric(Material.rock).setBlockName("brick_concrete_mossy_legacy")
                .setCreativeTab(NuclearFurniture.blocksTab)
                .setHardness(15.0F)
                .setResistance(160.0F)
                .setBlockTextureName(NuclearFurniture.MODID + ":brick_concrete_mossy_legacy");
        brick_concrete_mossy_stairs_legacy = new BlockGenericStairs(brick_concrete_mossy_legacy, 0).setBlockName("brick_concrete_mossy_stairs_legacy")
                .setCreativeTab(NuclearFurniture.blocksTab);

        brick_slab = new BlockMultiSlab(null, Material.rock, brick_concrete_legacy, brick_concrete_mossy_legacy).setBlockName("brick_slab").setCreativeTab(NuclearFurniture.blocksTab);
        brick_double_slab  = new BlockMultiSlab(brick_slab, Material.rock, brick_concrete_legacy, brick_concrete_mossy_legacy).setBlockName("brick_double_slab").setCreativeTab(NuclearFurniture.blocksTab);

        //most likely I will have to create my own class with my own foundation, but I'm too lazy
        /*plutonium_stool = new BlockDecoModel(Material.iron).setBlockName("plutonium_stool")
                .setCreativeTab(NuclearFurniture.blocksTab)
                .setLightLevel(5F/15F)
                .setHardness(5.0F)
                .setResistance(50.0F)
                .setBlockTextureName(NuclearFurniture.MODID + ":plutonium_stool");*/
    }

    public static void register() {
        GameRegistry.registerBlock(brick_concrete_legacy, ItemBlockBlastInfo.class, brick_concrete_legacy.getUnlocalizedName());
        GameRegistry.registerBlock(brick_concrete_stairs_legacy, brick_concrete_stairs_legacy.getUnlocalizedName());
        GameRegistry.registerBlock(brick_concrete_mossy_legacy, ItemBlockBlastInfo.class, brick_concrete_mossy_legacy.getUnlocalizedName());
        GameRegistry.registerBlock(brick_concrete_mossy_stairs_legacy, brick_concrete_mossy_stairs_legacy.getUnlocalizedName());

        GameRegistry.registerBlock(brick_slab, ItemModSlab.class, brick_slab.getUnlocalizedName());
        GameRegistry.registerBlock(brick_double_slab, ItemModSlab.class, brick_double_slab.getUnlocalizedName());

        //GameRegistry.registerBlock(plutonium_stool, plutonium_stool.getUnlocalizedName());
    }
}
