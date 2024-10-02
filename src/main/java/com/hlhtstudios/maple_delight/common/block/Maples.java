package com.hlhtstudios.maple_delight.common.block;

import com.hlhtstudios.maple_delight.Maple_delight;
import com.hlhtstudios.maple_delight.common.block.funtional.TreeTapperBlock;
import com.hlhtstudios.maple_delight.common.block.wood.MapleWoodTypes;
import com.hlhtstudios.maple_delight.common.world.tree.MapleSaplingGen;
import com.hlhtstudios.maple_delight.common.world.tree.RedMapleSaplingGen;
import com.terraformersmc.terraform.sign.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallSignBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.block.*;
import net.minecraft.block.enums.Instrument;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class Maples {

    public static void initialize(){
        Maple_delight.LOGGER.info("Generating Maples...");
        StrippableBlockRegistry.register(MAPLE_LOG, STRIPPED_MAPLE_LOG);
        StrippableBlockRegistry.register(MAPLE_WOOD, STRIPPED_MAPLE_WOOD);
        StrippableBlockRegistry.register(RED_MAPLE_LOG, STRIPPED_RED_MAPLE_LOG);
        StrippableBlockRegistry.register(RED_MAPLE_WOOD, STRIPPED_RED_MAPLE_WOOD);

        FlammableBlockRegistry.getDefaultInstance().add(MAPLE_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(MAPLE_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(STRIPPED_MAPLE_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(MAPLE_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(STRIPPED_MAPLE_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(RED_MAPLE_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(STRIPPED_RED_MAPLE_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(RED_MAPLE_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(STRIPPED_RED_MAPLE_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(MAPLE_LEAVES, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(RED_MAPLE_LEAVES, 30, 60);
    }

    private static Item registerBItem(String name, Block block, Rarity rarity){
        return Registry.register(Registries.ITEM, new Identifier(Maple_delight.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().rarity(rarity)));

    }

    private static Block registerBlock(String name, Block block, Rarity rarity){
        registerBItem(name, block, rarity);
        return Registry.register(Registries.BLOCK, new Identifier(Maple_delight.MOD_ID, name), block);
    }

    // tree blocks
    public static final Block MAPLE_LOG = registerBlock("maple_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_LOG).mapColor(MapColor.GRAY)), Rarity.COMMON);
    public static final Block MAPLE_WOOD = registerBlock("maple_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_WOOD).mapColor(MapColor.GRAY)), Rarity.COMMON);
    public static final Block STRIPPED_MAPLE_LOG = registerBlock("stripped_maple_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CHERRY_LOG).mapColor(MapColor.GRAY)), Rarity.COMMON);
    public static final Block STRIPPED_MAPLE_WOOD = registerBlock("stripped_maple_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CHERRY_WOOD).mapColor(MapColor.GRAY)), Rarity.COMMON);

    public static final Block RED_MAPLE_LOG = registerBlock("red_maple_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_LOG).mapColor(MapColor.BROWN)), Rarity.COMMON);
    public static final Block RED_MAPLE_WOOD = registerBlock("red_maple_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_WOOD).mapColor(MapColor.BROWN)), Rarity.COMMON);
    public static final Block STRIPPED_RED_MAPLE_LOG = registerBlock("stripped_red_maple_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CHERRY_LOG).mapColor(MapColor.SPRUCE_BROWN)), Rarity.COMMON);
    public static final Block STRIPPED_RED_MAPLE_WOOD = registerBlock("stripped_red_maple_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CHERRY_WOOD).mapColor(MapColor.SPRUCE_BROWN)), Rarity.COMMON);

    public static final Block MAPLE_LEAVES = registerBlock("maple_leaves",
            new MapleLeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).mapColor(MapColor.YELLOW), false), Rarity.COMMON);
    public static final Block RED_MAPLE_LEAVES = registerBlock("red_maple_leaves",
            new MapleLeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).mapColor(MapColor.RED), true), Rarity.COMMON);

    public static final Block MAPLE_PLANKS = registerBlock("maple_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).mapColor(MapColor.SPRUCE_BROWN)), Rarity.COMMON);

    public static final Block MAPLE_SAPLING = registerBlock("maple_sapling",
            new SaplingBlock(new MapleSaplingGen(), FabricBlockSettings.copyOf(Blocks.CHERRY_SAPLING)), Rarity.COMMON);
    public static final Block RED_MAPLE_SAPLING = registerBlock("red_maple_sapling",
            new SaplingBlock(new RedMapleSaplingGen(), FabricBlockSettings.copyOf(Blocks.CHERRY_SAPLING)), Rarity.COMMON);

    public static final Block MAPLE_STAIRS = registerBlock("maple_stairs",
            new StairsBlock(MAPLE_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), Rarity.COMMON);
    public static final Block MAPLE_SLAB = registerBlock("maple_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), Rarity.COMMON);

    public static final Block MAPLE_BUTTON = registerBlock("maple_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS), BlockSetType.CHERRY, 30, true), Rarity.COMMON);
    public static final Block MAPLE_PRESSURE_PLATE = registerBlock("maple_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS), BlockSetType.OAK), Rarity.COMMON);

    public static final Block MAPLE_DOOR = registerBlock("maple_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.CHERRY), Rarity.COMMON);
    public static final Block MAPLE_TRAPDOOR = registerBlock("maple_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_TRAPDOOR), BlockSetType.CHERRY), Rarity.COMMON);

    public static final Block MAPLE_FENCE = registerBlock("maple_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), Rarity.COMMON);
    public static final Block MAPLE_FENCE_GATE = registerBlock("maple_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS), WoodType.CHERRY), Rarity.COMMON);

    public static final Identifier MAPLE_SIGN_TEXTURE = new Identifier(Maple_delight.MOD_ID, "entity/signs/maple");
    public static final Identifier MAPLE_HANGING_SIGN_TEXTURE = new Identifier(Maple_delight.MOD_ID, "entity/signs/hanging/maple");
    public static final Identifier MAPLE_HANGING_SIGN_GUI_TEXTURE = new Identifier(Maple_delight.MOD_ID, "textures/gui/hanging_signs/maple");
    public static final Identifier HAZEL_SIGN_TEXTURE = new Identifier(Maple_delight.MOD_ID, "entity/signs/hazel");
    public static final Identifier HAZEL_HANGING_SIGN_TEXTURE = new Identifier(Maple_delight.MOD_ID, "entity/signs/hanging/hazel");
    public static final Identifier HAZEL_HANGING_SIGN_GUI_TEXTURE = new Identifier(Maple_delight.MOD_ID, "textures/gui/hanging_signs/hazel");

    public static final Block STANDING_MAPLE_SIGN = Registry.register(Registries.BLOCK, new Identifier(Maple_delight.MOD_ID, "maple_standing_sign"),
            new TerraformSignBlock(MAPLE_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.CHERRY_SIGN)));
    public static final Block WALL_MAPLE_SIGN = Registry.register(Registries.BLOCK, new Identifier(Maple_delight.MOD_ID, "maple_wall_sign"),
            new TerraformWallSignBlock(MAPLE_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.CHERRY_WALL_SIGN)));
    public static final Block HANGING_MAPLE_SIGN = Registry.register(Registries.BLOCK, new Identifier(Maple_delight.MOD_ID, "maple_hanging_sign"),
            new TerraformHangingSignBlock(MAPLE_HANGING_SIGN_TEXTURE, MAPLE_HANGING_SIGN_GUI_TEXTURE, FabricBlockSettings.copyOf(Blocks.CHERRY_HANGING_SIGN)));
    public static final Block WALL_HANGING_MAPLE_SIGN = Registry.register(Registries.BLOCK, new Identifier(Maple_delight.MOD_ID, "maple_wall_hanging_sign"),
            new TerraformWallHangingSignBlock(MAPLE_HANGING_SIGN_TEXTURE, MAPLE_HANGING_SIGN_GUI_TEXTURE, FabricBlockSettings.copyOf(Blocks.CHERRY_WALL_HANGING_SIGN)));

//    public static final Block HANGING_MAPLE_SIGN = Registry.register(Registries.BLOCK, new Identifier(Maple_delight.MOD_ID, "maple_hanging_sign"),
//            new HangingSignBlock(AbstractBlock.Settings.create()
//                    .mapColor(STRIPPED_MAPLE_LOG.getDefaultMapColor()).solid()
//                    .instrument(Instrument.BASS).noCollision().strength(1.0F).burnable(),
//                    MapleWoodTypes.MAPLE));
//    public static final Block WALL_HANGING_MAPLE_SIGN = Registry.register(Registries.BLOCK, new Identifier(Maple_delight.MOD_ID, "maple_wall_hanging_sign"),
//            new WallHangingSignBlock(AbstractBlock.Settings.create().mapColor(STRIPPED_MAPLE_LOG.getDefaultMapColor()).solid().instrument(Instrument.BASS).noCollision().strength(1.0F).burnable(), MapleWoodTypes.MAPLE));


    public static final BlockFamily MAPLE_FAMILY = BlockFamilies.register(MAPLE_PLANKS)
            .sign(STANDING_MAPLE_SIGN, WALL_MAPLE_SIGN)
            .group("wooden").unlockCriterionName("has_planks").build();

    public static final Block TREE_TAPPER = registerBlock("tree_tapper",
            new TreeTapperBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_PLANKS)), Rarity.COMMON);

}
