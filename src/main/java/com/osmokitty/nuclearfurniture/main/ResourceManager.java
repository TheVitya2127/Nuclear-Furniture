package com.osmokitty.nuclearfurniture.main;

import com.osmokitty.nuclearfurniture.NuclearFurniture;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

public class ResourceManager {
    public static final IModelCustom stool = AdvancedModelLoader.loadModel(new ResourceLocation(NuclearFurniture.MODID, "models/deco/stool"));
}