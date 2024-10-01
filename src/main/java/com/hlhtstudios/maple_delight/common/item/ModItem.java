package com.hlhtstudios.maple_delight.common.item;

import com.hlhtstudios.maple_delight.Maple_delight;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItem {
    public static void initialize() {

    }


    public static Item register(String id, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Maple_delight.MOD_ID, id), item);
    }

    public static final FoodComponent SUSPICIOUS_FOOD_COMPONENT = new FoodComponent.Builder()
            .alwaysEdible()
            .snack()
            // The duration is in ticks, 20 ticks = 1 second
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 6 * 20, 1), 1.0f)
            .build();
}