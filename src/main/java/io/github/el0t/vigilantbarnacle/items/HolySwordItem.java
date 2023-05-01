package io.github.el0t.vigilantbarnacle.items;

import net.minecraft.ChatFormatting;
import net.minecraft.core.Holder;
import net.minecraft.network.chat.Component;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageSources;
import net.minecraft.world.damagesource.DamageType;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class HolySwordItem extends SwordItem {
    private final int holy_damage;
    private final String tooltip;
    public HolySwordItem(Tier p_43269_, int p_43270_, float p_43271_, Properties p_43272_, int extra_damage) {
        super(p_43269_, p_43270_, p_43271_, p_43272_);
        holy_damage = extra_damage;
        tooltip = "Does "+Integer.toString(holy_damage)+" damage to Undead";
    }
    @Override
    public boolean hurtEnemy(ItemStack weapon, LivingEntity target, LivingEntity attacker) {
        if (target.isInvertedHealAndHarm())
        {
            target.addEffect(new MobEffectInstance(MobEffects.HEAL, holy_damage));
        }
        super.hurtEnemy(weapon, target, attacker);
        return true;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> componentList, TooltipFlag flag) {
        componentList.add(Component.literal(tooltip).withStyle(ChatFormatting.DARK_GREEN));
        super.appendHoverText(stack, level, componentList, flag);
    }


}
