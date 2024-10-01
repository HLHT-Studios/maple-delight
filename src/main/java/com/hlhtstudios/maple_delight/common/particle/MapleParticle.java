package com.hlhtstudios.maple_delight.common.particle;

import com.hlhtstudios.maple_delight.Maple_delight;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MapleParticle {

    public static void initialize(){

    }

    public static final DefaultParticleType MAPLE_LEAVES = FabricParticleTypes.simple();
    public static final DefaultParticleType RED_MAPLE_LEAVES = FabricParticleTypes.simple();

    static {
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(Maple_delight.MOD_ID,"maple_leaves"), MAPLE_LEAVES);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(Maple_delight.MOD_ID,"red_maple_leaves"), RED_MAPLE_LEAVES);
    }
}
