package com.ametrin.block_variants.bop.registry;

import com.ametrin.block_variants.registry.BVBlockFamilies;
import com.ametrinstudios.ametrin.data.DataProviderExtensions;
import com.ametrinstudios.ametrin.util.WoodTypeCollection;
import com.google.common.collect.Maps;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.BlockFamily;
import net.minecraft.world.level.block.Block;

import java.util.Comparator;
import java.util.Map;

public final class BBBlockFamilies {
    public static final Map<Block, BlockFamily> MAP = Maps.newTreeMap(Comparator.comparing(DataProviderExtensions::getBlockKey));

    public static final WoodTypeCollection<BlockFamily> LOG = BBWoodBlocks.LOGS.map((type, base) ->
            logFamily(familyBuilder(base.get())
                    .stairs(BBWoodBlocks.LOG_STAIRS.pick(type).orElseThrow().get())
                    .slab(BBWoodBlocks.LOG_SLAB.pick(type).orElseThrow().get())
            )
    );

    public static final WoodTypeCollection<BlockFamily> STRIPPED_LOG = BBWoodBlocks.STRIPPED_LOGS.map((type, base) ->
            logFamily(familyBuilder(base.get())
                    .stairs(BBWoodBlocks.STRIPPED_LOG_STAIRS.pick(type).orElseThrow().get())
                    .slab(BBWoodBlocks.STRIPPED_LOG_SLAB.pick(type).orElseThrow().get())
            )
    );

    public static final WoodTypeCollection<BlockFamily> WOOD = BBWoodBlocks.WOODS.map((type, base) ->
            woodFamily(familyBuilder(base.get())
                    .stairs(BBWoodBlocks.WOOD_STAIRS.pick(type).orElseThrow().get())
                    .slab(BBWoodBlocks.WOOD_SLAB.pick(type).orElseThrow().get())
                    .wall(BBWoodBlocks.WOOD_WALL.pick(type).orElseThrow().get())
                    .fence(BBWoodBlocks.WOOD_FENCE.pick(type).orElseThrow().get())
                    .fenceGate(BBWoodBlocks.WOOD_FENCE_GATE.pick(type).orElseThrow().get())
            )
    );

    public static final WoodTypeCollection<BlockFamily> STRIPPED_WOOD = BBWoodBlocks.STRIPPED_WOODS.map((type, base) ->
            woodFamily(familyBuilder(base.get())
                    .stairs(BBWoodBlocks.STRIPPED_WOOD_STAIRS.pick(type).orElseThrow().get())
                    .slab(BBWoodBlocks.STRIPPED_WOOD_SLAB.pick(type).orElseThrow().get())
                    .wall(BBWoodBlocks.STRIPPED_WOOD_WALL.pick(type).orElseThrow().get())
                    .fence(BBWoodBlocks.STRIPPED_WOOD_FENCE.pick(type).orElseThrow().get())
                    .fenceGate(BBWoodBlocks.STRIPPED_WOOD_FENCE_GATE.pick(type).orElseThrow().get())
            )
    );

    private static BlockFamily logFamily(BlockFamily.Builder builder) {
        var family = builder.getFamily();
        BVBlockFamilies.validateLogFamily(family);
        return family;
    }

    private static BlockFamily woodFamily(BlockFamily.Builder builder) {
        var family = builder.getFamily();
        BVBlockFamilies.validateWoodFamily(family);
        return family;
    }

    private static BlockFamily.Builder familyBuilder(Block base) {
        var builder = new BlockFamily.Builder(base);
        var blockFamily = MAP.put(base, builder.getFamily());
        if (blockFamily != null) {
            throw new IllegalStateException("Duplicate family definition for " + BuiltInRegistries.BLOCK.getKey(base));
        } else {
            return builder;
        }
    }
}
