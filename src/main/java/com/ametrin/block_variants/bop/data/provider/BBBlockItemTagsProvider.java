package com.ametrin.block_variants.bop.data.provider;

import com.ametrin.block_variants.bop.registry.BBBlocks;
import com.ametrin.block_variants.bop.registry.BBWoodBlocks;
import com.ametrinstudios.ametrin.data.provider.ExtendedBlockItemTagsProvider;
import com.barion.block_variants.registry.BVTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.*;
import net.neoforged.neoforge.common.Tags;

public abstract class BBBlockItemTagsProvider extends ExtendedBlockItemTagsProvider {
    @Override
    protected void run() {
        var stairs = tag(BlockTags.STAIRS, ItemTags.STAIRS);
        var slabs = tag(BlockTags.SLABS, ItemTags.SLABS);
        var walls = tag(BlockTags.WALLS, ItemTags.WALLS);

        for (var block : BBBlocks.REGISTER.getEntries()) {
            if (block.value() instanceof StairBlock) {
                stairs.add(block.get());
            } else if (block.value() instanceof SlabBlock) {
                slabs.add(block.get());
            } else if (block.value() instanceof WallBlock) {
                walls.add(block.get());
            }

            var name = block.getKey().identifier().getPath();
            if (name.contains("white")) {
                tag(Tags.Blocks.DYED_WHITE, Tags.Items.DYED_WHITE).add(block.value());
            } else if (name.contains("light_gray")) {
                tag(Tags.Blocks.DYED_LIGHT_GRAY, Tags.Items.DYED_LIGHT_GRAY).add(block.value());
            } else if (name.contains("gray")) {
                tag(Tags.Blocks.DYED_GRAY, Tags.Items.DYED_GRAY).add(block.value());
            } else if (name.contains("black_")) {
                tag(Tags.Blocks.DYED_BLACK, Tags.Items.DYED_BLACK).add(block.value());
            } else if (name.contains("brown")) {
                tag(Tags.Blocks.DYED_BROWN, Tags.Items.DYED_BROWN).add(block.value());
            } else if (name.contains("red") && !name.contains("sandstone") && !name.contains("nether")) {
                tag(Tags.Blocks.DYED_RED, Tags.Items.DYED_RED).add(block.value());
            } else if (name.contains("orange")) {
                tag(Tags.Blocks.DYED_ORANGE, Tags.Items.DYED_ORANGE).add(block.value());
            } else if (name.contains("yellow")) {
                tag(Tags.Blocks.DYED_YELLOW, Tags.Items.DYED_YELLOW).add(block.value());
            } else if (name.contains("lime")) {
                tag(Tags.Blocks.DYED_LIME, Tags.Items.DYED_LIME).add(block.value());
            } else if (name.contains("green")) {
                tag(Tags.Blocks.DYED_GREEN, Tags.Items.DYED_GREEN).add(block.value());
            } else if (name.contains("cyan")) {
                tag(Tags.Blocks.DYED_CYAN, Tags.Items.DYED_CYAN).add(block.value());
            } else if (name.contains("light_blue")) {
                tag(Tags.Blocks.DYED_LIGHT_BLUE, Tags.Items.DYED_LIGHT_BLUE).add(block.value());
            } else if (name.contains("blue")) {
                tag(Tags.Blocks.DYED_BLUE, Tags.Items.DYED_BLUE).add(block.value());
            } else if (name.contains("purple")) {
                tag(Tags.Blocks.DYED_PURPLE, Tags.Items.DYED_PURPLE).add(block.value());
            } else if (name.contains("magenta")) {
                tag(Tags.Blocks.DYED_MAGENTA, Tags.Items.DYED_MAGENTA).add(block.value());
            } else if (name.contains("pink")) {
                tag(Tags.Blocks.DYED_PINK, Tags.Items.DYED_PINK).add(block.value());
            }
        }

        var woodenStairs = tag(BlockTags.WOODEN_STAIRS, ItemTags.WOODEN_STAIRS);
        var woodenSlabs = tag(BlockTags.WOODEN_SLABS, ItemTags.WOODEN_SLABS);
        var woodenWalls = tag(BVTags.Blocks.WOODEN_WALLS, BVTags.Items.WOODEN_WALLS);
        var woodenFences = tag(BlockTags.WOODEN_FENCES, ItemTags.WOODEN_FENCES);
        var woodenFenceGates = tag(BlockTags.FENCE_GATES, ItemTags.FENCE_GATES);

        for (var block : BBWoodBlocks.REGISTER.getEntries()) {
            if (block.value() instanceof StairBlock) {
                woodenStairs.add(block.get());
            } else if (block.value() instanceof SlabBlock) {
                woodenSlabs.add(block.get());
            } else if (block.value() instanceof WallBlock) {
                woodenWalls.add(block.get());
            } else if (block.value() instanceof FenceBlock) {
                woodenFences.add(block.get());
            } else if (block.value() instanceof FenceGateBlock) {
                woodenFenceGates.add(block.get());
            }
        }
    }
}
