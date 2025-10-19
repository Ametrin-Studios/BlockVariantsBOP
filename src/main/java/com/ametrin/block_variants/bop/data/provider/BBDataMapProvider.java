package com.ametrin.block_variants.bop.data.provider;

import com.ametrin.block_variants.bop.registry.BBWoodBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DataMapProvider;
import net.neoforged.neoforge.registries.datamaps.builtin.NeoForgeDataMaps;
import net.neoforged.neoforge.registries.datamaps.builtin.Strippable;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public final class BBDataMapProvider extends DataMapProvider {

    public BBDataMapProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, lookupProvider);
    }

    @Override
    protected void gather(@NotNull HolderLookup.Provider provider) {
        builder(NeoForgeDataMaps.STRIPPABLES)
                .add(BBWoodBlocks.ORIGIN_OAK_LOG_STAIRS, new Strippable(BBWoodBlocks.STRIPPED_ORIGIN_OAK_LOG_STAIRS.get()), false)
                .add(BBWoodBlocks.ORIGIN_OAK_LOG_SLAB, new Strippable(BBWoodBlocks.STRIPPED_ORIGIN_OAK_LOG_SLAB.get()), false)
                .add(BBWoodBlocks.ORIGIN_OAK_WOOD_STAIRS, new Strippable(BBWoodBlocks.STRIPPED_ORIGIN_OAK_WOOD_STAIRS.get()), false)
                .add(BBWoodBlocks.ORIGIN_OAK_WOOD_SLAB, new Strippable(BBWoodBlocks.STRIPPED_ORIGIN_OAK_WOOD_SLAB.get()), false)
                .add(BBWoodBlocks.ORIGIN_OAK_WOOD_WALL, new Strippable(BBWoodBlocks.STRIPPED_ORIGIN_OAK_WOOD_WALL.get()), false)
                .add(BBWoodBlocks.ORIGIN_OAK_WOOD_FENCE, new Strippable(BBWoodBlocks.STRIPPED_ORIGIN_OAK_WOOD_FENCE.get()), false)
                .add(BBWoodBlocks.ORIGIN_OAK_WOOD_FENCE_GATE, new Strippable(BBWoodBlocks.STRIPPED_ORIGIN_OAK_WOOD_FENCE_GATE.get()), false)

                .add(BBWoodBlocks.FIR_LOG_STAIRS, new Strippable(BBWoodBlocks.STRIPPED_FIR_LOG_STAIRS.get()), false)
                .add(BBWoodBlocks.FIR_LOG_SLAB, new Strippable(BBWoodBlocks.STRIPPED_FIR_LOG_SLAB.get()), false)
                .add(BBWoodBlocks.FIR_WOOD_STAIRS, new Strippable(BBWoodBlocks.STRIPPED_FIR_WOOD_STAIRS.get()), false)
                .add(BBWoodBlocks.FIR_WOOD_SLAB, new Strippable(BBWoodBlocks.STRIPPED_FIR_WOOD_SLAB.get()), false)
                .add(BBWoodBlocks.FIR_WOOD_WALL, new Strippable(BBWoodBlocks.STRIPPED_FIR_WOOD_WALL.get()), false)
                .add(BBWoodBlocks.FIR_WOOD_FENCE, new Strippable(BBWoodBlocks.STRIPPED_FIR_WOOD_FENCE.get()), false)
                .add(BBWoodBlocks.FIR_WOOD_FENCE_GATE, new Strippable(BBWoodBlocks.STRIPPED_FIR_WOOD_FENCE_GATE.get()), false)

                .add(BBWoodBlocks.PINE_LOG_STAIRS, new Strippable(BBWoodBlocks.STRIPPED_PINE_LOG_STAIRS.get()), false)
                .add(BBWoodBlocks.PINE_LOG_SLAB, new Strippable(BBWoodBlocks.STRIPPED_PINE_LOG_SLAB.get()), false)
                .add(BBWoodBlocks.PINE_WOOD_STAIRS, new Strippable(BBWoodBlocks.STRIPPED_PINE_WOOD_STAIRS.get()), false)
                .add(BBWoodBlocks.PINE_WOOD_SLAB, new Strippable(BBWoodBlocks.STRIPPED_PINE_WOOD_SLAB.get()), false)
                .add(BBWoodBlocks.PINE_WOOD_WALL, new Strippable(BBWoodBlocks.STRIPPED_PINE_WOOD_WALL.get()), false)
                .add(BBWoodBlocks.PINE_WOOD_FENCE, new Strippable(BBWoodBlocks.STRIPPED_PINE_WOOD_FENCE.get()), false)
                .add(BBWoodBlocks.PINE_WOOD_FENCE_GATE, new Strippable(BBWoodBlocks.STRIPPED_PINE_WOOD_FENCE_GATE.get()), false)

                .add(BBWoodBlocks.MAPLE_LOG_STAIRS, new Strippable(BBWoodBlocks.STRIPPED_MAPLE_LOG_STAIRS.get()), false)
                .add(BBWoodBlocks.MAPLE_LOG_SLAB, new Strippable(BBWoodBlocks.STRIPPED_MAPLE_LOG_SLAB.get()), false)
                .add(BBWoodBlocks.MAPLE_WOOD_STAIRS, new Strippable(BBWoodBlocks.STRIPPED_MAPLE_WOOD_STAIRS.get()), false)
                .add(BBWoodBlocks.MAPLE_WOOD_SLAB, new Strippable(BBWoodBlocks.STRIPPED_MAPLE_WOOD_SLAB.get()), false)
                .add(BBWoodBlocks.MAPLE_WOOD_WALL, new Strippable(BBWoodBlocks.STRIPPED_MAPLE_WOOD_WALL.get()), false)
                .add(BBWoodBlocks.MAPLE_WOOD_FENCE, new Strippable(BBWoodBlocks.STRIPPED_MAPLE_WOOD_FENCE.get()), false)
                .add(BBWoodBlocks.MAPLE_WOOD_FENCE_GATE, new Strippable(BBWoodBlocks.STRIPPED_MAPLE_WOOD_FENCE_GATE.get()), false)

                .add(BBWoodBlocks.REDWOOD_LOG_STAIRS, new Strippable(BBWoodBlocks.STRIPPED_REDWOOD_LOG_STAIRS.get()), false)
                .add(BBWoodBlocks.REDWOOD_LOG_SLAB, new Strippable(BBWoodBlocks.STRIPPED_REDWOOD_LOG_SLAB.get()), false)
                .add(BBWoodBlocks.REDWOOD_WOOD_STAIRS, new Strippable(BBWoodBlocks.STRIPPED_REDWOOD_WOOD_STAIRS.get()), false)
                .add(BBWoodBlocks.REDWOOD_WOOD_SLAB, new Strippable(BBWoodBlocks.STRIPPED_REDWOOD_WOOD_SLAB.get()), false)
                .add(BBWoodBlocks.REDWOOD_WOOD_WALL, new Strippable(BBWoodBlocks.STRIPPED_REDWOOD_WOOD_WALL.get()), false)
                .add(BBWoodBlocks.REDWOOD_WOOD_FENCE, new Strippable(BBWoodBlocks.STRIPPED_REDWOOD_WOOD_FENCE.get()), false)
                .add(BBWoodBlocks.REDWOOD_WOOD_FENCE_GATE, new Strippable(BBWoodBlocks.STRIPPED_REDWOOD_WOOD_FENCE_GATE.get()), false)

                .add(BBWoodBlocks.MAHOGANY_LOG_STAIRS, new Strippable(BBWoodBlocks.STRIPPED_MAHOGANY_LOG_STAIRS.get()), false)
                .add(BBWoodBlocks.MAHOGANY_LOG_SLAB, new Strippable(BBWoodBlocks.STRIPPED_MAHOGANY_LOG_SLAB.get()), false)
                .add(BBWoodBlocks.MAHOGANY_WOOD_STAIRS, new Strippable(BBWoodBlocks.STRIPPED_MAHOGANY_WOOD_STAIRS.get()), false)
                .add(BBWoodBlocks.MAHOGANY_WOOD_SLAB, new Strippable(BBWoodBlocks.STRIPPED_MAHOGANY_WOOD_SLAB.get()), false)
                .add(BBWoodBlocks.MAHOGANY_WOOD_WALL, new Strippable(BBWoodBlocks.STRIPPED_MAHOGANY_WOOD_WALL.get()), false)
                .add(BBWoodBlocks.MAHOGANY_WOOD_FENCE, new Strippable(BBWoodBlocks.STRIPPED_MAHOGANY_WOOD_FENCE.get()), false)
                .add(BBWoodBlocks.MAHOGANY_WOOD_FENCE_GATE, new Strippable(BBWoodBlocks.STRIPPED_MAHOGANY_WOOD_FENCE_GATE.get()), false)

                .add(BBWoodBlocks.JACARANDA_LOG_STAIRS, new Strippable(BBWoodBlocks.STRIPPED_JACARANDA_LOG_STAIRS.get()), false)
                .add(BBWoodBlocks.JACARANDA_LOG_SLAB, new Strippable(BBWoodBlocks.STRIPPED_JACARANDA_LOG_SLAB.get()), false)
                .add(BBWoodBlocks.JACARANDA_WOOD_STAIRS, new Strippable(BBWoodBlocks.STRIPPED_JACARANDA_WOOD_STAIRS.get()), false)
                .add(BBWoodBlocks.JACARANDA_WOOD_SLAB, new Strippable(BBWoodBlocks.STRIPPED_JACARANDA_WOOD_SLAB.get()), false)
                .add(BBWoodBlocks.JACARANDA_WOOD_WALL, new Strippable(BBWoodBlocks.STRIPPED_JACARANDA_WOOD_WALL.get()), false)
                .add(BBWoodBlocks.JACARANDA_WOOD_FENCE, new Strippable(BBWoodBlocks.STRIPPED_JACARANDA_WOOD_FENCE.get()), false)
                .add(BBWoodBlocks.JACARANDA_WOOD_FENCE_GATE, new Strippable(BBWoodBlocks.STRIPPED_JACARANDA_WOOD_FENCE_GATE.get()), false)

                .add(BBWoodBlocks.PALM_LOG_STAIRS, new Strippable(BBWoodBlocks.STRIPPED_PALM_LOG_STAIRS.get()), false)
                .add(BBWoodBlocks.PALM_LOG_SLAB, new Strippable(BBWoodBlocks.STRIPPED_PALM_LOG_SLAB.get()), false)
                .add(BBWoodBlocks.PALM_WOOD_STAIRS, new Strippable(BBWoodBlocks.STRIPPED_PALM_WOOD_STAIRS.get()), false)
                .add(BBWoodBlocks.PALM_WOOD_SLAB, new Strippable(BBWoodBlocks.STRIPPED_PALM_WOOD_SLAB.get()), false)
                .add(BBWoodBlocks.PALM_WOOD_WALL, new Strippable(BBWoodBlocks.STRIPPED_PALM_WOOD_WALL.get()), false)
                .add(BBWoodBlocks.PALM_WOOD_FENCE, new Strippable(BBWoodBlocks.STRIPPED_PALM_WOOD_FENCE.get()), false)
                .add(BBWoodBlocks.PALM_WOOD_FENCE_GATE, new Strippable(BBWoodBlocks.STRIPPED_PALM_WOOD_FENCE_GATE.get()), false)

                .add(BBWoodBlocks.WILLOW_LOG_STAIRS, new Strippable(BBWoodBlocks.STRIPPED_WILLOW_LOG_STAIRS.get()), false)
                .add(BBWoodBlocks.WILLOW_LOG_SLAB, new Strippable(BBWoodBlocks.STRIPPED_WILLOW_LOG_SLAB.get()), false)
                .add(BBWoodBlocks.WILLOW_WOOD_STAIRS, new Strippable(BBWoodBlocks.STRIPPED_WILLOW_WOOD_STAIRS.get()), false)
                .add(BBWoodBlocks.WILLOW_WOOD_SLAB, new Strippable(BBWoodBlocks.STRIPPED_WILLOW_WOOD_SLAB.get()), false)
                .add(BBWoodBlocks.WILLOW_WOOD_WALL, new Strippable(BBWoodBlocks.STRIPPED_WILLOW_WOOD_WALL.get()), false)
                .add(BBWoodBlocks.WILLOW_WOOD_FENCE, new Strippable(BBWoodBlocks.STRIPPED_WILLOW_WOOD_FENCE.get()), false)
                .add(BBWoodBlocks.WILLOW_WOOD_FENCE_GATE, new Strippable(BBWoodBlocks.STRIPPED_WILLOW_WOOD_FENCE_GATE.get()), false)

                .add(BBWoodBlocks.DEAD_LOG_STAIRS, new Strippable(BBWoodBlocks.STRIPPED_DEAD_LOG_STAIRS.get()), false)
                .add(BBWoodBlocks.DEAD_LOG_SLAB, new Strippable(BBWoodBlocks.STRIPPED_DEAD_LOG_SLAB.get()), false)
                .add(BBWoodBlocks.DEAD_WOOD_STAIRS, new Strippable(BBWoodBlocks.STRIPPED_DEAD_WOOD_STAIRS.get()), false)
                .add(BBWoodBlocks.DEAD_WOOD_SLAB, new Strippable(BBWoodBlocks.STRIPPED_DEAD_WOOD_SLAB.get()), false)
                .add(BBWoodBlocks.DEAD_WOOD_WALL, new Strippable(BBWoodBlocks.STRIPPED_DEAD_WOOD_WALL.get()), false)
                .add(BBWoodBlocks.DEAD_WOOD_FENCE, new Strippable(BBWoodBlocks.STRIPPED_DEAD_WOOD_FENCE.get()), false)
                .add(BBWoodBlocks.DEAD_WOOD_FENCE_GATE, new Strippable(BBWoodBlocks.STRIPPED_DEAD_WOOD_FENCE_GATE.get()), false)

                .add(BBWoodBlocks.MAGIC_LOG_STAIRS, new Strippable(BBWoodBlocks.STRIPPED_MAGIC_LOG_STAIRS.get()), false)
                .add(BBWoodBlocks.MAGIC_LOG_SLAB, new Strippable(BBWoodBlocks.STRIPPED_MAGIC_LOG_SLAB.get()), false)
                .add(BBWoodBlocks.MAGIC_WOOD_STAIRS, new Strippable(BBWoodBlocks.STRIPPED_MAGIC_WOOD_STAIRS.get()), false)
                .add(BBWoodBlocks.MAGIC_WOOD_SLAB, new Strippable(BBWoodBlocks.STRIPPED_MAGIC_WOOD_SLAB.get()), false)
                .add(BBWoodBlocks.MAGIC_WOOD_WALL, new Strippable(BBWoodBlocks.STRIPPED_MAGIC_WOOD_WALL.get()), false)
                .add(BBWoodBlocks.MAGIC_WOOD_FENCE, new Strippable(BBWoodBlocks.STRIPPED_MAGIC_WOOD_FENCE.get()), false)
                .add(BBWoodBlocks.MAGIC_WOOD_FENCE_GATE, new Strippable(BBWoodBlocks.STRIPPED_MAGIC_WOOD_FENCE_GATE.get()), false)

                .add(BBWoodBlocks.UMBRAN_LOG_STAIRS, new Strippable(BBWoodBlocks.STRIPPED_UMBRAN_LOG_STAIRS.get()), false)
                .add(BBWoodBlocks.UMBRAN_LOG_SLAB, new Strippable(BBWoodBlocks.STRIPPED_UMBRAN_LOG_SLAB.get()), false)
                .add(BBWoodBlocks.UMBRAN_WOOD_STAIRS, new Strippable(BBWoodBlocks.STRIPPED_UMBRAN_WOOD_STAIRS.get()), false)
                .add(BBWoodBlocks.UMBRAN_WOOD_SLAB, new Strippable(BBWoodBlocks.STRIPPED_UMBRAN_WOOD_SLAB.get()), false)
                .add(BBWoodBlocks.UMBRAN_WOOD_WALL, new Strippable(BBWoodBlocks.STRIPPED_UMBRAN_WOOD_WALL.get()), false)
                .add(BBWoodBlocks.UMBRAN_WOOD_FENCE, new Strippable(BBWoodBlocks.STRIPPED_UMBRAN_WOOD_FENCE.get()), false)
                .add(BBWoodBlocks.UMBRAN_WOOD_FENCE_GATE, new Strippable(BBWoodBlocks.STRIPPED_UMBRAN_WOOD_FENCE_GATE.get()), false)

                .add(BBWoodBlocks.HELLBARK_LOG_STAIRS, new Strippable(BBWoodBlocks.STRIPPED_HELLBARK_LOG_STAIRS.get()), false)
                .add(BBWoodBlocks.HELLBARK_LOG_SLAB, new Strippable(BBWoodBlocks.STRIPPED_HELLBARK_LOG_SLAB.get()), false)
                .add(BBWoodBlocks.HELLBARK_WOOD_STAIRS, new Strippable(BBWoodBlocks.STRIPPED_HELLBARK_WOOD_STAIRS.get()), false)
                .add(BBWoodBlocks.HELLBARK_WOOD_SLAB, new Strippable(BBWoodBlocks.STRIPPED_HELLBARK_WOOD_SLAB.get()), false)
                .add(BBWoodBlocks.HELLBARK_WOOD_WALL, new Strippable(BBWoodBlocks.STRIPPED_HELLBARK_WOOD_WALL.get()), false)
                .add(BBWoodBlocks.HELLBARK_WOOD_FENCE, new Strippable(BBWoodBlocks.STRIPPED_HELLBARK_WOOD_FENCE.get()), false)
                .add(BBWoodBlocks.HELLBARK_WOOD_FENCE_GATE, new Strippable(BBWoodBlocks.STRIPPED_HELLBARK_WOOD_FENCE_GATE.get()), false)

                .add(BBWoodBlocks.EMPYREAL_LOG_STAIRS, new Strippable(BBWoodBlocks.STRIPPED_EMPYREAL_LOG_STAIRS.get()), false)
                .add(BBWoodBlocks.EMPYREAL_LOG_SLAB, new Strippable(BBWoodBlocks.STRIPPED_EMPYREAL_LOG_SLAB.get()), false)
                .add(BBWoodBlocks.EMPYREAL_WOOD_STAIRS, new Strippable(BBWoodBlocks.STRIPPED_EMPYREAL_WOOD_STAIRS.get()), false)
                .add(BBWoodBlocks.EMPYREAL_WOOD_SLAB, new Strippable(BBWoodBlocks.STRIPPED_EMPYREAL_WOOD_SLAB.get()), false)
                .add(BBWoodBlocks.EMPYREAL_WOOD_WALL, new Strippable(BBWoodBlocks.STRIPPED_EMPYREAL_WOOD_WALL.get()), false)
                .add(BBWoodBlocks.EMPYREAL_WOOD_FENCE, new Strippable(BBWoodBlocks.STRIPPED_EMPYREAL_WOOD_FENCE.get()), false)
                .add(BBWoodBlocks.EMPYREAL_WOOD_FENCE_GATE, new Strippable(BBWoodBlocks.STRIPPED_EMPYREAL_WOOD_FENCE_GATE.get()), false)
        ;
    }
}
