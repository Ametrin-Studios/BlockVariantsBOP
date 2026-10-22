package com.ametrin.block_variants.bop.data.provider;

import com.ametrin.block_variants.bop.registry.BBBlockFamilies;
import com.ametrin.block_variants.bop.registry.BBBlockItemIds;
import com.ametrin.block_variants.registry.BVTags;
import com.ametrinstudios.ametrin.data.provider.ExtendedBlockItemTagsProvider;
import net.minecraft.tags.BlockItemTagId;

import java.util.function.Function;

public final class BBBlockItemTagsProvider extends ExtendedBlockItemTagsProvider {

    public BBBlockItemTagsProvider(Function<BlockItemTagId, CombinedAppender> tagSupplier) {
        super(tagSupplier);
    }

    @Override
    protected void run() {
        BBBlockFamilies.MAP.values().forEach(this::tagBlockFamily);

        tagColorCollection(BBBlockItemIds.FLOWER_PETAL_STAIRS);
        tagColorCollection(BBBlockItemIds.FLOWER_PETAL_SLAB);
        tagColorCollection(BBBlockItemIds.FLOWER_PETAL_WALL);

        tag(BVTags.BlockItems.WOODEN_WALLS)
                .addAll(BBBlockItemIds.WOOD_WALL.stream())
                .addAll(BBBlockItemIds.STRIPPED_WOOD_WALL.stream())
        ;
    }
}
