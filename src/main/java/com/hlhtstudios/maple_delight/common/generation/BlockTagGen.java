package com.hlhtstudios.maple_delight.common.generation;

import com.hlhtstudios.maple_delight.common.block.Maples;
import com.hlhtstudios.maple_delight.common.util.MapleTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class BlockTagGen extends FabricTagProvider.BlockTagProvider {
    public BlockTagGen(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(Maples.MAPLE_LOG)
                .add(Maples.STRIPPED_MAPLE_LOG)
                .add(Maples.MAPLE_WOOD)
                .add(Maples.STRIPPED_MAPLE_WOOD)
                .add(Maples.RED_MAPLE_LOG)
                .add(Maples.STRIPPED_RED_MAPLE_LOG)
                .add(Maples.RED_MAPLE_WOOD)
                .add(Maples.STRIPPED_RED_MAPLE_WOOD);

        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS)
                .add(Maples.MAPLE_DOOR);

        getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS)
                .add(Maples.MAPLE_TRAPDOOR);

        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(Maples.MAPLE_FENCE);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(Maples.MAPLE_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.PRESSURE_PLATES)
                .add(Maples.MAPLE_PRESSURE_PLATE);

        getOrCreateTagBuilder(BlockTags.STAIRS)
                .add(Maples.MAPLE_STAIRS);

        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
                .add(Maples.MAPLE_SLAB);

        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .add(Maples.RED_MAPLE_LEAVES)
                .add(Maples.MAPLE_LEAVES);

        getOrCreateTagBuilder(BlockTags.LOGS)
                .add(Maples.MAPLE_LOG)
                .add(Maples.MAPLE_WOOD)
                .add(Maples.RED_MAPLE_LOG)
                .add(Maples.RED_MAPLE_WOOD)
                .add(Maples.STRIPPED_MAPLE_LOG)
                .add(Maples.STRIPPED_MAPLE_WOOD)
                .add(Maples.STRIPPED_RED_MAPLE_WOOD)
                .add(Maples.STRIPPED_MAPLE_LOG);

        getOrCreateTagBuilder(BlockTags.PLANKS)
                .add(Maples.MAPLE_PLANKS);

        getOrCreateTagBuilder(MapleTags.Blocks.MAPLE_LOGS)
                .add(Maples.MAPLE_LOG)
                .add(Maples.RED_MAPLE_LOG);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(Maples.MAPLE_PLANKS)
                .add(Maples.MAPLE_LOG)
                .add(Maples.MAPLE_WOOD)
                .add(Maples.RED_MAPLE_LOG)
                .add(Maples.RED_MAPLE_WOOD)
                .add(Maples.STRIPPED_MAPLE_LOG)
                .add(Maples.STRIPPED_MAPLE_WOOD)
                .add(Maples.STRIPPED_RED_MAPLE_WOOD)
                .add(Maples.STRIPPED_MAPLE_LOG)
                .add(Maples.MAPLE_SLAB)
                .add(Maples.MAPLE_STAIRS)
                .add(Maples.MAPLE_BUTTON)
                .add(Maples.MAPLE_PRESSURE_PLATE)
                .add(Maples.MAPLE_DOOR)
                .add(Maples.MAPLE_TRAPDOOR)
                .add(Maples.MAPLE_FENCE)
                .add(Maples.MAPLE_FENCE_GATE)
                .add(Maples.STANDING_MAPLE_SIGN)
                .add(Maples.WALL_MAPLE_SIGN)
                .add(Maples.HANGING_MAPLE_SIGN)
                .add(Maples.WALL_HANGING_MAPLE_SIGN);
    }
}
