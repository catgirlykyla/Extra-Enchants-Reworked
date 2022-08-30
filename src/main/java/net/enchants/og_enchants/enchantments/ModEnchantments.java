package net.enchants.og_enchants.enchantments;

import net.enchants.og_enchants.enchantments.WitherEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.enchants.og_enchants.og_enchants;

public class ModEnchantments {
    public static Enchantment Wither_enchantment = register("witherenchantment",
            new WitherEnchantment(Enchantment.Rarity.UNCOMMON,
                    EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));

    public static Enchantment Lev_enchantment = register("levenchantment",
            new LevEnchantment(Enchantment.Rarity.UNCOMMON,
                    EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));

    public static Enchantment inky_enchantment = register("inkyenchantment",
            new InkyEnchantment(Enchantment.Rarity.UNCOMMON,
                    EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));

public static Enchantment lifesteal_enchantment = register("lifestealenchantment",
            new lifesteal_enchantment(Enchantment.Rarity.UNCOMMON,
                    EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));

                    public static Enchantment Strength_Enchantment = register("strengthenchantment",
            new Strength_Enchantment(Enchantment.Rarity.UNCOMMON,
                    EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));

                    public static Enchantment LightningEnchantment = register("lightningenchantment",
            new LightningEnchantment(Enchantment.Rarity.UNCOMMON,
                    EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));

                    public static Enchantment Speedy = register("speedy",
            new Speedy(Enchantment.Rarity.UNCOMMON, EnchantmentTarget.ARMOR_FEET, EquipmentSlot.MAINHAND));
                    
                    

    private static Enchantment register(String name, Enchantment enchantment) {
        return Registry.register(Registry.ENCHANTMENT, new Identifier(og_enchants.MOD_ID, name), enchantment);
    }


    public static void registerModEnchanments() {
        System.out.println("Registering ModEnchantments for " + og_enchants.MOD_ID);
    }
}