package com.hlhtstudios.maple_delight.common.item.notfood;

import com.hlhtstudios.maple_delight.Maple_delight;
import com.hlhtstudios.maple_delight.common.block.Maples;
import com.hlhtstudios.maple_delight.common.entity.Boats;
import com.terraformersmc.terraform.boat.api.item.TerraformBoatItemHelper;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.HangingSignItem;
import net.minecraft.item.Item;
import net.minecraft.item.SignItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class NotFoodItems {

    public static void initialize() {

    }

    public static final Item MAPLE_SIGN = register("maple_sign",
            new SignItem(new FabricItemSettings().maxCount(16), Maples.STANDING_MAPLE_SIGN, Maples.WALL_MAPLE_SIGN));

    public static final Item HANGING_MAPLE_SIGN = register("maple_hanging_sign",
            new HangingSignItem(Maples.HANGING_MAPLE_SIGN, Maples.WALL_HANGING_MAPLE_SIGN, new FabricItemSettings().maxCount(16)));

    public static final Item MAPLE_BOAT = TerraformBoatItemHelper.registerBoatItem(Boats.MAPLE_BOAT_ID, Boats.MAPLE_BOAT_KEY, false);
    public static final Item MAPLE_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(Boats.MAPLE_CHEST_BOAT_ID, Boats.MAPLE_BOAT_KEY, true);



    public static Item register(String id, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Maple_delight.MOD_ID, id), item);
    }
}
