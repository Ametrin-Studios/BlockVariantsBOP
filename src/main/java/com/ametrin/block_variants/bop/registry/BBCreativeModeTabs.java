package com.ametrin.block_variants.bop.registry;

import com.ametrin.block_variants.bop.BlockVariantsBOPIntegration;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public final class BBCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> REGISTER = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BlockVariantsBOPIntegration.MOD_ID);
    public static final Supplier<CreativeModeTab> BLOCK_VARIANTS_BOP = REGISTER.register("block_variants_bop", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.block_variants_bop"))
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> BBBlocks.FIR_LOG_STAIRS.asItem().getDefaultInstance())
            .displayItems((parameters, output) -> BBBlocks.getAllBlocks().forEach(output::accept))
            .build()
    );
}
