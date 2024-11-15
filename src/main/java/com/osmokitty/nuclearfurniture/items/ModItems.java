package com.osmokitty.nuclearfurniture.items;

import com.osmokitty.nuclearfurniture.NuclearFurniture;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ModItems {
    public static Item ingot_kimkimium;
    public static Item nugget_kimkimium;
    public static Item plate_kimkimium;
    public static Item dusty_clay;
    public static Item dusty_brick;

    public static void init() {
        ingot_kimkimium = new Item().setUnlocalizedName("ingot_kimkimium")
                .setCreativeTab(NuclearFurniture.itemsTab)
                .setTextureName(NuclearFurniture.MODID + ":ingot_kimkimium");
        nugget_kimkimium = new Item().setUnlocalizedName("nugget_kimkimium")
                .setCreativeTab(NuclearFurniture.itemsTab)
                .setTextureName(NuclearFurniture.MODID + ":nugget_kimkimium");
        plate_kimkimium = new Item().setUnlocalizedName("plate_kimkimium")
                .setCreativeTab(NuclearFurniture.itemsTab)
                .setTextureName(NuclearFurniture.MODID + ":plate_kimkimium");
        dusty_clay = new Item().setUnlocalizedName("dusty_clay")
                .setCreativeTab(NuclearFurniture.itemsTab)
                .setTextureName(NuclearFurniture.MODID + ":dusty_clay");
        dusty_brick = new Item().setUnlocalizedName("dusty_brick")
                .setCreativeTab(NuclearFurniture.itemsTab)
                .setTextureName(NuclearFurniture.MODID + ":dusty_brick");
    }
    public static void register(){
        GameRegistry.registerItem(ingot_kimkimium, ingot_kimkimium.getUnlocalizedName());
        GameRegistry.registerItem(nugget_kimkimium, nugget_kimkimium.getUnlocalizedName());
        GameRegistry.registerItem(plate_kimkimium, plate_kimkimium.getUnlocalizedName());
        GameRegistry.registerItem(dusty_clay, dusty_clay.getUnlocalizedName());
        GameRegistry.registerItem(dusty_brick, dusty_brick.getUnlocalizedName());
    }
}