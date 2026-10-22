package com.ametrin.block_variants.bop.registry;

import biomesoplenty.api.block.BOPBlocks;
import biomesoplenty.core.BiomesOPlenty;
import com.ametrin.block_variants.bop.BlockVariantsBOPIntegration;
import com.ametrin.block_variants.bop.level.block.FleshSlabBlock;
import com.ametrin.block_variants.bop.level.block.FleshStairBlock;
import com.ametrin.block_variants.bop.level.block.FleshWallBlock;
import com.ametrinstudios.ametrin.world.block.helper.BlockRegisterHelper;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

import static com.ametrin.block_variants.bop.BlockVariantsBOPIntegration.locate;

public final class BBBlocks {
    public static final DeferredRegister.Blocks REGISTER = DeferredRegister.createBlocks(BlockVariantsBOPIntegration.MOD_ID);

    private static final SoundType FLESH_SOUND_TYPE = new SoundType(1.0F, 0.5F, SoundEvents.CORAL_BLOCK_BREAK, SoundEvents.CORAL_BLOCK_STEP, SoundEvents.CORAL_BLOCK_PLACE, SoundEvents.CORAL_BLOCK_HIT, SoundEvents.CORAL_BLOCK_FALL);

    static {
        // other mods are not guaranteed to be loaded during RegisterEvent so we have to create the id ourselves
        BBBlocks.REGISTER.addAlias(locate("brimstone_stairs"), Identifier.fromNamespaceAndPath(BiomesOPlenty.MOD_ID, "orpiment_stairs"));
        BBBlocks.REGISTER.addAlias(locate("brimstone_slab"), Identifier.fromNamespaceAndPath(BiomesOPlenty.MOD_ID, "orpiment_slab"));
        BBBlocks.REGISTER.addAlias(locate("brimstone_wall"), Identifier.fromNamespaceAndPath(BiomesOPlenty.MOD_ID, "orpiment_wall"));
    }

    public static ColorCollection<Supplier<Block>> FLOWER_PETALS = new ColorCollection<>(
            ()-> BOPBlocks.WHITE_FLOWER_PETAL_BLOCK,
            ()-> BOPBlocks.ORANGE_FLOWER_PETAL_BLOCK,
            ()-> BOPBlocks.MAGENTA_FLOWER_PETAL_BLOCK,
            ()-> BOPBlocks.LIGHT_BLUE_FLOWER_PETAL_BLOCK,
            ()-> BOPBlocks.YELLOW_FLOWER_PETAL_BLOCK,
            ()-> BOPBlocks.LIME_FLOWER_PETAL_BLOCK,
            ()-> BOPBlocks.PINK_FLOWER_PETAL_BLOCK,
            ()-> BOPBlocks.GRAY_FLOWER_PETAL_BLOCK,
            ()-> BOPBlocks.LIGHT_GRAY_FLOWER_PETAL_BLOCK,
            ()-> BOPBlocks.CYAN_FLOWER_PETAL_BLOCK,
            ()-> BOPBlocks.PURPLE_FLOWER_PETAL_BLOCK,
            ()-> BOPBlocks.BLUE_FLOWER_PETAL_BLOCK,
            ()-> BOPBlocks.BROWN_FLOWER_PETAL_BLOCK,
            ()-> BOPBlocks.GREEN_FLOWER_PETAL_BLOCK,
            ()-> BOPBlocks.RED_FLOWER_PETAL_BLOCK,
            ()-> BOPBlocks.BLACK_FLOWER_PETAL_BLOCK
    );

    public static final DeferredBlock<FleshStairBlock> FLESH_STAIRS = register("flesh_stairs", properties -> new FleshStairBlock(BBBlocks.POROUS_FLESH_STAIRS, BOPBlocks.FLESH.defaultBlockState(), properties), properties -> properties.mapColor(MapColor.TERRACOTTA_RED).strength(0.4F).sound(FLESH_SOUND_TYPE));
    public static final DeferredBlock<FleshSlabBlock> FLESH_SLAB = register("flesh_slab", properties -> new FleshSlabBlock(BBBlocks.POROUS_FLESH_SLAB, properties), properties -> properties.mapColor(MapColor.TERRACOTTA_RED).strength(0.4F).sound(FLESH_SOUND_TYPE));
    public static final DeferredBlock<FleshWallBlock> FLESH_WALL = register("flesh_wall", properties -> new FleshWallBlock(BBBlocks.POROUS_FLESH_WALL, properties), properties -> properties.mapColor(MapColor.TERRACOTTA_RED).strength(0.4F).sound(FLESH_SOUND_TYPE));

