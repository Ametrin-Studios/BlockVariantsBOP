package com.ametrin.block_variants.bop;

import com.ametrin.block_variants.bop.registry.BBBlocks;
import com.ametrin.block_variants.bop.registry.BBCreativeModeTabs;
import com.ametrin.block_variants.bop.registry.BBItems;
import com.ametrin.block_variants.bop.registry.BBWoodBlocks;
import com.mojang.logging.LogUtils;
import net.minecraft.resources.Identifier;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod(BlockVariantsBOPIntegration.MOD_ID)
public final class BlockVariantsBOPIntegration {
    public static final String MOD_ID = "block_variants_bop";
    private static final Logger LOGGER = LogUtils.getLogger();

    public BlockVariantsBOPIntegration(IEventBus modBus, ModContainer modContainer) {
        BBBlocks.REGISTER.register(modBus);
        BBWoodBlocks.REGISTER.register(modBus);
        BBItems.REGISTER.register(modBus);
        BBCreativeModeTabs.REGISTER.register(modBus);
    }

    public static Identifier locate(String path) {
        return Identifier.fromNamespaceAndPath(MOD_ID, path);
    }
}
