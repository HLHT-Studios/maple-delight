package com.hlhtstudios.maple_delight.common.generation;

import com.hlhtstudios.maple_delight.common.block.Maples;
import com.hlhtstudios.maple_delight.common.item.MapleItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModelGen extends FabricModelProvider {
    public ModelGen(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(Maples.MAPLE_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(Maples.RED_MAPLE_LEAVES);
        //blockStateModelGenerator.registerSimpleCubeAll(Maples.MAPLE_PLANKS);

        blockStateModelGenerator.registerLog(Maples.MAPLE_LOG).log(Maples.MAPLE_LOG).wood(Maples.MAPLE_WOOD);
        blockStateModelGenerator.registerLog(Maples.STRIPPED_MAPLE_LOG).log(Maples.STRIPPED_MAPLE_LOG).wood(Maples.STRIPPED_MAPLE_WOOD);
        blockStateModelGenerator.registerLog(Maples.RED_MAPLE_LOG).log(Maples.RED_MAPLE_LOG).wood(Maples.RED_MAPLE_WOOD);
        blockStateModelGenerator.registerLog(Maples.STRIPPED_RED_MAPLE_LOG).log(Maples.STRIPPED_RED_MAPLE_LOG).wood(Maples.STRIPPED_RED_MAPLE_WOOD);

        BlockStateModelGenerator.BlockTexturePool MAPLE_BLOCKS = blockStateModelGenerator.registerCubeAllModelTexturePool(Maples.MAPLE_PLANKS);
        // MAPLE_BLOCKS.base(Maples.MAPLE_PLANKS, Models.CUBE_ALL);
        MAPLE_BLOCKS.family(Maples.MAPLE_FAMILY);
        MAPLE_BLOCKS.stairs(Maples.MAPLE_STAIRS);
        MAPLE_BLOCKS.slab(Maples.MAPLE_SLAB);
        MAPLE_BLOCKS.button(Maples.MAPLE_BUTTON);
        MAPLE_BLOCKS.pressurePlate(Maples.MAPLE_PRESSURE_PLATE);
        MAPLE_BLOCKS.fence(Maples.MAPLE_FENCE);
        MAPLE_BLOCKS.fenceGate(Maples.MAPLE_FENCE_GATE);

        blockStateModelGenerator.registerDoor(Maples.MAPLE_DOOR);
        blockStateModelGenerator.registerTrapdoor(Maples.MAPLE_TRAPDOOR);

        blockStateModelGenerator.registerTintableCross(Maples.MAPLE_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(Maples.RED_MAPLE_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        // itemModelGenerator.register(MapleItems.MAPLE_SIGN, Models.GENERATED);
        itemModelGenerator.register(MapleItems.HANGING_MAPLE_SIGN, Models.GENERATED);
        itemModelGenerator.register(MapleItems.MAPLE_SAP_BUCKET, Models.GENERATED);
        itemModelGenerator.register(MapleItems.MAPLE_SYRUP, Models.GENERATED);
        itemModelGenerator.register(MapleItems.MAPLE_COOKIE, Models.GENERATED);

        itemModelGenerator.register(MapleItems.MAPLE_BOAT, Models.GENERATED);
        itemModelGenerator.register(MapleItems.MAPLE_CHEST_BOAT, Models.GENERATED);
    }
}
