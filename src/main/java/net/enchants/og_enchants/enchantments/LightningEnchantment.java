package net.enchants.og_enchants.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;

public class LightningEnchantment extends Enchantment {
    public LightningEnchantment(Rarity weight, EnchantmentTarget type, EquipmentSlot... slotTypes) {
        super(weight, type, slotTypes);
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if(!user.world.isClient()) {
            ServerWorld world = ((ServerWorld) user.world);
            PlayerEntity player = ((PlayerEntity) user);
            BlockPos position = target.getBlockPos();

            if(level == 1) {
                int chance = Random.create().nextBetween(1, 10);
                if(chance >= 1 && chance <= 1 && target instanceof LivingEntity) {
                EntityType.LIGHTNING_BOLT.spawn(world, null, null, player, position,
                        SpawnReason.TRIGGERED, true, true);
                }
            }

            
        }

        super.onTargetDamaged(user, target, level);
    }
}