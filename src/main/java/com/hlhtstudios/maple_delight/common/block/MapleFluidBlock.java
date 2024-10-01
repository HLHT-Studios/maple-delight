package com.hlhtstudios.maple_delight.common.block;

import com.hlhtstudios.maple_delight.Maple_delight;
import com.hlhtstudios.maple_delight.common.fluid.MapleFluid;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.Fluid;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MapleFluidBlock {
    public static void initialize(){

    }
    public static Block registerFluidBlocks(String id, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(Maple_delight.MOD_ID, id),
                block);
    }

    public static final Block MAPLE_SAP_FLUID_BLOCK = registerFluidBlocks("maple_sap_block",
            new MapleSapFluidBlock(MapleFluid.MAPLE_SAP_FLOWING, FabricBlockSettings.copyOf(Blocks.WATER).luminance(7)));
}
