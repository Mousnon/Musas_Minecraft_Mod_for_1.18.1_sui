package net.musa.musamaster.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.musa.musamaster.MCCourseMod;
import net.musa.musamaster.block.custom.*;
import net.musa.musamaster.item.ModItemGroups;

public class ModBlocks {




    public static final Block GREEN_BLOCK = registerBlock("green_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroups.GREEN);
    public static final Block GREEN_ORE = registerBlock("green_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ModItemGroups.GREEN);
    public static final Block DEEPSLATE_GREEN_ORE = registerBlock("deepslate_green_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()), ModItemGroups.GREEN);
    public static final Block RAW_GREEN_BLOCK = registerBlock("raw_green_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()), ModItemGroups.GREEN);

    public static final Block GREEN_SPEEDY_BLOCK = registerBlock("green_speedy_block",
            new SpeedyBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()), ModItemGroups.GREEN);

    public static final Block GREEN_COAL_ORE = registerBlock("green_coal_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()), ModItemGroups.GREEN);
    public static final Block GREEN_STAIRS = registerBlock("green_stairs",
            new ModStairsBlocks(ModBlocks.GREEN_BLOCK.getDefaultState()
                    ,FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroups.GREEN);
    public static final Block GREEN_SLAB = registerBlock("green_slab",
            new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroups.GREEN);
    public static final Block GREEN_BUTTON = registerBlock("green_button",
            new ModStoneButtonBlock(FabricBlockSettings.of(Material.METAL).strength(1.0f)), ModItemGroups.GREEN);
    public static final Block GREEN_PRESSURE_PLATE = registerBlock("green_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.of(Material.METAL).strength(1.0f)), ModItemGroups.GREEN);
    public static final Block GREEN_FENCE = registerBlock("green_fence",
            new FenceBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroups.GREEN);
    public static final Block GREEN_FENCE_GATE = registerBlock("green_fence_gate",
            new FenceGateBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroups.GREEN);
    public static final Block GREEN_WALL = registerBlock("green_wall",
            new WallBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroups.GREEN);
    public static final Block GREEN_DOOR = registerBlock("green_door",
            new ModDoorBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool().nonOpaque()), ModItemGroups.GREEN);
    public static final Block GREEN_TRAPDOOR = registerBlock("green_trapdoor",
            new ModTrapdoorBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool().nonOpaque()), ModItemGroups.GREEN);




    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(MCCourseMod.MOD_ID, name), block);
    }



    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
       return Registry.register(Registry.ITEM, new Identifier(MCCourseMod.MOD_ID, name),
               new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        System.out.println("Registering Mod Blocks for " + MCCourseMod.MOD_ID);
    }
}
