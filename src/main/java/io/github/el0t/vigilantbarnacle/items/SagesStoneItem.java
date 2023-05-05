package io.github.el0t.vigilantbarnacle.items;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class SagesStoneItem extends Item {
    public SagesStoneItem(Properties properties){
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand){

        player.addEffect(new MobEffectInstance(MobEffects.HEAL, getHealNumber()));
        //todo custom particle effect
        //todo cooldown
        return super.use(level, player, hand);
    }

    private int getHealNumber(){
        return 1;
    }
}
