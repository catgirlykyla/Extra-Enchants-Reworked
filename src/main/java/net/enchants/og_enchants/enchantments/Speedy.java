package net.enchants.og_enchants.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.*;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.util.math.random.Random;

public class Speedy extends Enchantment {
    public Speedy(Rarity weight, EnchantmentTarget type, EquipmentSlot... slotTypes) {
        super(weight, type, slotTypes);
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if(!user.world.isClient()) {
            if(level == 1) {
                int chance = Random.create().nextBetween(1, 10);
                if(chance >= 1 && chance <= 3 && target instanceof LivingEntity) {
                    ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 60, 2), user);
                }
            }

            if(level == 2) {
                int chance = Random.create().nextBetween(1, 10);
                if(chance >= 1 && chance <= 3 && target instanceof LivingEntity) {
                    ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 60, 3), user);
                }
            }

            
        }

        super.onTargetDamaged(user, target, level);
    }

    @Override
    public int getMaxLevel() {
        return 2;
    }
}