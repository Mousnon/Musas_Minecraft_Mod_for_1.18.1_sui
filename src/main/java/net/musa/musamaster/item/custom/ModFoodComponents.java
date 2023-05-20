package net.musa.musamaster.item.custom;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;

public class ModFoodComponents {
    public static FoodComponent PIZZA = new FoodComponent.Builder().hunger(20).
            saturationModifier(0.3f).statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 700),
                     99f).build();
}
