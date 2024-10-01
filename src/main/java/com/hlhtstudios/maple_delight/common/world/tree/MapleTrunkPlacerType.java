package com.hlhtstudios.maple_delight.common.world.tree;

import com.hlhtstudios.maple_delight.mixin.TrunkPlacerTypeInvoker;
import net.minecraft.world.gen.trunk.TrunkPlacerType;

public class MapleTrunkPlacerType {
    public static final TrunkPlacerType<?> MAPLE_TRUNK_PLACER = TrunkPlacerTypeInvoker.callRegister("maple_trunk_placer", MapleTrunkPlacer.CODEC);

    public static void register() {

    }
}
