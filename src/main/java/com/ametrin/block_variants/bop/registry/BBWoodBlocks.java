package com.ametrin.block_variants.bop.registry;

import biomesoplenty.api.block.BOPBlocks;
import biomesoplenty.api.block.BOPWoodTypes;
import com.ametrin.block_variants.bop.BlockVariantsBOPIntegration;
import com.ametrinstudios.ametrin.util.WoodTypeCollection;
import com.ametrinstudios.ametrin.world.block.HorizontalAxisAlignedSlabBlock;
import com.ametrinstudios.ametrin.world.block.helper.BlockRegisterHelper;
import com.google.common.collect.ImmutableMap;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.storage.loot.providers.number.ints.ContextIntProviders;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public final class BBWoodBlocks {
    public static final DeferredRegister.Blocks REGISTER = DeferredRegister.createBlocks(BlockVariantsBOPIntegration.MOD_ID);

    // ORIGIN OAK, FIR, PINE, MAPLE, REDWOOD, MAHOGANY, JACARANDA, PALM, WILLOW, DEAD, MAGIC, UMBRAN, HELLBARK, EMPYREAL

    public static final WoodTypeCollection<Supplier<Block>> LOGS = new WoodTypeCollection<>(ImmutableMap.<WoodType, Supplier<Block>>builder()
            .put(BOPWoodTypes.ORIGIN_OAK, () -> BOPBlocks.ORIGIN_OAK_LOG)
            .put(BOPWoodTypes.FIR, () -> BOPBlocks.FIR_LOG)
            .put(BOPWoodTypes.PINE, () -> BOPBlocks.PINE_LOG)
            .put(BOPWoodTypes.MAPLE, () -> BOPBlocks.MAPLE_LOG)
            .put(BOPWoodTypes.REDWOOD, () -> BOPBlocks.REDWOOD_LOG)
            .put(BOPWoodTypes.MAHOGANY, () -> BOPBlocks.MAHOGANY_LOG)
            .put(BOPWoodTypes.JACARANDA, () -> BOPBlocks.JACARANDA_LOG)
            .put(BOPWoodTypes.PALM, () -> BOPBlocks.PALM_LOG)
            .put(BOPWoodTypes.WILLOW, () -> BOPBlocks.WILLOW_LOG)
            .put(BOPWoodTypes.DEAD, () -> BOPBlocks.DEAD_LOG)
            .put(BOPWoodTypes.MAGIC, () -> BOPBlocks.MAGIC_LOG)
            .put(BOPWoodTypes.UMBRAN, () -> BOPBlocks.UMBRAN_LOG)
            .put(BOPWoodTypes.HELLBARK, () -> BOPBlocks.HELLBARK_LOG)
            .put(BOPWoodTypes.EMPYREAL, () -> BOPBlocks.EMPYREAL_LOG)
            .buildOrThrow());

    public static final WoodTypeCollection<Supplier<Block>> STRIPPED_LOGS = new WoodTypeCollection<>(ImmutableMap.<WoodType, Supplier<Block>>builder()
            .put(BOPWoodTypes.ORIGIN_OAK, () -> BOPBlocks.STRIPPED_ORIGIN_OAK_LOG)
            .put(BOPWoodTypes.FIR, () -> BOPBlocks.STRIPPED_FIR_LOG)
            .put(BOPWoodTypes.PINE, () -> BOPBlocks.STRIPPED_PINE_LOG)
            .put(BOPWoodTypes.MAPLE, () -> BOPBlocks.STRIPPED_MAPLE_LOG)
            .put(BOPWoodTypes.REDWOOD, () -> BOPBlocks.STRIPPED_REDWOOD_LOG)
            .put(BOPWoodTypes.MAHOGANY, () -> BOPBlocks.STRIPPED_MAHOGANY_LOG)
            .put(BOPWoodTypes.JACARANDA, () -> BOPBlocks.STRIPPED_JACARANDA_LOG)
            .put(BOPWoodTypes.PALM, () -> BOPBlocks.STRIPPED_PALM_LOG)
            .put(BOPWoodTypes.WILLOW, () -> BOPBlocks.STRIPPED_WILLOW_LOG)
            .put(BOPWoodTypes.DEAD, () -> BOPBlocks.STRIPPED_DEAD_LOG)
            .put(BOPWoodTypes.MAGIC, () -> BOPBlocks.STRIPPED_MAGIC_LOG)
            .put(BOPWoodTypes.UMBRAN, () -> BOPBlocks.STRIPPED_UMBRAN_LOG)
            .put(BOPWoodTypes.HELLBARK, () -> BOPBlocks.STRIPPED_HELLBARK_LOG)
            .put(BOPWoodTypes.EMPYREAL, () -> BOPBlocks.STRIPPED_EMPYREAL_LOG)
            .buildOrThrow());

    public static final WoodTypeCollection<Supplier<Block>> WOODS = new WoodTypeCollection<>(ImmutableMap.<WoodType, Supplier<Block>>builder()
            .put(BOPWoodTypes.ORIGIN_OAK, () -> BOPBlocks.ORIGIN_OAK_WOOD)
            .put(BOPWoodTypes.FIR, () -> BOPBlocks.FIR_WOOD)
            .put(BOPWoodTypes.PINE, () -> BOPBlocks.PINE_WOOD)
            .put(BOPWoodTypes.MAPLE, () -> BOPBlocks.MAPLE_WOOD)
            .put(BOPWoodTypes.REDWOOD, () -> BOPBlocks.REDWOOD_WOOD)
            .put(BOPWoodTypes.MAHOGANY, () -> BOPBlocks.MAHOGANY_WOOD)
            .put(BOPWoodTypes.JACARANDA, () -> BOPBlocks.JACARANDA_WOOD)
            .put(BOPWoodTypes.PALM, () -> BOPBlocks.PALM_WOOD)
            .put(BOPWoodTypes.WILLOW, () -> BOPBlocks.WILLOW_WOOD)
            .put(BOPWoodTypes.DEAD, () -> BOPBlocks.DEAD_WOOD)
            .put(BOPWoodTypes.MAGIC, () -> BOPBlocks.MAGIC_WOOD)
            .put(BOPWoodTypes.UMBRAN, () -> BOPBlocks.UMBRAN_WOOD)
            .put(BOPWoodTypes.HELLBARK, () -> BOPBlocks.HELLBARK_WOOD)
            .put(BOPWoodTypes.EMPYREAL, () -> BOPBlocks.EMPYREAL_WOOD)
            .buildOrThrow());

    public static final WoodTypeCollection<Supplier<Block>> STRIPPED_WOODS = new WoodTypeCollection<>(ImmutableMap.<WoodType, Supplier<Block>>builder()
            .put(BOPWoodTypes.ORIGIN_OAK, () -> BOPBlocks.STRIPPED_ORIGIN_OAK_WOOD)
            .put(BOPWoodTypes.FIR, () -> BOPBlocks.STRIPPED_FIR_WOOD)
            .put(BOPWoodTypes.PINE, () -> BOPBlocks.STRIPPED_PINE_WOOD)
            .put(BOPWoodTypes.MAPLE, () -> BOPBlocks.STRIPPED_MAPLE_WOOD)
            .put(BOPWoodTypes.REDWOOD, () -> BOPBlocks.STRIPPED_REDWOOD_WOOD)
            .put(BOPWoodTypes.MAHOGANY, () -> BOPBlocks.STRIPPED_MAHOGANY_WOOD)
            .put(BOPWoodTypes.JACARANDA, () -> BOPBlocks.STRIPPED_JACARANDA_WOOD)
            .put(BOPWoodTypes.PALM, () -> BOPBlocks.STRIPPED_PALM_WOOD)
            .put(BOPWoodTypes.WILLOW, () -> BOPBlocks.STRIPPED_WILLOW_WOOD)
            .put(BOPWoodTypes.DEAD, () -> BOPBlocks.STRIPPED_DEAD_WOOD)
            .put(BOPWoodTypes.MAGIC, () -> BOPBlocks.STRIPPED_MAGIC_WOOD)
            .put(BOPWoodTypes.UMBRAN, () -> BOPBlocks.STRIPPED_UMBRAN_WOOD)
            .put(BOPWoodTypes.HELLBARK, () -> BOPBlocks.STRIPPED_HELLBARK_WOOD)
            .put(BOPWoodTypes.EMPYREAL, () -> BOPBlocks.STRIPPED_EMPYREAL_WOOD)
            .buildOrThrow());

    public static final WoodTypeCollection<DeferredBlock<StairBlock>> LOG_STAIRS = LOGS.map((type, log) -> {
        return register(type.name().substring(14) + "_log_stairs", StairBlock::new, log, base -> BlockRegisterHelper.stairProperties(base).mapColor(base.defaultMapColor()), p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS));
    });
    public static final WoodTypeCollection<DeferredBlock<SlabBlock>> LOG_SLAB = LOGS.map((type, log) -> {
        return register(type.name().substring(14) + "_log_slab", SlabBlock::new, log, base -> BlockRegisterHelper.slabProperties(base).mapColor(base.defaultMapColor()), p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_SLABS));
    });

    public static final WoodTypeCollection<DeferredBlock<StairBlock>> STRIPPED_LOG_STAIRS = STRIPPED_LOGS.map((type, log) -> {
        return register("stripped_" + type.name().substring(14) + "_log_stairs", StairBlock::new, log, base -> BlockRegisterHelper.stairProperties(base).mapColor(base.defaultMapColor()), p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS));
    });
    public static final WoodTypeCollection<DeferredBlock<SlabBlock>> STRIPPED_LOG_SLAB = STRIPPED_LOGS.map((type, log) -> {
        return register("stripped_" + type.name().substring(14) + "_log_slab", SlabBlock::new, log, base -> BlockRegisterHelper.slabProperties(base).mapColor(base.defaultMapColor()), p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_SLABS));
    });

    public static final WoodTypeCollection<DeferredBlock<StairBlock>> WOOD_STAIRS = WOODS.map((type, log) -> {
        return register(type.name().substring(14) + "_wood_stairs", StairBlock::new, log, BlockRegisterHelper::stairProperties, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS));
    });
    public static final WoodTypeCollection<DeferredBlock<SlabBlock>> WOOD_SLAB = WOODS.map((type, log) -> {
        return register(type.name().substring(14) + "_wood_slab", HorizontalAxisAlignedSlabBlock::new, log, BlockRegisterHelper::slabProperties, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_SLABS));
    });
    public static final WoodTypeCollection<DeferredBlock<WallBlock>> WOOD_WALL = WOODS.map((type, log) -> {
        return register(type.name().substring(14) + "_wood_wall", WallBlock::new, log, BlockRegisterHelper::wallProperties, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS));
    });
    public static final WoodTypeCollection<DeferredBlock<FenceBlock>> WOOD_FENCE = WOODS.map((type, log) -> {
        return register(type.name().substring(14) + "_wood_fence", FenceBlock::new, log, BlockRegisterHelper::fenceProperties, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS));
    });
    public static final WoodTypeCollection<DeferredBlock<FenceGateBlock>> WOOD_FENCE_GATE = WOODS.map((type, log) -> {
        return register(type.name().substring(14) + "_wood_fence_gate", p -> new FenceGateBlock(type, p), log, BlockRegisterHelper::fenceGateProperties, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS));
    });

    public static final WoodTypeCollection<DeferredBlock<StairBlock>> STRIPPED_WOOD_STAIRS = STRIPPED_WOODS.map((type, log) -> {
        return register("stripped_" + type.name().substring(14) + "_wood_stairs", StairBlock::new, log, base -> BlockRegisterHelper.stairProperties(base)/*.mapColor(base.defaultMapColor())*/, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS));
    });
    public static final WoodTypeCollection<DeferredBlock<SlabBlock>> STRIPPED_WOOD_SLAB = STRIPPED_WOODS.map((type, log) -> {
        return register("stripped_" + type.name().substring(14) + "_wood_slab", HorizontalAxisAlignedSlabBlock::new, log, base -> BlockRegisterHelper.slabProperties(base)/*.mapColor(base.defaultMapColor())*/, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_SLABS));
    });
    public static final WoodTypeCollection<DeferredBlock<WallBlock>> STRIPPED_WOOD_WALL = STRIPPED_WOODS.map((type, log) -> {
        return register("stripped_" + type.name().substring(14) + "_wood_wall", WallBlock::new, log, base -> BlockRegisterHelper.wallProperties(base)/*.mapColor(base.defaultMapColor())*/, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS));
    });
    public static final WoodTypeCollection<DeferredBlock<FenceBlock>> STRIPPED_WOOD_FENCE = STRIPPED_WOODS.map((type, log) -> {
        return register("stripped_" + type.name().substring(14) + "_wood_fence", FenceBlock::new, log, base -> BlockRegisterHelper.fenceProperties(base)/*.mapColor(base.defaultMapColor())*/, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS));
    });
    public static final WoodTypeCollection<DeferredBlock<FenceGateBlock>> STRIPPED_WOOD_FENCE_GATE = STRIPPED_WOODS.map((type, log) -> {
        return register("stripped_" + type.name().substring(14) + "_wood_fence_gate", p -> new FenceGateBlock(type, p), log, base -> BlockRegisterHelper.fenceGateProperties(base)/*.mapColor(base.defaultMapColor())*/, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS));
    });

    private static <T extends Block> DeferredBlock<T> register(String name, BiFunction<BlockState, BlockBehaviour.Properties, T> block, Supplier<Block> base, Function<Block, BlockBehaviour.Properties> properties, UnaryOperator<Item.Properties> itemProperties) {
        return register(name, prop -> block.apply(base.get().defaultBlockState(), prop), () -> properties.apply(base.get()), itemProperties);
    }

    private static <T extends Block> DeferredBlock<T> register(String name, Function<BlockBehaviour.Properties, T> block, Supplier<Block> base, Function<Block, BlockBehaviour.Properties> properties, UnaryOperator<Item.Properties> itemProperties) {
        return register(name, block, () -> properties.apply(base.get()), itemProperties);
    }

    private static <T extends Block> DeferredBlock<T> register(String name, Function<BlockBehaviour.Properties, T> block, Supplier<BlockBehaviour.Properties> properties) {
        return register(name, block, properties, UnaryOperator.identity());
    }

    private static <T extends Block> DeferredBlock<T> register(String name, Function<BlockBehaviour.Properties, T> block, Supplier<BlockBehaviour.Properties> properties, UnaryOperator<Item.Properties> itemProperties) {
        var registryObject = REGISTER.registerBlock(name, block, properties);
        BBItems.REGISTER.registerSimpleBlockItem(registryObject, itemProperties);
        return registryObject;
    }

    public static Stream<Block> getAllWoodBlocks() {
        return REGISTER.getEntries().stream().map(Supplier::get);
    }
}
