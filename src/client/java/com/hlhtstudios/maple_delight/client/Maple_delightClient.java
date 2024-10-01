package com.hlhtstudios.maple_delight.client;

import com.hlhtstudios.maple_delight.client.particle.MapleLeavesParticle;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.minecraft.client.render.RenderLayer;

import com.hlhtstudios.maple_delight.common.block.Maples;
import com.hlhtstudios.maple_delight.common.particle.MapleParticle;

public class Maple_delightClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(Maples.MAPLE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Maples.MAPLE_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Maples.MAPLE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Maples.RED_MAPLE_SAPLING, RenderLayer.getCutout());


        ParticleFactoryRegistry.getInstance().register(MapleParticle.MAPLE_LEAVES,((spriteProvider) -> {
            return (parameters, world, x, y, z, velocityX, velocityY, velocityZ) -> {
                return new MapleLeavesParticle(world, x, y, z, spriteProvider);
            };
        }));

        ParticleFactoryRegistry.getInstance().register(MapleParticle.RED_MAPLE_LEAVES,((spriteProvider) -> {
            return (parameters, world, x, y, z, velocityX, velocityY, velocityZ) -> {
                return new MapleLeavesParticle(world, x, y, z, spriteProvider);
            };
        }));
    }
}
