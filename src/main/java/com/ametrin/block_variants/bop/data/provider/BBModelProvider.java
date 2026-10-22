package com.ametrin.block_variants.bop.data.provider;

import biomesoplenty.api.block.BOPBlocks;
import com.ametrin.block_variants.bop.BlockVariantsBOPIntegration;
import com.ametrin.block_variants.bop.registry.BBBlockFamilies;
import com.ametrinstudios.ametrin.data.provider.ExtendedModelProvider;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.data.PackOutput;

import static com.ametrin.block_variants.data.provider.BVModelProvider.createWoodenExisting;

public final class BBModelProvider extends ExtendedModelProvider {
    public BBModelProvider(PackOutput output) {
        super(output, BlockVariantsBOPIntegration.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        blockModels.familyWithExistingFullBlock(BOPBlocks.FLESH).generateFor(BBBlockFamilies.FLESH);
        blockModels.familyWithExistingFullBlock(BOPBlocks.POROUS_FLESH).generateFor(BBBlockFamilies.POROUS_FLESH);
        blockModels.familyWithExistingFullBlock(BOPBlocks.ROSE_QUARTZ_BLOCK).generateFor(BBBlockFamilies.ROSE_QUARTZ_BLOCK);

        BBBlockFamilies.FLOWER_PETALS.forEach(family -> blockModels.familyWithExistingFullBlock(family.getBaseBlock()).generateFor(family));

        createWoodenExisting(blockModels, BBBlockFamilies.LOG, BBBlockFamilies.WOOD);
        createWoodenExisting(blockModels, BBBlockFamilies.STRIPPED_LOG, BBBlockFamilies.STRIPPED_WOOD);
    }
}
