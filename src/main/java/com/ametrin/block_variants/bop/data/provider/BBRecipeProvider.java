package com.ametrin.block_variants.bop.data.provider;

import com.ametrin.block_variants.bop.BlockVariantsBOPIntegration;
import com.ametrin.block_variants.bop.registry.BBBlockFamilies;
import com.ametrinstudios.ametrin.data.provider.ExtendedRecipeProvider;
import com.ametrinstudios.ametrin.util.WoodTypeCollection;
import net.minecraft.advancements.Advancement;
import net.minecraft.data.BlockFamily;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;

public final class BBRecipeProvider extends ExtendedRecipeProvider {


    public BBRecipeProvider(BootstrapContext<Recipe<?>> recipeOutput, BootstrapContext<Advancement> advancementOutput) {
        super(BlockVariantsBOPIntegration.MOD_ID, recipeOutput, advancementOutput, BBBlockFamilies.MAP);
    }

    @Override
    protected void buildRecipes() {
        family(BBBlockFamilies.FLESH).generate();
        family(BBBlockFamilies.POROUS_FLESH).generate();
        family(BBBlockFamilies.ROSE_QUARTZ_BLOCK).generate();

        BBBlockFamilies.FLOWER_PETALS.forEach(family -> family(family).generate());

        WoodTypeCollection.zipCommonApply(BBBlockFamilies.LOG, BBBlockFamilies.WOOD, (_, log, wood) -> {
            family(log).generate();
            family(wood).generate();
            wallFenceFenceGate(wood.get(BlockFamily.Variant.WALL), wood.get(BlockFamily.Variant.FENCE), wood.get(BlockFamily.Variant.FENCE_GATE), log.getBaseBlock(), false);
        });

        WoodTypeCollection.zipCommonApply(BBBlockFamilies.STRIPPED_LOG, BBBlockFamilies.STRIPPED_WOOD, (_, log, wood) -> {
            family(log).generate();
            family(wood).generate();
            wallFenceFenceGate(wood.get(BlockFamily.Variant.WALL), wood.get(BlockFamily.Variant.FENCE), wood.get(BlockFamily.Variant.FENCE_GATE), log.getBaseBlock(), false);
        });
    }

    public void wallFenceFenceGate(ItemLike wall, ItemLike fence, ItemLike fenceGate, ItemLike material, boolean hasStonecutting) {
        wall(wall, material, hasStonecutting);
        fence(fence, material);
        fenceGate(fenceGate, material);
    }

    private void stairSlabWall(StairBlock stair, SlabBlock slab, WallBlock wall, ItemLike material, boolean hasStonecutting) {
        stairs(stair, material, hasStonecutting);
        slab(slab, material, hasStonecutting);
        wall(wall, material, hasStonecutting);
    }
}
