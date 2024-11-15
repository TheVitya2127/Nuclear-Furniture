package com.osmokitty.nuclearfurniture.hazard;

//import com.osmokitty.nuclearfurniture.blocks.ModBlocks;

import com.hbm.hazard.HazardData;
//import com.hbm.hazard.HazardSystem;
//import com.hbm.hazard.HazardRegistry;
import com.hbm.hazard.type.HazardTypeBase;

public class RAHazardRegistry {
    public static void register() {
        //HazardSystem.register(ModBlocks.deco_stool, newData(HazardRegistry.RADIATION, 10.0F));
    }
    private static HazardData newData(HazardTypeBase hazard, float level) {
        return new HazardData().addEntry(hazard, level);
    }
}