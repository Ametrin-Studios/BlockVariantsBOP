package com.ametrin.block_variants.bop;

import com.ametrin.block_variants.bop.data.provider.*;
import com.ametrin.block_variants.bop.data.provider.loot.BBBlockLootProvider;
import com.ametrin.block_variants.bop.registry.BBBlocks;
import com.ametrin.block_variants.bop.registry.BBCreativeModeTabs;
import com.ametrin.block_variants.bop.registry.BBItems;
import com.ametrinstudios.ametrin.data.provider.CustomLootTableProvider;
import com.barion.block_variants.BlockVariants;
import com.barion.block_variants.data.provider.BVRecipeProvider;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.network.chat.Component;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;

@Mod(BlockVariantsBOPIntegration.MOD_ID)
public final class BlockVariantsBOPIntegration {
    public static final String MOD_ID = "block_variants_bop";
    private static final Logger LOGGER = LogUtils.getLogger();

    public BlockVariantsBOPIntegration(IEventBus modBus, ModContainer modContainer) {
        BBBlocks.REGISTER.register(modBus);
        BBItems.REGISTER.register(modBus);
        BBCreativeModeTabs.REGISTER.register(modBus);
        modBus.addListener(BlockVariantsBOPIntegration::gatherData);
    }

    private static void gatherData(GatherDataEvent.Client event) {
        event.createProvider(BBModelProvider::new);
        event.createProvider(BBRecipeProvider.Runner::new);
        event.createProvider(BBLanguageProvider::new);
        event.createProvider(BBDataMapProvider::new);
        event.createBlockAndItemTags(BBBlockTagsProvider::new, BBItemTagsProvider::new);
        event.createProvider(CustomLootTableProvider.builder()
                .addBlockProvider(BBBlockLootProvider::new)
                ::build);
    }
}
