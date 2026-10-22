package com.ametrin.block_variants.bop.data.provider;

import com.ametrin.block_variants.bop.BlockVariantsBOPIntegration;
import com.ametrin.block_variants.bop.registry.BBBlocks;
import com.ametrin.block_variants.bop.registry.BBWoodBlocks;
import com.ametrinstudios.ametrin.data.provider.ExtendedBlockTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.BlockItemTagsProvider;
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

        tag(BlockTags.MINEABLE_WITH_HOE).add(
                BBBlocks.WHITE_FLOWER_PETAL_STAIRS.key(),
                BBBlocks.WHITE_FLOWER_PETAL_SLAB.key(),
                BBBlocks.WHITE_FLOWER_PETAL_WALL.key(),
                BBBlocks.LIGHT_GRAY_FLOWER_PETAL_STAIRS.key(),
                BBBlocks.LIGHT_GRAY_FLOWER_PETAL_SLAB.key(),
                BBBlocks.LIGHT_GRAY_FLOWER_PETAL_WALL.key(),
                BBBlocks.GRAY_FLOWER_PETAL_STAIRS.key(),
                BBBlocks.GRAY_FLOWER_PETAL_SLAB.key(),
                BBBlocks.GRAY_FLOWER_PETAL_WALL.key(),
                BBBlocks.BLACK_FLOWER_PETAL_STAIRS.key(),
                BBBlocks.BLACK_FLOWER_PETAL_SLAB.key(),
                BBBlocks.BLACK_FLOWER_PETAL_WALL.key(),
                BBBlocks.BROWN_FLOWER_PETAL_STAIRS.key(),
                BBBlocks.BROWN_FLOWER_PETAL_SLAB.key(),
                BBBlocks.BROWN_FLOWER_PETAL_WALL.key(),
                BBBlocks.RED_FLOWER_PETAL_STAIRS.key(),
                BBBlocks.RED_FLOWER_PETAL_SLAB.key(),
                BBBlocks.RED_FLOWER_PETAL_WALL.key(),
                BBBlocks.ORANGE_FLOWER_PETAL_STAIRS.key(),
                BBBlocks.ORANGE_FLOWER_PETAL_SLAB.key(),
                BBBlocks.ORANGE_FLOWER_PETAL_WALL.key(),
                BBBlocks.YELLOW_FLOWER_PETAL_STAIRS.key(),
                BBBlocks.YELLOW_FLOWER_PETAL_SLAB.key(),
                BBBlocks.YELLOW_FLOWER_PETAL_WALL.key(),
                BBBlocks.LIME_FLOWER_PETAL_STAIRS.key(),
                BBBlocks.LIME_FLOWER_PETAL_SLAB.key(),
                BBBlocks.LIME_FLOWER_PETAL_WALL.key(),
                BBBlocks.GREEN_FLOWER_PETAL_STAIRS.key(),
                BBBlocks.GREEN_FLOWER_PETAL_SLAB.key(),
                BBBlocks.GREEN_FLOWER_PETAL_WALL.key(),
                BBBlocks.CYAN_FLOWER_PETAL_STAIRS.key(),
                BBBlocks.CYAN_FLOWER_PETAL_SLAB.key(),
                BBBlocks.CYAN_FLOWER_PETAL_WALL.key(),
                BBBlocks.LIGHT_BLUE_FLOWER_PETAL_STAIRS.key(),
                BBBlocks.LIGHT_BLUE_FLOWER_PETAL_SLAB.key(),
                BBBlocks.LIGHT_BLUE_FLOWER_PETAL_WALL.key(),
                BBBlocks.BLUE_FLOWER_PETAL_STAIRS.key(),
                BBBlocks.BLUE_FLOWER_PETAL_SLAB.key(),
                BBBlocks.BLUE_FLOWER_PETAL_WALL.key(),
                BBBlocks.PURPLE_FLOWER_PETAL_STAIRS.key(),
                BBBlocks.PURPLE_FLOWER_PETAL_SLAB.key(),
                BBBlocks.PURPLE_FLOWER_PETAL_WALL.key(),
                BBBlocks.MAGENTA_FLOWER_PETAL_STAIRS.key(),
                BBBlocks.MAGENTA_FLOWER_PETAL_SLAB.key(),
                BBBlocks.MAGENTA_FLOWER_PETAL_WALL.key(),
                BBBlocks.PINK_FLOWER_PETAL_STAIRS.key(),
                BBBlocks.PINK_FLOWER_PETAL_SLAB.key(),
                BBBlocks.PINK_FLOWER_PETAL_WALL.key()
        );

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
