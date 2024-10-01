package com.hlhtstudios.maple_delight.common.fluid;

import com.hlhtstudios.maple_delight.Maple_delight;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MapleFluid {

    public static void initialize(){

    }
    public static Fluid register(String id, Fluid fluid) {
        return Registry.register(Registries.FLUID, new Identifier(Maple_delight.MOD_ID, id), fluid);
    }

    public static final FlowableFluid MAPLE_SAP_STILL = Registry.register(Registries.FLUID,
            new Identifier(Maple_delight.MOD_ID,"maple_sap"), new MapleSyrupFluid.Still());
    public static final FlowableFluid MAPLE_SAP_FLOWING = Registry.register(Registries.FLUID,
            new Identifier(Maple_delight.MOD_ID,"maple_sap_flowing"), new MapleSyrupFluid.Flowing());
}
