package com.hlhtstudios.maple_delight.client;

import com.hlhtstudios.maple_delight.client.particle.MapleLeavesParticle;
import com.hlhtstudios.maple_delight.common.entity.Boats;
import com.terraformersmc.terraform.boat.api.client.TerraformBoatClientHelper;
import com.terraformersmc.terraform.sign.SpriteIdentifierRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.minecraft.client.render.RenderLayer;

import com.hlhtstudios.maple_delight.common.block.Maples;
import com.hlhtstudios.maple_delight.common.particle.MapleParticle;
import net.minecraft.client.render.TexturedRenderLayers;
import net.minecraft.client.util.SpriteIdentifier;

public class Maple_delightClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(Maples.MAPLE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Maples.MAPLE_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Maples.MAPLE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Maples.RED_MAPLE_SAPLING, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(Maples.BIG_MAPLE_CANDY, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Maples.MAPLE_SYRUP_PANCAKE_STACK, RenderLayer.getTranslucent());

        SpriteIdentifierRegistry.INSTANCE.addIdentifier(new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, Maples.MAPLE_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier(new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, Maples.MAPLE_HANGING_SIGN_TEXTURE));

        TerraformBoatClientHelper.registerModelLayers(Boats.MAPLE_BOAT_ID, false);
        TerraformBoatClientHelper.registerModelLayers(Boats.MAPLE_CHEST_BOAT_ID, false);

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
