package com.hlhtstudios.maple_delight.common.world.tree;

import com.hlhtstudios.maple_delight.common.world.PlacedFeatures;
import com.hlhtstudios.maple_delight.common.world.biome.MapleBiome;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

import static net.minecraft.world.gen.feature.TreePlacedFeatures.OAK_CHECKED;

public class TreeGen {
    public static void generateTrees() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(MapleBiome.MAPLE_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, PlacedFeatures.MAPLE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(MapleBiome.MAPLE_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, PlacedFeatures.RED_MAPLE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(MapleBiome.MAPLE_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, OAK_CHECKED);
    }
}
