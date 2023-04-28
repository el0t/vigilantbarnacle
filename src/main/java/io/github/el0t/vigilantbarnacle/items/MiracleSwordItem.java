package io.github.el0t.vigilantbarnacle.items;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class MiracleSwordItem extends SwordItem {
    private int healing;
    public MiracleSwordItem(Tier p_43269_, int p_43270_, float p_43271_, Properties p_43272_, int heals) {
        super(p_43269_, p_43270_, p_43271_, p_43272_);
        healing = heals;
    }
    @Override
    public boolean hurtEnemy(ItemStack weapon, LivingEntity target, LivingEntity attacker) {
        attacker.addEffect(new MobEffectInstance(MobEffects.HEAL, healing));
        return super.hurtEnemy(weapon, target, attacker);
    }
}
