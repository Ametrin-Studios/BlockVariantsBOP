package com.ametrin.block_variants.bop.data.provider.loot;

import com.ametrin.block_variants.bop.registry.BBBlocks;
import com.ametrinstudios.ametrin.data.provider.loot_table.ExtendedBlockLootSubProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;


public final class BBBlockLootProvider extends ExtendedBlockLootSubProvider {
    public BBBlockLootProvider(HolderLookup.Provider registries) {
        super(registries);
    }

    @Override
    protected void generate() {
        dropSelf(BBBlocks.getAllBlocks().iterator());
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return BBBlocks.REGISTER.getEntries().stream().map(holder -> (Block)holder.get()).toList();
    }
}
