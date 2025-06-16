package com.ametrin.block_variants.bop.registry;

import biomesoplenty.core.BiomesOPlenty;
import com.ametrin.block_variants.bop.BlockVariantsBOPIntegration;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public final class BBCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> REGISTER = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BlockVariantsBOPIntegration.MOD_ID);
    public static final String BLOCK_VARIANTS_BOP_TRANSLATION_KEY = "itemGroup.block_variants_bop.main";
    public static final Supplier<CreativeModeTab> BLOCK_VARIANTS_BOP = REGISTER.register("main", () -> CreativeModeTab.builder()
            .title(Component.translatable(BLOCK_VARIANTS_BOP_TRANSLATION_KEY))
            .withTabsBefore(ResourceLocation.fromNamespaceAndPath(BiomesOPlenty.MOD_ID, "main"))
            .icon(() -> BBBlocks.ROSE_QUARTZ_BLOCK_WALL.asItem().getDefaultInstance())
            .displayItems((parameters, output) -> BBBlocks.getAllBlocks().forEach(output::accept))
            .build()
    );
}
