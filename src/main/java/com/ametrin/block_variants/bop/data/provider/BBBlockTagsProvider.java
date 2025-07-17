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
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public final class BBBlockTagsProvider extends ExtendedBlockTagsProvider {
    public BBBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BlockVariantsBOPIntegration.MOD_ID);
    }

    @Override
    protected void addTags(@NotNull HolderLookup.Provider provider) {
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

        for (var block : BBWoodBlocks.REGISTER.getEntries()) {
            mineableWithAxe.add(block.get());
        }

        new BBBlockItemTagsProvider() {
            @Override
            protected @NotNull TagAppender<Block, Block> tag(@NotNull TagKey<Block> blockTag, @NotNull TagKey<Item> itemTag) {
                return BBBlockTagsProvider.this.tag(blockTag);
            }
        }.run();
    }
}
