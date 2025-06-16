package com.ametrin.block_variants.bop.data.provider;

import com.ametrin.block_variants.bop.BlockVariantsBOPIntegration;
import com.ametrin.block_variants.bop.registry.BBBlocks;
import com.ametrin.block_variants.bop.registry.BBCreativeModeTabs;
import com.ametrin.block_variants.bop.registry.BBWoodBlocks;
import com.ametrinstudios.ametrin.data.provider.ExtendedLanguageProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.ItemLike;

public final class BBLanguageProvider extends ExtendedLanguageProvider {
    public BBLanguageProvider(PackOutput output) {
        super(output, BlockVariantsBOPIntegration.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add(BBCreativeModeTabs.BLOCK_VARIANTS_BOP_TRANSLATION_KEY, "Block Variants - Biomes O' Plenty");

        family("Flesh").stairs(BBBlocks.FLESH_STAIRS).slab(BBBlocks.FLESH_SLAB).wall(BBBlocks.FLESH_WALL);
        family("Porous Flesh").stairs(BBBlocks.POROUS_FLESH_STAIRS).slab(BBBlocks.POROUS_FLESH_SLAB).wall(BBBlocks.POROUS_FLESH_WALL);
        family("Brimstone").stairs(BBBlocks.BRIMSTONE_STAIRS).slab(BBBlocks.BRIMSTONE_SLAB).wall(BBBlocks.BRIMSTONE_WALL);

        family("Rose Quartz").stairs(BBBlocks.ROSE_QUARTZ_BLOCK_STAIRS).slab(BBBlocks.ROSE_QUARTZ_BLOCK_SLAB).wall(BBBlocks.ROSE_QUARTZ_BLOCK_WALL);

        family("Fir Log").stairs(BBWoodBlocks.FIR_LOG_STAIRS).slab(BBWoodBlocks.FIR_LOG_SLAB);
        family("Stripped Fir Log").stairs(BBWoodBlocks.STRIPPED_FIR_LOG_STAIRS).slab(BBWoodBlocks.STRIPPED_FIR_LOG_SLAB);
        family("Fir Wood").stairs(BBWoodBlocks.FIR_WOOD_STAIRS).slab(BBWoodBlocks.FIR_WOOD_SLAB).wall(BBWoodBlocks.FIR_WOOD_WALL).fence(BBWoodBlocks.FIR_WOOD_FENCE).fenceGate(BBWoodBlocks.FIR_WOOD_FENCE_GATE);
        family("Stripped Fir Wood").stairs(BBWoodBlocks.STRIPPED_FIR_WOOD_STAIRS).slab(BBWoodBlocks.STRIPPED_FIR_WOOD_SLAB).wall(BBWoodBlocks.STRIPPED_FIR_WOOD_WALL).fence(BBWoodBlocks.STRIPPED_FIR_WOOD_FENCE).fenceGate(BBWoodBlocks.STRIPPED_FIR_WOOD_FENCE_GATE);

        family("Pine Log").stairs(BBWoodBlocks.PINE_LOG_STAIRS).slab(BBWoodBlocks.PINE_LOG_SLAB);
        family("Stripped Pine Log").stairs(BBWoodBlocks.STRIPPED_PINE_LOG_STAIRS).slab(BBWoodBlocks.STRIPPED_PINE_LOG_SLAB);
        family("Pine Wood").stairs(BBWoodBlocks.PINE_WOOD_STAIRS).slab(BBWoodBlocks.PINE_WOOD_SLAB).wall(BBWoodBlocks.PINE_WOOD_WALL).fence(BBWoodBlocks.PINE_WOOD_FENCE).fenceGate(BBWoodBlocks.PINE_WOOD_FENCE_GATE);
        family("Stripped Pine Wood").stairs(BBWoodBlocks.STRIPPED_PINE_WOOD_STAIRS).slab(BBWoodBlocks.STRIPPED_PINE_WOOD_SLAB).wall(BBWoodBlocks.STRIPPED_PINE_WOOD_WALL).fence(BBWoodBlocks.STRIPPED_PINE_WOOD_FENCE).fenceGate(BBWoodBlocks.STRIPPED_PINE_WOOD_FENCE_GATE);

        family("Maple Log").stairs(BBWoodBlocks.MAPLE_LOG_STAIRS).slab(BBWoodBlocks.MAPLE_LOG_SLAB);
        family("Stripped Maple Log").stairs(BBWoodBlocks.STRIPPED_MAPLE_LOG_STAIRS).slab(BBWoodBlocks.STRIPPED_MAPLE_LOG_SLAB);
        family("Maple Wood").stairs(BBWoodBlocks.MAPLE_WOOD_STAIRS).slab(BBWoodBlocks.MAPLE_WOOD_SLAB).wall(BBWoodBlocks.MAPLE_WOOD_WALL).fence(BBWoodBlocks.MAPLE_WOOD_FENCE).fenceGate(BBWoodBlocks.MAPLE_WOOD_FENCE_GATE);
        family("Stripped Maple Wood").stairs(BBWoodBlocks.STRIPPED_MAPLE_WOOD_STAIRS).slab(BBWoodBlocks.STRIPPED_MAPLE_WOOD_SLAB).wall(BBWoodBlocks.STRIPPED_MAPLE_WOOD_WALL).fence(BBWoodBlocks.STRIPPED_MAPLE_WOOD_FENCE).fenceGate(BBWoodBlocks.STRIPPED_MAPLE_WOOD_FENCE_GATE);

        family("Redwood Log").stairs(BBWoodBlocks.REDWOOD_LOG_STAIRS).slab(BBWoodBlocks.REDWOOD_LOG_SLAB);
        family("Stripped Redwood Log").stairs(BBWoodBlocks.STRIPPED_REDWOOD_LOG_STAIRS).slab(BBWoodBlocks.STRIPPED_REDWOOD_LOG_SLAB);
        family("Redwood Wood").stairs(BBWoodBlocks.REDWOOD_WOOD_STAIRS).slab(BBWoodBlocks.REDWOOD_WOOD_SLAB).wall(BBWoodBlocks.REDWOOD_WOOD_WALL).fence(BBWoodBlocks.REDWOOD_WOOD_FENCE).fenceGate(BBWoodBlocks.REDWOOD_WOOD_FENCE_GATE);
        family("Stripped Redwood Wood").stairs(BBWoodBlocks.STRIPPED_REDWOOD_WOOD_STAIRS).slab(BBWoodBlocks.STRIPPED_REDWOOD_WOOD_SLAB).wall(BBWoodBlocks.STRIPPED_REDWOOD_WOOD_WALL).fence(BBWoodBlocks.STRIPPED_REDWOOD_WOOD_FENCE).fenceGate(BBWoodBlocks.STRIPPED_REDWOOD_WOOD_FENCE_GATE);

        family("Mahogany Log").stairs(BBWoodBlocks.MAHOGANY_LOG_STAIRS).slab(BBWoodBlocks.MAHOGANY_LOG_SLAB);
        family("Stripped Mahogany Log").stairs(BBWoodBlocks.STRIPPED_MAHOGANY_LOG_STAIRS).slab(BBWoodBlocks.STRIPPED_MAHOGANY_LOG_SLAB);
        family("Mahogany Wood").stairs(BBWoodBlocks.MAHOGANY_WOOD_STAIRS).slab(BBWoodBlocks.MAHOGANY_WOOD_SLAB).wall(BBWoodBlocks.MAHOGANY_WOOD_WALL).fence(BBWoodBlocks.MAHOGANY_WOOD_FENCE).fenceGate(BBWoodBlocks.MAHOGANY_WOOD_FENCE_GATE);
        family("Stripped Mahogany Wood").stairs(BBWoodBlocks.STRIPPED_MAHOGANY_WOOD_STAIRS).slab(BBWoodBlocks.STRIPPED_MAHOGANY_WOOD_SLAB).wall(BBWoodBlocks.STRIPPED_MAHOGANY_WOOD_WALL).fence(BBWoodBlocks.STRIPPED_MAHOGANY_WOOD_FENCE).fenceGate(BBWoodBlocks.STRIPPED_MAHOGANY_WOOD_FENCE_GATE);

        family("Jacaranda Log").stairs(BBWoodBlocks.JACARANDA_LOG_STAIRS).slab(BBWoodBlocks.JACARANDA_LOG_SLAB);
        family("Stripped Jacaranda Log").stairs(BBWoodBlocks.STRIPPED_JACARANDA_LOG_STAIRS).slab(BBWoodBlocks.STRIPPED_JACARANDA_LOG_SLAB);
        family("Jacaranda Wood").stairs(BBWoodBlocks.JACARANDA_WOOD_STAIRS).slab(BBWoodBlocks.JACARANDA_WOOD_SLAB).wall(BBWoodBlocks.JACARANDA_WOOD_WALL).fence(BBWoodBlocks.JACARANDA_WOOD_FENCE).fenceGate(BBWoodBlocks.JACARANDA_WOOD_FENCE_GATE);
        family("Stripped Jacaranda Wood").stairs(BBWoodBlocks.STRIPPED_JACARANDA_WOOD_STAIRS).slab(BBWoodBlocks.STRIPPED_JACARANDA_WOOD_SLAB).wall(BBWoodBlocks.STRIPPED_JACARANDA_WOOD_WALL).fence(BBWoodBlocks.STRIPPED_JACARANDA_WOOD_FENCE).fenceGate(BBWoodBlocks.STRIPPED_JACARANDA_WOOD_FENCE_GATE);

        family("Palm Log").stairs(BBWoodBlocks.PALM_LOG_STAIRS).slab(BBWoodBlocks.PALM_LOG_SLAB);
        family("Stripped Palm Log").stairs(BBWoodBlocks.STRIPPED_PALM_LOG_STAIRS).slab(BBWoodBlocks.STRIPPED_PALM_LOG_SLAB);
        family("Palm Wood").stairs(BBWoodBlocks.PALM_WOOD_STAIRS).slab(BBWoodBlocks.PALM_WOOD_SLAB).wall(BBWoodBlocks.PALM_WOOD_WALL).fence(BBWoodBlocks.PALM_WOOD_FENCE).fenceGate(BBWoodBlocks.PALM_WOOD_FENCE_GATE);
        family("Stripped Palm Wood").stairs(BBWoodBlocks.STRIPPED_PALM_WOOD_STAIRS).slab(BBWoodBlocks.STRIPPED_PALM_WOOD_SLAB).wall(BBWoodBlocks.STRIPPED_PALM_WOOD_WALL).fence(BBWoodBlocks.STRIPPED_PALM_WOOD_FENCE).fenceGate(BBWoodBlocks.STRIPPED_PALM_WOOD_FENCE_GATE);

        family("Willow Log").stairs(BBWoodBlocks.WILLOW_LOG_STAIRS).slab(BBWoodBlocks.WILLOW_LOG_SLAB);
        family("Stripped Willow Log").stairs(BBWoodBlocks.STRIPPED_WILLOW_LOG_STAIRS).slab(BBWoodBlocks.STRIPPED_WILLOW_LOG_SLAB);
        family("Willow Wood").stairs(BBWoodBlocks.WILLOW_WOOD_STAIRS).slab(BBWoodBlocks.WILLOW_WOOD_SLAB).wall(BBWoodBlocks.WILLOW_WOOD_WALL).fence(BBWoodBlocks.WILLOW_WOOD_FENCE).fenceGate(BBWoodBlocks.WILLOW_WOOD_FENCE_GATE);
        family("Stripped Willow Wood").stairs(BBWoodBlocks.STRIPPED_WILLOW_WOOD_STAIRS).slab(BBWoodBlocks.STRIPPED_WILLOW_WOOD_SLAB).wall(BBWoodBlocks.STRIPPED_WILLOW_WOOD_WALL).fence(BBWoodBlocks.STRIPPED_WILLOW_WOOD_FENCE).fenceGate(BBWoodBlocks.STRIPPED_WILLOW_WOOD_FENCE_GATE);

        family("Dead Log").stairs(BBWoodBlocks.DEAD_LOG_STAIRS).slab(BBWoodBlocks.DEAD_LOG_SLAB);
        family("Stripped Dead Log").stairs(BBWoodBlocks.STRIPPED_DEAD_LOG_STAIRS).slab(BBWoodBlocks.STRIPPED_DEAD_LOG_SLAB);
        family("Dead Wood").stairs(BBWoodBlocks.DEAD_WOOD_STAIRS).slab(BBWoodBlocks.DEAD_WOOD_SLAB).wall(BBWoodBlocks.DEAD_WOOD_WALL).fence(BBWoodBlocks.DEAD_WOOD_FENCE).fenceGate(BBWoodBlocks.DEAD_WOOD_FENCE_GATE);
        family("Stripped Dead Wood").stairs(BBWoodBlocks.STRIPPED_DEAD_WOOD_STAIRS).slab(BBWoodBlocks.STRIPPED_DEAD_WOOD_SLAB).wall(BBWoodBlocks.STRIPPED_DEAD_WOOD_WALL).fence(BBWoodBlocks.STRIPPED_DEAD_WOOD_FENCE).fenceGate(BBWoodBlocks.STRIPPED_DEAD_WOOD_FENCE_GATE);

        family("Magic Log").stairs(BBWoodBlocks.MAGIC_LOG_STAIRS).slab(BBWoodBlocks.MAGIC_LOG_SLAB);
        family("Stripped Magic Log").stairs(BBWoodBlocks.STRIPPED_MAGIC_LOG_STAIRS).slab(BBWoodBlocks.STRIPPED_MAGIC_LOG_SLAB);
        family("Magic Wood").stairs(BBWoodBlocks.MAGIC_WOOD_STAIRS).slab(BBWoodBlocks.MAGIC_WOOD_SLAB).wall(BBWoodBlocks.MAGIC_WOOD_WALL).fence(BBWoodBlocks.MAGIC_WOOD_FENCE).fenceGate(BBWoodBlocks.MAGIC_WOOD_FENCE_GATE);
        family("Stripped Magic Wood").stairs(BBWoodBlocks.STRIPPED_MAGIC_WOOD_STAIRS).slab(BBWoodBlocks.STRIPPED_MAGIC_WOOD_SLAB).wall(BBWoodBlocks.STRIPPED_MAGIC_WOOD_WALL).fence(BBWoodBlocks.STRIPPED_MAGIC_WOOD_FENCE).fenceGate(BBWoodBlocks.STRIPPED_MAGIC_WOOD_FENCE_GATE);

        family("Umbran Log").stairs(BBWoodBlocks.UMBRAN_LOG_STAIRS).slab(BBWoodBlocks.UMBRAN_LOG_SLAB);
        family("Stripped Umbran Log").stairs(BBWoodBlocks.STRIPPED_UMBRAN_LOG_STAIRS).slab(BBWoodBlocks.STRIPPED_UMBRAN_LOG_SLAB);
        family("Umbran Wood").stairs(BBWoodBlocks.UMBRAN_WOOD_STAIRS).slab(BBWoodBlocks.UMBRAN_WOOD_SLAB).wall(BBWoodBlocks.UMBRAN_WOOD_WALL).fence(BBWoodBlocks.UMBRAN_WOOD_FENCE).fenceGate(BBWoodBlocks.UMBRAN_WOOD_FENCE_GATE);
        family("Stripped Umbran Wood").stairs(BBWoodBlocks.STRIPPED_UMBRAN_WOOD_STAIRS).slab(BBWoodBlocks.STRIPPED_UMBRAN_WOOD_SLAB).wall(BBWoodBlocks.STRIPPED_UMBRAN_WOOD_WALL).fence(BBWoodBlocks.STRIPPED_UMBRAN_WOOD_FENCE).fenceGate(BBWoodBlocks.STRIPPED_UMBRAN_WOOD_FENCE_GATE);

        family("Hellbark Log").stairs(BBWoodBlocks.HELLBARK_LOG_STAIRS).slab(BBWoodBlocks.HELLBARK_LOG_SLAB);
        family("Stripped Hellbark Log").stairs(BBWoodBlocks.STRIPPED_HELLBARK_LOG_STAIRS).slab(BBWoodBlocks.STRIPPED_HELLBARK_LOG_SLAB);
        family("Hellbark Wood").stairs(BBWoodBlocks.HELLBARK_WOOD_STAIRS).slab(BBWoodBlocks.HELLBARK_WOOD_SLAB).wall(BBWoodBlocks.HELLBARK_WOOD_WALL).fence(BBWoodBlocks.HELLBARK_WOOD_FENCE).fenceGate(BBWoodBlocks.HELLBARK_WOOD_FENCE_GATE);
        family("Stripped Hellbark Wood").stairs(BBWoodBlocks.STRIPPED_HELLBARK_WOOD_STAIRS).slab(BBWoodBlocks.STRIPPED_HELLBARK_WOOD_SLAB).wall(BBWoodBlocks.STRIPPED_HELLBARK_WOOD_WALL).fence(BBWoodBlocks.STRIPPED_HELLBARK_WOOD_FENCE).fenceGate(BBWoodBlocks.STRIPPED_HELLBARK_WOOD_FENCE_GATE);

        family("Empyreal Log").stairs(BBWoodBlocks.EMPYREAL_LOG_STAIRS).slab(BBWoodBlocks.EMPYREAL_LOG_SLAB);
        family("Stripped Empyreal Log").stairs(BBWoodBlocks.STRIPPED_EMPYREAL_LOG_STAIRS).slab(BBWoodBlocks.STRIPPED_EMPYREAL_LOG_SLAB);
        family("Empyreal Wood").stairs(BBWoodBlocks.EMPYREAL_WOOD_STAIRS).slab(BBWoodBlocks.EMPYREAL_WOOD_SLAB).wall(BBWoodBlocks.EMPYREAL_WOOD_WALL).fence(BBWoodBlocks.EMPYREAL_WOOD_FENCE).fenceGate(BBWoodBlocks.EMPYREAL_WOOD_FENCE_GATE);
        family("Stripped Empyreal Wood").stairs(BBWoodBlocks.STRIPPED_EMPYREAL_WOOD_STAIRS).slab(BBWoodBlocks.STRIPPED_EMPYREAL_WOOD_SLAB).wall(BBWoodBlocks.STRIPPED_EMPYREAL_WOOD_WALL).fence(BBWoodBlocks.STRIPPED_EMPYREAL_WOOD_FENCE).fenceGate(BBWoodBlocks.STRIPPED_EMPYREAL_WOOD_FENCE_GATE);

    }

    public FamilyBuilder family(String name) {
        return new FamilyBuilder(this, name);
    }

    public static final class FamilyBuilder {
        private final ExtendedLanguageProvider provider;
        private final String name;

        public FamilyBuilder(ExtendedLanguageProvider provider, String name) {
            this.provider = provider;
            this.name = name;
        }

        public FamilyBuilder stairs(ItemLike stairs) {
            provider.add(stairs.asItem(), name + " Stairs");
            return this;
        }

        public FamilyBuilder slab(ItemLike slab) {
            provider.add(slab.asItem(), name + " Slab");
            return this;
        }

        public FamilyBuilder wall(ItemLike slab) {
            provider.add(slab.asItem(), name + " Wall");
            return this;
        }

        public FamilyBuilder fence(ItemLike slab) {
            provider.add(slab.asItem(), name + " Fence");
            return this;
        }

        public FamilyBuilder fenceGate(ItemLike slab) {
            provider.add(slab.asItem(), name + " Fence Gate");
            return this;
        }
    }
}
