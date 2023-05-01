package io.github.el0t.vigilantbarnacle.util.tags;

import io.github.el0t.vigilantbarnacle.VigilantBarnacle;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;

public class VBEntityTags {

    public static final TagKey<EntityType<?>> UNDEAD = create("undead");



    private static TagKey<EntityType<?>> create(String location){
        return TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation(VigilantBarnacle.MODID, location));
    }
}
