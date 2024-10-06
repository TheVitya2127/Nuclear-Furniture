package com.osmokitty.nuclearfurniture;

import net.minecraft.creativetab.CreativeTabs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.osmokitty.nuclearfurniture.creativetabs.BlocksTab;
import com.osmokitty.nuclearfurniture.creativetabs.FurnituresTab;
import com.osmokitty.nuclearfurniture.main.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;

@Mod(
    modid = NuclearFurniture.MODID,
    version = Tags.VERSION,
    name = "NuclearFurniture",
    acceptedMinecraftVersions = "[1.7.10]",
    dependencies = "required-after:hbm")
public class NuclearFurniture {

    @Mod.Instance
    public static NuclearFurniture instance;

    public static final String MODID = "nuclearfurniture";
    public static final Logger LOG = LogManager.getLogger(MODID);

    @SidedProxy(
        clientSide = "com.osmokitty.nuclearfurniture.main.ClientProxy",
        serverSide = "com.osmokitty.nuclearfurniture.main.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    // preInit "Run before anything else. Read your config, create blocks, items, etc, and register them with the
    // GameRegistry." (Remove if not needed)
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    public static CreativeTabs blocksTab = new BlocksTab(CreativeTabs.getNextID(), "tabBlocksNF");
    public static CreativeTabs furnituresTab = new FurnituresTab(CreativeTabs.getNextID(), "tabFurnituresNF");

    @Mod.EventHandler
    // load "Do your mod setup. Build whatever data structures you care about. Register recipes." (Remove if not needed)
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    // postInit "Handle interaction with other mods, complete your setup based on this." (Remove if not needed)
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

    @Mod.EventHandler
    // register server commands in this event handler (Remove if not needed)
    public void serverStarting(FMLServerStartingEvent event) {
        proxy.serverStarting(event);
    }
}
