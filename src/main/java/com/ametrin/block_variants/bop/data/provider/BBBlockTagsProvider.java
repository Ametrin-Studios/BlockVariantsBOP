package com.ametrin.block_variants.bop.data.provider;

import com.ametrin.block_variants.bop.BlockVariantsBOPIntegration;
import com.ametrin.block_variants.bop.registry.BBBlocks;
import com.ametrinstudios.ametrin.data.provider.ExtendedBlockTagsProvider;
import com.barion.block_variants.registry.BVTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.Tags;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public final class BBBlockTagsProvider extends ExtendedBlockTagsProvider {
    public BBBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BlockVariantsBOPIntegration.MOD_ID);
    }

    @Override
    protected void addTags(@NotNull HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_AXE)
                .add(BBBlocks.FIR_LOG_STAIRS.get())
                .add(BBBlocks.FIR_LOG_SLAB.get())
                .add(BBBlocks.STRIPPED_FIR_LOG_STAIRS.get())
                .add(BBBlocks.STRIPPED_FIR_LOG_SLAB.get())
                .add(BBBlocks.FIR_WOOD_STAIRS.get())
                .add(BBBlocks.FIR_WOOD_SLAB.get())
                .add(BBBlocks.FIR_WOOD_WALL.get())
                .add(BBBlocks.FIR_WOOD_FENCE.get())
                .add(BBBlocks.FIR_WOOD_FENCE_GATE.get())
                .add(BBBlocks.STRIPPED_FIR_WOOD_STAIRS.get())
                .add(BBBlocks.STRIPPED_FIR_WOOD_SLAB.get())
                .add(BBBlocks.STRIPPED_FIR_WOOD_WALL.get())
                .add(BBBlocks.STRIPPED_FIR_WOOD_FENCE.get())
                .add(BBBlocks.STRIPPED_FIR_WOOD_FENCE_GATE.get())
        ;

        tag(BlockTags.WOODEN_STAIRS)
                .add(BBBlocks.FIR_LOG_STAIRS.get())
                .add(BBBlocks.STRIPPED_FIR_LOG_STAIRS.get())
                .add(BBBlocks.FIR_WOOD_STAIRS.get())
                .add(BBBlocks.STRIPPED_FIR_WOOD_STAIRS.get())
        ;

        tag(BlockTags.WOODEN_SLABS)
                .add(BBBlocks.FIR_LOG_SLAB.get())
                .add(BBBlocks.STRIPPED_FIR_LOG_SLAB.get())
                .add(BBBlocks.FIR_WOOD_SLAB.get())
                .add(BBBlocks.STRIPPED_FIR_WOOD_SLAB.get())
        ;

        tag(BVTags.Blocks.WOODEN_WALLS)
                .add(BBBlocks.FIR_WOOD_WALL.get())
                .add(BBBlocks.STRIPPED_FIR_WOOD_WALL.get())
        ;

        tag(BlockTags.WOODEN_FENCES)
                .add(BBBlocks.FIR_WOOD_FENCE.get())
                .add(BBBlocks.STRIPPED_FIR_WOOD_FENCE.get())
        ;

        tag(Tags.Blocks.FENCE_GATES_WOODEN)
                .add(BBBlocks.FIR_WOOD_FENCE_GATE.get())
                .add(BBBlocks.STRIPPED_FIR_WOOD_FENCE_GATE.get())
        ;

        tag(BlockTags.WALLS).addTag(BVTags.Blocks.WOODEN_WALLS);
    }
}
