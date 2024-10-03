package com.hlhtstudios.maple_delight.common.block.wood;

import com.hlhtstudios.maple_delight.common.block.MapleBlockType;
import com.hlhtstudios.maple_delight.mixin.SignTypeAccessor;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.WoodType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

import java.util.Set;
import java.util.stream.Stream;

public class MapleWoodTypes {
    public static final WoodType MAPLE =
            SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("maple", MapleBlockType.MAPLE));

}

//public record MapleWoodTypes(String name, BlockSetType setType, BlockSoundGroup soundType, BlockSoundGroup hangingSignSoundType, SoundEvent fenceGateClose, SoundEvent fenceGateOpen
//) {
//    private static final Set<WoodType> VALUES = new ObjectArraySet<WoodType>();
//    public static final WoodType MAPLE = register(new WoodType("maple", MapleBlockType.MAPLE));
//
//    public MapleWoodTypes(String name, BlockSetType setType) {
//        this(name, setType, BlockSoundGroup.WOOD, BlockSoundGroup.HANGING_SIGN, SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
//    }
//
//    private static WoodType register(WoodType type) {
//        VALUES.add(type);
//        return type;
//    }
//
//    public static Stream<WoodType> stream() {
//        return VALUES.stream();
//    }
//}
