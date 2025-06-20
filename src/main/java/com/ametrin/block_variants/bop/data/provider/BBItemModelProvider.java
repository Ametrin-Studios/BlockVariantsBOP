package com.ametrin.block_variants.bop.data.provider;

import com.ametrin.block_variants.bop.BlockVariantsBOPIntegration;
import com.ametrin.block_variants.bop.registry.BBBlocks;
import com.ametrinstudios.ametrin.data.provider.ExtendedItemModelProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.WallBlock;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.stream.Stream;

import static com.ametrinstudios.ametrin.data.DataProviderExtensions.getBlockName;
import static com.ametrinstudios.ametrin.data.DataProviderExtensions.isWood;

public final class BBItemModelProvider extends ExtendedItemModelProvider {
    public BBItemModelProvider(PackOutput output, ExistingFileHelper fileHelper) {
        super(output, BlockVariantsBOPIntegration.MOD_ID, fileHelper);
    }

    @Override
    protected void registerModels() {
        blocks(BBBlocks.getAllBlocks());
    }

    private void blocks(Stream<Block> blocks) {
        blocks.forEach(block -> {
            String textureName = getBlockName(block);
            String name = getBlockName(block);
            ResourceLocation texture;
            if (textureName.contains("_wood")) {
                textureName = textureName.replace("_wood", "_log");
            }

            switch (block) {
                case WallBlock wallBlock -> {
                    texture = blockTexture(textureName.replace("_wall", ""));
                    wallInventory(name, texture);
                }
                case FenceBlock fenceBlock -> {
                    if (isWood(name)) {
                        texture = blockTexture(textureName.replace("_fence", ""));
                    } else {
                        texture = blockTexture(textureName.replace("_fence", "_planks"));
                    }
                    fenceInventory(name, texture);
                }
                case FenceGateBlock fenceGateBlock -> {
                    if (isWood(name)) {
                        texture = blockTexture(textureName.replace("_fence_gate", ""));
                    } else {
                        texture = blockTexture(textureName.replace("_fence_gate", "_planks"));
                    }
                    fenceGate(name, texture);
                }
                case null, default -> withExistingParent(name, modBlockLoc(name));
            }
        });
    }

    private ResourceLocation blockTexture(String texture) {
        return ResourceLocation.fromNamespaceAndPath("biomesoplenty", "block/" + texture);
    }

}
