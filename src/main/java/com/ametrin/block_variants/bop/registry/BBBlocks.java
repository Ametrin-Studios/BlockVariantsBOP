package com.ametrin.block_variants.bop.registry;

import biomesoplenty.api.block.BOPBlocks;
import com.ametrin.block_variants.bop.BlockVariantsBOPIntegration;
import com.ametrin.block_variants.bop.level.block.FleshSlabBlock;
import com.ametrin.block_variants.bop.level.block.FleshStairBlock;
import com.ametrin.block_variants.bop.level.block.FleshWallBlock;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public final class BBBlocks {
    public static final DeferredRegister.Blocks REGISTER = DeferredRegister.createBlocks(BlockVariantsBOPIntegration.MOD_ID);

    private static final SoundType FLESH_SOUND_TYPE = new SoundType(1.0F, 0.5F, SoundEvents.CORAL_BLOCK_BREAK, SoundEvents.CORAL_BLOCK_STEP, SoundEvents.CORAL_BLOCK_PLACE, SoundEvents.CORAL_BLOCK_HIT, SoundEvents.CORAL_BLOCK_FALL);

    public static final DeferredBlock<FleshStairBlock> FLESH_STAIRS = register("flesh_stairs", properties -> new FleshStairBlock(BBBlocks.POROUS_FLESH_STAIRS, BOPBlocks.FLESH.defaultBlockState(), properties), BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_RED).strength(0.4F).sound(FLESH_SOUND_TYPE));
    public static final DeferredBlock<FleshSlabBlock> FLESH_SLAB = register("flesh_slab", properties -> new FleshSlabBlock(BBBlocks.POROUS_FLESH_SLAB, properties), BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_RED).strength(0.4F).sound(FLESH_SOUND_TYPE));
    public static final DeferredBlock<FleshWallBlock> FLESH_WALL = register("flesh_wall", properties -> new FleshWallBlock(BBBlocks.POROUS_FLESH_WALL, properties), BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_RED).strength(0.4F).sound(FLESH_SOUND_TYPE));

    public static final DeferredBlock<StairBlock> POROUS_FLESH_STAIRS = register("porous_flesh_stairs", properties -> new StairBlock(BOPBlocks.POROUS_FLESH.defaultBlockState(), properties), BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_RED).strength(0.4F).sound(FLESH_SOUND_TYPE));
    public static final DeferredBlock<SlabBlock> POROUS_FLESH_SLAB = register("porous_flesh_slab", SlabBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_RED).strength(0.4F).sound(FLESH_SOUND_TYPE));
    public static final DeferredBlock<WallBlock> POROUS_FLESH_WALL = register("porous_flesh_wall", WallBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_RED).strength(0.4F).sound(FLESH_SOUND_TYPE));

    public static final DeferredBlock<StairBlock> BRIMSTONE_STAIRS = register("brimstone_stairs", properties -> new StairBlock(BOPBlocks.BRIMSTONE.defaultBlockState(), properties), BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.COLOR_YELLOW).requiresCorrectToolForDrops().strength(0.5F));
    public static final DeferredBlock<SlabBlock> BRIMSTONE_SLAB = register("brimstone_slab", SlabBlock::new, BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.COLOR_YELLOW).requiresCorrectToolForDrops().strength(0.5F));
    public static final DeferredBlock<WallBlock> BRIMSTONE_WALL = register("brimstone_wall", WallBlock::new, BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.COLOR_YELLOW).requiresCorrectToolForDrops().strength(0.5F));

    public static final DeferredBlock<StairBlock> ROSE_QUARTZ_BLOCK_STAIRS = register("rose_quartz_block_stairs", properties -> new StairBlock(BOPBlocks.ROSE_QUARTZ_BLOCK.defaultBlockState(), properties), BlockBehaviour.Properties.of().mapColor(MapColor.CRIMSON_STEM).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops().lightLevel((state) -> 10));
    public static final DeferredBlock<SlabBlock> ROSE_QUARTZ_BLOCK_SLAB = register("rose_quartz_block_slab", SlabBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.CRIMSON_STEM).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops().lightLevel((state) -> 10));
    public static final DeferredBlock<WallBlock> ROSE_QUARTZ_BLOCK_WALL = register("rose_quartz_block_wall", WallBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.CRIMSON_STEM).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops().lightLevel((state) -> 10));

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

    public static Stream<Block> getAllNonWoodBlocks() {
        return REGISTER.getEntries().stream().map(Supplier::get);
    }
    public static Stream<Block> getAllBlocks() {
        return Stream.concat(getAllNonWoodBlocks(), BBWoodBlocks.getAllWoodBlocks());
    }}
