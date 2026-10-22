package com.ametrin.block_variants.bop.data;

import com.ametrin.block_variants.bop.data.provider.*;
import com.ametrin.block_variants.bop.data.provider.loot.BBBlockLootProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.neoforge.data.event.GatherDataRegistryEntriesEvent;

@EventBusSubscriber(value = Dist.CLIENT)
public class BBGatherDataEvents {
    @SubscribeEvent
    static void gatherRegistryEntries(final GatherDataRegistryEntriesEvent event) {
        event.lootTable(new LootTableProvider.SubProviderEntry(BBBlockLootProvider::new, LootContextParamSets.BLOCK));
        event.recipe(BBRecipeProvider::new);
    }

    @SubscribeEvent
    static void gatherData(GatherDataEvent.Client event) {
        event.createProvider(BBModelProvider::new);
        event.createProvider(BBLanguageProvider::new);
        event.createProvider(BBDataMapProvider::new);
        event.createProvider(BBBlockTagsProvider::new);
        event.createProvider(BBItemTagsProvider::new);
    }
}
