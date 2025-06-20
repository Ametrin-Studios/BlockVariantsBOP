package com.ametrin.block_variants.bop.data.provider;

import com.ametrin.block_variants.bop.BlockVariantsBOPIntegration;
import com.ametrin.block_variants.bop.registry.BBBlocks;
import com.ametrin.block_variants.bop.registry.BBWoodBlocks;
import com.ametrinstudios.ametrin.data.provider.ExtendedBlockStateProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import static com.ametrinstudios.ametrin.data.DataProviderExtensions.isLog;

public final class BBBlockStateProvider extends ExtendedBlockStateProvider {

    public BBBlockStateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, BlockVariantsBOPIntegration.MOD_ID, existingFileHelper);
    }

    {
        blockStateProviderRules.add((block, name, texture) -> {
            if (!isLog(name)) {
                return false;
            }
            if (block instanceof StairBlock) {
                var top = modBlockLoc(texture.replace("stairs", "top"));
                stairsBlock((StairBlock) block, modBlockLoc(texture.replace("_stairs", "")), top, top);
            } else if (block instanceof SlabBlock) {
                var top = modBlockLoc(texture.replace("slab", "top"));
                slabBlock((SlabBlock) block, modBlockLoc(texture.replace("_slab", "")), modBlockLoc(texture.replace("_slab", "")), top, top);
            } else {
                return false;
            }
            return true;
        });
    }

    @Override
    protected void registerStatesAndModels() {
        runProviderRules(BBWoodBlocks.REGISTER);
        runProviderRules(BBBlocks.REGISTER);
    }

    @Override
    protected String getTextureLocation(String name) {
        if (name.contains("_wood")) {
            name = name.replace("_wood", "_log");
        }
        return name;
    }

    @Override
    protected ResourceLocation modBlockLoc(String key) {
        return ResourceLocation.fromNamespaceAndPath("biomesoplenty", "block/" + key);
    }
}
