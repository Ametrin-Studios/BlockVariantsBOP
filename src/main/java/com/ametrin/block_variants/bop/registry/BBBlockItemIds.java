package com.ametrin.block_variants.bop.registry;

import com.ametrin.block_variants.bop.BlockVariantsBOPIntegration;
import com.ametrin.block_variants.registry.BVBlockItemIds;
import com.ametrinstudios.ametrin.util.WoodTypeCollection;
import net.minecraft.references.BlockItemId;
import net.minecraft.world.level.block.ColorCollection;

public final class BBBlockItemIds {
    public static final ColorCollection<BlockItemId> FLOWER_PETAL_STAIRS = ColorCollection.prefixWithColor(ColorCollection.create("flower_petal_stairs")).map(BBBlockItemIds::create);
    public static final ColorCollection<BlockItemId> FLOWER_PETAL_SLAB = ColorCollection.prefixWithColor(ColorCollection.create("flower_petal_slab")).map(BBBlockItemIds::create);
    public static final ColorCollection<BlockItemId> FLOWER_PETAL_WALL = ColorCollection.prefixWithColor(ColorCollection.create("flower_petal_wall")).map(BBBlockItemIds::create);

    public static final WoodTypeCollection<BlockItemId> LOG_STAIRS = BBWoodBlocks.LOG_STAIRS.map(BVBlockItemIds::create);
    public static final WoodTypeCollection<BlockItemId> LOG_SLAB = BBWoodBlocks.LOG_SLAB.map(BVBlockItemIds::create);
    public static final WoodTypeCollection<BlockItemId> STRIPPED_LOG_STAIRS = BBWoodBlocks.STRIPPED_LOG_STAIRS.map(BVBlockItemIds::create);
    public static final WoodTypeCollection<BlockItemId> STRIPPED_LOG_SLAB = BBWoodBlocks.STRIPPED_LOG_SLAB.map(BVBlockItemIds::create);

    public static final WoodTypeCollection<BlockItemId> WOOD_STAIRS = BBWoodBlocks.WOOD_STAIRS.map(BVBlockItemIds::create);
    public static final WoodTypeCollection<BlockItemId> WOOD_SLAB = BBWoodBlocks.WOOD_SLAB.map(BVBlockItemIds::create);
    public static final WoodTypeCollection<BlockItemId> WOOD_WALL = BBWoodBlocks.WOOD_WALL.map(BVBlockItemIds::create);
    public static final WoodTypeCollection<BlockItemId> WOOD_FENCE = BBWoodBlocks.WOOD_FENCE.map(BVBlockItemIds::create);
    public static final WoodTypeCollection<BlockItemId> WOOD_FENCE_GATE = BBWoodBlocks.WOOD_FENCE_GATE.map(BVBlockItemIds::create);
    public static final WoodTypeCollection<BlockItemId> STRIPPED_WOOD_STAIRS = BBWoodBlocks.STRIPPED_WOOD_STAIRS.map(BVBlockItemIds::create);
    public static final WoodTypeCollection<BlockItemId> STRIPPED_WOOD_SLAB = BBWoodBlocks.STRIPPED_WOOD_SLAB.map(BVBlockItemIds::create);
    public static final WoodTypeCollection<BlockItemId> STRIPPED_WOOD_WALL = BBWoodBlocks.STRIPPED_WOOD_WALL.map(BVBlockItemIds::create);
    public static final WoodTypeCollection<BlockItemId> STRIPPED_WOOD_FENCE = BBWoodBlocks.STRIPPED_WOOD_FENCE.map(BVBlockItemIds::create);
    public static final WoodTypeCollection<BlockItemId> STRIPPED_WOOD_FENCE_GATE = BBWoodBlocks.STRIPPED_WOOD_FENCE_GATE.map(BVBlockItemIds::create);

    public static BlockItemId create(String name) {
        var id = BlockVariantsBOPIntegration.locate(name);
        return BlockItemId.create(id, id);
    }
}
