package com.hlhtstudios.maple_delight.common.generation;

import com.hlhtstudios.maple_delight.common.block.Maples;
import com.hlhtstudios.maple_delight.common.item.MapleItems;
import com.hlhtstudios.maple_delight.common.util.MapleTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class RecipeGen extends FabricRecipeProvider {
    public RecipeGen(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Maples.MAPLE_DOOR, 3)
                .pattern("SS")
                .pattern("SS")
                .pattern("SS")
                .input('S', Maples.MAPLE_PLANKS)
                .criterion(hasItem(Maples.MAPLE_PLANKS), conditionsFromItem(Maples.MAPLE_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(Maples.MAPLE_DOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Maples.MAPLE_TRAPDOOR, 2)
                .pattern("SSS")
                .pattern("SSS")
                .input('S', Maples.MAPLE_PLANKS)
                .criterion(hasItem(Maples.MAPLE_PLANKS), conditionsFromItem(Maples.MAPLE_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(Maples.MAPLE_TRAPDOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Maples.MAPLE_FENCE, 3)
                .pattern("SXS")
                .pattern("SXS")
                .input('S', Maples.MAPLE_PLANKS)
                .input('X', Items.STICK)
                .criterion(hasItem(Maples.MAPLE_PLANKS), conditionsFromItem(Maples.MAPLE_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(Maples.MAPLE_FENCE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Maples.MAPLE_FENCE_GATE, 1)
                .pattern("XSX")
                .pattern("XSX")
                .input('S', Maples.MAPLE_PLANKS)
                .input('X', Items.STICK)
                .criterion(hasItem(Maples.MAPLE_PLANKS), conditionsFromItem(Maples.MAPLE_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(Maples.MAPLE_FENCE_GATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Maples.MAPLE_STAIRS, 4)
                .pattern("S  ")
                .pattern("SS ")
                .pattern("SSS")
                .input('S', Maples.MAPLE_PLANKS)
                .criterion(hasItem(Maples.MAPLE_PLANKS), conditionsFromItem(Maples.MAPLE_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(Maples.MAPLE_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Maples.MAPLE_PRESSURE_PLATE, 1)
                .pattern("SS")
                .input('S', Maples.MAPLE_PLANKS)
                .criterion(hasItem(Maples.MAPLE_PLANKS), conditionsFromItem(Maples.MAPLE_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(Maples.MAPLE_PRESSURE_PLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, MapleItems.MAPLE_SIGN, 3)
                .pattern("SSS")
                .pattern("SSS")
                .pattern(" X ")
                .input('S', Maples.MAPLE_PLANKS)
                .input('X', Items.STICK)
                .criterion(hasItem(Maples.MAPLE_PLANKS), conditionsFromItem(Maples.MAPLE_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(MapleItems.MAPLE_SIGN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, MapleItems.HANGING_MAPLE_SIGN, 3)
                .pattern("X X")
                .pattern("SSS")
                .pattern("SSS")
                .input('S', MapleTags.Items.STRIPPED_MAPLE_LOGS)
                .input('X', Items.CHAIN)
                .criterion(hasItem(Items.CHAIN), conditionsFromTag(MapleTags.Items.STRIPPED_MAPLE_LOGS))
                .offerTo(exporter, new Identifier(getRecipeName(MapleItems.HANGING_MAPLE_SIGN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Maples.TREE_TAPPER, 1)
                .pattern(" X ")
                .pattern("S S")
                .pattern("S#S")
                .input('S', ItemTags.PLANKS)
                .input('X', Items.IRON_INGOT)
                .input('#', ItemTags.LOGS)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromTag(ItemTags.LOGS))
                .offerTo(exporter, new Identifier(getRecipeName(Maples.TREE_TAPPER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Maples.MAPLE_WOOD, 3)
                .pattern("SS")
                .pattern("SS")
                .input('S', Maples.MAPLE_LOG)
                .criterion(hasItem(Maples.MAPLE_LOG), conditionsFromItem(Maples.MAPLE_LOG))
                .offerTo(exporter, new Identifier(getRecipeName(Maples.MAPLE_WOOD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Maples.STRIPPED_MAPLE_WOOD, 3)
                .pattern("SS")
                .pattern("SS")
                .input('S', Maples.STRIPPED_MAPLE_LOG)
                .criterion(hasItem(Maples.STRIPPED_MAPLE_LOG), conditionsFromItem(Maples.STRIPPED_MAPLE_LOG))
                .offerTo(exporter, new Identifier(getRecipeName(Maples.STRIPPED_MAPLE_WOOD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Maples.RED_MAPLE_WOOD, 3)
                .pattern("SS")
                .pattern("SS")
                .input('S', Maples.RED_MAPLE_LOG)
                .criterion(hasItem(Maples.RED_MAPLE_LOG), conditionsFromItem(Maples.RED_MAPLE_LOG))
                .offerTo(exporter, new Identifier(getRecipeName(Maples.RED_MAPLE_WOOD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Maples.STRIPPED_RED_MAPLE_WOOD, 3)
                .pattern("SS")
                .pattern("SS")
                .input('S', Maples.STRIPPED_RED_MAPLE_LOG)
                .criterion(hasItem(Maples.STRIPPED_RED_MAPLE_LOG), conditionsFromItem(Maples.STRIPPED_RED_MAPLE_LOG))
                .offerTo(exporter, new Identifier(getRecipeName(Maples.STRIPPED_RED_MAPLE_WOOD)));
    }
}
