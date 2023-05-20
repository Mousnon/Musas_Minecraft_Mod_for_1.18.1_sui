package net.musa.musamaster.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.musa.musamaster.MCCourseMod;
import net.musa.musamaster.item.ModItems;

// not finished!!!
public class ModRegistries {
    public static void registerModStuffs() {
        registerFuels();
    }

    private static void registerFuels() {
        System.out.println("Registering Fuels for + " + MCCourseMod.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        // 400 / 20 = 20 Seconds
        registry.add(ModItems.GREEN_COAL, 400);
    }
}
