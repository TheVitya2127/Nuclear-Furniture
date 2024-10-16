package com.osmokitty.nuclearfurniture.blocks;

import com.hbm.blocks.generic.BlockDecoCT;
import com.hbm.blocks.generic.BlockGeneric;
import com.hbm.blocks.generic.BlockGenericStairs;
import com.hbm.items.block.ItemBlockBlastInfo;

import com.osmokitty.nuclearfurniture.blocks.generic.BlockDecoStool;
import com.osmokitty.nuclearfurniture.NuclearFurniture;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {

    public static Block brick_concrete_legacy;
    public static Block brick_concrete_stairs_legacy;
    public static Block brick_concrete_mossy_legacy;
    public static Block brick_concrete_mossy_stairs_legacy;

    public static Block brick_gray;
    public static Block brick_gray_stairs;
    public static Block brick_arc;
    public static Block brick_arc_stairs;
    public static Block concrete_ferrouranium;
    public static Block brick_ferrouranium;
    public static Block brick_ferrouranium_stairs;

    public static Block deco_stool;

    public static void init() {
        brick_concrete_legacy = new BlockGeneric(Material.rock).setBlockName("brick_concrete_legacy")
                .setCreativeTab(NuclearFurniture.blocksTab)
                .setHardness(15.0F)
                .setResistance(160.0F).setBlockTextureName(NuclearFurniture.MODID + ":brick_concrete_legacy");
        brick_concrete_stairs_legacy = new BlockGenericStairs(brick_concrete_legacy, 0).setBlockName("brick_concrete_stairs_legacy")
                .setCreativeTab(NuclearFurniture.blocksTab);
        brick_concrete_mossy_legacy = new BlockGeneric(Material.rock).setBlockName("brick_concrete_mossy_legacy")
                .setCreativeTab(NuclearFurniture.blocksTab)
                .setHardness(15.0F)
                .setResistance(160.0F)
                .setBlockTextureName(NuclearFurniture.MODID + ":brick_concrete_mossy_legacy");
        brick_concrete_mossy_stairs_legacy = new BlockGenericStairs(brick_concrete_mossy_legacy, 0).setBlockName("brick_concrete_mossy_stairs_legacy")
                .setCreativeTab(NuclearFurniture.blocksTab);

        brick_gray = new BlockGeneric(Material.rock).setBlockName("brick_gray")
                .setCreativeTab(NuclearFurniture.blocksTab)
                .setHardness(5.0F)
                .setResistance(20.0F).setBlockTextureName(NuclearFurniture.MODID + ":brick_gray");
        brick_gray_stairs = new BlockGenericStairs(brick_gray, 0).setBlockName("brick_gray_stairs")
                .setCreativeTab(NuclearFurniture.blocksTab);
        brick_arc = new BlockGeneric(Material.rock).setBlockName("brick_arc")
                .setCreativeTab(NuclearFurniture.blocksTab)
                .setHardness(5.0F)
                .setResistance(80.0F).setBlockTextureName(NuclearFurniture.MODID + ":brick_arc");
        brick_arc_stairs = new BlockGenericStairs(brick_arc, 0).setBlockName("brick_arc_stairs")
                .setCreativeTab(NuclearFurniture.blocksTab);
        concrete_ferrouranium = new BlockDecoCT(Material.rock).noFortune().setBlockName("concrete_ferrouranium")
                .setCreativeTab(NuclearFurniture.blocksTab)
                .setHardness(15.0F)
                .setResistance(700.0F).setBlockTextureName(NuclearFurniture.MODID + ":concrete_ferrouranium");
        brick_ferrouranium = new BlockGeneric(Material.rock).setBlockName("brick_ferrouranium")
                .setCreativeTab(NuclearFurniture.blocksTab)
                .setHardness(20.0F)
                .setResistance(1400.0F).setBlockTextureName(NuclearFurniture.MODID + ":brick_ferrouranium");
        brick_ferrouranium_stairs = new BlockGenericStairs(brick_ferrouranium, 0).setBlockName("brick_ferrouranium_stairs")
                .setCreativeTab(NuclearFurniture.blocksTab);

        deco_stool = new BlockDecoStool(Material.iron).setBlockName("deco_stool")
                .setCreativeTab(NuclearFurniture.blocksTab)
                .setHardness(5.0F)
                .setResistance(10.0F).setBlockTextureName(NuclearFurniture.MODID + ":deco_stool");
    }

    public static void register() {
        GameRegistry.registerBlock(brick_concrete_legacy, ItemBlockBlastInfo.class, brick_concrete_legacy.getUnlocalizedName());
        GameRegistry.registerBlock(brick_concrete_stairs_legacy, brick_concrete_stairs_legacy.getUnlocalizedName());
        GameRegistry.registerBlock(brick_concrete_mossy_legacy, ItemBlockBlastInfo.class, brick_concrete_mossy_legacy.getUnlocalizedName());
        GameRegistry.registerBlock(brick_concrete_mossy_stairs_legacy, brick_concrete_mossy_stairs_legacy.getUnlocalizedName());

        GameRegistry.registerBlock(brick_gray, ItemBlockBlastInfo.class, brick_gray.getUnlocalizedName());
        GameRegistry.registerBlock(brick_gray_stairs, brick_gray_stairs.getUnlocalizedName());
        GameRegistry.registerBlock(brick_arc, ItemBlockBlastInfo.class, brick_arc.getUnlocalizedName());
        GameRegistry.registerBlock(brick_arc_stairs, brick_arc_stairs.getUnlocalizedName());
        GameRegistry.registerBlock(concrete_ferrouranium, ItemBlockBlastInfo.class, concrete_ferrouranium.getUnlocalizedName());
        GameRegistry.registerBlock(brick_ferrouranium, ItemBlockBlastInfo.class, brick_ferrouranium.getUnlocalizedName());
        GameRegistry.registerBlock(brick_ferrouranium_stairs, brick_ferrouranium_stairs.getUnlocalizedName());
        GameRegistry.registerBlock(deco_stool, deco_stool.getUnlocalizedName());

    }
}