    public static final DeferredBlock<StairBlock> POROUS_FLESH_STAIRS = register("porous_flesh_stairs", properties -> new StairBlock(BOPBlocks.POROUS_FLESH.defaultBlockState(), properties), properties -> properties.mapColor(MapColor.TERRACOTTA_RED).strength(0.4F).sound(FLESH_SOUND_TYPE));
    public static final DeferredBlock<SlabBlock> POROUS_FLESH_SLAB = register("porous_flesh_slab", SlabBlock::new, properties -> properties.mapColor(MapColor.TERRACOTTA_RED).strength(0.4F).sound(FLESH_SOUND_TYPE));
    public static final DeferredBlock<WallBlock> POROUS_FLESH_WALL = register("porous_flesh_wall", WallBlock::new, properties -> properties.mapColor(MapColor.TERRACOTTA_RED).strength(0.4F).sound(FLESH_SOUND_TYPE));

    public static final DeferredBlock<StairBlock> ROSE_QUARTZ_BLOCK_STAIRS = register("rose_quartz_block_stairs", properties -> new StairBlock(BOPBlocks.ROSE_QUARTZ_BLOCK.defaultBlockState(), properties), properties -> properties.mapColor(MapColor.CRIMSON_STEM).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops().lightLevel((state) -> 10));
    public static final DeferredBlock<SlabBlock> ROSE_QUARTZ_BLOCK_SLAB = register("rose_quartz_block_slab", SlabBlock::new, properties -> properties.mapColor(MapColor.CRIMSON_STEM).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops().lightLevel((state) -> 10));
    public static final DeferredBlock<WallBlock> ROSE_QUARTZ_BLOCK_WALL = register("rose_quartz_block_wall", WallBlock::new, properties -> properties.mapColor(MapColor.CRIMSON_STEM).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops().lightLevel((state) -> 10));

    public static final ColorCollection<DeferredBlock<StairBlock>> FLOWER_PETAL_STAIRS = ColorCollection.zipMap(
            FLOWER_PETALS, BBBlockItemIds.FLOWER_PETAL_STAIRS, (base, id) -> register(id.block().identifier().getPath(), StairBlock::new, base, BlockRegisterHelper::stairProperties, UnaryOperator.identity())
    );
    public static final ColorCollection<DeferredBlock<SlabBlock>> FLOWER_PETAL_SLAB = ColorCollection.zipMap(
            FLOWER_PETALS, BBBlockItemIds.FLOWER_PETAL_SLAB, (base, id) -> register(id.block().identifier().getPath(), SlabBlock::new, base, BlockRegisterHelper::slabProperties, UnaryOperator.identity())
    );
    public static final ColorCollection<DeferredBlock<WallBlock>> FLOWER_PETAL_WALL = ColorCollection.zipMap(
            FLOWER_PETALS, BBBlockItemIds.FLOWER_PETAL_WALL, (base, id) -> register(id.block().identifier().getPath(), WallBlock::new, base, BlockRegisterHelper::wallProperties, UnaryOperator.identity())
    );

    private static <T extends Block> DeferredBlock<T> register(String name, Function<BlockBehaviour.Properties, T> block, UnaryOperator<BlockBehaviour.Properties> properties) {
        return register(name, block, properties, UnaryOperator.identity());
    }

    private static <T extends Block> DeferredBlock<T> register(String name, BiFunction<BlockState, BlockBehaviour.Properties, T> block, Supplier<Block> base, Function<Block, BlockBehaviour.Properties> properties, UnaryOperator<Item.Properties> itemProperties) {
        return register(name, prop -> block.apply(base.get().defaultBlockState(), prop), p -> properties.apply(base.get()), itemProperties);
    }

    private static <T extends Block> DeferredBlock<T> register(String name, Function<BlockBehaviour.Properties, T> block, Supplier<Block> base, Function<Block, BlockBehaviour.Properties> properties, UnaryOperator<Item.Properties> itemProperties) {
        return register(name, block, p -> properties.apply(base.get()), itemProperties);
    }

    private static <T extends Block> DeferredBlock<T> register(String name, Function<BlockBehaviour.Properties, T> block, UnaryOperator<BlockBehaviour.Properties> properties, UnaryOperator<Item.Properties> itemProperties) {
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
