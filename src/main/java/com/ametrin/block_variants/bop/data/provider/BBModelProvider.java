package com.ametrin.block_variants.bop.data.provider;

import biomesoplenty.api.block.BOPBlocks;
import com.ametrin.block_variants.bop.BlockVariantsBOPIntegration;
import com.ametrin.block_variants.bop.registry.BBBlocks;
import com.ametrin.block_variants.bop.registry.BBWoodBlocks;
import com.ametrinstudios.ametrin.data.provider.ExtendedModelProvider;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;

import static com.barion.block_variants.data.provider.BVModelProvider.customSlab;
import static com.barion.block_variants.data.provider.BVModelProvider.customStairs;

public final class BBModelProvider extends ExtendedModelProvider {
    public BBModelProvider(PackOutput output) {
        super(output, BlockVariantsBOPIntegration.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        blockModels.familyWithExistingFullBlock(BOPBlocks.FLESH).stairs(BBBlocks.FLESH_STAIRS.get()).slab(BBBlocks.FLESH_SLAB.get()).wall(BBBlocks.FLESH_WALL.get());
        blockModels.familyWithExistingFullBlock(BOPBlocks.POROUS_FLESH).stairs(BBBlocks.POROUS_FLESH_STAIRS.get()).slab(BBBlocks.POROUS_FLESH_SLAB.get()).wall(BBBlocks.POROUS_FLESH_WALL.get());
        blockModels.familyWithExistingFullBlock(BOPBlocks.BRIMSTONE).stairs(BBBlocks.BRIMSTONE_STAIRS.get()).slab(BBBlocks.BRIMSTONE_SLAB.get()).wall(BBBlocks.BRIMSTONE_WALL.get());
        blockModels.familyWithExistingFullBlock(BOPBlocks.ROSE_QUARTZ_BLOCK).stairs(BBBlocks.ROSE_QUARTZ_BLOCK_STAIRS.get()).slab(BBBlocks.ROSE_QUARTZ_BLOCK_SLAB.get()).wall(BBBlocks.ROSE_QUARTZ_BLOCK_WALL.get());

        // ORIGIN OAK
        logStairsSlab(blockModels, BOPBlocks.ORIGIN_OAK_LOG, BBWoodBlocks.ORIGIN_OAK_LOG_STAIRS.get(), BBWoodBlocks.ORIGIN_OAK_LOG_SLAB.get());
        logStairsSlab(blockModels, BOPBlocks.STRIPPED_ORIGIN_OAK_LOG, BBWoodBlocks.STRIPPED_ORIGIN_OAK_LOG_STAIRS.get(), BBWoodBlocks.STRIPPED_ORIGIN_OAK_LOG_SLAB.get());
        woodStairsSlabWallFenceGate(blockModels, BOPBlocks.ORIGIN_OAK_LOG, BBWoodBlocks.ORIGIN_OAK_WOOD_STAIRS.get(), BBWoodBlocks.ORIGIN_OAK_WOOD_SLAB.get(), BOPBlocks.ORIGIN_OAK_WOOD, BBWoodBlocks.ORIGIN_OAK_WOOD_WALL.get(), BBWoodBlocks.ORIGIN_OAK_WOOD_FENCE.get(), BBWoodBlocks.ORIGIN_OAK_WOOD_FENCE_GATE.get());
        woodStairsSlabWallFenceGate(blockModels, BOPBlocks.STRIPPED_ORIGIN_OAK_LOG, BBWoodBlocks.STRIPPED_ORIGIN_OAK_WOOD_STAIRS.get(), BBWoodBlocks.STRIPPED_ORIGIN_OAK_WOOD_SLAB.get(), BOPBlocks.STRIPPED_ORIGIN_OAK_WOOD, BBWoodBlocks.STRIPPED_ORIGIN_OAK_WOOD_WALL.get(), BBWoodBlocks.STRIPPED_ORIGIN_OAK_WOOD_FENCE.get(), BBWoodBlocks.STRIPPED_ORIGIN_OAK_WOOD_FENCE_GATE.get());

        // FIR
        logStairsSlab(blockModels, BOPBlocks.FIR_LOG, BBWoodBlocks.FIR_LOG_STAIRS.get(), BBWoodBlocks.FIR_LOG_SLAB.get());
        logStairsSlab(blockModels, BOPBlocks.STRIPPED_FIR_LOG, BBWoodBlocks.STRIPPED_FIR_LOG_STAIRS.get(), BBWoodBlocks.STRIPPED_FIR_LOG_SLAB.get());
        woodStairsSlabWallFenceGate(blockModels, BOPBlocks.FIR_LOG, BBWoodBlocks.FIR_WOOD_STAIRS.get(), BBWoodBlocks.FIR_WOOD_SLAB.get(), BOPBlocks.FIR_WOOD, BBWoodBlocks.FIR_WOOD_WALL.get(), BBWoodBlocks.FIR_WOOD_FENCE.get(), BBWoodBlocks.FIR_WOOD_FENCE_GATE.get());
        woodStairsSlabWallFenceGate(blockModels, BOPBlocks.STRIPPED_FIR_LOG, BBWoodBlocks.STRIPPED_FIR_WOOD_STAIRS.get(), BBWoodBlocks.STRIPPED_FIR_WOOD_SLAB.get(), BOPBlocks.STRIPPED_FIR_WOOD, BBWoodBlocks.STRIPPED_FIR_WOOD_WALL.get(), BBWoodBlocks.STRIPPED_FIR_WOOD_FENCE.get(), BBWoodBlocks.STRIPPED_FIR_WOOD_FENCE_GATE.get());

        // PINE
        logStairsSlab(blockModels, BOPBlocks.PINE_LOG, BBWoodBlocks.PINE_LOG_STAIRS.get(), BBWoodBlocks.PINE_LOG_SLAB.get());
        logStairsSlab(blockModels, BOPBlocks.STRIPPED_PINE_LOG, BBWoodBlocks.STRIPPED_PINE_LOG_STAIRS.get(), BBWoodBlocks.STRIPPED_PINE_LOG_SLAB.get());
        woodStairsSlabWallFenceGate(blockModels, BOPBlocks.PINE_LOG, BBWoodBlocks.PINE_WOOD_STAIRS.get(), BBWoodBlocks.PINE_WOOD_SLAB.get(), BOPBlocks.PINE_WOOD, BBWoodBlocks.PINE_WOOD_WALL.get(), BBWoodBlocks.PINE_WOOD_FENCE.get(), BBWoodBlocks.PINE_WOOD_FENCE_GATE.get());
        woodStairsSlabWallFenceGate(blockModels, BOPBlocks.STRIPPED_PINE_LOG, BBWoodBlocks.STRIPPED_PINE_WOOD_STAIRS.get(), BBWoodBlocks.STRIPPED_PINE_WOOD_SLAB.get(), BOPBlocks.STRIPPED_PINE_WOOD, BBWoodBlocks.STRIPPED_PINE_WOOD_WALL.get(), BBWoodBlocks.STRIPPED_PINE_WOOD_FENCE.get(), BBWoodBlocks.STRIPPED_PINE_WOOD_FENCE_GATE.get());

        // MAPLE
        logStairsSlab(blockModels, BOPBlocks.MAPLE_LOG, BBWoodBlocks.MAPLE_LOG_STAIRS.get(), BBWoodBlocks.MAPLE_LOG_SLAB.get());
        logStairsSlab(blockModels, BOPBlocks.STRIPPED_MAPLE_LOG, BBWoodBlocks.STRIPPED_MAPLE_LOG_STAIRS.get(), BBWoodBlocks.STRIPPED_MAPLE_LOG_SLAB.get());
        woodStairsSlabWallFenceGate(blockModels, BOPBlocks.MAPLE_LOG, BBWoodBlocks.MAPLE_WOOD_STAIRS.get(), BBWoodBlocks.MAPLE_WOOD_SLAB.get(), BOPBlocks.MAPLE_WOOD, BBWoodBlocks.MAPLE_WOOD_WALL.get(), BBWoodBlocks.MAPLE_WOOD_FENCE.get(), BBWoodBlocks.MAPLE_WOOD_FENCE_GATE.get());
        woodStairsSlabWallFenceGate(blockModels, BOPBlocks.STRIPPED_MAPLE_LOG, BBWoodBlocks.STRIPPED_MAPLE_WOOD_STAIRS.get(), BBWoodBlocks.STRIPPED_MAPLE_WOOD_SLAB.get(), BOPBlocks.STRIPPED_MAPLE_WOOD, BBWoodBlocks.STRIPPED_MAPLE_WOOD_WALL.get(), BBWoodBlocks.STRIPPED_MAPLE_WOOD_FENCE.get(), BBWoodBlocks.STRIPPED_MAPLE_WOOD_FENCE_GATE.get());

        // REDWOOD
        logStairsSlab(blockModels, BOPBlocks.REDWOOD_LOG, BBWoodBlocks.REDWOOD_LOG_STAIRS.get(), BBWoodBlocks.REDWOOD_LOG_SLAB.get());
        logStairsSlab(blockModels, BOPBlocks.STRIPPED_REDWOOD_LOG, BBWoodBlocks.STRIPPED_REDWOOD_LOG_STAIRS.get(), BBWoodBlocks.STRIPPED_REDWOOD_LOG_SLAB.get());
        woodStairsSlabWallFenceGate(blockModels, BOPBlocks.REDWOOD_LOG, BBWoodBlocks.REDWOOD_WOOD_STAIRS.get(), BBWoodBlocks.REDWOOD_WOOD_SLAB.get(), BOPBlocks.REDWOOD_WOOD, BBWoodBlocks.REDWOOD_WOOD_WALL.get(), BBWoodBlocks.REDWOOD_WOOD_FENCE.get(), BBWoodBlocks.REDWOOD_WOOD_FENCE_GATE.get());
        woodStairsSlabWallFenceGate(blockModels, BOPBlocks.STRIPPED_REDWOOD_LOG, BBWoodBlocks.STRIPPED_REDWOOD_WOOD_STAIRS.get(), BBWoodBlocks.STRIPPED_REDWOOD_WOOD_SLAB.get(), BOPBlocks.STRIPPED_REDWOOD_WOOD, BBWoodBlocks.STRIPPED_REDWOOD_WOOD_WALL.get(), BBWoodBlocks.STRIPPED_REDWOOD_WOOD_FENCE.get(), BBWoodBlocks.STRIPPED_REDWOOD_WOOD_FENCE_GATE.get());

        // MAHOGANY
        logStairsSlab(blockModels, BOPBlocks.MAHOGANY_LOG, BBWoodBlocks.MAHOGANY_LOG_STAIRS.get(), BBWoodBlocks.MAHOGANY_LOG_SLAB.get());
        logStairsSlab(blockModels, BOPBlocks.STRIPPED_MAHOGANY_LOG, BBWoodBlocks.STRIPPED_MAHOGANY_LOG_STAIRS.get(), BBWoodBlocks.STRIPPED_MAHOGANY_LOG_SLAB.get());
        woodStairsSlabWallFenceGate(blockModels, BOPBlocks.MAHOGANY_LOG, BBWoodBlocks.MAHOGANY_WOOD_STAIRS.get(), BBWoodBlocks.MAHOGANY_WOOD_SLAB.get(), BOPBlocks.MAHOGANY_WOOD, BBWoodBlocks.MAHOGANY_WOOD_WALL.get(), BBWoodBlocks.MAHOGANY_WOOD_FENCE.get(), BBWoodBlocks.MAHOGANY_WOOD_FENCE_GATE.get());
        woodStairsSlabWallFenceGate(blockModels, BOPBlocks.STRIPPED_MAHOGANY_LOG, BBWoodBlocks.STRIPPED_MAHOGANY_WOOD_STAIRS.get(), BBWoodBlocks.STRIPPED_MAHOGANY_WOOD_SLAB.get(), BOPBlocks.STRIPPED_MAHOGANY_WOOD, BBWoodBlocks.STRIPPED_MAHOGANY_WOOD_WALL.get(), BBWoodBlocks.STRIPPED_MAHOGANY_WOOD_FENCE.get(), BBWoodBlocks.STRIPPED_MAHOGANY_WOOD_FENCE_GATE.get());

        // JACARANDA
        logStairsSlab(blockModels, BOPBlocks.JACARANDA_LOG, BBWoodBlocks.JACARANDA_LOG_STAIRS.get(), BBWoodBlocks.JACARANDA_LOG_SLAB.get());
        logStairsSlab(blockModels, BOPBlocks.STRIPPED_JACARANDA_LOG, BBWoodBlocks.STRIPPED_JACARANDA_LOG_STAIRS.get(), BBWoodBlocks.STRIPPED_JACARANDA_LOG_SLAB.get());
        woodStairsSlabWallFenceGate(blockModels, BOPBlocks.JACARANDA_LOG, BBWoodBlocks.JACARANDA_WOOD_STAIRS.get(), BBWoodBlocks.JACARANDA_WOOD_SLAB.get(), BOPBlocks.JACARANDA_WOOD, BBWoodBlocks.JACARANDA_WOOD_WALL.get(), BBWoodBlocks.JACARANDA_WOOD_FENCE.get(), BBWoodBlocks.JACARANDA_WOOD_FENCE_GATE.get());
        woodStairsSlabWallFenceGate(blockModels, BOPBlocks.STRIPPED_JACARANDA_LOG, BBWoodBlocks.STRIPPED_JACARANDA_WOOD_STAIRS.get(), BBWoodBlocks.STRIPPED_JACARANDA_WOOD_SLAB.get(), BOPBlocks.STRIPPED_JACARANDA_WOOD, BBWoodBlocks.STRIPPED_JACARANDA_WOOD_WALL.get(), BBWoodBlocks.STRIPPED_JACARANDA_WOOD_FENCE.get(), BBWoodBlocks.STRIPPED_JACARANDA_WOOD_FENCE_GATE.get());

        // PALM
        logStairsSlab(blockModels, BOPBlocks.PALM_LOG, BBWoodBlocks.PALM_LOG_STAIRS.get(), BBWoodBlocks.PALM_LOG_SLAB.get());
        logStairsSlab(blockModels, BOPBlocks.STRIPPED_PALM_LOG, BBWoodBlocks.STRIPPED_PALM_LOG_STAIRS.get(), BBWoodBlocks.STRIPPED_PALM_LOG_SLAB.get());
        woodStairsSlabWallFenceGate(blockModels, BOPBlocks.PALM_LOG, BBWoodBlocks.PALM_WOOD_STAIRS.get(), BBWoodBlocks.PALM_WOOD_SLAB.get(), BOPBlocks.PALM_WOOD, BBWoodBlocks.PALM_WOOD_WALL.get(), BBWoodBlocks.PALM_WOOD_FENCE.get(), BBWoodBlocks.PALM_WOOD_FENCE_GATE.get());
        woodStairsSlabWallFenceGate(blockModels, BOPBlocks.STRIPPED_PALM_LOG, BBWoodBlocks.STRIPPED_PALM_WOOD_STAIRS.get(), BBWoodBlocks.STRIPPED_PALM_WOOD_SLAB.get(), BOPBlocks.STRIPPED_PALM_WOOD, BBWoodBlocks.STRIPPED_PALM_WOOD_WALL.get(), BBWoodBlocks.STRIPPED_PALM_WOOD_FENCE.get(), BBWoodBlocks.STRIPPED_PALM_WOOD_FENCE_GATE.get());

        // WILLOW
        logStairsSlab(blockModels, BOPBlocks.WILLOW_LOG, BBWoodBlocks.WILLOW_LOG_STAIRS.get(), BBWoodBlocks.WILLOW_LOG_SLAB.get());
        logStairsSlab(blockModels, BOPBlocks.STRIPPED_WILLOW_LOG, BBWoodBlocks.STRIPPED_WILLOW_LOG_STAIRS.get(), BBWoodBlocks.STRIPPED_WILLOW_LOG_SLAB.get());
        woodStairsSlabWallFenceGate(blockModels, BOPBlocks.WILLOW_LOG, BBWoodBlocks.WILLOW_WOOD_STAIRS.get(), BBWoodBlocks.WILLOW_WOOD_SLAB.get(), BOPBlocks.WILLOW_WOOD, BBWoodBlocks.WILLOW_WOOD_WALL.get(), BBWoodBlocks.WILLOW_WOOD_FENCE.get(), BBWoodBlocks.WILLOW_WOOD_FENCE_GATE.get());
        woodStairsSlabWallFenceGate(blockModels, BOPBlocks.STRIPPED_WILLOW_LOG, BBWoodBlocks.STRIPPED_WILLOW_WOOD_STAIRS.get(), BBWoodBlocks.STRIPPED_WILLOW_WOOD_SLAB.get(), BOPBlocks.STRIPPED_WILLOW_WOOD, BBWoodBlocks.STRIPPED_WILLOW_WOOD_WALL.get(), BBWoodBlocks.STRIPPED_WILLOW_WOOD_FENCE.get(), BBWoodBlocks.STRIPPED_WILLOW_WOOD_FENCE_GATE.get());

        // DEAD
        logStairsSlab(blockModels, BOPBlocks.DEAD_LOG, BBWoodBlocks.DEAD_LOG_STAIRS.get(), BBWoodBlocks.DEAD_LOG_SLAB.get());
        logStairsSlab(blockModels, BOPBlocks.STRIPPED_DEAD_LOG, BBWoodBlocks.STRIPPED_DEAD_LOG_STAIRS.get(), BBWoodBlocks.STRIPPED_DEAD_LOG_SLAB.get());
        woodStairsSlabWallFenceGate(blockModels, BOPBlocks.DEAD_LOG, BBWoodBlocks.DEAD_WOOD_STAIRS.get(), BBWoodBlocks.DEAD_WOOD_SLAB.get(), BOPBlocks.DEAD_WOOD, BBWoodBlocks.DEAD_WOOD_WALL.get(), BBWoodBlocks.DEAD_WOOD_FENCE.get(), BBWoodBlocks.DEAD_WOOD_FENCE_GATE.get());
        woodStairsSlabWallFenceGate(blockModels, BOPBlocks.STRIPPED_DEAD_LOG, BBWoodBlocks.STRIPPED_DEAD_WOOD_STAIRS.get(), BBWoodBlocks.STRIPPED_DEAD_WOOD_SLAB.get(), BOPBlocks.STRIPPED_DEAD_WOOD, BBWoodBlocks.STRIPPED_DEAD_WOOD_WALL.get(), BBWoodBlocks.STRIPPED_DEAD_WOOD_FENCE.get(), BBWoodBlocks.STRIPPED_DEAD_WOOD_FENCE_GATE.get());

        // MAGIC
        logStairsSlab(blockModels, BOPBlocks.MAGIC_LOG, BBWoodBlocks.MAGIC_LOG_STAIRS.get(), BBWoodBlocks.MAGIC_LOG_SLAB.get());
        logStairsSlab(blockModels, BOPBlocks.STRIPPED_MAGIC_LOG, BBWoodBlocks.STRIPPED_MAGIC_LOG_STAIRS.get(), BBWoodBlocks.STRIPPED_MAGIC_LOG_SLAB.get());
        woodStairsSlabWallFenceGate(blockModels, BOPBlocks.MAGIC_LOG, BBWoodBlocks.MAGIC_WOOD_STAIRS.get(), BBWoodBlocks.MAGIC_WOOD_SLAB.get(), BOPBlocks.MAGIC_WOOD, BBWoodBlocks.MAGIC_WOOD_WALL.get(), BBWoodBlocks.MAGIC_WOOD_FENCE.get(), BBWoodBlocks.MAGIC_WOOD_FENCE_GATE.get());
        woodStairsSlabWallFenceGate(blockModels, BOPBlocks.STRIPPED_MAGIC_LOG, BBWoodBlocks.STRIPPED_MAGIC_WOOD_STAIRS.get(), BBWoodBlocks.STRIPPED_MAGIC_WOOD_SLAB.get(), BOPBlocks.STRIPPED_MAGIC_WOOD, BBWoodBlocks.STRIPPED_MAGIC_WOOD_WALL.get(), BBWoodBlocks.STRIPPED_MAGIC_WOOD_FENCE.get(), BBWoodBlocks.STRIPPED_MAGIC_WOOD_FENCE_GATE.get());

        // UMBRAN
        logStairsSlab(blockModels, BOPBlocks.UMBRAN_LOG, BBWoodBlocks.UMBRAN_LOG_STAIRS.get(), BBWoodBlocks.UMBRAN_LOG_SLAB.get());
        logStairsSlab(blockModels, BOPBlocks.STRIPPED_UMBRAN_LOG, BBWoodBlocks.STRIPPED_UMBRAN_LOG_STAIRS.get(), BBWoodBlocks.STRIPPED_UMBRAN_LOG_SLAB.get());
        woodStairsSlabWallFenceGate(blockModels, BOPBlocks.UMBRAN_LOG, BBWoodBlocks.UMBRAN_WOOD_STAIRS.get(), BBWoodBlocks.UMBRAN_WOOD_SLAB.get(), BOPBlocks.UMBRAN_WOOD, BBWoodBlocks.UMBRAN_WOOD_WALL.get(), BBWoodBlocks.UMBRAN_WOOD_FENCE.get(), BBWoodBlocks.UMBRAN_WOOD_FENCE_GATE.get());
        woodStairsSlabWallFenceGate(blockModels, BOPBlocks.STRIPPED_UMBRAN_LOG, BBWoodBlocks.STRIPPED_UMBRAN_WOOD_STAIRS.get(), BBWoodBlocks.STRIPPED_UMBRAN_WOOD_SLAB.get(), BOPBlocks.STRIPPED_UMBRAN_WOOD, BBWoodBlocks.STRIPPED_UMBRAN_WOOD_WALL.get(), BBWoodBlocks.STRIPPED_UMBRAN_WOOD_FENCE.get(), BBWoodBlocks.STRIPPED_UMBRAN_WOOD_FENCE_GATE.get());

        // HELLBARK
        logStairsSlab(blockModels, BOPBlocks.HELLBARK_LOG, BBWoodBlocks.HELLBARK_LOG_STAIRS.get(), BBWoodBlocks.HELLBARK_LOG_SLAB.get());
        logStairsSlab(blockModels, BOPBlocks.STRIPPED_HELLBARK_LOG, BBWoodBlocks.STRIPPED_HELLBARK_LOG_STAIRS.get(), BBWoodBlocks.STRIPPED_HELLBARK_LOG_SLAB.get());
        woodStairsSlabWallFenceGate(blockModels, BOPBlocks.HELLBARK_LOG, BBWoodBlocks.HELLBARK_WOOD_STAIRS.get(), BBWoodBlocks.HELLBARK_WOOD_SLAB.get(), BOPBlocks.HELLBARK_WOOD, BBWoodBlocks.HELLBARK_WOOD_WALL.get(), BBWoodBlocks.HELLBARK_WOOD_FENCE.get(), BBWoodBlocks.HELLBARK_WOOD_FENCE_GATE.get());
        woodStairsSlabWallFenceGate(blockModels, BOPBlocks.STRIPPED_HELLBARK_LOG, BBWoodBlocks.STRIPPED_HELLBARK_WOOD_STAIRS.get(), BBWoodBlocks.STRIPPED_HELLBARK_WOOD_SLAB.get(), BOPBlocks.STRIPPED_HELLBARK_WOOD, BBWoodBlocks.STRIPPED_HELLBARK_WOOD_WALL.get(), BBWoodBlocks.STRIPPED_HELLBARK_WOOD_FENCE.get(), BBWoodBlocks.STRIPPED_HELLBARK_WOOD_FENCE_GATE.get());

        // EMPYREAL
        logStairsSlab(blockModels, BOPBlocks.EMPYREAL_LOG, BBWoodBlocks.EMPYREAL_LOG_STAIRS.get(), BBWoodBlocks.EMPYREAL_LOG_SLAB.get());
        logStairsSlab(blockModels, BOPBlocks.STRIPPED_EMPYREAL_LOG, BBWoodBlocks.STRIPPED_EMPYREAL_LOG_STAIRS.get(), BBWoodBlocks.STRIPPED_EMPYREAL_LOG_SLAB.get());
        woodStairsSlabWallFenceGate(blockModels, BOPBlocks.EMPYREAL_LOG, BBWoodBlocks.EMPYREAL_WOOD_STAIRS.get(), BBWoodBlocks.EMPYREAL_WOOD_SLAB.get(), BOPBlocks.EMPYREAL_WOOD, BBWoodBlocks.EMPYREAL_WOOD_WALL.get(), BBWoodBlocks.EMPYREAL_WOOD_FENCE.get(), BBWoodBlocks.EMPYREAL_WOOD_FENCE_GATE.get());
        woodStairsSlabWallFenceGate(blockModels, BOPBlocks.STRIPPED_EMPYREAL_LOG, BBWoodBlocks.STRIPPED_EMPYREAL_WOOD_STAIRS.get(), BBWoodBlocks.STRIPPED_EMPYREAL_WOOD_SLAB.get(), BOPBlocks.STRIPPED_EMPYREAL_WOOD, BBWoodBlocks.STRIPPED_EMPYREAL_WOOD_WALL.get(), BBWoodBlocks.STRIPPED_EMPYREAL_WOOD_FENCE.get(), BBWoodBlocks.STRIPPED_EMPYREAL_WOOD_FENCE_GATE.get());

    }

    public static void woodStairsSlabWallFenceGate(BlockModelGenerators blockModels, Block base, StairBlock stair, SlabBlock slab, Block doubleSlap, WallBlock wall, FenceBlock fence, FenceGateBlock gate) {
        blockModels.familyWithExistingFullBlock(base).stairs(stair).wall(wall).fence(fence).fenceGate(gate);
        customSlab(blockModels, slab, doubleSlap, new TextureMapping()
                .put(TextureSlot.SIDE, TextureMapping.getBlockTexture(base))
                .put(TextureSlot.TOP, TextureMapping.getBlockTexture(base))
                .put(TextureSlot.BOTTOM, TextureMapping.getBlockTexture(base))
        );
    }

    public static void logStairsSlab(BlockModelGenerators blockModels, Block base, StairBlock stair, SlabBlock slab) {
        var mapping = logTextureMapping(base);
        customStairs(blockModels, stair, mapping);
        customSlab(blockModels, slab, base, mapping);
    }

    public static TextureMapping logTextureMapping(Block log) {
        return new TextureMapping()
                .put(TextureSlot.SIDE, TextureMapping.getBlockTexture(log))
                .put(TextureSlot.TOP, TextureMapping.getBlockTexture(log, "_top"))
                .put(TextureSlot.BOTTOM, TextureMapping.getBlockTexture(log, "_top"));
    }
}
