package com.ametrin.block_variants.bop.data.provider;

import biomesoplenty.api.block.BOPWoodTypes;
import com.ametrin.block_variants.bop.registry.BBWoodBlocks;
import com.ametrin.block_variants.data.provider.BVDataMapProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.component.BlockTransformer;
import net.minecraft.data.PackOutput;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.component.BlockTransformers;
import net.minecraft.world.level.block.FireBlock;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.levelgen.feature.stateproviders.RuleBasedStateProvider;
import net.neoforged.neoforge.common.data.DataMapProvider;
import net.neoforged.neoforge.registries.datamaps.builtin.BlockTransformAppender;
import net.neoforged.neoforge.registries.datamaps.builtin.Flammable;
import net.neoforged.neoforge.registries.datamaps.builtin.NeoForgeDataMaps;

import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public final class BBDataMapProvider extends DataMapProvider {

    public BBDataMapProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, lookupProvider);
    }

    @Override
    protected void gather(HolderLookup.Provider provider) {
        var strippables = RuleBasedStateProvider.builder();
        BVDataMapProvider.add(strippables, BBWoodBlocks.LOG_STAIRS, BBWoodBlocks.STRIPPED_LOG_STAIRS);
        BVDataMapProvider.add(strippables, BBWoodBlocks.LOG_SLAB, BBWoodBlocks.STRIPPED_LOG_SLAB);
        BVDataMapProvider.add(strippables, BBWoodBlocks.WOOD_STAIRS, BBWoodBlocks.STRIPPED_WOOD_STAIRS);
        BVDataMapProvider.add(strippables, BBWoodBlocks.WOOD_SLAB, BBWoodBlocks.STRIPPED_WOOD_SLAB);
        BVDataMapProvider.add(strippables, BBWoodBlocks.WOOD_WALL, BBWoodBlocks.STRIPPED_WOOD_WALL);
        BVDataMapProvider.add(strippables, BBWoodBlocks.WOOD_FENCE, BBWoodBlocks.STRIPPED_WOOD_FENCE);
        BVDataMapProvider.add(strippables, BBWoodBlocks.WOOD_FENCE_GATE, BBWoodBlocks.STRIPPED_WOOD_FENCE_GATE);

        builder(NeoForgeDataMaps.BLOCK_TRANSFORM_APPENDERS)
                .add(BlockTransformers.AXE, new BlockTransformAppender(List.of(BlockTransformer.BlockTransformData.builder(strippables.build()).sound(SoundEvents.AXE_STRIP).build())), false);

        var flammableTypes = HashSet.<WoodType>newHashSet(BBWoodBlocks.TYPES.size());
        flammableTypes.addAll(BBWoodBlocks.TYPES);
        flammableTypes.remove(BOPWoodTypes.HELLBARK);
        var flammables = builder(NeoForgeDataMaps.FLAMMABLE);
        BBWoodBlocks.queryWooden(flammableTypes).forEach(b -> flammables.add(b, new Flammable(FireBlock.IGNITE_HARD, FireBlock.BURN_HARD), false));
    }
}
