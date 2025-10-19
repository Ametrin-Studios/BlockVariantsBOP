package com.ametrin.block_variants.bop.data.provider;

import biomesoplenty.api.block.BOPBlocks;
import com.ametrin.block_variants.bop.BlockVariantsBOPIntegration;
import com.ametrin.block_variants.bop.registry.BBBlocks;
import com.ametrin.block_variants.bop.registry.BBWoodBlocks;
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
        stairSlabWall(BBBlocks.FLESH_STAIRS.get(), BBBlocks.FLESH_SLAB.get(), BBBlocks.FLESH_WALL.get(), BOPBlocks.FLESH, false);
        stairSlabWall(BBBlocks.POROUS_FLESH_STAIRS.get(), BBBlocks.POROUS_FLESH_SLAB.get(), BBBlocks.POROUS_FLESH_WALL.get(), BOPBlocks.POROUS_FLESH, false);
        stairSlabWall(BBBlocks.BRIMSTONE_STAIRS.get(), BBBlocks.BRIMSTONE_SLAB.get(), BBBlocks.BRIMSTONE_WALL.get(), BOPBlocks.BRIMSTONE, true);
        stairSlabWall(BBBlocks.ROSE_QUARTZ_BLOCK_STAIRS.get(), BBBlocks.ROSE_QUARTZ_BLOCK_SLAB.get(), BBBlocks.ROSE_QUARTZ_BLOCK_WALL.get(), BOPBlocks.ROSE_QUARTZ_BLOCK, true);

        // ORIGIN OAK
        stairSlab(BBWoodBlocks.ORIGIN_OAK_LOG_STAIRS.get(), BBWoodBlocks.ORIGIN_OAK_LOG_SLAB.get(), BOPBlocks.ORIGIN_OAK_LOG, false);
        stairSlab(BBWoodBlocks.STRIPPED_ORIGIN_OAK_LOG_STAIRS.get(), BBWoodBlocks.STRIPPED_ORIGIN_OAK_LOG_SLAB.get(), BOPBlocks.STRIPPED_ORIGIN_OAK_LOG, false);
        recipeWoods(BBWoodBlocks.ORIGIN_OAK_WOOD_STAIRS.get(), BBWoodBlocks.ORIGIN_OAK_WOOD_SLAB.get(), BBWoodBlocks.ORIGIN_OAK_WOOD_WALL.get(), BBWoodBlocks.ORIGIN_OAK_WOOD_FENCE.get(), BBWoodBlocks.ORIGIN_OAK_WOOD_FENCE_GATE.get(), BOPBlocks.ORIGIN_OAK_WOOD, BOPBlocks.ORIGIN_OAK_LOG);
        recipeWoods(BBWoodBlocks.STRIPPED_ORIGIN_OAK_WOOD_STAIRS.get(), BBWoodBlocks.STRIPPED_ORIGIN_OAK_WOOD_SLAB.get(), BBWoodBlocks.STRIPPED_ORIGIN_OAK_WOOD_WALL.get(), BBWoodBlocks.STRIPPED_ORIGIN_OAK_WOOD_FENCE.get(), BBWoodBlocks.STRIPPED_ORIGIN_OAK_WOOD_FENCE_GATE.get(), BOPBlocks.STRIPPED_ORIGIN_OAK_WOOD, BOPBlocks.STRIPPED_ORIGIN_OAK_LOG);

        // FIR
        stairSlab(BBWoodBlocks.FIR_LOG_STAIRS.get(), BBWoodBlocks.FIR_LOG_SLAB.get(), BOPBlocks.FIR_LOG, false);
        stairSlab(BBWoodBlocks.STRIPPED_FIR_LOG_STAIRS.get(), BBWoodBlocks.STRIPPED_FIR_LOG_SLAB.get(), BOPBlocks.STRIPPED_FIR_LOG, false);
        recipeWoods(BBWoodBlocks.FIR_WOOD_STAIRS.get(), BBWoodBlocks.FIR_WOOD_SLAB.get(), BBWoodBlocks.FIR_WOOD_WALL.get(), BBWoodBlocks.FIR_WOOD_FENCE.get(), BBWoodBlocks.FIR_WOOD_FENCE_GATE.get(), BOPBlocks.FIR_WOOD, BOPBlocks.FIR_LOG);
        recipeWoods(BBWoodBlocks.STRIPPED_FIR_WOOD_STAIRS.get(), BBWoodBlocks.STRIPPED_FIR_WOOD_SLAB.get(), BBWoodBlocks.STRIPPED_FIR_WOOD_WALL.get(), BBWoodBlocks.STRIPPED_FIR_WOOD_FENCE.get(), BBWoodBlocks.STRIPPED_FIR_WOOD_FENCE_GATE.get(), BOPBlocks.STRIPPED_FIR_WOOD, BOPBlocks.STRIPPED_FIR_LOG);

        // PINE
        stairSlab(BBWoodBlocks.PINE_LOG_STAIRS.get(), BBWoodBlocks.PINE_LOG_SLAB.get(), BOPBlocks.PINE_LOG, false);
        stairSlab(BBWoodBlocks.STRIPPED_PINE_LOG_STAIRS.get(), BBWoodBlocks.STRIPPED_PINE_LOG_SLAB.get(), BOPBlocks.STRIPPED_PINE_LOG, false);
        recipeWoods(BBWoodBlocks.PINE_WOOD_STAIRS.get(), BBWoodBlocks.PINE_WOOD_SLAB.get(), BBWoodBlocks.PINE_WOOD_WALL.get(), BBWoodBlocks.PINE_WOOD_FENCE.get(), BBWoodBlocks.PINE_WOOD_FENCE_GATE.get(), BOPBlocks.PINE_WOOD, BOPBlocks.PINE_LOG);
        recipeWoods(BBWoodBlocks.STRIPPED_PINE_WOOD_STAIRS.get(), BBWoodBlocks.STRIPPED_PINE_WOOD_SLAB.get(), BBWoodBlocks.STRIPPED_PINE_WOOD_WALL.get(), BBWoodBlocks.STRIPPED_PINE_WOOD_FENCE.get(), BBWoodBlocks.STRIPPED_PINE_WOOD_FENCE_GATE.get(), BOPBlocks.STRIPPED_PINE_WOOD, BOPBlocks.STRIPPED_PINE_LOG);

        // MAPLE
        stairSlab(BBWoodBlocks.MAPLE_LOG_STAIRS.get(), BBWoodBlocks.MAPLE_LOG_SLAB.get(), BOPBlocks.MAPLE_LOG, false);
        stairSlab(BBWoodBlocks.STRIPPED_MAPLE_LOG_STAIRS.get(), BBWoodBlocks.STRIPPED_MAPLE_LOG_SLAB.get(), BOPBlocks.STRIPPED_MAPLE_LOG, false);
        recipeWoods(BBWoodBlocks.MAPLE_WOOD_STAIRS.get(), BBWoodBlocks.MAPLE_WOOD_SLAB.get(), BBWoodBlocks.MAPLE_WOOD_WALL.get(), BBWoodBlocks.MAPLE_WOOD_FENCE.get(), BBWoodBlocks.MAPLE_WOOD_FENCE_GATE.get(), BOPBlocks.MAPLE_WOOD, BOPBlocks.MAPLE_LOG);
        recipeWoods(BBWoodBlocks.STRIPPED_MAPLE_WOOD_STAIRS.get(), BBWoodBlocks.STRIPPED_MAPLE_WOOD_SLAB.get(), BBWoodBlocks.STRIPPED_MAPLE_WOOD_WALL.get(), BBWoodBlocks.STRIPPED_MAPLE_WOOD_FENCE.get(), BBWoodBlocks.STRIPPED_MAPLE_WOOD_FENCE_GATE.get(), BOPBlocks.STRIPPED_MAPLE_WOOD, BOPBlocks.STRIPPED_MAPLE_LOG);

        // REDWOOD
        stairSlab(BBWoodBlocks.REDWOOD_LOG_STAIRS.get(), BBWoodBlocks.REDWOOD_LOG_SLAB.get(), BOPBlocks.REDWOOD_LOG, false);
        stairSlab(BBWoodBlocks.STRIPPED_REDWOOD_LOG_STAIRS.get(), BBWoodBlocks.STRIPPED_REDWOOD_LOG_SLAB.get(), BOPBlocks.STRIPPED_REDWOOD_LOG, false);
        recipeWoods(BBWoodBlocks.REDWOOD_WOOD_STAIRS.get(), BBWoodBlocks.REDWOOD_WOOD_SLAB.get(), BBWoodBlocks.REDWOOD_WOOD_WALL.get(), BBWoodBlocks.REDWOOD_WOOD_FENCE.get(), BBWoodBlocks.REDWOOD_WOOD_FENCE_GATE.get(), BOPBlocks.REDWOOD_WOOD, BOPBlocks.REDWOOD_LOG);
        recipeWoods(BBWoodBlocks.STRIPPED_REDWOOD_WOOD_STAIRS.get(), BBWoodBlocks.STRIPPED_REDWOOD_WOOD_SLAB.get(), BBWoodBlocks.STRIPPED_REDWOOD_WOOD_WALL.get(), BBWoodBlocks.STRIPPED_REDWOOD_WOOD_FENCE.get(), BBWoodBlocks.STRIPPED_REDWOOD_WOOD_FENCE_GATE.get(), BOPBlocks.STRIPPED_REDWOOD_WOOD, BOPBlocks.STRIPPED_REDWOOD_LOG);

        // MAHOGANY
        stairSlab(BBWoodBlocks.MAHOGANY_LOG_STAIRS.get(), BBWoodBlocks.MAHOGANY_LOG_SLAB.get(), BOPBlocks.MAHOGANY_LOG, false);
        stairSlab(BBWoodBlocks.STRIPPED_MAHOGANY_LOG_STAIRS.get(), BBWoodBlocks.STRIPPED_MAHOGANY_LOG_SLAB.get(), BOPBlocks.STRIPPED_MAHOGANY_LOG, false);
        recipeWoods(BBWoodBlocks.MAHOGANY_WOOD_STAIRS.get(), BBWoodBlocks.MAHOGANY_WOOD_SLAB.get(), BBWoodBlocks.MAHOGANY_WOOD_WALL.get(), BBWoodBlocks.MAHOGANY_WOOD_FENCE.get(), BBWoodBlocks.MAHOGANY_WOOD_FENCE_GATE.get(), BOPBlocks.MAHOGANY_WOOD, BOPBlocks.MAHOGANY_LOG);
        recipeWoods(BBWoodBlocks.STRIPPED_MAHOGANY_WOOD_STAIRS.get(), BBWoodBlocks.STRIPPED_MAHOGANY_WOOD_SLAB.get(), BBWoodBlocks.STRIPPED_MAHOGANY_WOOD_WALL.get(), BBWoodBlocks.STRIPPED_MAHOGANY_WOOD_FENCE.get(), BBWoodBlocks.STRIPPED_MAHOGANY_WOOD_FENCE_GATE.get(), BOPBlocks.STRIPPED_MAHOGANY_WOOD, BOPBlocks.STRIPPED_MAHOGANY_LOG);

        // JACARANDA
        stairSlab(BBWoodBlocks.JACARANDA_LOG_STAIRS.get(), BBWoodBlocks.JACARANDA_LOG_SLAB.get(), BOPBlocks.JACARANDA_LOG, false);
        stairSlab(BBWoodBlocks.STRIPPED_JACARANDA_LOG_STAIRS.get(), BBWoodBlocks.STRIPPED_JACARANDA_LOG_SLAB.get(), BOPBlocks.STRIPPED_JACARANDA_LOG, false);
        recipeWoods(BBWoodBlocks.JACARANDA_WOOD_STAIRS.get(), BBWoodBlocks.JACARANDA_WOOD_SLAB.get(), BBWoodBlocks.JACARANDA_WOOD_WALL.get(), BBWoodBlocks.JACARANDA_WOOD_FENCE.get(), BBWoodBlocks.JACARANDA_WOOD_FENCE_GATE.get(), BOPBlocks.JACARANDA_WOOD, BOPBlocks.JACARANDA_LOG);
        recipeWoods(BBWoodBlocks.STRIPPED_JACARANDA_WOOD_STAIRS.get(), BBWoodBlocks.STRIPPED_JACARANDA_WOOD_SLAB.get(), BBWoodBlocks.STRIPPED_JACARANDA_WOOD_WALL.get(), BBWoodBlocks.STRIPPED_JACARANDA_WOOD_FENCE.get(), BBWoodBlocks.STRIPPED_JACARANDA_WOOD_FENCE_GATE.get(), BOPBlocks.STRIPPED_JACARANDA_WOOD, BOPBlocks.STRIPPED_JACARANDA_LOG);

        // PALM
        stairSlab(BBWoodBlocks.PALM_LOG_STAIRS.get(), BBWoodBlocks.PALM_LOG_SLAB.get(), BOPBlocks.PALM_LOG, false);
        stairSlab(BBWoodBlocks.STRIPPED_PALM_LOG_STAIRS.get(), BBWoodBlocks.STRIPPED_PALM_LOG_SLAB.get(), BOPBlocks.STRIPPED_PALM_LOG, false);
        recipeWoods(BBWoodBlocks.PALM_WOOD_STAIRS.get(), BBWoodBlocks.PALM_WOOD_SLAB.get(), BBWoodBlocks.PALM_WOOD_WALL.get(), BBWoodBlocks.PALM_WOOD_FENCE.get(), BBWoodBlocks.PALM_WOOD_FENCE_GATE.get(), BOPBlocks.PALM_WOOD, BOPBlocks.PALM_LOG);
        recipeWoods(BBWoodBlocks.STRIPPED_PALM_WOOD_STAIRS.get(), BBWoodBlocks.STRIPPED_PALM_WOOD_SLAB.get(), BBWoodBlocks.STRIPPED_PALM_WOOD_WALL.get(), BBWoodBlocks.STRIPPED_PALM_WOOD_FENCE.get(), BBWoodBlocks.STRIPPED_PALM_WOOD_FENCE_GATE.get(), BOPBlocks.STRIPPED_PALM_WOOD, BOPBlocks.STRIPPED_PALM_LOG);

        // WILLOW
        stairSlab(BBWoodBlocks.WILLOW_LOG_STAIRS.get(), BBWoodBlocks.WILLOW_LOG_SLAB.get(), BOPBlocks.WILLOW_LOG, false);
        stairSlab(BBWoodBlocks.STRIPPED_WILLOW_LOG_STAIRS.get(), BBWoodBlocks.STRIPPED_WILLOW_LOG_SLAB.get(), BOPBlocks.STRIPPED_WILLOW_LOG, false);
        recipeWoods(BBWoodBlocks.WILLOW_WOOD_STAIRS.get(), BBWoodBlocks.WILLOW_WOOD_SLAB.get(), BBWoodBlocks.WILLOW_WOOD_WALL.get(), BBWoodBlocks.WILLOW_WOOD_FENCE.get(), BBWoodBlocks.WILLOW_WOOD_FENCE_GATE.get(), BOPBlocks.WILLOW_WOOD, BOPBlocks.WILLOW_LOG);
        recipeWoods(BBWoodBlocks.STRIPPED_WILLOW_WOOD_STAIRS.get(), BBWoodBlocks.STRIPPED_WILLOW_WOOD_SLAB.get(), BBWoodBlocks.STRIPPED_WILLOW_WOOD_WALL.get(), BBWoodBlocks.STRIPPED_WILLOW_WOOD_FENCE.get(), BBWoodBlocks.STRIPPED_WILLOW_WOOD_FENCE_GATE.get(), BOPBlocks.STRIPPED_WILLOW_WOOD, BOPBlocks.STRIPPED_WILLOW_LOG);

        // DEAD
        stairSlab(BBWoodBlocks.DEAD_LOG_STAIRS.get(), BBWoodBlocks.DEAD_LOG_SLAB.get(), BOPBlocks.DEAD_LOG, false);
        stairSlab(BBWoodBlocks.STRIPPED_DEAD_LOG_STAIRS.get(), BBWoodBlocks.STRIPPED_DEAD_LOG_SLAB.get(), BOPBlocks.STRIPPED_DEAD_LOG, false);
        recipeWoods(BBWoodBlocks.DEAD_WOOD_STAIRS.get(), BBWoodBlocks.DEAD_WOOD_SLAB.get(), BBWoodBlocks.DEAD_WOOD_WALL.get(), BBWoodBlocks.DEAD_WOOD_FENCE.get(), BBWoodBlocks.DEAD_WOOD_FENCE_GATE.get(), BOPBlocks.DEAD_WOOD, BOPBlocks.DEAD_LOG);
        recipeWoods(BBWoodBlocks.STRIPPED_DEAD_WOOD_STAIRS.get(), BBWoodBlocks.STRIPPED_DEAD_WOOD_SLAB.get(), BBWoodBlocks.STRIPPED_DEAD_WOOD_WALL.get(), BBWoodBlocks.STRIPPED_DEAD_WOOD_FENCE.get(), BBWoodBlocks.STRIPPED_DEAD_WOOD_FENCE_GATE.get(), BOPBlocks.STRIPPED_DEAD_WOOD, BOPBlocks.STRIPPED_DEAD_LOG);

        // MAGIC
        stairSlab(BBWoodBlocks.MAGIC_LOG_STAIRS.get(), BBWoodBlocks.MAGIC_LOG_SLAB.get(), BOPBlocks.MAGIC_LOG, false);
        stairSlab(BBWoodBlocks.STRIPPED_MAGIC_LOG_STAIRS.get(), BBWoodBlocks.STRIPPED_MAGIC_LOG_SLAB.get(), BOPBlocks.STRIPPED_MAGIC_LOG, false);
        recipeWoods(BBWoodBlocks.MAGIC_WOOD_STAIRS.get(), BBWoodBlocks.MAGIC_WOOD_SLAB.get(), BBWoodBlocks.MAGIC_WOOD_WALL.get(), BBWoodBlocks.MAGIC_WOOD_FENCE.get(), BBWoodBlocks.MAGIC_WOOD_FENCE_GATE.get(), BOPBlocks.MAGIC_WOOD, BOPBlocks.MAGIC_LOG);
        recipeWoods(BBWoodBlocks.STRIPPED_MAGIC_WOOD_STAIRS.get(), BBWoodBlocks.STRIPPED_MAGIC_WOOD_SLAB.get(), BBWoodBlocks.STRIPPED_MAGIC_WOOD_WALL.get(), BBWoodBlocks.STRIPPED_MAGIC_WOOD_FENCE.get(), BBWoodBlocks.STRIPPED_MAGIC_WOOD_FENCE_GATE.get(), BOPBlocks.STRIPPED_MAGIC_WOOD, BOPBlocks.STRIPPED_MAGIC_LOG);

        // UMBRAN
        stairSlab(BBWoodBlocks.UMBRAN_LOG_STAIRS.get(), BBWoodBlocks.UMBRAN_LOG_SLAB.get(), BOPBlocks.UMBRAN_LOG, false);
        stairSlab(BBWoodBlocks.STRIPPED_UMBRAN_LOG_STAIRS.get(), BBWoodBlocks.STRIPPED_UMBRAN_LOG_SLAB.get(), BOPBlocks.STRIPPED_UMBRAN_LOG, false);
        recipeWoods(BBWoodBlocks.UMBRAN_WOOD_STAIRS.get(), BBWoodBlocks.UMBRAN_WOOD_SLAB.get(), BBWoodBlocks.UMBRAN_WOOD_WALL.get(), BBWoodBlocks.UMBRAN_WOOD_FENCE.get(), BBWoodBlocks.UMBRAN_WOOD_FENCE_GATE.get(), BOPBlocks.UMBRAN_WOOD, BOPBlocks.UMBRAN_LOG);
        recipeWoods(BBWoodBlocks.STRIPPED_UMBRAN_WOOD_STAIRS.get(), BBWoodBlocks.STRIPPED_UMBRAN_WOOD_SLAB.get(), BBWoodBlocks.STRIPPED_UMBRAN_WOOD_WALL.get(), BBWoodBlocks.STRIPPED_UMBRAN_WOOD_FENCE.get(), BBWoodBlocks.STRIPPED_UMBRAN_WOOD_FENCE_GATE.get(), BOPBlocks.STRIPPED_UMBRAN_WOOD, BOPBlocks.STRIPPED_UMBRAN_LOG);

        // HELLBARK
        stairSlab(BBWoodBlocks.HELLBARK_LOG_STAIRS.get(), BBWoodBlocks.HELLBARK_LOG_SLAB.get(), BOPBlocks.HELLBARK_LOG, false);
        stairSlab(BBWoodBlocks.STRIPPED_HELLBARK_LOG_STAIRS.get(), BBWoodBlocks.STRIPPED_HELLBARK_LOG_SLAB.get(), BOPBlocks.STRIPPED_HELLBARK_LOG, false);
        recipeWoods(BBWoodBlocks.HELLBARK_WOOD_STAIRS.get(), BBWoodBlocks.HELLBARK_WOOD_SLAB.get(), BBWoodBlocks.HELLBARK_WOOD_WALL.get(), BBWoodBlocks.HELLBARK_WOOD_FENCE.get(), BBWoodBlocks.HELLBARK_WOOD_FENCE_GATE.get(), BOPBlocks.HELLBARK_WOOD, BOPBlocks.HELLBARK_LOG);
        recipeWoods(BBWoodBlocks.STRIPPED_HELLBARK_WOOD_STAIRS.get(), BBWoodBlocks.STRIPPED_HELLBARK_WOOD_SLAB.get(), BBWoodBlocks.STRIPPED_HELLBARK_WOOD_WALL.get(), BBWoodBlocks.STRIPPED_HELLBARK_WOOD_FENCE.get(), BBWoodBlocks.STRIPPED_HELLBARK_WOOD_FENCE_GATE.get(), BOPBlocks.STRIPPED_HELLBARK_WOOD, BOPBlocks.STRIPPED_HELLBARK_LOG);

        // EMPYREAL
        stairSlab(BBWoodBlocks.EMPYREAL_LOG_STAIRS.get(), BBWoodBlocks.EMPYREAL_LOG_SLAB.get(), BOPBlocks.EMPYREAL_LOG, false);
        stairSlab(BBWoodBlocks.STRIPPED_EMPYREAL_LOG_STAIRS.get(), BBWoodBlocks.STRIPPED_EMPYREAL_LOG_SLAB.get(), BOPBlocks.STRIPPED_EMPYREAL_LOG, false);
        recipeWoods(BBWoodBlocks.EMPYREAL_WOOD_STAIRS.get(), BBWoodBlocks.EMPYREAL_WOOD_SLAB.get(), BBWoodBlocks.EMPYREAL_WOOD_WALL.get(), BBWoodBlocks.EMPYREAL_WOOD_FENCE.get(), BBWoodBlocks.EMPYREAL_WOOD_FENCE_GATE.get(), BOPBlocks.EMPYREAL_WOOD, BOPBlocks.EMPYREAL_LOG);
        recipeWoods(BBWoodBlocks.STRIPPED_EMPYREAL_WOOD_STAIRS.get(), BBWoodBlocks.STRIPPED_EMPYREAL_WOOD_SLAB.get(), BBWoodBlocks.STRIPPED_EMPYREAL_WOOD_WALL.get(), BBWoodBlocks.STRIPPED_EMPYREAL_WOOD_FENCE.get(), BBWoodBlocks.STRIPPED_EMPYREAL_WOOD_FENCE_GATE.get(), BOPBlocks.STRIPPED_EMPYREAL_WOOD, BOPBlocks.STRIPPED_EMPYREAL_LOG);
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

    private void stairSlabWall(StairBlock stair, SlabBlock slab, WallBlock wall, ItemLike material, boolean hasStonecutting) {
        stairs(stair, material, hasStonecutting);
        slab(slab, material, hasStonecutting);
        wall(wall, material, hasStonecutting);
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
