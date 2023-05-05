package io.github.el0t.vigilantbarnacle.init;

import io.github.el0t.vigilantbarnacle.VigilantBarnacle;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ParticleInit {
    public static final DeferredRegister<ParticleType<?>> PARTICLE_TYPES = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, VigilantBarnacle.MODID);

    // TODO particles

    //  public static final RegistryObject<SimpleParticleType> SAGES_STONE_PARTICLES = PARTICLE_TYPES.register("sages_stone_particles", () -> new SimpleParticleType(true));

}
