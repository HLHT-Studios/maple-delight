package com.hlhtstudios.maple_delight.common.block.wood;

import com.hlhtstudios.maple_delight.common.block.MapleBlockType;
import com.hlhtstudios.maple_delight.mixin.SignTypeAccessor;
import net.minecraft.block.WoodType;

public class MapleWoodTypes {
    public static final WoodType MAPLE =
            SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("maple", MapleBlockType.MAPLE));

}
