package io.github.el0t.vigilantbarnacle;

import com.mojang.logging.LogUtils;
import io.github.el0t.vigilantbarnacle.init.BlockInit;
import io.github.el0t.vigilantbarnacle.init.ItemInit;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(VigilantBarnacle.MODID)
public class VigilantBarnacle
{
    public static final String MODID = "vigilantbarnacle";
    public static CreativeModeTab tab1;
    public static CreativeModeTab tab2;
    private static final Logger LOGGER = LogUtils.getLogger();

    public VigilantBarnacle()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // BLOCKS.register(modEventBus);
        ItemInit.ITEMS.register(modEventBus);
        BlockInit.BLOCKS.register(modEventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register creative tabs
        modEventBus.addListener(this::registerTabs);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        // Common setup code
        LOGGER.info("HELLO FROM COMMON SETUP");
        LOGGER.info("DIRT BLOCK >> {}", ForgeRegistries.BLOCKS.getKey(Blocks.DIRT));
    }

    private void registerTabs(CreativeModeTabEvent.Register event){
        tab1 = event.registerCreativeModeTab(new ResourceLocation(MODID, "tab1"), builder -> builder
                .icon(() -> new ItemStack(ItemInit.ORICHALCUM.get()))
                .title(Component.translatable("tabs.vigilantbarnacle.tab1"))
                .displayItems((featureFlags, output) -> {
                    output.accept(ItemInit.ORICHALCUM.get());
                    output.accept(BlockInit.ORICHALCUM_BLOCK.get());
                    output.accept(ItemInit.YGGDRASIL_LEAF.get());
                }));
        tab2 = event.registerCreativeModeTab(new ResourceLocation(MODID, "tab2"), builder -> builder
                .icon(() -> new ItemStack(ItemInit.UBER_MIRACLE_SWORD.get()))
                .title(Component.translatable("tabs.vigilantbarnacle.tab2"))
                .displayItems((featureFlags, output) -> {
                    output.accept(ItemInit.CYPRESS_STICK.get());
                    output.accept(ItemInit.SOLDIERS_SWORD.get());
                    output.accept(ItemInit.STEEL_BROADSWORD.get());
                    output.accept(ItemInit.TEMPLARS_SWORD.get());
                    output.accept(ItemInit.RAPIER.get());
                    output.accept(ItemInit.MIRACLE_SWORD.get());
                    output.accept(ItemInit.UBER_MIRACLE_SWORD.get());
                    output.accept(ItemInit.DREAM_BLADE.get());
                    output.accept(ItemInit.ZOMBIESBANE.get());
                    output.accept(ItemInit.ZOMBIE_SLAYER.get());
                }));
    }
    private void addCreative(CreativeModeTabEvent.BuildContents event)
    {
        /* if (event.getTab() == CreativeModeTabs.SPAWN_EGGS) {
            event.accept(ItemInit.ORICHALCUM);
            event.accept(ItemInit.YGGDRASIL_LEAF);
        } */
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            // Some client setup code
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
