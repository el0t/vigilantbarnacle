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

public class DreamBladeItem extends SwordItem {
    private final int duration;
    private final String tooltip = "Levitates enemies";
    public DreamBladeItem(Tier p_43269_, int p_43270_, float p_43271_, Properties p_43272_, int duration) {
        super(p_43269_, p_43270_, p_43271_, p_43272_);
        this.duration = duration;
    }
    @Override
    public boolean hurtEnemy(ItemStack weapon, LivingEntity target, LivingEntity attacker) {
        target.addEffect(new MobEffectInstance(MobEffects.LEVITATION, duration));
        return super.hurtEnemy(weapon, target, attacker);
    }
    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> componentList, TooltipFlag flag) {
        componentList.add(Component.literal(tooltip).withStyle(ChatFormatting.DARK_GREEN));
        super.appendHoverText(stack, level, componentList, flag);
    }
}
