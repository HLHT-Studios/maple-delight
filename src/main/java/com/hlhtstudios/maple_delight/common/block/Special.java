package com.hlhtstudios.maple_delight.common.block;

import com.hlhtstudios.maple_delight.Maple_delight;
import com.hlhtstudios.maple_delight.common.block.credit.MapleBadgeBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class Special {

    public static void initialize(){

    }
    private static Item registerBItem(String name, Block block, Rarity rarity){
        return Registry.register(Registries.ITEM, new Identifier(Maple_delight.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().rarity(rarity)));

    }

    private static Block registerBlock(String name, Block block, Rarity rarity){
        registerBItem(name, block, rarity);
        return Registry.register(Registries.BLOCK, new Identifier(Maple_delight.MOD_ID, name), block);
    }

    public static final Block MAPLE_BADGE = registerBlock("maple_badge",
            new MapleBadgeBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()),
            Rarity.RARE);
}
