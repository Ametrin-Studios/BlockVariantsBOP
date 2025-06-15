package com.ametrin.block_variants.bop.data.provider;

import biomesoplenty.api.block.BOPBlocks;
import com.ametrin.block_variants.bop.BlockVariantsBOPIntegration;
import com.ametrin.block_variants.bop.registry.BBBlocks;
import com.ametrinstudios.ametrin.data.provider.ExtendedModelProvider;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
import org.jetbrains.annotations.NotNull;

import static com.barion.block_variants.data.provider.BVModelProvider.*;

public final class BBModelProvider extends ExtendedModelProvider {
    public BBModelProvider(PackOutput output) {
        super(output, BlockVariantsBOPIntegration.MOD_ID);
    }

    @Override
    protected void registerModels(@NotNull BlockModelGenerators blockModels, @NotNull ItemModelGenerators itemModels) {
        logStairsSlab(blockModels, BOPBlocks.FIR_LOG, BBBlocks.FIR_LOG_STAIRS.get(), BBBlocks.FIR_LOG_SLAB.get());
        logStairsSlab(blockModels, BOPBlocks.STRIPPED_FIR_LOG, BBBlocks.STRIPPED_FIR_LOG_STAIRS.get(), BBBlocks.STRIPPED_FIR_LOG_SLAB.get());
        woodStairsSlabWallFenceGate(blockModels, BOPBlocks.FIR_LOG, BBBlocks.FIR_WOOD_STAIRS.get(), BBBlocks.FIR_WOOD_SLAB.get(), BOPBlocks.FIR_WOOD, BBBlocks.FIR_WOOD_WALL.get(),  BBBlocks.FIR_WOOD_FENCE.get(), BBBlocks.FIR_WOOD_FENCE_GATE.get() );
        woodStairsSlabWallFenceGate(blockModels, BOPBlocks.STRIPPED_FIR_LOG, BBBlocks.STRIPPED_FIR_WOOD_STAIRS.get(), BBBlocks.STRIPPED_FIR_WOOD_SLAB.get(), BOPBlocks.STRIPPED_FIR_WOOD, BBBlocks.STRIPPED_FIR_WOOD_WALL.get(),  BBBlocks.STRIPPED_FIR_WOOD_FENCE.get(), BBBlocks.STRIPPED_FIR_WOOD_FENCE_GATE.get() );
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
