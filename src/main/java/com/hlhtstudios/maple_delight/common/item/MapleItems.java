package com.hlhtstudios.maple_delight.common.item;

import com.hlhtstudios.maple_delight.Maple_delight;
import com.hlhtstudios.maple_delight.common.block.Maples;
import com.hlhtstudios.maple_delight.common.entity.Boats;
import com.hlhtstudios.maple_delight.common.fluid.MapleSyrupFluid;
import com.terraformersmc.terraform.boat.api.item.TerraformBoatItemHelper;
import com.terraformersmc.terraform.boat.impl.item.TerraformBoatItem;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MapleItems {
    public static void initialize() {

    }


    public static Item register(String id, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Maple_delight.MOD_ID, id), item);
    }


    public static final FoodComponent SYRUP_FOOD_COMPONENT = new FoodComponent.Builder()
            .alwaysEdible()
            // The duration is in ticks, 20 ticks = 1 second
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 40 * 20, 0), 1.0f)
            .build();

    public static final FoodComponent SYRUP_FOOD_COMPONENT_MIN = new FoodComponent.Builder()
            .alwaysEdible()
            // The duration is in ticks, 20 ticks = 1 second
            .hunger(3)
            .saturationModifier(1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 20 * 20, 0), 1.0f)
            .build();

    public static final FoodComponent SYRUP_FOOD_COMPONENT_MED = new FoodComponent.Builder()
            .alwaysEdible()
            // The duration is in ticks, 20 ticks = 1 second
            .hunger(6)
            .saturationModifier(1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 20 * 20, 0), 1.0f)
            .build();

    public static final FoodComponent SYRUP_FOOD_COMPONENT_LAR = new FoodComponent.Builder()
            .alwaysEdible()
            // The duration is in ticks, 20 ticks = 1 second
            .hunger(10)
            .saturationModifier(1.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 20 * 20, 0), 1.0f)
            .build();

    public static final FoodComponent SAP_FOOD_COMPONENT = new FoodComponent.Builder()
            .alwaysEdible()
            // The duration is in ticks, 20 ticks = 1 second
            .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 120 * 20, 0), 1.0f)
            .build();

    public static final Item MAPLE_SAP_BUCKET = register("maple_sap_bucket",
            new Item(new FabricItemSettings().maxCount(64).recipeRemainder(Items.BUCKET)));
    public static final Item MAPLE_SYRUP = register("maple_syrup",
            new HoneyBottleItem(new FabricItemSettings().maxCount(64).food(SYRUP_FOOD_COMPONENT).recipeRemainder(Items.GLASS_BOTTLE)));
    public static final Item MAPLE_COOKIE = register("maple_cookie",
            new Item(new FabricItemSettings().maxCount(64).food(SYRUP_FOOD_COMPONENT_MIN)));
    public static final Item SYRUP_PANCAKE = register("maple_syrup_pancake",
            new Item(new FabricItemSettings().maxCount(64).food(SYRUP_FOOD_COMPONENT_MED)));

    public static final Item MAPLE_SIGN = register("maple_sign",
            new SignItem(new FabricItemSettings().maxCount(16), Maples.STANDING_MAPLE_SIGN, Maples.WALL_MAPLE_SIGN));

    public static final Item HANGING_MAPLE_SIGN = register("maple_hanging_sign",
            new HangingSignItem(Maples.HANGING_MAPLE_SIGN, Maples.WALL_HANGING_MAPLE_SIGN, new FabricItemSettings().maxCount(16)));

    public static final Item MAPLE_BOAT = TerraformBoatItemHelper.registerBoatItem(Boats.MAPLE_BOAT_ID, Boats.MAPLE_BOAT_KEY, false);
    public static final Item MAPLE_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(Boats.MAPLE_CHEST_BOAT_ID, Boats.MAPLE_BOAT_KEY, true);

}
