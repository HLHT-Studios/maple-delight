package com.hlhtstudios.maple_delight.common.generation;

import com.hlhtstudios.maple_delight.common.world.ConfigedFeatures;
import com.hlhtstudios.maple_delight.common.world.PlacedFeatures;
import com.hlhtstudios.maple_delight.common.world.biome.MapleBiome;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;


public class DataGeneration implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(ModelGen::new);
        pack.addProvider(ItemTagGen::new);
        pack.addProvider(BlockTagGen::new);
        pack.addProvider(LootTableGen::new);
        pack.addProvider(RecipeGen::new);
        pack.addProvider(WorldGen::new);
    }

    @Override
    public void buildRegistry(RegistryBuilder registryBuilder) {
        registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ConfigedFeatures::boostrap);
        registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, PlacedFeatures::boostrap);
        registryBuilder.addRegistry(RegistryKeys.BIOME, MapleBiome::boostrap);
    }
}
