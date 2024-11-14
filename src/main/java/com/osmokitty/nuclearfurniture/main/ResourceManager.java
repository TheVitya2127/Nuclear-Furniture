package com.osmokitty.nuclearfurniture.main;

import com.osmokitty.nuclearfurniture.NuclearFurniture;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
//import net.minecraftforge.client.model.obj.WavefrontObject;

public class ResourceManager {
    // Models
    public static final IModelCustom deco_stool = AdvancedModelLoader.loadModel(new ResourceLocation(NuclearFurniture.MODID, "models/blocks/deco_stool.obj"));
    // Textures

}