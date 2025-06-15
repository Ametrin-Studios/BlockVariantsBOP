package com.ametrin.block_variants.bop.data.provider;

import com.ametrin.block_variants.bop.BlockVariantsBOPIntegration;
import com.ametrin.block_variants.bop.registry.BBBlocks;
import com.ametrin.block_variants.bop.registry.BBCreativeModeTabs;
import com.ametrinstudios.ametrin.data.provider.ExtendedLanguageProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.ItemLike;

public final class BBLanguageProvider extends ExtendedLanguageProvider {
    public BBLanguageProvider(PackOutput output) {
        super(output, BlockVariantsBOPIntegration.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add(BBCreativeModeTabs.BLOCK_VARIANTS_BOP_TRANSLATION_KEY, "Block Variants - Biomes O' Plenty");

        family("Fir Log").stairs(BBBlocks.FIR_LOG_STAIRS).slab(BBBlocks.FIR_LOG_SLAB);
        family("Stripped Fir Log").stairs(BBBlocks.STRIPPED_FIR_LOG_STAIRS).slab(BBBlocks.STRIPPED_FIR_LOG_SLAB);
        family("Fir Wood").stairs(BBBlocks.FIR_WOOD_STAIRS).slab(BBBlocks.FIR_WOOD_SLAB).wall(BBBlocks.FIR_WOOD_WALL).fence(BBBlocks.FIR_WOOD_FENCE).fenceGate(BBBlocks.FIR_WOOD_FENCE_GATE);
        family("Stripped Fir Wood").stairs(BBBlocks.STRIPPED_FIR_WOOD_STAIRS).slab(BBBlocks.STRIPPED_FIR_WOOD_SLAB).wall(BBBlocks.STRIPPED_FIR_WOOD_WALL).fence(BBBlocks.STRIPPED_FIR_WOOD_FENCE).fenceGate(BBBlocks.STRIPPED_FIR_WOOD_FENCE_GATE);
    }

    public FamilyBuilder family(String name) {
        return new FamilyBuilder(this, name);
    }

    public static final class FamilyBuilder {
        private final ExtendedLanguageProvider provider;
        private final String name;

        public FamilyBuilder(ExtendedLanguageProvider provider, String name) {
            this.provider = provider;
            this.name = name;
        }

        public FamilyBuilder stairs(ItemLike stairs) {
            provider.add(stairs.asItem(), name + " Stairs");
            return this;
        }

        public FamilyBuilder slab(ItemLike slab) {
            provider.add(slab.asItem(), name + " Slab");
            return this;
        }

        public FamilyBuilder wall(ItemLike slab) {
            provider.add(slab.asItem(), name + " Wall");
            return this;
        }

        public FamilyBuilder fence(ItemLike slab) {
            provider.add(slab.asItem(), name + " Fence");
            return this;
        }

        public FamilyBuilder fenceGate(ItemLike slab) {
            provider.add(slab.asItem(), name + " Fence Gate");
            return this;
        }
    }
}
