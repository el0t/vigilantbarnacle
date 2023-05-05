package io.github.el0t.vigilantbarnacle.init;

import io.github.el0t.vigilantbarnacle.VigilantBarnacle;
import io.github.el0t.vigilantbarnacle.blocks.NookGrassCropBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, VigilantBarnacle.MODID);

    public static final RegistryObject<Block> ORICHALCUM_BLOCK = register("orichalcum_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.DIAMOND).requiresCorrectToolForDrops().strength(2.0F, 6.0F)),
                  new Item.Properties().rarity(Rarity.RARE));
    public static final RegistryObject<Block> NOOK_GRASS_CROP = BLOCKS.register("nook_grass_crop",
            () -> new NookGrassCropBlock(BlockBehaviour.Properties.copy(Blocks.POTATOES)));

    //Generic method to register block items
    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> supplier, Item.Properties properties){
        RegistryObject<T> block = BLOCKS.register(name, supplier);
        ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(), properties));
        return block;
    }
}
