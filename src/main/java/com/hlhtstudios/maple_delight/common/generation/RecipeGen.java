package com.hlhtstudios.maple_delight.common.generation;

import com.google.common.collect.Lists;
import com.hlhtstudios.maple_delight.common.block.Maples;
import com.hlhtstudios.maple_delight.common.item.MapleItems;
import com.hlhtstudios.maple_delight.common.item.notfood.NotFoodItems;
import com.hlhtstudios.maple_delight.common.util.MapleTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.List;
import java.util.function.Consumer;

public class RecipeGen extends FabricRecipeProvider {
    public RecipeGen(FabricDataOutput output) {
        super(output);
    }

    public static final List<ItemConvertible> SAP_BUCKET = Util.make(Lists.newArrayList(), list -> {
        list.add(MapleItems.MAPLE_SAP_BUCKET);
    });

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Maples.MAPLE_DOOR, 3)
                .pattern("SS")
                .pattern("SS")
                .pattern("SS")
                .input('S', Maples.MAPLE_PLANKS)
                .criterion(hasItem(Maples.MAPLE_PLANKS), conditionsFromItem(Maples.MAPLE_PLANKS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Maples.MAPLE_TRAPDOOR, 2)
                .pattern("SSS")
                .pattern("SSS")
                .input('S', Maples.MAPLE_PLANKS)
                .criterion(hasItem(Maples.MAPLE_PLANKS), conditionsFromItem(Maples.MAPLE_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Maples.MAPLE_SLAB, 6)
                .pattern("SSS")
                .input('S', Maples.MAPLE_PLANKS)
                .criterion(hasItem(Maples.MAPLE_PLANKS), conditionsFromItem(Maples.MAPLE_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Maples.MAPLE_FENCE, 3)
                .pattern("SXS")
                .pattern("SXS")
                .input('S', Maples.MAPLE_PLANKS)
                .input('X', Items.STICK)
                .criterion(hasItem(Maples.MAPLE_PLANKS), conditionsFromItem(Maples.MAPLE_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Maples.MAPLE_FENCE_GATE, 1)
                .pattern("XSX")
                .pattern("XSX")
                .input('S', Maples.MAPLE_PLANKS)
                .input('X', Items.STICK)
                .criterion(hasItem(Maples.MAPLE_PLANKS), conditionsFromItem(Maples.MAPLE_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Maples.MAPLE_STAIRS, 4)
                .pattern("S  ")
                .pattern("SS ")
                .pattern("SSS")
                .input('S', Maples.MAPLE_PLANKS)
                .criterion(hasItem(Maples.MAPLE_PLANKS), conditionsFromItem(Maples.MAPLE_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Maples.MAPLE_PRESSURE_PLATE, 1)
                .pattern("SS")
                .input('S', Maples.MAPLE_PLANKS)
                .criterion(hasItem(Maples.MAPLE_PLANKS), conditionsFromItem(Maples.MAPLE_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, NotFoodItems.MAPLE_SIGN, 3)
                .pattern("SSS")
                .pattern("SSS")
                .pattern(" X ")
                .input('S', Maples.MAPLE_PLANKS)
                .input('X', Items.STICK)
                .criterion(hasItem(Maples.MAPLE_PLANKS), conditionsFromItem(Maples.MAPLE_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, NotFoodItems.HANGING_MAPLE_SIGN, 3)
                .pattern("X X")
                .pattern("SSS")
                .pattern("SSS")
                .input('S', MapleTags.Items.STRIPPED_MAPLE_LOGS)
                .input('X', Items.CHAIN)
                .criterion(hasItem(Maples.STRIPPED_MAPLE_LOG), conditionsFromTag(MapleTags.Items.STRIPPED_MAPLE_LOGS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Maples.TREE_TAPPER, 1)
                .pattern(" X ")
                .pattern("S S")
                .pattern("S#S")
                .input('S', ItemTags.PLANKS)
                .input('X', Items.IRON_INGOT)
                .input('#', ItemTags.LOGS)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Maples.MAPLE_WOOD, 3)
                .pattern("SS")
                .pattern("SS")
                .input('S', Maples.MAPLE_LOG)
                .criterion(hasItem(Maples.MAPLE_LOG), conditionsFromItem(Maples.MAPLE_LOG))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Maples.STRIPPED_MAPLE_WOOD, 3)
                .pattern("SS")
                .pattern("SS")
                .input('S', Maples.STRIPPED_MAPLE_LOG)
                .criterion(hasItem(Maples.STRIPPED_MAPLE_LOG), conditionsFromItem(Maples.STRIPPED_MAPLE_LOG))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Maples.RED_MAPLE_WOOD, 3)
                .pattern("SS")
                .pattern("SS")
                .input('S', Maples.RED_MAPLE_LOG)
                .criterion(hasItem(Maples.RED_MAPLE_LOG), conditionsFromItem(Maples.RED_MAPLE_LOG))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Maples.STRIPPED_RED_MAPLE_WOOD, 3)
                .pattern("SS")
                .pattern("SS")
                .input('S', Maples.STRIPPED_RED_MAPLE_LOG)
                .criterion(hasItem(Maples.STRIPPED_RED_MAPLE_LOG), conditionsFromItem(Maples.STRIPPED_RED_MAPLE_LOG))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, NotFoodItems.MAPLE_BOAT, 1)
                .pattern("S S")
                .pattern("SSS")
                .input('S', Maples.MAPLE_PLANKS)
                .group("boat")
                .criterion(hasItem(Maples.MAPLE_PLANKS), conditionsFromItem(Maples.MAPLE_PLANKS))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Maples.MAPLE_PLANKS, 4)
                .input(MapleTags.Items.MAPLE_WOODS)
                .criterion("has_wood", conditionsFromTag(MapleTags.Items.MAPLE_WOODS))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Maples.MAPLE_BUTTON, 1)
                .input(Maples.MAPLE_PLANKS)
                .criterion(hasItem(Maples.MAPLE_PLANKS), conditionsFromItem(Maples.MAPLE_PLANKS))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, NotFoodItems.MAPLE_CHEST_BOAT, 1)
                .input(NotFoodItems.MAPLE_BOAT)
                .input(Items.CHEST)
                .group("chest_boat")
                .criterion(hasItem(NotFoodItems.MAPLE_BOAT), conditionsFromItem(NotFoodItems.MAPLE_BOAT))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, Maples.PANCAKE_STACK, 1)
                .input(MapleItems.PANCAKE)
                .input(MapleItems.PANCAKE)
                .input(MapleItems.PANCAKE)
                .input(MapleItems.PANCAKE)
                .input(Items.BOWL)
                .criterion(hasItem(MapleItems.PANCAKE), conditionsFromItem(MapleItems.PANCAKE))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, Maples.MAPLE_SYRUP_PANCAKE_STACK, 1)
                .input(MapleItems.SYRUP_PANCAKE)
                .input(MapleItems.SYRUP_PANCAKE)
                .input(MapleItems.SYRUP_PANCAKE)
                .input(MapleItems.SYRUP_PANCAKE)
                .input(Items.BOWL)
                .group("maple_syrup_pancake_stack")
                .criterion(hasItem(MapleItems.SYRUP_PANCAKE), conditionsFromItem(MapleItems.SYRUP_PANCAKE))
                .offerTo(exporter);


        RecipeProvider.offerSmelting(exporter, SAP_BUCKET, RecipeCategory.FOOD, MapleItems.MAPLE_SUGAR,
                1.0F, 400, "maple_sugar");

    }
}
