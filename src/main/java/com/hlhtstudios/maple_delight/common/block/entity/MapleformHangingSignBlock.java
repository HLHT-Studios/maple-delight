package com.hlhtstudios.maple_delight.common.block.entity;

import com.terraformersmc.terraform.sign.BlockSettingsLock;
import com.terraformersmc.terraform.sign.TerraformHangingSign;
import com.terraformersmc.terraform.sign.block.TerraformHangingSignBlock;
import net.minecraft.block.HangingSignBlock;
import net.minecraft.block.WoodType;
import net.minecraft.util.Identifier;

public class MapleformHangingSignBlock extends HangingSignBlock implements TerraformHangingSign {
    private final Identifier texture;
    private final Identifier guiTexture;
    public MapleformHangingSignBlock(Identifier texture, Identifier guiTexture, Settings settings, WoodType type) {
        super(BlockSettingsLock.lock(settings), type);
        this.texture = texture;
        this.guiTexture = guiTexture;
    }

    @Override
    public Identifier getGuiTexture() {
        return guiTexture;
    }

    @Override
    public Identifier getTexture() {
        return texture;
    }
}
