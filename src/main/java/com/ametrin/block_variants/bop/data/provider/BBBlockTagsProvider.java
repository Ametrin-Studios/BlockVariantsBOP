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
                .add(BBBlocks.FLESH_STAIRS.getKey())
                .add(BBBlocks.FLESH_SLAB.getKey())
                .add(BBBlocks.FLESH_WALL.getKey())
                .add(BBBlocks.POROUS_FLESH_STAIRS.getKey())
                .add(BBBlocks.POROUS_FLESH_SLAB.getKey())
                .add(BBBlocks.POROUS_FLESH_WALL.getKey());

        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(BBBlocks.BRIMSTONE_STAIRS.getKey())
                .add(BBBlocks.BRIMSTONE_SLAB.getKey())
                .add(BBBlocks.BRIMSTONE_WALL.getKey())

                .add(BBBlocks.ROSE_QUARTZ_BLOCK_STAIRS.getKey())
                .add(BBBlocks.ROSE_QUARTZ_BLOCK_SLAB.getKey())
                .add(BBBlocks.ROSE_QUARTZ_BLOCK_WALL.getKey())
        ;

        tag(BlockTags.MINEABLE_WITH_HOE).add(
                BBBlocks.WHITE_FLOWER_PETAL_STAIRS.getKey(),
                BBBlocks.WHITE_FLOWER_PETAL_SLAB.getKey(),
                BBBlocks.WHITE_FLOWER_PETAL_WALL.getKey(),
                BBBlocks.LIGHT_GRAY_FLOWER_PETAL_STAIRS.getKey(),
                BBBlocks.LIGHT_GRAY_FLOWER_PETAL_SLAB.getKey(),
                BBBlocks.LIGHT_GRAY_FLOWER_PETAL_WALL.getKey(),
                BBBlocks.GRAY_FLOWER_PETAL_STAIRS.getKey(),
                BBBlocks.GRAY_FLOWER_PETAL_SLAB.getKey(),
                BBBlocks.GRAY_FLOWER_PETAL_WALL.getKey(),
                BBBlocks.BLACK_FLOWER_PETAL_STAIRS.getKey(),
                BBBlocks.BLACK_FLOWER_PETAL_SLAB.getKey(),
                BBBlocks.BLACK_FLOWER_PETAL_WALL.getKey(),
                BBBlocks.BROWN_FLOWER_PETAL_STAIRS.getKey(),
                BBBlocks.BROWN_FLOWER_PETAL_SLAB.getKey(),
                BBBlocks.BROWN_FLOWER_PETAL_WALL.getKey(),
                BBBlocks.RED_FLOWER_PETAL_STAIRS.getKey(),
                BBBlocks.RED_FLOWER_PETAL_SLAB.getKey(),
                BBBlocks.RED_FLOWER_PETAL_WALL.getKey(),
                BBBlocks.ORANGE_FLOWER_PETAL_STAIRS.getKey(),
                BBBlocks.ORANGE_FLOWER_PETAL_SLAB.getKey(),
                BBBlocks.ORANGE_FLOWER_PETAL_WALL.getKey(),
                BBBlocks.YELLOW_FLOWER_PETAL_STAIRS.getKey(),
                BBBlocks.YELLOW_FLOWER_PETAL_SLAB.getKey(),
                BBBlocks.YELLOW_FLOWER_PETAL_WALL.getKey(),
                BBBlocks.LIME_FLOWER_PETAL_STAIRS.getKey(),
                BBBlocks.LIME_FLOWER_PETAL_SLAB.getKey(),
                BBBlocks.LIME_FLOWER_PETAL_WALL.getKey(),
                BBBlocks.GREEN_FLOWER_PETAL_STAIRS.getKey(),
                BBBlocks.GREEN_FLOWER_PETAL_SLAB.getKey(),
                BBBlocks.GREEN_FLOWER_PETAL_WALL.getKey(),
                BBBlocks.CYAN_FLOWER_PETAL_STAIRS.getKey(),
                BBBlocks.CYAN_FLOWER_PETAL_SLAB.getKey(),
                BBBlocks.CYAN_FLOWER_PETAL_WALL.getKey(),
                BBBlocks.LIGHT_BLUE_FLOWER_PETAL_STAIRS.getKey(),
                BBBlocks.LIGHT_BLUE_FLOWER_PETAL_SLAB.getKey(),
                BBBlocks.LIGHT_BLUE_FLOWER_PETAL_WALL.getKey(),
                BBBlocks.BLUE_FLOWER_PETAL_STAIRS.getKey(),
                BBBlocks.BLUE_FLOWER_PETAL_SLAB.getKey(),
                BBBlocks.BLUE_FLOWER_PETAL_WALL.getKey(),
                BBBlocks.PURPLE_FLOWER_PETAL_STAIRS.getKey(),
                BBBlocks.PURPLE_FLOWER_PETAL_SLAB.getKey(),
                BBBlocks.PURPLE_FLOWER_PETAL_WALL.getKey(),
                BBBlocks.MAGENTA_FLOWER_PETAL_STAIRS.getKey(),
                BBBlocks.MAGENTA_FLOWER_PETAL_SLAB.getKey(),
                BBBlocks.MAGENTA_FLOWER_PETAL_WALL.getKey(),
                BBBlocks.PINK_FLOWER_PETAL_STAIRS.getKey(),
                BBBlocks.PINK_FLOWER_PETAL_SLAB.getKey(),
                BBBlocks.PINK_FLOWER_PETAL_WALL.getKey()
        );

        for (var block : BBWoodBlocks.REGISTER.getEntries()) {
            mineableWithAxe.add(block.getKey());
        }

        tag(BlockTags.CRYSTAL_SOUND_BLOCKS)
                .add(BBBlocks.ROSE_QUARTZ_BLOCK_STAIRS.getKey())
                .add(BBBlocks.ROSE_QUARTZ_BLOCK_SLAB.getKey())
                .add(BBBlocks.ROSE_QUARTZ_BLOCK_WALL.getKey())
        ;

        new BBBlockItemTagsProvider(tags -> BlockItemTagsProvider.wrapForBlocks(tag(tags.block()))).run();
    }
}
