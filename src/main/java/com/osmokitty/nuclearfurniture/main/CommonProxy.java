package com.osmokitty.nuclearfurniture.main;

import com.osmokitty.nuclearfurniture.NuclearFurniture;
import com.osmokitty.nuclearfurniture.Tags;
import com.osmokitty.nuclearfurniture.blocks.ModBlocks;
import com.osmokitty.nuclearfurniture.hazard.RAHazardRegistry;
import com.osmokitty.nuclearfurniture.items.ModItems;
import com.osmokitty.nuclearfurniture.recipes.CraftingManager;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;

public class CommonProxy {

    // preInit "Run before anything else. Read your config, create blocks, items, etc, and register them with the
    // GameRegistry." (Remove if not needed)
    public void preInit(FMLPreInitializationEvent event) {
        Config.synchronizeConfiguration(event.getSuggestedConfigurationFile());

        ModBlocks.init();
        ModBlocks.register();

        ModItems.init();
        ModItems.register();

        RAHazardRegistry.register();

        NuclearFurniture.LOG.info(Config.greeting);
        NuclearFurniture.LOG.info("I am NuclearFurniture at version " + Tags.VERSION);
    }

    // load "Do your mod setup. Build whatever data structures you care about. Register recipes." (Remove if not needed)
    public void init(FMLInitializationEvent event) {}

    // postInit "Handle interaction with other mods, complete your setup based on this." (Remove if not needed)
    public void postInit(FMLPostInitializationEvent event) {
        CraftingManager.registerRecipes();
    }

    // register server commands in this event handler (Remove if not needed)
    public void serverStarting(FMLServerStartingEvent event) {}
}
