package io.github.el0t.vigilantbarnacle.init;

import io.github.el0t.vigilantbarnacle.VigilantBarnacle;
import io.github.el0t.vigilantbarnacle.items.DreamBladeItem;
import io.github.el0t.vigilantbarnacle.items.HolySwordItem;
import io.github.el0t.vigilantbarnacle.items.MiracleSwordItem;
import io.github.el0t.vigilantbarnacle.util.tiers.VBTiers;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, VigilantBarnacle.MODID);

    public static final RegistryObject<Item> ORICHALCUM = ITEMS.register("orichalcum", () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> YGGDRASIL_LEAF = ITEMS.register("yggdrasil_leaf", () -> new Item(new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> NOOK_GRASS = ITEMS.register("nook_grass", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(1.0F).build())));
    public static final RegistryObject<Item> NOOK_SEEDS = ITEMS.register("nook_seeds", () -> new ItemNameBlockItem(BlockInit.NOOK_GRASS_CROP.get(), new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(1).saturationMod(1.0F).build())));


    //todo make burning nook grass
    public static final RegistryObject<SwordItem> CYPRESS_STICK = ITEMS.register("cypress_stick",
            () -> new SwordItem(Tiers.WOOD, 1, 3.0F, new Item.Properties()));  //tier, attack_damage, attack_speed, props
    public static final RegistryObject<SwordItem> SOLDIERS_SWORD = ITEMS.register("soldiers_sword", () -> new SwordItem(Tiers.IRON, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<SwordItem> RAPIER = ITEMS.register("rapier", () -> new SwordItem(Tiers.IRON, 3, 1.5F, new Item.Properties()));
    public static final RegistryObject<SwordItem> STEEL_BROADSWORD = ITEMS.register("steel_broadsword", () -> new SwordItem(Tiers.IRON, 4, -2.8F, new Item.Properties()));
    public static final RegistryObject<SwordItem> TEMPLARS_SWORD = ITEMS.register("templars_sword", ()-> new SwordItem(Tiers.IRON, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<MiracleSwordItem> MIRACLE_SWORD = ITEMS.register("miracle_sword",
            () -> new MiracleSwordItem(VBTiers.ORICHALCUM, 3, -2.4F, new Item.Properties().rarity(Rarity.UNCOMMON), 1));
    public static final RegistryObject<MiracleSwordItem> UBER_MIRACLE_SWORD = ITEMS.register("uber_miracle_sword",
            () -> new MiracleSwordItem(VBTiers.UBER_ORICHALCUM, 3, -2.4F, new Item.Properties().rarity(Rarity.RARE), 1));
    public static final RegistryObject<DreamBladeItem> DREAM_BLADE = ITEMS.register("dream_blade",
            () -> new DreamBladeItem(VBTiers.ORICHALCUM, 3, -2.0F, new Item.Properties().rarity(Rarity.UNCOMMON), 54));
    public static final RegistryObject<HolySwordItem> ZOMBIESBANE = ITEMS.register("zombiesbane",
            () -> new HolySwordItem(VBTiers.ORICHALCUM, 3, -2.4F, new Item.Properties().rarity(Rarity.UNCOMMON), 10));
    public static final RegistryObject<HolySwordItem> ZOMBIE_SLAYER = ITEMS.register("zombie_slayer",
            () -> new HolySwordItem(VBTiers.UBER_ORICHALCUM, 3, -2.4F, new Item.Properties().rarity(Rarity.RARE),10));
}
