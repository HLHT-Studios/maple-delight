package com.hlhtstudios.maple_delight.common.item;

import com.hlhtstudios.maple_delight.common.block.Maples;
import com.hlhtstudios.maple_delight.Maple_delight;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import com.hlhtstudios.maple_delight.common.block.Special;

public class ItemGroup {

    public static final net.minecraft.item.ItemGroup MAPLE_MAIN = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Maple_delight.MOD_ID, "maple_delight_maingroup"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.main"))
                    .icon(() -> new ItemStack(Special.MAPLE_BADGE)).entries((displayContext, entries) -> {

                        entries.add(Maples.MAPLE_LOG);
                        entries.add(Maples.STRIPPED_MAPLE_LOG);
                        entries.add(Maples.MAPLE_WOOD);
                        entries.add(Maples.STRIPPED_MAPLE_WOOD);
                        entries.add(Maples.MAPLE_LEAVES);

                        entries.add(Maples.RED_MAPLE_LOG);
                        entries.add(Maples.STRIPPED_RED_MAPLE_LOG);
                        entries.add(Maples.STRIPPED_RED_MAPLE_WOOD);
                        entries.add(Maples.RED_MAPLE_WOOD);
                        entries.add(Maples.RED_MAPLE_LEAVES);

                        entries.add(Maples.MAPLE_SAPLING);
                        entries.add(Maples.RED_MAPLE_SAPLING);

                        entries.add(Maples.MAPLE_PLANKS);
                        entries.add(Maples.MAPLE_STAIRS);
                        entries.add(Maples.MAPLE_SLAB);
                        entries.add(Maples.MAPLE_DOOR);
                        entries.add(Maples.MAPLE_TRAPDOOR);
                        entries.add(Maples.MAPLE_FENCE);
                        entries.add(Maples.MAPLE_FENCE_GATE);
                        entries.add(Maples.MAPLE_BUTTON);
                        entries.add(Maples.MAPLE_PRESSURE_PLATE);
                        entries.add(Maples.TREE_TAPPER);

                        entries.add(MapleItems.MAPLE_SIGN);
                        entries.add(MapleItems.HANGING_MAPLE_SIGN);


                        entries.add(Special.MAPLE_BADGE);
                    }).build());

    public static final net.minecraft.item.ItemGroup MAPLE_FOOD = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Maple_delight.MOD_ID, "maple_delight_food_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.food"))
                    .icon(() -> new ItemStack(MapleItems.MAPLE_SYRUP)).entries((displayContext, entries) -> {


                        entries.add(MapleItems.MAPLE_SAP_BUCKET);
                        entries.add(MapleItems.MAPLE_SYRUP);
                        entries.add(MapleItems.MAPLE_COOKIE);

                    }).build());

    public static void initialize() {
        Maple_delight.LOGGER.info("Generating Maple items");
    }
}
