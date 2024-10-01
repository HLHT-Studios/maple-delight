package com.hlhtstudios.maple_delight.common.generation;

import com.hlhtstudios.maple_delight.common.block.Maples;
import com.hlhtstudios.maple_delight.common.util.MapleTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ItemTagGen extends FabricTagProvider.ItemTagProvider {

    public ItemTagGen(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(Maples.MAPLE_PLANKS.asItem());

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(Maples.MAPLE_LOG.asItem())
                .add(Maples.STRIPPED_MAPLE_LOG.asItem())
                .add(Maples.MAPLE_WOOD.asItem())
                .add(Maples.STRIPPED_MAPLE_WOOD.asItem())
                .add(Maples.RED_MAPLE_LOG.asItem())
                .add(Maples.STRIPPED_RED_MAPLE_LOG.asItem())
                .add(Maples.RED_MAPLE_WOOD.asItem())
                .add(Maples.STRIPPED_RED_MAPLE_WOOD.asItem());
        getOrCreateTagBuilder(MapleTags.Items.MAPLE_WOODS)
                .add(Maples.MAPLE_LOG.asItem())
                .add(Maples.MAPLE_WOOD.asItem())
                .add(Maples.RED_MAPLE_LOG.asItem())
                .add(Maples.RED_MAPLE_WOOD.asItem())
                .add(Maples.STRIPPED_MAPLE_LOG.asItem())
                .add(Maples.STRIPPED_MAPLE_WOOD.asItem())
                .add(Maples.STRIPPED_RED_MAPLE_WOOD.asItem())
                .add(Maples.STRIPPED_RED_MAPLE_LOG.asItem());

        getOrCreateTagBuilder(MapleTags.Items.STRIPPED_MAPLE_LOGS)
                .add(Maples.STRIPPED_MAPLE_LOG.asItem())
                .add(Maples.STRIPPED_RED_MAPLE_LOG.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_DOORS)
                .add(Maples.MAPLE_DOOR.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_TRAPDOORS)
                .add(Maples.MAPLE_TRAPDOOR.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_FENCES)
                .add(Maples.MAPLE_FENCE.asItem());

        getOrCreateTagBuilder(ItemTags.FENCE_GATES)
                .add(Maples.MAPLE_FENCE_GATE.asItem());

        getOrCreateTagBuilder(ItemTags.STAIRS)
                .add(Maples.MAPLE_STAIRS.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_SLABS)
                .add(Maples.MAPLE_SLAB.asItem());
    }
}
