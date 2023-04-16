package io.github.el0t.vigilantbarnacle.util.tags;

import io.github.el0t.vigilantbarnacle.VigilantBarnacle;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class VBBlockTags {

    public static final TagKey<Block> ORICHALCUM = create("mineable/needs_iron_tool");


    private static TagKey<Block> create(String location){
        return BlockTags.create(new ResourceLocation(VigilantBarnacle.MODID, location));
    }
    private static TagKey<Block> createForge(String location){
        return BlockTags.create(new ResourceLocation("forge", location));
    }

}
