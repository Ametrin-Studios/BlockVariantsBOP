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
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public final class BBBlocks {
    public static final DeferredRegister.Blocks REGISTER = DeferredRegister.createBlocks(BlockVariantsBOPIntegration.MOD_ID);

    private static final SoundType FLESH_SOUND_TYPE = new SoundType(1.0F, 0.5F, SoundEvents.CORAL_BLOCK_BREAK, SoundEvents.CORAL_BLOCK_STEP, SoundEvents.CORAL_BLOCK_PLACE, SoundEvents.CORAL_BLOCK_HIT, SoundEvents.CORAL_BLOCK_FALL);

    public static final DeferredBlock<FleshStairBlock> FLESH_STAIRS = register("flesh_stairs", properties -> new FleshStairBlock(BBBlocks.POROUS_FLESH_STAIRS, BOPBlocks.FLESH.defaultBlockState(), properties), properties -> properties.mapColor(MapColor.TERRACOTTA_RED).strength(0.4F).sound(FLESH_SOUND_TYPE));
    public static final DeferredBlock<FleshSlabBlock> FLESH_SLAB = register("flesh_slab", properties -> new FleshSlabBlock(BBBlocks.POROUS_FLESH_SLAB, properties), properties -> properties.mapColor(MapColor.TERRACOTTA_RED).strength(0.4F).sound(FLESH_SOUND_TYPE));
    public static final DeferredBlock<FleshWallBlock> FLESH_WALL = register("flesh_wall", properties -> new FleshWallBlock(BBBlocks.POROUS_FLESH_WALL, properties), properties -> properties.mapColor(MapColor.TERRACOTTA_RED).strength(0.4F).sound(FLESH_SOUND_TYPE));

    public static final DeferredBlock<StairBlock> POROUS_FLESH_STAIRS = register("porous_flesh_stairs", properties -> new StairBlock(BOPBlocks.POROUS_FLESH.defaultBlockState(), properties), properties -> properties.mapColor(MapColor.TERRACOTTA_RED).strength(0.4F).sound(FLESH_SOUND_TYPE));
    public static final DeferredBlock<SlabBlock> POROUS_FLESH_SLAB = register("porous_flesh_slab", SlabBlock::new, properties -> properties.mapColor(MapColor.TERRACOTTA_RED).strength(0.4F).sound(FLESH_SOUND_TYPE));
    public static final DeferredBlock<WallBlock> POROUS_FLESH_WALL = register("porous_flesh_wall", WallBlock::new, properties -> properties.mapColor(MapColor.TERRACOTTA_RED).strength(0.4F).sound(FLESH_SOUND_TYPE));

    public static final DeferredBlock<StairBlock> BRIMSTONE_STAIRS = register("brimstone_stairs", properties -> new StairBlock(BOPBlocks.BRIMSTONE.defaultBlockState(), properties), properties -> properties.instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.COLOR_YELLOW).requiresCorrectToolForDrops().strength(0.5F));
    public static final DeferredBlock<SlabBlock> BRIMSTONE_SLAB = register("brimstone_slab", SlabBlock::new, properties -> properties.instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.COLOR_YELLOW).requiresCorrectToolForDrops().strength(0.5F));
    public static final DeferredBlock<WallBlock> BRIMSTONE_WALL = register("brimstone_wall", WallBlock::new, properties -> properties.instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.COLOR_YELLOW).requiresCorrectToolForDrops().strength(0.5F));

    public static final DeferredBlock<StairBlock> ROSE_QUARTZ_BLOCK_STAIRS = register("rose_quartz_block_stairs", properties -> new StairBlock(BOPBlocks.ROSE_QUARTZ_BLOCK.defaultBlockState(), properties), properties -> properties.mapColor(MapColor.CRIMSON_STEM).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops().lightLevel((state) -> 10));
    public static final DeferredBlock<SlabBlock> ROSE_QUARTZ_BLOCK_SLAB = register("rose_quartz_block_slab", SlabBlock::new, properties -> properties.mapColor(MapColor.CRIMSON_STEM).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops().lightLevel((state) -> 10));
    public static final DeferredBlock<WallBlock> ROSE_QUARTZ_BLOCK_WALL = register("rose_quartz_block_wall", WallBlock::new, properties -> properties.mapColor(MapColor.CRIMSON_STEM).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops().lightLevel((state) -> 10));


    // FLOWER PETALS
    public static final DeferredBlock<StairBlock> WHITE_FLOWER_PETAL_STAIRS = register("white_flower_petal_stairs", properties -> new StairBlock(BOPBlocks.WHITE_FLOWER_PETAL_BLOCK.defaultBlockState(), properties), p -> BlockBehaviour.Properties.ofFullCopy(BOPBlocks.WHITE_FLOWER_PETAL_BLOCK));
    public static final DeferredBlock<SlabBlock> WHITE_FLOWER_PETAL_SLAB = register("white_flower_petal_slab", SlabBlock::new, p -> BlockBehaviour.Properties.ofFullCopy(BOPBlocks.WHITE_FLOWER_PETAL_BLOCK));
    public static final DeferredBlock<WallBlock> WHITE_FLOWER_PETAL_WALL = register("white_flower_petal_wall", WallBlock::new, p -> BlockBehaviour.Properties.ofFullCopy(BOPBlocks.WHITE_FLOWER_PETAL_BLOCK));

    public static final DeferredBlock<StairBlock> LIGHT_GRAY_FLOWER_PETAL_STAIRS = register("light_gray_flower_petal_stairs", properties -> new StairBlock(BOPBlocks.LIGHT_GRAY_FLOWER_PETAL_BLOCK.defaultBlockState(), properties), p -> BlockBehaviour.Properties.ofFullCopy(BOPBlocks.LIGHT_GRAY_FLOWER_PETAL_BLOCK));
    public static final DeferredBlock<SlabBlock> LIGHT_GRAY_FLOWER_PETAL_SLAB = register("light_gray_flower_petal_slab", SlabBlock::new, p -> BlockBehaviour.Properties.ofFullCopy(BOPBlocks.LIGHT_GRAY_FLOWER_PETAL_BLOCK));
    public static final DeferredBlock<WallBlock> LIGHT_GRAY_FLOWER_PETAL_WALL = register("light_gray_flower_petal_wall", WallBlock::new, p -> BlockBehaviour.Properties.ofFullCopy(BOPBlocks.LIGHT_GRAY_FLOWER_PETAL_BLOCK));

    public static final DeferredBlock<StairBlock> GRAY_FLOWER_PETAL_STAIRS = register("gray_flower_petal_stairs", properties -> new StairBlock(BOPBlocks.GRAY_FLOWER_PETAL_BLOCK.defaultBlockState(), properties), p -> BlockBehaviour.Properties.ofFullCopy(BOPBlocks.GRAY_FLOWER_PETAL_BLOCK));
    public static final DeferredBlock<SlabBlock> GRAY_FLOWER_PETAL_SLAB = register("gray_flower_petal_slab", SlabBlock::new, p -> BlockBehaviour.Properties.ofFullCopy(BOPBlocks.GRAY_FLOWER_PETAL_BLOCK));
    public static final DeferredBlock<WallBlock> GRAY_FLOWER_PETAL_WALL = register("gray_flower_petal_wall", WallBlock::new, p -> BlockBehaviour.Properties.ofFullCopy(BOPBlocks.GRAY_FLOWER_PETAL_BLOCK));

    public static final DeferredBlock<StairBlock> BLACK_FLOWER_PETAL_STAIRS = register("black_flower_petal_stairs", properties -> new StairBlock(BOPBlocks.BLACK_FLOWER_PETAL_BLOCK.defaultBlockState(), properties), p -> BlockBehaviour.Properties.ofFullCopy(BOPBlocks.BLACK_FLOWER_PETAL_BLOCK));
    public static final DeferredBlock<SlabBlock> BLACK_FLOWER_PETAL_SLAB = register("black_flower_petal_slab", SlabBlock::new, p -> BlockBehaviour.Properties.ofFullCopy(BOPBlocks.BLACK_FLOWER_PETAL_BLOCK));
    public static final DeferredBlock<WallBlock> BLACK_FLOWER_PETAL_WALL = register("black_flower_petal_wall", WallBlock::new, p -> BlockBehaviour.Properties.ofFullCopy(BOPBlocks.BLACK_FLOWER_PETAL_BLOCK));

    public static final DeferredBlock<StairBlock> BROWN_FLOWER_PETAL_STAIRS = register("brown_flower_petal_stairs", properties -> new StairBlock(BOPBlocks.BROWN_FLOWER_PETAL_BLOCK.defaultBlockState(), properties), p -> BlockBehaviour.Properties.ofFullCopy(BOPBlocks.BROWN_FLOWER_PETAL_BLOCK));
    public static final DeferredBlock<SlabBlock> BROWN_FLOWER_PETAL_SLAB = register("brown_flower_petal_slab", SlabBlock::new, p -> BlockBehaviour.Properties.ofFullCopy(BOPBlocks.BROWN_FLOWER_PETAL_BLOCK));
    public static final DeferredBlock<WallBlock> BROWN_FLOWER_PETAL_WALL = register("brown_flower_petal_wall", WallBlock::new, p -> BlockBehaviour.Properties.ofFullCopy(BOPBlocks.BROWN_FLOWER_PETAL_BLOCK));

    public static final DeferredBlock<StairBlock> RED_FLOWER_PETAL_STAIRS = register("red_flower_petal_stairs", properties -> new StairBlock(BOPBlocks.RED_FLOWER_PETAL_BLOCK.defaultBlockState(), properties), p -> BlockBehaviour.Properties.ofFullCopy(BOPBlocks.RED_FLOWER_PETAL_BLOCK));
    public static final DeferredBlock<SlabBlock> RED_FLOWER_PETAL_SLAB = register("red_flower_petal_slab", SlabBlock::new, p -> BlockBehaviour.Properties.ofFullCopy(BOPBlocks.RED_FLOWER_PETAL_BLOCK));
    public static final DeferredBlock<WallBlock> RED_FLOWER_PETAL_WALL = register("red_flower_petal_wall", WallBlock::new, p -> BlockBehaviour.Properties.ofFullCopy(BOPBlocks.RED_FLOWER_PETAL_BLOCK));

    public static final DeferredBlock<StairBlock> ORANGE_FLOWER_PETAL_STAIRS = register("orange_flower_petal_stairs", properties -> new StairBlock(BOPBlocks.ORANGE_FLOWER_PETAL_BLOCK.defaultBlockState(), properties), p -> BlockBehaviour.Properties.ofFullCopy(BOPBlocks.ORANGE_FLOWER_PETAL_BLOCK));
    public static final DeferredBlock<SlabBlock> ORANGE_FLOWER_PETAL_SLAB = register("orange_flower_petal_slab", SlabBlock::new, p -> BlockBehaviour.Properties.ofFullCopy(BOPBlocks.ORANGE_FLOWER_PETAL_BLOCK));
    public static final DeferredBlock<WallBlock> ORANGE_FLOWER_PETAL_WALL = register("orange_flower_petal_wall", WallBlock::new, p -> BlockBehaviour.Properties.ofFullCopy(BOPBlocks.ORANGE_FLOWER_PETAL_BLOCK));

    public static final DeferredBlock<StairBlock> YELLOW_FLOWER_PETAL_STAIRS = register("yellow_flower_petal_stairs", properties -> new StairBlock(BOPBlocks.YELLOW_FLOWER_PETAL_BLOCK.defaultBlockState(), properties), p -> BlockBehaviour.Properties.ofFullCopy(BOPBlocks.YELLOW_FLOWER_PETAL_BLOCK));
    public static final DeferredBlock<SlabBlock> YELLOW_FLOWER_PETAL_SLAB = register("yellow_flower_petal_slab", SlabBlock::new, p -> BlockBehaviour.Properties.ofFullCopy(BOPBlocks.YELLOW_FLOWER_PETAL_BLOCK));
    public static final DeferredBlock<WallBlock> YELLOW_FLOWER_PETAL_WALL = register("yellow_flower_petal_wall", WallBlock::new, p -> BlockBehaviour.Properties.ofFullCopy(BOPBlocks.YELLOW_FLOWER_PETAL_BLOCK));

    public static final DeferredBlock<StairBlock> LIME_FLOWER_PETAL_STAIRS = register("lime_flower_petal_stairs", properties -> new StairBlock(BOPBlocks.LIME_FLOWER_PETAL_BLOCK.defaultBlockState(), properties), p -> BlockBehaviour.Properties.ofFullCopy(BOPBlocks.LIME_FLOWER_PETAL_BLOCK));
    public static final DeferredBlock<SlabBlock> LIME_FLOWER_PETAL_SLAB = register("lime_flower_petal_slab", SlabBlock::new, p -> BlockBehaviour.Properties.ofFullCopy(BOPBlocks.LIME_FLOWER_PETAL_BLOCK));
    public static final DeferredBlock<WallBlock> LIME_FLOWER_PETAL_WALL = register("lime_flower_petal_wall", WallBlock::new, p -> BlockBehaviour.Properties.ofFullCopy(BOPBlocks.LIME_FLOWER_PETAL_BLOCK));

    public static final DeferredBlock<StairBlock> GREEN_FLOWER_PETAL_STAIRS = register("green_flower_petal_stairs", properties -> new StairBlock(BOPBlocks.GREEN_FLOWER_PETAL_BLOCK.defaultBlockState(), properties), p -> BlockBehaviour.Properties.ofFullCopy(BOPBlocks.GREEN_FLOWER_PETAL_BLOCK));
    public static final DeferredBlock<SlabBlock> GREEN_FLOWER_PETAL_SLAB = register("green_flower_petal_slab", SlabBlock::new, p -> BlockBehaviour.Properties.ofFullCopy(BOPBlocks.GREEN_FLOWER_PETAL_BLOCK));
    public static final DeferredBlock<WallBlock> GREEN_FLOWER_PETAL_WALL = register("green_flower_petal_wall", WallBlock::new, p -> BlockBehaviour.Properties.ofFullCopy(BOPBlocks.GREEN_FLOWER_PETAL_BLOCK));

    public static final DeferredBlock<StairBlock> CYAN_FLOWER_PETAL_STAIRS = register("cyan_flower_petal_stairs", properties -> new StairBlock(BOPBlocks.CYAN_FLOWER_PETAL_BLOCK.defaultBlockState(), properties), p -> BlockBehaviour.Properties.ofFullCopy(BOPBlocks.CYAN_FLOWER_PETAL_BLOCK));
    public static final DeferredBlock<SlabBlock> CYAN_FLOWER_PETAL_SLAB = register("cyan_flower_petal_slab", SlabBlock::new, p -> BlockBehaviour.Properties.ofFullCopy(BOPBlocks.CYAN_FLOWER_PETAL_BLOCK));
    public static final DeferredBlock<WallBlock> CYAN_FLOWER_PETAL_WALL = register("cyan_flower_petal_wall", WallBlock::new, p -> BlockBehaviour.Properties.ofFullCopy(BOPBlocks.CYAN_FLOWER_PETAL_BLOCK));

    public static final DeferredBlock<StairBlock> LIGHT_BLUE_FLOWER_PETAL_STAIRS = register("light_blue_flower_petal_stairs", properties -> new StairBlock(BOPBlocks.LIGHT_BLUE_FLOWER_PETAL_BLOCK.defaultBlockState(), properties), p -> BlockBehaviour.Properties.ofFullCopy(BOPBlocks.LIGHT_BLUE_FLOWER_PETAL_BLOCK));
    public static final DeferredBlock<SlabBlock> LIGHT_BLUE_FLOWER_PETAL_SLAB = register("light_blue_flower_petal_slab", SlabBlock::new, p -> BlockBehaviour.Properties.ofFullCopy(BOPBlocks.LIGHT_BLUE_FLOWER_PETAL_BLOCK));
    public static final DeferredBlock<WallBlock> LIGHT_BLUE_FLOWER_PETAL_WALL = register("light_blue_flower_petal_wall", WallBlock::new, p -> BlockBehaviour.Properties.ofFullCopy(BOPBlocks.LIGHT_BLUE_FLOWER_PETAL_BLOCK));

    public static final DeferredBlock<StairBlock> BLUE_FLOWER_PETAL_STAIRS = register("blue_flower_petal_stairs", properties -> new StairBlock(BOPBlocks.BLUE_FLOWER_PETAL_BLOCK.defaultBlockState(), properties), p -> BlockBehaviour.Properties.ofFullCopy(BOPBlocks.BLUE_FLOWER_PETAL_BLOCK));
    public static final DeferredBlock<SlabBlock> BLUE_FLOWER_PETAL_SLAB = register("blue_flower_petal_slab", SlabBlock::new, p -> BlockBehaviour.Properties.ofFullCopy(BOPBlocks.BLUE_FLOWER_PETAL_BLOCK));
    public static final DeferredBlock<WallBlock> BLUE_FLOWER_PETAL_WALL = register("blue_flower_petal_wall", WallBlock::new, p -> BlockBehaviour.Properties.ofFullCopy(BOPBlocks.BLUE_FLOWER_PETAL_BLOCK));

    public static final DeferredBlock<StairBlock> PURPLE_FLOWER_PETAL_STAIRS = register("purple_flower_petal_stairs", properties -> new StairBlock(BOPBlocks.PURPLE_FLOWER_PETAL_BLOCK.defaultBlockState(), properties), p -> BlockBehaviour.Properties.ofFullCopy(BOPBlocks.PURPLE_FLOWER_PETAL_BLOCK));
    public static final DeferredBlock<SlabBlock> PURPLE_FLOWER_PETAL_SLAB = register("purple_flower_petal_slab", SlabBlock::new, p -> BlockBehaviour.Properties.ofFullCopy(BOPBlocks.PURPLE_FLOWER_PETAL_BLOCK));
    public static final DeferredBlock<WallBlock> PURPLE_FLOWER_PETAL_WALL = register("purple_flower_petal_wall", WallBlock::new, p -> BlockBehaviour.Properties.ofFullCopy(BOPBlocks.PURPLE_FLOWER_PETAL_BLOCK));

    public static final DeferredBlock<StairBlock> MAGENTA_FLOWER_PETAL_STAIRS = register("magenta_flower_petal_stairs", properties -> new StairBlock(BOPBlocks.MAGENTA_FLOWER_PETAL_BLOCK.defaultBlockState(), properties), p -> BlockBehaviour.Properties.ofFullCopy(BOPBlocks.MAGENTA_FLOWER_PETAL_BLOCK));
    public static final DeferredBlock<SlabBlock> MAGENTA_FLOWER_PETAL_SLAB = register("magenta_flower_petal_slab", SlabBlock::new, p -> BlockBehaviour.Properties.ofFullCopy(BOPBlocks.MAGENTA_FLOWER_PETAL_BLOCK));
    public static final DeferredBlock<WallBlock> MAGENTA_FLOWER_PETAL_WALL = register("magenta_flower_petal_wall", WallBlock::new, p -> BlockBehaviour.Properties.ofFullCopy(BOPBlocks.MAGENTA_FLOWER_PETAL_BLOCK));

    public static final DeferredBlock<StairBlock> PINK_FLOWER_PETAL_STAIRS = register("pink_flower_petal_stairs", properties -> new StairBlock(BOPBlocks.PINK_FLOWER_PETAL_BLOCK.defaultBlockState(), properties), p -> BlockBehaviour.Properties.ofFullCopy(BOPBlocks.PINK_FLOWER_PETAL_BLOCK));
    public static final DeferredBlock<SlabBlock> PINK_FLOWER_PETAL_SLAB = register("pink_flower_petal_slab", SlabBlock::new, p -> BlockBehaviour.Properties.ofFullCopy(BOPBlocks.PINK_FLOWER_PETAL_BLOCK));
    public static final DeferredBlock<WallBlock> PINK_FLOWER_PETAL_WALL = register("pink_flower_petal_wall", WallBlock::new, p -> BlockBehaviour.Properties.ofFullCopy(BOPBlocks.PINK_FLOWER_PETAL_BLOCK));

    private static <T extends Block> DeferredBlock<T> register(String name, Function<BlockBehaviour.Properties, T> block, UnaryOperator<BlockBehaviour.Properties> properties) {
        return register(name, block, properties, Item.Properties::new);
    }

    private static <T extends Block> DeferredBlock<T> register(String name, Function<BlockBehaviour.Properties, T> block, UnaryOperator<BlockBehaviour.Properties> properties, Supplier<Item.Properties> itemProperties) {
        var registryObject = REGISTER.registerBlock(name, block, properties);
        BBItems.REGISTER.registerItem(name, iproperties -> new BlockItem(registryObject.get(), iproperties), itemProperties);
        return registryObject;
    }

    public static Stream<Block> getAllNonWoodBlocks() {
        return REGISTER.getEntries().stream().map(Supplier::get);
    }
    public static Stream<Block> getAllBlocks() {
        return Stream.concat(getAllNonWoodBlocks(), BBWoodBlocks.getAllWoodBlocks());
    }}
