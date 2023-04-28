package io.github.el0t.vigilantbarnacle.items;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class DreamBladeItem extends SwordItem {
    private final int effectSize;
    public DreamBladeItem(Tier p_43269_, int p_43270_, float p_43271_, Properties p_43272_, int duration) {
        super(p_43269_, p_43270_, p_43271_, p_43272_);
        effectSize = duration;
    }
    @Override
    public boolean hurtEnemy(ItemStack weapon, LivingEntity target, LivingEntity attacker) {
        target.addEffect(new MobEffectInstance(MobEffects.LEVITATION, effectSize));
        return super.hurtEnemy(weapon, target, attacker);
    }
}
