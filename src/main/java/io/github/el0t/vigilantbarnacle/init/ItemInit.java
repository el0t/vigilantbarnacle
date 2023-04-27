package io.github.el0t.vigilantbarnacle.init;

import io.github.el0t.vigilantbarnacle.VigilantBarnacle;
import io.github.el0t.vigilantbarnacle.util.tiers.VBTiers;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, VigilantBarnacle.MODID);

    public static final RegistryObject<Item> ORICHALCUM = ITEMS.register("orichalcum", () -> new Item(new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> YGGDRASIL_LEAF = ITEMS.register("yggdrasil_leaf", () -> new Item(new Item.Properties().rarity(Rarity.EPIC)));

    public static final RegistryObject<SwordItem> CYPRESS_STICK = ITEMS.register("cypress_stick",
            () -> new SwordItem(Tiers.WOOD, 1, 3.5F, new Item.Properties()));  //tier, attack_damage, attack_speed, props
    public static final RegistryObject<SwordItem> SOLDIERS_SWORD = ITEMS.register("soldiers_sword", () -> new SwordItem(Tiers.IRON, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<SwordItem> RAPIER = ITEMS.register("rapier", () -> new SwordItem(Tiers.IRON, 3, 2.0F, new Item.Properties()));
    public static final RegistryObject<SwordItem> STEEL_BROADSWORD = ITEMS.register("steel_broadsword", () -> new SwordItem(Tiers.IRON, 4, -2.8F, new Item.Properties()));
    public static final RegistryObject<SwordItem> TEMPLARS_SWORD = ITEMS.register("templars_sword", ()-> new SwordItem(Tiers.IRON, 3, -2.4F, new Item.Properties()));

}
