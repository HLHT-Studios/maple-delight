package com.hlhtstudios.maple_delight.common.block.food;

import com.hlhtstudios.maple_delight.common.item.MapleItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import vectorwing.farmersdelight.common.block.FeastBlock;

import java.util.Arrays;
import java.util.List;

public class PancakeBlock extends FeastBlock {
    /**
     * This block provides up to 4 servings of food to players who interact with it.
     * If a leftover item is specified, the block lingers at 0 servings, and is destroyed on right-click.
     *
     * @param properties   Block properties.
     * @param servingItem  The meal to be served.
     * @param hasLeftovers Whether the block remains when out of servings. If false, the block vanishes once it runs out.
     */
    protected static final VoxelShape PLATE_SHAPE = Block.createCuboidShape(1.0D, 0.0D, 1.0D, 15.0D, 2.0D, 15.0D);
    protected static final VoxelShape FOOD_SHAPE = VoxelShapes.combine(PLATE_SHAPE, Block.createCuboidShape(2.0D, 2.0D, 2.0D, 14.0D, 10.0D, 14.0D), BooleanBiFunction.OR);

    public final List<Item> pancakeServings;

    public PancakeBlock(Settings properties, Item pancakeItem) {
        super(properties, () -> MapleItems.SYRUP_PANCAKE, true);
        this.pancakeServings = Arrays.asList(pancakeItem, pancakeItem, pancakeItem, pancakeItem);
    }

    @Override
    public ItemStack getServingItem(BlockState state) {
        return new ItemStack(pancakeServings.get(state.get(getServingsProperty()) - 1));
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView level, BlockPos pos, ShapeContext context) {
        return state.get(getServingsProperty()) == 0 ? PLATE_SHAPE : FOOD_SHAPE;
    }

}
