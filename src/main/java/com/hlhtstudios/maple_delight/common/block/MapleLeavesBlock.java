package com.hlhtstudios.maple_delight.common.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.client.util.ParticleUtil;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

import com.hlhtstudios.maple_delight.common.particle.MapleParticle;

public class MapleLeavesBlock extends LeavesBlock {
    DefaultParticleType particle;
    public MapleLeavesBlock(Settings settings, Boolean is_red) {
        super(settings);

        if (is_red){
            this.particle = MapleParticle.RED_MAPLE_LEAVES;
        }
        else{
            this.particle = MapleParticle.MAPLE_LEAVES;
        }
    }

    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        super.randomDisplayTick(state, world, pos, random);
        if (random.nextInt(20) == 0) {
            BlockPos blockPos = pos.down();
            BlockState blockState = world.getBlockState(blockPos);
            if (!isFaceFullSquare(blockState.getCollisionShape(world, blockPos), Direction.UP)) {
                ParticleUtil.spawnParticle(world, pos, random, this.particle);
            }
        }
    }
}
