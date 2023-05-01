package io.github.el0t.vigilantbarnacle.items;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class MiracleSwordItem extends SwordItem {
    private final int healing;
    private final String tooltip;
    public MiracleSwordItem(Tier p_43269_, int p_43270_, float p_43271_, Properties p_43272_, int healing) {
        super(p_43269_, p_43270_, p_43271_, p_43272_);
        this.healing = healing;
        tooltip = "Heals "+ this.healing + " on hit";
    }
    @Override
    public boolean hurtEnemy(ItemStack weapon, LivingEntity target, LivingEntity attacker) {
        attacker.addEffect(new MobEffectInstance(MobEffects.HEAL, healing));
        return super.hurtEnemy(weapon, target, attacker);
    }
    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> componentList, TooltipFlag flag) {
        componentList.add(Component.literal(tooltip).withStyle(ChatFormatting.DARK_GREEN));
        super.appendHoverText(stack, level, componentList, flag);
    }
}
