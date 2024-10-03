package com.hlhtstudios.maple_delight.common.item.food;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import vectorwing.farmersdelight.common.registry.ModEffects;

public class MapleFoodComponent {

    public static void initialize(){

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
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 40 * 20, 0), 1.0f)
            .statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 60 * 20, 0), 1.0f)
            .build();

    public static final FoodComponent SYRUP_FOOD_COMPONENT_LAR = new FoodComponent.Builder()
            .alwaysEdible()
            // The duration is in ticks, 20 ticks = 1 second
            .hunger(10)
            .saturationModifier(1.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 60 * 20, 0), 1.0f)
            .statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 180 * 20, 0), 1.0f)
            .build();

    public static final FoodComponent FOOD_COMPONENT_MIN = new FoodComponent.Builder()
            .alwaysEdible()
            // The duration is in ticks, 20 ticks = 1 second
            .hunger(2)
            .saturationModifier(1.0f)
            .build();

    public static final FoodComponent FOOD_COMPONENT_MED = new FoodComponent.Builder()
            .alwaysEdible()
            // The duration is in ticks, 20 ticks = 1 second
            .hunger(5)
            .saturationModifier(1.0f)
            .statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 60 * 20, 0), 1.0f)
            .build();

    public static final FoodComponent FOOD_COMPONENT_LAR = new FoodComponent.Builder()
            .alwaysEdible()
            // The duration is in ticks, 20 ticks = 1 second
            .hunger(10)
            .saturationModifier(1.5f)
            .statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 180 * 20, 0), 1.0f)
            .build();

    public static final FoodComponent SAP_FOOD_COMPONENT = new FoodComponent.Builder()
            .alwaysEdible()
            // The duration is in ticks, 20 ticks = 1 second
            .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 120 * 20, 0), 1.0f)
            .build();

    public static final FoodComponent SYRUP_FOOD_COMPONENT_SNAKE = new FoodComponent.Builder()
            .alwaysEdible()
            // The duration is in ticks, 20 ticks = 1 second
            .hunger(1)
            .saturationModifier(1.0f)
            .snack()
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 10 * 20, 0), 1.0f)
            .build();
}
