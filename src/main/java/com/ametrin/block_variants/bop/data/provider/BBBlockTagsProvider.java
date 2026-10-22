package com.ametrin.block_variants.bop.data.provider;

import com.ametrin.block_variants.bop.BlockVariantsBOPIntegration;
import com.ametrin.block_variants.bop.registry.BBBlockItemIds;
import com.ametrin.block_variants.bop.registry.BBBlocks;
import com.ametrin.block_variants.bop.registry.BBWoodBlocks;
import com.ametrinstudios.ametrin.data.provider.ExtendedBlockTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.BlockItemTagsProvider;
import net.minecraft.references.BlockItemId;
import net.minecraft.tags.BlockTags;

import java.util.concurrent.CompletableFuture;

public final class BBBlockTagsProvider extends ExtendedBlockTagsProvider {
    public BBBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BlockVariantsBOPIntegration.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        var mineableWithAxe = tag(BlockTags.MINEABLE_WITH_AXE)
                .add(BBBlocks.FLESH_STAIRS.key())
                .add(BBBlocks.FLESH_SLAB.key())
                .add(BBBlocks.FLESH_WALL.key())
                .add(BBBlocks.POROUS_FLESH_STAIRS.key())
                .add(BBBlocks.POROUS_FLESH_SLAB.key())
                .add(BBBlocks.POROUS_FLESH_WALL.key());

        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(BBBlocks.ROSE_QUARTZ_BLOCK_STAIRS.key())
                .add(BBBlocks.ROSE_QUARTZ_BLOCK_SLAB.key())
                .add(BBBlocks.ROSE_QUARTZ_BLOCK_WALL.key())
        ;

        tag(BlockTags.MINEABLE_WITH_HOE)
                .addAll(BBBlockItemIds.FLOWER_PETAL_STAIRS.asList().stream().map(BlockItemId::block))
                .addAll(BBBlockItemIds.FLOWER_PETAL_SLAB.asList().stream().map(BlockItemId::block))
                .addAll(BBBlockItemIds.FLOWER_PETAL_WALL.asList().stream().map(BlockItemId::block))
        ;

        for (var block : BBWoodBlocks.REGISTER.getEntries()) {
            mineableWithAxe.add(block.key());
        }

        tag(BlockTags.CRYSTAL_SOUND_BLOCKS)
                .add(BBBlocks.ROSE_QUARTZ_BLOCK_STAIRS.key())
                .add(BBBlocks.ROSE_QUARTZ_BLOCK_SLAB.key())
                .add(BBBlocks.ROSE_QUARTZ_BLOCK_WALL.key())
        ;

        new BBBlockItemTagsProvider(tags -> BlockItemTagsProvider.wrapForBlocks(tag(tags.block()))).run();
    }
}
