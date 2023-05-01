package io.github.el0t.vigilantbarnacle.util.tags;

import io.github.el0t.vigilantbarnacle.VigilantBarnacle;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;

import java.util.ArrayList;

public class VBEntityTags {

    // public static final TagKey<EntityType<?>> EVIL = create("evil");



    private static TagKey<EntityType<?>> create(String location){
        return TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation(VigilantBarnacle.MODID, location));
    }
    public boolean isEvil(LivingEntity entity) {
        return Evil_Entities().contains(entity.getType());
        //todo - use TAGS to do this somehow
    }
    private static ArrayList<EntityType<?>> Evil_Entities() {
        ArrayList<EntityType<?>> list = new ArrayList<>();
        list.add(EntityType.GIANT);
        list.add(EntityType.HUSK);
        list.add(EntityType.PHANTOM);
        list.add(EntityType.DROWNED);
        list.add(EntityType.SKELETON);
        list.add(EntityType.SKELETON_HORSE);
        list.add(EntityType.WITHER_SKELETON);
        list.add(EntityType.WITHER);
        list.add(EntityType.STRAY);
        list.add(EntityType.ZOGLIN);
        list.add(EntityType.ZOMBIFIED_PIGLIN);
        list.add(EntityType.ZOMBIE);
        list.add(EntityType.ZOMBIE_VILLAGER);
        list.add(EntityType.ZOMBIE_HORSE);
        return list;
    }
}
