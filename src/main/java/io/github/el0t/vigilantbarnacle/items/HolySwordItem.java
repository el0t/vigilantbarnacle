package io.github.el0t.vigilantbarnacle.items;

import io.github.el0t.vigilantbarnacle.util.tags.VBEntityTags;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageSources;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

import java.util.ArrayList;

public class HolySwordItem extends SwordItem {
    private final int holy_damage;
    public HolySwordItem(Tier p_43269_, int p_43270_, float p_43271_, Properties p_43272_, int extra_damage) {
        super(p_43269_, p_43270_, p_43271_, p_43272_);
        holy_damage = extra_damage;
    }
    @Override
    public boolean hurtEnemy(ItemStack weapon, LivingEntity target, LivingEntity attacker) {

        if (isUndead(target))
        {
            target.addEffect(new MobEffectInstance(MobEffects.GLOWING,100));
        }
        return super.hurtEnemy(weapon, target, attacker);
    }

    public boolean isUndead(LivingEntity entity) {
        EntityType<?> type = entity.getType();
        return type.is(VBEntityTags.UNDEAD);
    }

}
