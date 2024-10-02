package com.hlhtstudios.maple_delight.common.entity;

import com.hlhtstudios.maple_delight.Maple_delight;
import com.hlhtstudios.maple_delight.common.block.Maples;
import com.hlhtstudios.maple_delight.common.item.MapleItems;
import com.terraformersmc.terraform.boat.api.TerraformBoatType;
import com.terraformersmc.terraform.boat.api.TerraformBoatTypeRegistry;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class Boats {

    public static final Identifier MAPLE_BOAT_ID = new Identifier(Maple_delight.MOD_ID, "maple_boat");
    public static final Identifier MAPLE_CHEST_BOAT_ID = new Identifier(Maple_delight.MOD_ID, "maple_chest_boat");

    public static final RegistryKey<TerraformBoatType> MAPLE_BOAT_KEY = TerraformBoatTypeRegistry.createKey(MAPLE_BOAT_ID);


    public static void initialize(){
        TerraformBoatType mapleBoat = new TerraformBoatType.Builder()
                .item(MapleItems.MAPLE_BOAT)
                .chestItem(MapleItems.MAPLE_CHEST_BOAT)
                .planks(Maples.MAPLE_PLANKS.asItem())
                .build();

        Registry.register(TerraformBoatTypeRegistry.INSTANCE, MAPLE_BOAT_KEY, mapleBoat);
    }

}
