package com.ametrin.block_variants.bop.registry;

import biomesoplenty.api.block.BOPBlocks;
import com.ametrin.block_variants.bop.BlockVariantsBOPIntegration;
import com.barion.block_variants.registry.BVItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public final class BBBlocks {
    public static final DeferredRegister.Blocks REGISTER = DeferredRegister.createBlocks(BlockVariantsBOPIntegration.MOD_ID);

    public static final DeferredBlock<StairBlock> STRIPPED_FIR_LOG_STAIRS = register("stripped_fir_log_stairs", properties -> new StairBlock(BOPBlocks.STRIPPED_FIR_LOG.defaultBlockState(), properties.mapColor(BOPBlocks.STRIPPED_FIR_LOG.defaultMapColor())), BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD));
    public static final DeferredBlock<SlabBlock> STRIPPED_FIR_LOG_SLAB = register("stripped_fir_log_slab", properties -> new SlabBlock(properties.mapColor(BOPBlocks.STRIPPED_FIR_LOG.defaultMapColor())), BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD));

    public static final DeferredBlock<StairBlock> FIR_LOG_STAIRS = register("fir_log_stairs", properties -> new StairBlock(BOPBlocks.FIR_LOG.defaultBlockState(), properties.mapColor(BOPBlocks.FIR_LOG.defaultMapColor())), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD));
    public static final DeferredBlock<SlabBlock> FIR_LOG_SLAB = register("fir_log_slab", properties -> new SlabBlock(properties.mapColor(BOPBlocks.FIR_LOG.defaultMapColor())), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD));

    private static final Item.Properties DEFAULT_ITEM_PROPERTIES = new Item.Properties();

    private static <T extends Block> DeferredBlock<T> register(String name, Function<BlockBehaviour.Properties, T> block, BlockBehaviour.Properties properties) {
        return register(name, block, properties, DEFAULT_ITEM_PROPERTIES);
    }

    private static <T extends Block> DeferredBlock<T> register(String name, Function<BlockBehaviour.Properties, T> block, BlockBehaviour.Properties properties, Item.Properties itemProperties) {
        var registryObject = registerWithoutItem(name, block, properties);
        BVItems.REGISTER.registerItem(name, iproperties -> new BlockItem(registryObject.get(), iproperties), itemProperties);
        return registryObject;
    }

    private static <T extends Block> DeferredBlock<T> registerWithoutItem(String name, Function<BlockBehaviour.Properties, T> block, BlockBehaviour.Properties properties) {
        return REGISTER.registerBlock(name, block, properties);
    }

    public static Stream<? extends Block> getAllBlocks() {
        return REGISTER.getEntries().stream().map(Supplier::get);
    }
}
