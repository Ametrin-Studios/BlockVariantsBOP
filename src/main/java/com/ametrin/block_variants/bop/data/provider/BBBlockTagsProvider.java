package com.ametrin.block_variants.bop.data.provider;

import com.ametrin.block_variants.bop.BlockVariantsBOPIntegration;
import com.ametrin.block_variants.bop.registry.BBWoodBlocks;
import com.ametrinstudios.ametrin.data.provider.ExtendedBlockTagsProvider;
import com.barion.block_variants.registry.BVTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.*;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public final class BBBlockTagsProvider extends ExtendedBlockTagsProvider {
    public BBBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BlockVariantsBOPIntegration.MOD_ID);
    }

    @Override
    protected void addTags(@NotNull HolderLookup.Provider provider) {
        var mineableWithAxe = tag(BlockTags.MINEABLE_WITH_AXE);
        var woodenStairs = tag(BlockTags.WOODEN_STAIRS);
        var woodenSlabs = tag(BlockTags.WOODEN_SLABS);
        var woodenWalls = tag(BVTags.Blocks.WOODEN_WALLS);
        var woodenFences = tag(BlockTags.WOODEN_FENCES);
        var woodenFenceGates = tag(BlockTags.FENCE_GATES);

        for (var block : BBWoodBlocks.REGISTER.getEntries()) {
            mineableWithAxe.add(block.getKey());

            if (block.value() instanceof StairBlock) {
                woodenStairs.add(block.getKey());
            } else if (block.value() instanceof SlabBlock) {
                woodenSlabs.add(block.getKey());
            } else if (block.value() instanceof WallBlock) {
                woodenWalls.add(block.getKey());
            } else if (block.value() instanceof FenceBlock) {
                woodenFences.add(block.getKey());
            } else if (block.value() instanceof FenceGateBlock) {
                woodenFenceGates.add(block.getKey());
            }
        }


        tag(BlockTags.WALLS).addTag(BVTags.Blocks.WOODEN_WALLS);
    }

    private void addAll(TagKey<Block> tag, DeferredRegister<Block> register) {
        var appender = tag(tag);
        for (var block : register.getEntries()) {
            appender.add(block.getKey());
        }
    }
}
