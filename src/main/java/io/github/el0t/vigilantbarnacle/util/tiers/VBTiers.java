package io.github.el0t.vigilantbarnacle.util.tiers;

import io.github.el0t.vigilantbarnacle.init.ItemInit;
import io.github.el0t.vigilantbarnacle.util.tags.VBBlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class VBTiers {

    public static final ForgeTier VBEARLY = new ForgeTier(2,780,7,2.5F,10,
            VBBlockTags.ORICHALCUM, () -> Ingredient.of(ItemInit.ORICHALCUM.get()));
    public static final ForgeTier VBMID = new ForgeTier(3,1561,9,3.5F,13,
            VBBlockTags.ORICHALCUM, () -> Ingredient.of(ItemInit.ORICHALCUM.get()));
    public static final ForgeTier VBLATE = new ForgeTier(4,2343,11,4.0F,16,
            VBBlockTags.ORICHALCUM, () -> Ingredient.of(ItemInit.ORICHALCUM.get()));
    public static final ForgeTier VBSUPER = new ForgeTier(4,2343,10,5.0F,19,
            VBBlockTags.ORICHALCUM, () -> Ingredient.of(ItemInit.ORICHALCUM.get()));
    public static final ForgeTier VBSTAF1 = new ForgeTier(0,1171,4,1.0F,22,
            VBBlockTags.ORICHALCUM, () -> Ingredient.of(ItemInit.ORICHALCUM.get()));
    public static final ForgeTier VBSTAF2 = new ForgeTier(1,1953,6,2.0F,25,
            VBBlockTags.ORICHALCUM, () -> Ingredient.of(ItemInit.ORICHALCUM.get()));
}
