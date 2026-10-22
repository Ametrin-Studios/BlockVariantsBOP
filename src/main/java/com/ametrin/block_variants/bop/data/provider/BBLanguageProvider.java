package com.ametrin.block_variants.bop.data.provider;

import com.ametrin.block_variants.bop.BlockVariantsBOPIntegration;
import com.ametrin.block_variants.bop.registry.BBBlocks;
import com.ametrin.block_variants.bop.registry.BBCreativeModeTabs;
import com.ametrin.block_variants.bop.registry.BBWoodBlocks;
import com.ametrinstudios.ametrin.data.provider.ExtendedLanguageProvider;
import net.minecraft.data.PackOutput;

public final class BBLanguageProvider extends ExtendedLanguageProvider {
    public BBLanguageProvider(PackOutput output) {
        super(output, BlockVariantsBOPIntegration.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add(BBCreativeModeTabs.BLOCK_VARIANTS_BOP_TRANSLATION_KEY, "Block Variants - Biomes O' Plenty");

        BBWoodBlocks.REGISTER.getEntries().forEach(e -> addHumanized(e.get(), e.getId().getPath()));
        BBBlocks.REGISTER.getEntries().forEach(e -> addHumanized(e.get(), e.getId().getPath()));
    }
}
