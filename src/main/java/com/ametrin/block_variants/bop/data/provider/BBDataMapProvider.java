package com.ametrin.block_variants.bop.data.provider;

import com.ametrin.block_variants.bop.registry.BBBlocks;
import com.barion.block_variants.registry.BVTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.neoforged.neoforge.common.data.DataMapProvider;
import net.neoforged.neoforge.registries.datamaps.builtin.FurnaceFuel;
import net.neoforged.neoforge.registries.datamaps.builtin.NeoForgeDataMaps;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public final class BBDataMapProvider extends DataMapProvider {

    public BBDataMapProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, lookupProvider);
    }

    @Override
    protected void gather(@NotNull HolderLookup.Provider provider) {
        builder(NeoForgeDataMaps.FURNACE_FUELS)
                .add(BVTags.Items.WOODEN_WALLS, new FurnaceFuel(AbstractFurnaceBlockEntity.BURN_TIME_STANDARD * 3 / 2), false)
                .add(BBBlocks.FIR_WOOD_FENCE_GATE.getId(), new FurnaceFuel(AbstractFurnaceBlockEntity.BURN_TIME_STANDARD * 3 / 2), false)
                .add(BBBlocks.STRIPPED_FIR_WOOD_FENCE_GATE.getId(), new FurnaceFuel(AbstractFurnaceBlockEntity.BURN_TIME_STANDARD * 3 / 2), false)
        ;
    }
}
