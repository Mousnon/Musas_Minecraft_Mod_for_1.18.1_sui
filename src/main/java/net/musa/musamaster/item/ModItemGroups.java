package net.musa.musamaster.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.musa.musamaster.MCCourseMod;

public class ModItemGroups {
    public static final ItemGroup GREEN = FabricItemGroupBuilder.build(new Identifier(MCCourseMod.MOD_ID, "green"),
            () -> new ItemStack(ModItems.GREEN_INGOT));

}
