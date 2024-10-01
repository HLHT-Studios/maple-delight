package com.hlhtstudios.maple_delight.common.world.tree;

import com.hlhtstudios.maple_delight.common.world.ConfigedFeatures;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

public class MapleSaplingGen extends SaplingGenerator {
    @Override
    protected @Nullable RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        return ConfigedFeatures.MAPLE_KEY;
    }
}
