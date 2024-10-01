package com.hlhtstudios.maple_delight.common.generation;

import com.hlhtstudios.maple_delight.common.block.Maples;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.item.Items;

public class LootTableGen extends FabricBlockLootTableProvider {
    public LootTableGen(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(Maples.MAPLE_LOG);
        addDrop(Maples.MAPLE_WOOD);
        addDrop(Maples.STRIPPED_MAPLE_LOG);
        addDrop(Maples.STRIPPED_MAPLE_WOOD);
        addDrop(Maples.RED_MAPLE_LOG);
        addDrop(Maples.RED_MAPLE_WOOD);
        addDrop(Maples.STRIPPED_RED_MAPLE_LOG);
        addDrop(Maples.STRIPPED_RED_MAPLE_WOOD);
        addDrop(Maples.MAPLE_PLANKS);
        addDrop(Maples.MAPLE_STAIRS);
        addDrop(Maples.MAPLE_SLAB, slabDrops(Maples.MAPLE_SLAB));
        addDrop(Maples.MAPLE_BUTTON);
        addDrop(Maples.MAPLE_PRESSURE_PLATE);
        addDrop(Maples.MAPLE_DOOR, doorDrops(Maples.MAPLE_DOOR));
        addDrop(Maples.MAPLE_TRAPDOOR);
        addDrop(Maples.MAPLE_FENCE);
        addDrop(Maples.MAPLE_FENCE_GATE);
        addDrop(Maples.STANDING_MAPLE_SIGN);
        addDrop(Maples.WALL_MAPLE_SIGN);
        addDrop(Maples.HANGING_MAPLE_SIGN);
        addDrop(Maples.WALL_HANGING_MAPLE_SIGN);
        addDrop(Maples.MAPLE_SAPLING);
        addDrop(Maples.RED_MAPLE_SAPLING);

        addDrop(Maples.MAPLE_LEAVES, leavesDrops(Maples.MAPLE_LEAVES, Maples.MAPLE_SAPLING, 0.01f));
        addDrop(Maples.RED_MAPLE_LEAVES, leavesDrops(Maples.RED_MAPLE_LEAVES, Maples.RED_MAPLE_SAPLING, 0.01f));
    }
}
