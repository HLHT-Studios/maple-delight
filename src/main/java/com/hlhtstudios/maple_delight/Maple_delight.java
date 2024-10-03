package com.hlhtstudios.maple_delight;

import com.hlhtstudios.maple_delight.common.block.MapleFluidBlock;
import com.hlhtstudios.maple_delight.common.block.Maples;
import com.hlhtstudios.maple_delight.common.block.Special;
import com.hlhtstudios.maple_delight.common.entity.Boats;
import com.hlhtstudios.maple_delight.common.entity.MapleEntities;
import com.hlhtstudios.maple_delight.common.fluid.MapleFluid;
import com.hlhtstudios.maple_delight.common.item.ItemGroup;
import com.hlhtstudios.maple_delight.common.item.MapleItems;
import com.hlhtstudios.maple_delight.common.item.notfood.SpecialItem;
import com.hlhtstudios.maple_delight.common.particle.MapleParticle;
import com.hlhtstudios.maple_delight.common.world.WorldGeneration;
import com.hlhtstudios.maple_delight.common.world.biome.MapleRegion;
import com.hlhtstudios.maple_delight.common.world.tree.MapleTrunkPlacerType;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import terrablender.api.Regions;
import terrablender.api.TerraBlenderApi;

public class Maple_delight implements ModInitializer, TerraBlenderApi {
    public static final String MOD_ID = "maple_delight";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Loading Maple Delight");
        Maples.initialize();
        Special.initialize();
        MapleItems.initialize();
        MapleFluid.initialize();
        MapleFluidBlock.initialize();
        MapleEntities.initialize();
        Boats.initialize();
        SpecialItem.initialize();
        MapleParticle.initialize();
        MapleTrunkPlacerType.register();
        ItemGroup.initialize();
        WorldGeneration.generateModWorldGen();
        LOGGER.info("Maple Generation Completed!");


    }
    @Override
    public void onTerraBlenderInitialized()
    {
        Regions.register(new MapleRegion(new Identifier(MOD_ID, "overworld"), 4));

    }
}
