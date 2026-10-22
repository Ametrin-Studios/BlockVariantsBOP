package com.ametrin.block_variants.bop.data.provider.loot;

import com.ametrin.block_variants.bop.registry.BBBlocks;
import com.ametrinstudios.ametrin.data.provider.loot_table.ExtendedBlockLootSubProvider;
import net.minecraft.world.level.block.Block;


public final class BBBlockLootProvider extends ExtendedBlockLootSubProvider {

    public BBBlockLootProvider(Context output) {
        super(output);
    }

    @Override
    protected void generate() {
        dropSelf(BBBlocks.getAllBlocks());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return BBBlocks.getAllBlocks().toList();
    }
}
