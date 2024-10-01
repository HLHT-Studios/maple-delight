package com.hlhtstudios.maple_delight.common.util;

import com.hlhtstudios.maple_delight.Maple_delight;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class MapleTags {
    public static class Blocks {
        public static final TagKey<Block> MAPLE_LOGS =
                createTag("maple_logs");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(Maple_delight.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> MAPLE_WOODS =
                createTag("maple_woods");
        public static final TagKey<Item> STRIPPED_MAPLE_LOGS =
                createTag("stripped_maple_logs");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(Maple_delight.MOD_ID, name));
        }
    }
}

