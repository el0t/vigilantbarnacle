package io.github.el0t.vigilantbarnacle.init;

import io.github.el0t.vigilantbarnacle.VigilantBarnacle;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, VigilantBarnacle.MODID);

    public static final RegistryObject<Item> ORICHALCUM = ITEMS.register("orichalcum", () -> new Item(new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> YGGDRASIL_LEAF = ITEMS.register("yggdrasil_leaf", () -> new Item(new Item.Properties().rarity(Rarity.EPIC)));
}
