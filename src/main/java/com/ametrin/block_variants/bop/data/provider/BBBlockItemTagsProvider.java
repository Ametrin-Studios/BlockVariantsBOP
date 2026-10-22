package com.ametrin.block_variants.bop.data.provider;

import com.ametrin.block_variants.bop.registry.BBBlocks;
import com.ametrin.block_variants.bop.registry.BBWoodBlocks;
import com.ametrin.block_variants.registry.BVTags;
import com.ametrinstudios.ametrin.data.provider.ExtendedBlockItemTagsProvider;
import net.minecraft.references.BlockItemId;
import net.minecraft.tags.BlockItemTagId;
import net.minecraft.tags.BlockItemTags;
import net.minecraft.world.level.block.*;
import net.neoforged.neoforge.common.Tags;

import java.util.function.Function;

public final class BBBlockItemTagsProvider extends ExtendedBlockItemTagsProvider {

    public BBBlockItemTagsProvider(Function<BlockItemTagId, CombinedAppender> tagSupplier) {
        super(tagSupplier);
    }

    @Override
    protected void run() {
        var stairs = tag(BlockItemTags.STAIRS);
        var slabs = tag(BlockItemTags.SLABS);
        var walls = tag(BlockItemTags.WALLS);

        for (var block : BBBlocks.REGISTER.getEntries()) {
            var blockItemId = BlockItemId.create(block.getId(), block.getId());
            if (block.value() instanceof StairBlock) {
                stairs.add(blockItemId);
            } else if (block.value() instanceof SlabBlock) {
                slabs.add(blockItemId);
            } else if (block.value() instanceof WallBlock) {
                walls.add(blockItemId);
            }

            var name = block.getId().getPath();
            if (name.contains("white")) {
                tag(new BlockItemTagId(Tags.Blocks.DYED_WHITE, Tags.Items.DYED_WHITE)).add(blockItemId);
            } else if (name.contains("light_gray")) {
                tag(new BlockItemTagId(Tags.Blocks.DYED_LIGHT_GRAY, Tags.Items.DYED_LIGHT_GRAY)).add(blockItemId);
            } else if (name.contains("gray")) {
                tag(new BlockItemTagId(Tags.Blocks.DYED_GRAY, Tags.Items.DYED_GRAY)).add(blockItemId);
            } else if (name.contains("black_")) {
                tag(new BlockItemTagId(Tags.Blocks.DYED_BLACK, Tags.Items.DYED_BLACK)).add(blockItemId);
            } else if (name.contains("brown")) {
                tag(new BlockItemTagId(Tags.Blocks.DYED_BROWN, Tags.Items.DYED_BROWN)).add(blockItemId);
            } else if (name.contains("red") && !name.contains("sandstone") && !name.contains("nether")) {
                tag(new BlockItemTagId(Tags.Blocks.DYED_RED, Tags.Items.DYED_RED)).add(blockItemId);
            } else if (name.contains("orange")) {
                tag(new BlockItemTagId(Tags.Blocks.DYED_ORANGE, Tags.Items.DYED_ORANGE)).add(blockItemId);
            } else if (name.contains("yellow")) {
                tag(new BlockItemTagId(Tags.Blocks.DYED_YELLOW, Tags.Items.DYED_YELLOW)).add(blockItemId);
            } else if (name.contains("lime")) {
                tag(new BlockItemTagId(Tags.Blocks.DYED_LIME, Tags.Items.DYED_LIME)).add(blockItemId);
            } else if (name.contains("green")) {
                tag(new BlockItemTagId(Tags.Blocks.DYED_GREEN, Tags.Items.DYED_GREEN)).add(blockItemId);
            } else if (name.contains("cyan")) {
                tag(new BlockItemTagId(Tags.Blocks.DYED_CYAN, Tags.Items.DYED_CYAN)).add(blockItemId);
            } else if (name.contains("light_blue")) {
                tag(new BlockItemTagId(Tags.Blocks.DYED_LIGHT_BLUE, Tags.Items.DYED_LIGHT_BLUE)).add(blockItemId);
            } else if (name.contains("blue")) {
                tag(new BlockItemTagId(Tags.Blocks.DYED_BLUE, Tags.Items.DYED_BLUE)).add(blockItemId);
            } else if (name.contains("purple")) {
                tag(new BlockItemTagId(Tags.Blocks.DYED_PURPLE, Tags.Items.DYED_PURPLE)).add(blockItemId);
            } else if (name.contains("magenta")) {
                tag(new BlockItemTagId(Tags.Blocks.DYED_MAGENTA, Tags.Items.DYED_MAGENTA)).add(blockItemId);
            } else if (name.contains("pink")) {
                tag(new BlockItemTagId(Tags.Blocks.DYED_PINK, Tags.Items.DYED_PINK)).add(blockItemId);
            }
        }

        var woodenStairs = tag(BlockItemTags.WOODEN_STAIRS);
        var woodenSlabs = tag(BlockItemTags.WOODEN_SLABS);
        var woodenWalls = tag(BVTags.BlockItems.WOODEN_WALLS);
        var woodenFences = tag(BlockItemTags.WOODEN_FENCES);
        var woodenFenceGates = tag(BlockItemTags.FENCE_GATES);

        for (var block : BBWoodBlocks.REGISTER.getEntries()) {
            var blockItemId = BlockItemId.create(block.getId(), block.getId());
            if (block.value() instanceof StairBlock) {
                woodenStairs.add(blockItemId);
            } else if (block.value() instanceof SlabBlock) {
                woodenSlabs.add(blockItemId);
            } else if (block.value() instanceof WallBlock) {
                woodenWalls.add(blockItemId);
            } else if (block.value() instanceof FenceBlock) {
                woodenFences.add(blockItemId);
            } else if (block.value() instanceof FenceGateBlock) {
                woodenFenceGates.add(blockItemId);
            }
        }
    }
}
