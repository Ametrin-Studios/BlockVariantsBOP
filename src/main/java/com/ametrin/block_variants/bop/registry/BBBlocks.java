package com.ametrin.block_variants.bop.registry;

import biomesoplenty.api.block.BOPBlocks;
import biomesoplenty.api.block.BOPWoodTypes;
import com.ametrin.block_variants.bop.BlockVariantsBOPIntegration;
import com.barion.block_variants.block.*;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public final class BBBlocks {
    public static final DeferredRegister.Blocks REGISTER = DeferredRegister.createBlocks(BlockVariantsBOPIntegration.MOD_ID);

    // use oak wood as property base because fir has not been loaded yet and logs have an incompatible color map
    public static final DeferredBlock<StrippableStairBlock> FIR_LOG_STAIRS = register("fir_log_stairs", properties -> new StrippableStairBlock(BBBlocks.STRIPPED_FIR_LOG_STAIRS, BOPBlocks.FIR_LOG.defaultBlockState(), properties.mapColor(BOPBlocks.FIR_LOG.defaultMapColor())), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD));
    public static final DeferredBlock<StrippableSlabBlock> FIR_LOG_SLAB = register("fir_log_slab", properties -> new StrippableSlabBlock(BBBlocks.STRIPPED_FIR_LOG_SLAB, properties.mapColor(BOPBlocks.FIR_LOG.defaultMapColor())), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD));

    public static final DeferredBlock<StairBlock> STRIPPED_FIR_LOG_STAIRS = register("stripped_fir_log_stairs", properties -> new StairBlock(BOPBlocks.STRIPPED_FIR_LOG.defaultBlockState(), properties.mapColor(BOPBlocks.STRIPPED_FIR_LOG.defaultMapColor())), BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD));
    public static final DeferredBlock<SlabBlock> STRIPPED_FIR_LOG_SLAB = register("stripped_fir_log_slab", properties -> new SlabBlock(properties.mapColor(BOPBlocks.STRIPPED_FIR_LOG.defaultMapColor())), BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD));

    public static final DeferredBlock<StrippableStairBlock> FIR_WOOD_STAIRS = register("fir_wood_stairs", properties -> new StrippableStairBlock(BBBlocks.STRIPPED_FIR_WOOD_STAIRS, BOPBlocks.FIR_WOOD.defaultBlockState(), properties.mapColor(BOPBlocks.FIR_WOOD.defaultMapColor())), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD));
    public static final DeferredBlock<StrippableSlabBlock> FIR_WOOD_SLAB = register("fir_wood_slab", properties -> new StrippableSlabBlock(BBBlocks.STRIPPED_FIR_WOOD_SLAB, properties.mapColor(BOPBlocks.FIR_WOOD.defaultMapColor())), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD));
    public static final DeferredBlock<StrippableWallBlock> FIR_WOOD_WALL = register("fir_wood_wall", properties -> new StrippableWallBlock(BBBlocks.STRIPPED_FIR_WOOD_WALL, properties.mapColor(BOPBlocks.FIR_WOOD.defaultMapColor())), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD));
    public static final DeferredBlock<StrippableFenceBlock> FIR_WOOD_FENCE = register("fir_wood_fence", properties -> new StrippableFenceBlock(BBBlocks.STRIPPED_FIR_WOOD_FENCE, properties.mapColor(BOPBlocks.FIR_WOOD.defaultMapColor())), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD));
    public static final DeferredBlock<StrippableFenceGateBlock> FIR_WOOD_FENCE_GATE = register("fir_wood_fence_gate", properties -> new StrippableFenceGateBlock(BBBlocks.STRIPPED_FIR_WOOD_FENCE_GATE, BOPWoodTypes.FIR, properties.mapColor(BOPBlocks.FIR_WOOD.defaultMapColor())), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD));

    public static final DeferredBlock<StairBlock> STRIPPED_FIR_WOOD_STAIRS = register("stripped_fir_wood_stairs", properties -> new StairBlock(BOPBlocks.STRIPPED_FIR_WOOD.defaultBlockState(), properties.mapColor(BOPBlocks.STRIPPED_FIR_WOOD.defaultMapColor())), BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD));
    public static final DeferredBlock<SlabBlock> STRIPPED_FIR_WOOD_SLAB = register("stripped_fir_wood_slab", properties -> new SlabBlock(properties.mapColor(BOPBlocks.STRIPPED_FIR_WOOD.defaultMapColor())), BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD));
    public static final DeferredBlock<WallBlock> STRIPPED_FIR_WOOD_WALL = register("stripped_fir_wood_wall", properties -> new WallBlock(properties.mapColor(BOPBlocks.STRIPPED_FIR_WOOD.defaultMapColor())), BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD));
    public static final DeferredBlock<FenceBlock> STRIPPED_FIR_WOOD_FENCE = register("stripped_fir_wood_fence", properties -> new FenceBlock(properties.mapColor(BOPBlocks.STRIPPED_FIR_WOOD.defaultMapColor())), BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD));
    public static final DeferredBlock<FenceGateBlock> STRIPPED_FIR_WOOD_FENCE_GATE = register("stripped_fir_wood_fence_gate", properties -> new FenceGateBlock(BOPWoodTypes.FIR, properties.mapColor(BOPBlocks.STRIPPED_FIR_WOOD.defaultMapColor())), BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD));



    private static <T extends Block> DeferredBlock<T> register(String name, Function<BlockBehaviour.Properties, T> block, BlockBehaviour.Properties properties) {
        return register(name, block, properties, new Item.Properties());
    }

    private static <T extends Block> DeferredBlock<T> register(String name, Function<BlockBehaviour.Properties, T> block, BlockBehaviour.Properties properties, Item.Properties itemProperties) {
        var registryObject = registerWithoutItem(name, block, properties);
        BBItems.REGISTER.registerItem(name, iproperties -> new BlockItem(registryObject.get(), iproperties), itemProperties);
        return registryObject;
    }

    private static <T extends Block> DeferredBlock<T> registerWithoutItem(String name, Function<BlockBehaviour.Properties, T> block, BlockBehaviour.Properties properties) {
        return REGISTER.registerBlock(name, block, properties);
    }

    public static Stream<? extends Block> getAllBlocks() {
        return REGISTER.getEntries().stream().map(Supplier::get);
    }
}
