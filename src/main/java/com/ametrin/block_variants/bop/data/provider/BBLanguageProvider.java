package com.ametrin.block_variants.bop.data.provider;

import com.ametrin.block_variants.bop.BlockVariantsBOPIntegration;
import com.ametrin.block_variants.bop.registry.BBBlocks;
import com.ametrin.block_variants.bop.registry.BBCreativeModeTabs;
import com.ametrin.block_variants.bop.registry.BBWoodBlocks;
import com.ametrinstudios.ametrin.data.provider.ExtendedLanguageProvider;
import net.minecraft.data.PackOutput;

public final class BBLanguageProvider extends ExtendedLanguageProvider {
    public BBLanguageProvider(PackOutput output) {
        super(output, BlockVariantsBOPIntegration.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add(BBCreativeModeTabs.BLOCK_VARIANTS_BOP_TRANSLATION_KEY, "Block Variants - Biomes O' Plenty");

        family("Flesh").stairs(BBBlocks.FLESH_STAIRS).slab(BBBlocks.FLESH_SLAB).wall(BBBlocks.FLESH_WALL);
        family("Porous Flesh").stairs(BBBlocks.POROUS_FLESH_STAIRS).slab(BBBlocks.POROUS_FLESH_SLAB).wall(BBBlocks.POROUS_FLESH_WALL);

        family("Rose Quartz").stairs(BBBlocks.ROSE_QUARTZ_BLOCK_STAIRS).slab(BBBlocks.ROSE_QUARTZ_BLOCK_SLAB).wall(BBBlocks.ROSE_QUARTZ_BLOCK_WALL);

        family("White Flower Petal").stairs(BBBlocks.WHITE_FLOWER_PETAL_STAIRS).slab(BBBlocks.WHITE_FLOWER_PETAL_SLAB).wall(BBBlocks.WHITE_FLOWER_PETAL_WALL);
        family("Light Gray Flower Petal").stairs(BBBlocks.LIGHT_GRAY_FLOWER_PETAL_STAIRS).slab(BBBlocks.LIGHT_GRAY_FLOWER_PETAL_SLAB).wall(BBBlocks.LIGHT_GRAY_FLOWER_PETAL_WALL);
        family("Gray Flower Petal").stairs(BBBlocks.GRAY_FLOWER_PETAL_STAIRS).slab(BBBlocks.GRAY_FLOWER_PETAL_SLAB).wall(BBBlocks.GRAY_FLOWER_PETAL_WALL);
        family("Black Flower Petal").stairs(BBBlocks.BLACK_FLOWER_PETAL_STAIRS).slab(BBBlocks.BLACK_FLOWER_PETAL_SLAB).wall(BBBlocks.BLACK_FLOWER_PETAL_WALL);
        family("Brown Flower Petal").stairs(BBBlocks.BROWN_FLOWER_PETAL_STAIRS).slab(BBBlocks.BROWN_FLOWER_PETAL_SLAB).wall(BBBlocks.BROWN_FLOWER_PETAL_WALL);
        family("Red Flower Petal").stairs(BBBlocks.RED_FLOWER_PETAL_STAIRS).slab(BBBlocks.RED_FLOWER_PETAL_SLAB).wall(BBBlocks.RED_FLOWER_PETAL_WALL);
        family("Orange Flower Petal").stairs(BBBlocks.ORANGE_FLOWER_PETAL_STAIRS.get()).slab(BBBlocks.ORANGE_FLOWER_PETAL_SLAB.get()).wall(BBBlocks.ORANGE_FLOWER_PETAL_WALL.get());
        family("Yellow Flower Petal").stairs(BBBlocks.YELLOW_FLOWER_PETAL_STAIRS.get()).slab(BBBlocks.YELLOW_FLOWER_PETAL_SLAB.get()).wall(BBBlocks.YELLOW_FLOWER_PETAL_WALL.get());
        family("Lime Flower Petal").stairs(BBBlocks.LIME_FLOWER_PETAL_STAIRS.get()).slab(BBBlocks.LIME_FLOWER_PETAL_SLAB.get()).wall(BBBlocks.LIME_FLOWER_PETAL_WALL.get());
        family("Green Flower Petal").stairs(BBBlocks.GREEN_FLOWER_PETAL_STAIRS.get()).slab(BBBlocks.GREEN_FLOWER_PETAL_SLAB.get()).wall(BBBlocks.GREEN_FLOWER_PETAL_WALL.get());
        family("Cyan Flower Petal").stairs(BBBlocks.CYAN_FLOWER_PETAL_STAIRS.get()).slab(BBBlocks.CYAN_FLOWER_PETAL_SLAB.get()).wall(BBBlocks.CYAN_FLOWER_PETAL_WALL.get());
        family("Light Blue Flower Petal").stairs(BBBlocks.LIGHT_BLUE_FLOWER_PETAL_STAIRS.get()).slab(BBBlocks.LIGHT_BLUE_FLOWER_PETAL_SLAB.get()).wall(BBBlocks.LIGHT_BLUE_FLOWER_PETAL_WALL.get());
        family("Blue Flower Petal").stairs(BBBlocks.BLUE_FLOWER_PETAL_STAIRS.get()).slab(BBBlocks.BLUE_FLOWER_PETAL_SLAB.get()).wall(BBBlocks.BLUE_FLOWER_PETAL_WALL.get());
        family("Purple Flower Petal").stairs(BBBlocks.PURPLE_FLOWER_PETAL_STAIRS.get()).slab(BBBlocks.PURPLE_FLOWER_PETAL_SLAB.get()).wall(BBBlocks.PURPLE_FLOWER_PETAL_WALL.get());
        family("Magenta Flower Petal").stairs(BBBlocks.MAGENTA_FLOWER_PETAL_STAIRS.get()).slab(BBBlocks.MAGENTA_FLOWER_PETAL_SLAB.get()).wall(BBBlocks.MAGENTA_FLOWER_PETAL_WALL.get());
        family("Pink Flower Petal").stairs(BBBlocks.PINK_FLOWER_PETAL_STAIRS.get()).slab(BBBlocks.PINK_FLOWER_PETAL_SLAB.get()).wall(BBBlocks.PINK_FLOWER_PETAL_WALL.get());

        BBWoodBlocks.REGISTER.getEntries().forEach(e -> addHumanized(e.get(), e.getId().getPath()));

//        family("Origin Oak Log").family(BBBlockFamilies.LOG.pick(BOPWoodTypes.ORIGIN_OAK).orElseThrow());
//        family("Stripped Origin Oak Log").family(BBBlockFamilies.STRIPPED_LOG.pick(BOPWoodTypes.ORIGIN_OAK).orElseThrow());
//        family("Origin Oak Wood").family(BBBlockFamilies.WOOD.pick(BOPWoodTypes.ORIGIN_OAK).orElseThrow());
//        family("Stripped Origin Oak Wood").family(BBBlockFamilies.STRIPPED_WOOD.pick(BOPWoodTypes.ORIGIN_OAK).orElseThrow());
//
//        family("Fir Log").family(BBBlockFamilies.LOG.pick(BOPWoodTypes.FIR).orElseThrow());
//        family("Stripped Fir Log").family(BBBlockFamilies.STRIPPED_LOG.pick(BOPWoodTypes.FIR).orElseThrow());
//        family("Fir Wood").family(BBBlockFamilies.WOOD.pick(BOPWoodTypes.FIR).orElseThrow());
//        family("Stripped Fir Wood").family(BBBlockFamilies.STRIPPED_WOOD.pick(BOPWoodTypes.FIR).orElseThrow());
//
//        family("Pine Log").family(BBBlockFamilies.PINE_LOG);
//        family("Stripped Pine Log").family(BBBlockFamilies.STRIPPED_PINE_LOG);
//        family("Pine Wood").family(BBBlockFamilies.PINE_WOOD);
//        family("Stripped Pine Wood").family(BBBlockFamilies.STRIPPED_PINE_WOOD);
//
//        family("Maple Log").family(BBBlockFamilies.MAPLE_LOG);
//        family("Stripped Maple Log").family(BBBlockFamilies.STRIPPED_MAPLE_LOG);
//        family("Maple Wood").family(BBBlockFamilies.MAPLE_WOOD);
//        family("Stripped Maple Wood").family(BBBlockFamilies.STRIPPED_MAPLE_WOOD);
//
//        family("Redwood Log").family(BBBlockFamilies.REDWOOD_LOG);
//        family("Stripped Redwood Log").family(BBBlockFamilies.STRIPPED_REDWOOD_LOG);
//        family("Redwood Wood").family(BBBlockFamilies.REDWOOD_WOOD);
//        family("Stripped Redwood Wood").family(BBBlockFamilies.STRIPPED_REDWOOD_WOOD);
//
//        family("Mahogany Log").family(BBBlockFamilies.MAHOGANY_LOG);
//        family("Stripped Mahogany Log").family(BBBlockFamilies.STRIPPED_MAHOGANY_LOG);
//        family("Mahogany Wood").family(BBBlockFamilies.MAHOGANY_WOOD);
//        family("Stripped Mahogany Wood").family(BBBlockFamilies.STRIPPED_MAHOGANY_WOOD);
//
//        family("Jacaranda Log").family(BBBlockFamilies.JACARANDA_LOG);
//        family("Stripped Jacaranda Log").family(BBBlockFamilies.STRIPPED_JACARANDA_LOG);
//        family("Jacaranda Wood").family(BBBlockFamilies.JACARANDA_WOOD);
//        family("Stripped Jacaranda Wood").family(BBBlockFamilies.STRIPPED_JACARANDA_WOOD);
//
//        family("Palm Log").family(BBBlockFamilies.PALM_LOG);
//        family("Stripped Palm Log").family(BBBlockFamilies.STRIPPED_PALM_LOG);
//        family("Palm Wood").family(BBBlockFamilies.PALM_WOOD);
//        family("Stripped Palm Wood").family(BBBlockFamilies.STRIPPED_PALM_WOOD);
//
//        family("Willow Log").family(BBBlockFamilies.WILLOW_LOG);
//        family("Stripped Willow Log").family(BBBlockFamilies.STRIPPED_WILLOW_LOG);
//        family("Willow Wood").family(BBBlockFamilies.WILLOW_WOOD);
//        family("Stripped Willow Wood").family(BBBlockFamilies.STRIPPED_WILLOW_WOOD);
//
//        family("Dead Log").family(BBBlockFamilies.DEAD_LOG);
//        family("Stripped Dead Log").family(BBBlockFamilies.STRIPPED_DEAD_LOG);
//        family("Dead Wood").family(BBBlockFamilies.DEAD_WOOD);
//        family("Stripped Dead Wood").family(BBBlockFamilies.STRIPPED_DEAD_WOOD);
//
//        family("Magic Log").family(BBBlockFamilies.MAGIC_LOG);
//        family("Stripped Magic Log").family(BBBlockFamilies.STRIPPED_MAGIC_LOG);
//        family("Magic Wood").family(BBBlockFamilies.MAGIC_WOOD);
//        family("Stripped Magic Wood").family(BBBlockFamilies.STRIPPED_MAGIC_WOOD);
//
//        family("Umbran Log").family(BBBlockFamilies.UMBRAN_LOG);
//        family("Stripped Umbran Log").family(BBBlockFamilies.STRIPPED_UMBRAN_LOG);
//        family("Umbran Wood").family(BBBlockFamilies.UMBRAN_WOOD);
//        family("Stripped Umbran Wood").family(BBBlockFamilies.STRIPPED_UMBRAN_WOOD);
//
//        family("Hellbark Log").family(BBBlockFamilies.HELLBARK_LOG);
//        family("Stripped Hellbark Log").family(BBBlockFamilies.STRIPPED_HELLBARK_LOG);
//        family("Hellbark Wood").family(BBBlockFamilies.HELLBARK_WOOD);
//        family("Stripped Hellbark Wood").family(BBBlockFamilies.STRIPPED_HELLBARK_WOOD);
//
//        family("Empyreal Log").family(BBBlockFamilies.EMPYREAL_LOG);
//        family("Stripped Empyreal Log").family(BBBlockFamilies.STRIPPED_EMPYREAL_LOG);
//        family("Empyreal Wood").family(BBBlockFamilies.EMPYREAL_WOOD);
//        family("Stripped Empyreal Wood").family(BBBlockFamilies.STRIPPED_EMPYREAL_WOOD);

    }
}
