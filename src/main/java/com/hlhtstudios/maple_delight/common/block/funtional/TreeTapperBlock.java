package com.hlhtstudios.maple_delight.common.block.funtional;

import com.hlhtstudios.maple_delight.common.item.MapleItems;
import com.hlhtstudios.maple_delight.common.particle.MapleParticle;
import com.hlhtstudios.maple_delight.common.util.MapleTags;
import net.minecraft.block.*;
import net.minecraft.block.entity.BeehiveBlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import net.minecraft.world.event.GameEvent;
import org.jetbrains.annotations.Nullable;

public class TreeTapperBlock extends CocoaBlock {
    public static final int MAX_AGE = 2;
    public static final IntProperty AGE = Properties.AGE_2;

    protected static final VoxelShape[] AGE_TO_EAST_SHAPE = new VoxelShape[]{
            Block.createCuboidShape(6.0, 0.0, 2.0, 16.0, 10.0, 14.0),
            Block.createCuboidShape(6.0, 0.0, 2.0, 16.0, 10.0, 14.0),
            Block.createCuboidShape(6.0, 0.0, 2.0, 16.0, 10.0, 14.0)
    };
    protected static final VoxelShape[] AGE_TO_WEST_SHAPE = new VoxelShape[]{
            Block.createCuboidShape(0.0, 0.0, 2.0, 10.0, 10.0, 14.0),
            Block.createCuboidShape(0.0, 0.0, 2.0, 10.0, 10.0, 14.0),
            Block.createCuboidShape(0.0, 0.0, 2.0, 10.0, 10.0, 14.0)
    };
    protected static final VoxelShape[] AGE_TO_NORTH_SHAPE = new VoxelShape[]{
            Block.createCuboidShape(2.0, 0.0, 0.0, 14.0, 10.0, 10.0),
            Block.createCuboidShape(2.0, 0.0, 0.0, 14.0, 10.0, 10.0),
            Block.createCuboidShape(2.0, 0.0, 0.0, 14.0, 10.0, 10.0)
    };
    protected static final VoxelShape[] AGE_TO_SOUTH_SHAPE = new VoxelShape[]{
            Block.createCuboidShape(2.0, 0.0, 6.0, 14.0, 10.0, 16.0),
            Block.createCuboidShape(2.0, 0.0, 6.0, 14.0, 10.0, 16.0),
            Block.createCuboidShape(2.0, 0.0, 6.0, 14.0, 10.0, 16.0)
    };

    public TreeTapperBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.NORTH).with(AGE, Integer.valueOf(0)));
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        BlockState blockState = world.getBlockState(pos.offset(state.get(FACING)));
        return blockState.isIn(MapleTags.Blocks.MAPLE_LOGS);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        int i = (Integer)state.get(AGE);
        return switch ((Direction) state.get(FACING)) {
            case SOUTH -> AGE_TO_SOUTH_SHAPE[i];
            case WEST -> AGE_TO_WEST_SHAPE[i];
            case EAST -> AGE_TO_EAST_SHAPE[i];
            default -> AGE_TO_NORTH_SHAPE[i];
        };
    }
    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockState blockState = this.getDefaultState();
        WorldView worldView = ctx.getWorld();
        BlockPos blockPos = ctx.getBlockPos();

        for (Direction direction : ctx.getPlacementDirections()) {
            if (direction.getAxis().isHorizontal()) {
                blockState = blockState.with(FACING, direction);
                if (blockState.canPlaceAt(worldView, blockPos)) {
                    return blockState;
                }
            }
        }

        return null;
    }

    @Override
    public BlockState getStateForNeighborUpdate(
            BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos
    ) {
        return direction == state.get(FACING) && !state.canPlaceAt(world, pos)
                ? Blocks.AIR.getDefaultState()
                : super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    @Override
    public boolean hasRandomTicks(BlockState state) {
        return (Integer)state.get(AGE) < 2;
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (world.random.nextInt(5) == 0) {
            int i = (Integer)state.get(AGE);
            if (i < 2) {
                world.setBlockState(pos, state.with(AGE, Integer.valueOf(i + 1)), Block.NOTIFY_LISTENERS);
            }
        }
    }

    @Override
    public boolean isFertilizable(WorldView world, BlockPos pos, BlockState state, boolean isClient) {
        return false;
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack itemStack = player.getStackInHand(hand);
        int i = (Integer)state.get(AGE);
        boolean bl = false;
        if (i == 2) {
            Item item = itemStack.getItem();
            if (itemStack.isOf(Items.BUCKET)) {
                itemStack.decrement(1);
                world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_BOTTLE_FILL, SoundCategory.BLOCKS, 1.0F, 1.0F);
                if (itemStack.isEmpty()) {
                    player.setStackInHand(hand, new ItemStack(MapleItems.MAPLE_SAP_BUCKET));
                } else if (!player.getInventory().insertStack(new ItemStack(MapleItems.MAPLE_SAP_BUCKET))) {
                    player.dropItem(new ItemStack(MapleItems.MAPLE_SAP_BUCKET), false);
                }

                bl = true;
                world.emitGameEvent(player, GameEvent.FLUID_PICKUP, pos);
                world.setBlockState(pos, state.with(AGE, Integer.valueOf(0)), Block.NOTIFY_LISTENERS);
            }

            if (!world.isClient() && bl) {
                player.incrementStat(Stats.USED.getOrCreateStat(item));
            }
        }
        if (bl) {
            return ActionResult.success(world.isClient);
        } else {
            return super.onUse(state, world, pos, player, hand, hit);
        }
    }


}
