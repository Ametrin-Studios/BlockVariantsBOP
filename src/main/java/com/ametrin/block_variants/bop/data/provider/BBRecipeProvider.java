package com.ametrin.block_variants.bop.data.provider;

import biomesoplenty.api.block.BOPBlocks;
import com.ametrin.block_variants.bop.BlockVariantsBOPIntegration;
import com.ametrin.block_variants.bop.registry.BBBlocks;
import com.ametrinstudios.ametrin.data.provider.ExtendedRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.*;
import org.jetbrains.annotations.NotNull;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public final class BBRecipeProvider extends ExtendedRecipeProvider {
    public BBRecipeProvider( HolderLookup.Provider registries, RecipeOutput output, Set<ResourceLocation> recipeSet) {
        super(BlockVariantsBOPIntegration.MOD_ID, registries, output, recipeSet);
    }

    @Override
    protected void buildRecipes() {
        stairSlab(BBBlocks.FIR_LOG_STAIRS.get(), BBBlocks.FIR_LOG_SLAB.get(), BOPBlocks.FIR_LOG, false);
        stairSlab(BBBlocks.STRIPPED_FIR_LOG_STAIRS.get(), BBBlocks.STRIPPED_FIR_LOG_SLAB.get(), BOPBlocks.STRIPPED_FIR_LOG, false);
        recipeWoods(BBBlocks.FIR_WOOD_STAIRS.get(), BBBlocks.FIR_WOOD_SLAB.get(), BBBlocks.FIR_WOOD_WALL.get(), BBBlocks.FIR_WOOD_FENCE.get(), BBBlocks.FIR_WOOD_FENCE_GATE.get(), BOPBlocks.FIR_WOOD, BOPBlocks.FIR_LOG);
        recipeWoods(BBBlocks.STRIPPED_FIR_WOOD_STAIRS.get(), BBBlocks.STRIPPED_FIR_WOOD_SLAB.get(), BBBlocks.STRIPPED_FIR_WOOD_WALL.get(), BBBlocks.STRIPPED_FIR_WOOD_FENCE.get(), BBBlocks.STRIPPED_FIR_WOOD_FENCE_GATE.get(), BOPBlocks.STRIPPED_FIR_WOOD, BOPBlocks.STRIPPED_FIR_LOG);
    }

    public void recipeWoods(StairBlock stairs, SlabBlock slab, WallBlock wall, FenceBlock fence, FenceGateBlock fenceGate, ItemLike material, ItemLike altMaterial) {
        stairs(stairs, material, false);
        slab(slab, material, false);
        wall(wall, material, false);
        wall(wall, altMaterial, false);
        fence(fence, material);
        fence(fence, altMaterial);
        fenceGate(fenceGate, material);
        fenceGate(fenceGate, altMaterial);
    }

    public void stairSlab(StairBlock stair, SlabBlock slab, ItemLike material, boolean hasStonecutting) {
        stairs(stair, material, hasStonecutting);
        slab(slab, material, hasStonecutting);
    }

    public static final class Runner extends ExtendedRecipeProvider.Runner {
        public Runner(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> registries) {
            super(packOutput, registries);
        }

        @Override
        protected ExtendedRecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput, Set<ResourceLocation> set) {
            return new BBRecipeProvider(provider, recipeOutput, set);
        }

        @Override
        public @NotNull String getName() {
            return "Block Variants - Biomes O' Plenty recipes";
        }
    }
}
