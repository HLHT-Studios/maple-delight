package com.hlhtstudios.maple_delight.common.item;

import com.hlhtstudios.maple_delight.Maple_delight;
import com.hlhtstudios.maple_delight.common.block.Maples;
import com.hlhtstudios.maple_delight.common.item.notfood.NotFoodItems;
import com.hlhtstudios.maple_delight.common.item.notfood.SpecialItem;
import com.hlhtstudios.maple_delight.common.item.food.MapleFoodComponent;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class MapleItems {
    public static void initialize() {
        NotFoodItems.initialize();
        SpecialItem.initialize();
        MapleFoodComponent.initialize();

    }


    public static Item register(String id, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Maple_delight.MOD_ID, id), item);
    }

    // Can not eat
    public static final Item MAPLE_SAP_BUCKET = register("maple_sap_bucket",
            new Item(new FabricItemSettings().maxCount(64).recipeRemainder(Items.BUCKET)));
    public static final Item MAPLE_SUGAR = register("maple_sugar",
            new Item(new FabricItemSettings().maxCount(64)));

    // Can eat
    public static final Item MAPLE_SYRUP = register("maple_syrup",
            new HoneyBottleItem(new FabricItemSettings().maxCount(64).food(MapleFoodComponent.SYRUP_FOOD_COMPONENT).recipeRemainder(Items.GLASS_BOTTLE)));
    public static final Item MAPLE_COOKIE = register("maple_cookie",
            new Item(new FabricItemSettings().maxCount(64).food(MapleFoodComponent.SYRUP_FOOD_COMPONENT_MIN)));
    public static final Item MAPLE_CANDY = register("maple_candy",
            new Item(new FabricItemSettings().maxCount(64).food(MapleFoodComponent.SYRUP_FOOD_COMPONENT_SNAKE)));
//    public static final Item BIG_MAPLE_CANDY = register("big_maple_candy",
//            new BlockItem(Maples.BIG_MAPLE_CANDY, new FabricItemSettings().maxCount(64)));
    public static final Item PANCAKE = register("pancake",
        new Item(new FabricItemSettings().maxCount(64).food(MapleFoodComponent.FOOD_COMPONENT_MED)));

    public static final Item SYRUP_PANCAKE = register("maple_syrup_pancake",
            new Item(new FabricItemSettings().maxCount(64).food(MapleFoodComponent.SYRUP_FOOD_COMPONENT_MED)));
}
