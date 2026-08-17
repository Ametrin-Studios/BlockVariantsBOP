package com.ametrin.block_variants.bop.data.provider;

import com.ametrin.block_variants.bop.BlockVariantsBOPIntegration;
import com.ametrinstudios.ametrin.data.provider.ExtendedItemTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.BlockItemTagsProvider;

import java.util.concurrent.CompletableFuture;

public final class BBItemTagsProvider extends ExtendedItemTagsProvider {

    public BBItemTagsProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, lookupProvider, BlockVariantsBOPIntegration.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        new BBBlockItemTagsProvider(tags -> BlockItemTagsProvider.wrapForItems(tag(tags.item()))).run();
    }
}
