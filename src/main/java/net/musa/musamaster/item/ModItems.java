package net.musa.musamaster.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.musa.musamaster.MCCourseMod;
import net.musa.musamaster.item.custom.*;

public class ModItems {

    public static final Item GREEN_INGOT = registerItem("green_ingot",
            new Item(new FabricItemSettings().group(ModItemGroups.GREEN)));

    public static final Item GREEN_NUGGET = registerItem("green_nugget",
            new Item(new FabricItemSettings().group(ModItemGroups.GREEN)));
    public static final Item GREEN_COIN = registerItem("green_coin",
            new Item(new FabricItemSettings().group(ModItemGroups.GREEN)));

    public static final Item RAW_GREEN = registerItem("raw_green",
            new Item(new FabricItemSettings().group(ModItemGroups.GREEN)));
    public static final Item PIZZA = registerItem("pizza",
            new Item(new FabricItemSettings().group(ModItemGroups.GREEN).food(ModFoodComponents.PIZZA)));
    public static final Item GREEN_DOWSING_ROD = registerItem("green_dowsing_rod",
            new DowsingRodItem(new FabricItemSettings().group(ModItemGroups.GREEN).maxDamage(32)));
    public static final Item GREEN_COAL= registerItem("green_coal",
            new Item(new FabricItemSettings().group(ModItemGroups.GREEN)));
    public static final Item GREEN_PICKAXE= registerItem("green_pickaxe",
            new ModPickaxeItem(ModToolMaterial.GREEN, 5, 6f,
                        new FabricItemSettings().group(ModItemGroups.GREEN)));
    public static final Item GREEN_SWORD = registerItem("green_sword",
            new ModBlindingSwordItem(ModToolMaterial.GREEN, 50, 40f,
                    new FabricItemSettings().group(ModItemGroups.GREEN)));
    public static final Item GREEN_HOE= registerItem("green_hoe",
            new ModHoeItem(ModToolMaterial.GREEN, 3, 1f,
                    new FabricItemSettings().group(ModItemGroups.GREEN)));
    public static final Item GREEN_AXE= registerItem("green_axe",
            new ModAxeItem(ModToolMaterial.GREEN, 7, 6f,
                    new FabricItemSettings().group(ModItemGroups.GREEN)));
    public static final Item GREEN_SHOVEL= registerItem("green_shovel",
            new ShovelItem(ModToolMaterial.GREEN, 1, 2f,
                    new FabricItemSettings().group(ModItemGroups.GREEN)));
    public static final Item GREEN_PAXEL = registerItem("green_paxel",
            new ModPaxelItem(ModToolMaterial.GREEN, 40, 35f,
                    new FabricItemSettings().group(ModItemGroups.GREEN)));

    public static final Item GREEN_HELMET = registerItem("green_helmet",
            new ArmorItem(ModArmorMaterials.GREEN, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroups.GREEN)));
    public static final Item GREEN_CHESTPLATE = registerItem("green_chestplate",
            new ArmorItem(ModArmorMaterials.GREEN, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroups.GREEN)));;
    public static final Item GREEN_LEGGINGS = registerItem("green_leggings",
            new ArmorItem(ModArmorMaterials.GREEN, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroups.GREEN)));
    public static final Item GREEN_BOOTS = registerItem("green_boots",
            new ArmorItem(ModArmorMaterials.GREEN, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroups.GREEN)));


    private static Item registerItem(String name, Item item) {
     return Registry.register(Registry.ITEM, new Identifier(MCCourseMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Mod Items for " + MCCourseMod.MOD_ID);
    }
}
