package com.ametrin.block_variants.bop.data.provider;

import com.ametrin.block_variants.bop.BlockVariantsBOPIntegration;
import com.ametrin.block_variants.bop.registry.BBBlocks;
import com.ametrin.block_variants.bop.registry.BBWoodBlocks;
import com.ametrinstudios.ametrin.data.provider.ExtendedBlockTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.TagAppender;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.concurrent.CompletableFuture;

public final class BBBlockTagsProvider extends ExtendedBlockTagsProvider {
    public BBBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BlockVariantsBOPIntegration.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        var mineableWithAxe = tag(BlockTags.MINEABLE_WITH_AXE)
                .add(BBBlocks.FLESH_STAIRS.get())
                .add(BBBlocks.FLESH_SLAB.get())
                .add(BBBlocks.FLESH_WALL.get())
                .add(BBBlocks.POROUS_FLESH_STAIRS.get())
                .add(BBBlocks.POROUS_FLESH_SLAB.get())
                .add(BBBlocks.POROUS_FLESH_WALL.get());

        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(BBBlocks.BRIMSTONE_STAIRS.get())
                .add(BBBlocks.BRIMSTONE_SLAB.get())
                .add(BBBlocks.BRIMSTONE_WALL.get())

                .add(BBBlocks.ROSE_QUARTZ_BLOCK_STAIRS.get())
                .add(BBBlocks.ROSE_QUARTZ_BLOCK_SLAB.get())
                .add(BBBlocks.ROSE_QUARTZ_BLOCK_WALL.get())
        ;

        tag(BlockTags.MINEABLE_WITH_HOE).add(
                BBBlocks.WHITE_FLOWER_PETAL_STAIRS.get(),
                BBBlocks.WHITE_FLOWER_PETAL_SLAB.get(),
                BBBlocks.WHITE_FLOWER_PETAL_WALL.get(),
                BBBlocks.LIGHT_GRAY_FLOWER_PETAL_STAIRS.get(),
                BBBlocks.LIGHT_GRAY_FLOWER_PETAL_SLAB.get(),
                BBBlocks.LIGHT_GRAY_FLOWER_PETAL_WALL.get(),
                BBBlocks.GRAY_FLOWER_PETAL_STAIRS.get(),
                BBBlocks.GRAY_FLOWER_PETAL_SLAB.get(),
                BBBlocks.GRAY_FLOWER_PETAL_WALL.get(),
                BBBlocks.BLACK_FLOWER_PETAL_STAIRS.get(),
                BBBlocks.BLACK_FLOWER_PETAL_SLAB.get(),
                BBBlocks.BLACK_FLOWER_PETAL_WALL.get(),
                BBBlocks.BROWN_FLOWER_PETAL_STAIRS.get(),
                BBBlocks.BROWN_FLOWER_PETAL_SLAB.get(),
                BBBlocks.BROWN_FLOWER_PETAL_WALL.get(),
                BBBlocks.RED_FLOWER_PETAL_STAIRS.get(),
                BBBlocks.RED_FLOWER_PETAL_SLAB.get(),
                BBBlocks.RED_FLOWER_PETAL_WALL.get(),
                BBBlocks.ORANGE_FLOWER_PETAL_STAIRS.get(),
                BBBlocks.ORANGE_FLOWER_PETAL_SLAB.get(),
                BBBlocks.ORANGE_FLOWER_PETAL_WALL.get(),
                BBBlocks.YELLOW_FLOWER_PETAL_STAIRS.get(),
                BBBlocks.YELLOW_FLOWER_PETAL_SLAB.get(),
                BBBlocks.YELLOW_FLOWER_PETAL_WALL.get(),
                BBBlocks.LIME_FLOWER_PETAL_STAIRS.get(),
                BBBlocks.LIME_FLOWER_PETAL_SLAB.get(),
                BBBlocks.LIME_FLOWER_PETAL_WALL.get(),
                BBBlocks.GREEN_FLOWER_PETAL_STAIRS.get(),
                BBBlocks.GREEN_FLOWER_PETAL_SLAB.get(),
                BBBlocks.GREEN_FLOWER_PETAL_WALL.get(),
                BBBlocks.CYAN_FLOWER_PETAL_STAIRS.get(),
                BBBlocks.CYAN_FLOWER_PETAL_SLAB.get(),
                BBBlocks.CYAN_FLOWER_PETAL_WALL.get(),
                BBBlocks.LIGHT_BLUE_FLOWER_PETAL_STAIRS.get(),
                BBBlocks.LIGHT_BLUE_FLOWER_PETAL_SLAB.get(),
                BBBlocks.LIGHT_BLUE_FLOWER_PETAL_WALL.get(),
                BBBlocks.BLUE_FLOWER_PETAL_STAIRS.get(),
                BBBlocks.BLUE_FLOWER_PETAL_SLAB.get(),
                BBBlocks.BLUE_FLOWER_PETAL_WALL.get(),
                BBBlocks.PURPLE_FLOWER_PETAL_STAIRS.get(),
                BBBlocks.PURPLE_FLOWER_PETAL_SLAB.get(),
                BBBlocks.PURPLE_FLOWER_PETAL_WALL.get(),
                BBBlocks.MAGENTA_FLOWER_PETAL_STAIRS.get(),
                BBBlocks.MAGENTA_FLOWER_PETAL_SLAB.get(),
                BBBlocks.MAGENTA_FLOWER_PETAL_WALL.get(),
                BBBlocks.PINK_FLOWER_PETAL_STAIRS.get(),
                BBBlocks.PINK_FLOWER_PETAL_SLAB.get(),
                BBBlocks.PINK_FLOWER_PETAL_WALL.get()
        );

        for (var block : BBWoodBlocks.REGISTER.getEntries()) {
            mineableWithAxe.add(block.get());
        }

        tag(BlockTags.CRYSTAL_SOUND_BLOCKS)
                .add(BBBlocks.ROSE_QUARTZ_BLOCK_STAIRS.get())
                .add(BBBlocks.ROSE_QUARTZ_BLOCK_SLAB.get())
                .add(BBBlocks.ROSE_QUARTZ_BLOCK_WALL.get())
        ;

        new BBBlockItemTagsProvider() {
            @Override
            protected TagAppender<Block, Block> tag(TagKey<Block> blockTag, TagKey<Item> itemTag) {
                return BBBlockTagsProvider.this.tag(blockTag);
            }
        }.run();
    }
}
