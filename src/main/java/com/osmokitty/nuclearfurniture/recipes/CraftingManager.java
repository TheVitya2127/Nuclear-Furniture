package com.osmokitty.nuclearfurniture.recipes;

import com.osmokitty.nuclearfurniture.blocks.ModBlocks;
import com.osmokitty.nuclearfurniture.items.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CraftingManager {
    public static void registerRecipes() {
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.brick_concrete_legacy, 4),
                "AA", "AA", 'A', com.hbm.blocks.ModBlocks.brick_concrete);
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.brick_concrete_stairs_legacy, 4),
                "A  ", "AA ","AAA", 'A', ModBlocks.brick_concrete_legacy);
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.brick_concrete_mossy_legacy, 4),
                "AA", "AA", 'A', com.hbm.blocks.ModBlocks.brick_concrete_mossy);
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.brick_concrete_mossy_stairs_legacy, 4),
                "A  ", "AA ","AAA", 'A', ModBlocks.brick_concrete_mossy_legacy);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.dusty_clay, 4), new Object[] {Items.clay_ball, Items.clay_ball, Items.clay_ball, com.hbm.items.ModItems.dust} );
        GameRegistry.addSmelting(ModItems.dusty_clay, new ItemStack(ModItems.dusty_brick), 0F);
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.brick_gray, 1),
                "AA", "AA", 'A', ModItems.dusty_brick);
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.brick_gray_stairs, 4),
                "A  ", "AA ","AAA", 'A', ModBlocks.brick_gray);
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.brick_arc_stairs, 4),
                "A  ", "AA ","AAA", 'A', ModBlocks.brick_arc);
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.brick_ferrouranium_stairs, 4),
                "A  ", "AA ","AAA", 'A', ModBlocks.brick_ferrouranium);
    }
}