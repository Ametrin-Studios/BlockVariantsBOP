package com.ametrin.block_variants.bop.level.block;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.common.ItemAbilities;
import net.neoforged.neoforge.common.ItemAbility;
import org.jetbrains.annotations.Nullable;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.function.Supplier;

public final class FleshSlabBlock extends SlabBlock {
    private final Supplier<SlabBlock> stripResult;

    public FleshSlabBlock(Supplier<SlabBlock> stripResult, Properties properties) {
        super(properties);
        this.stripResult = stripResult;
    }

    @ParametersAreNonnullByDefault
    public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ItemAbility itemAbility, boolean simulate) {
        if (itemAbility != ItemAbilities.SHEARS_TRIM) {
            return  super.getToolModifiedState(state, context, itemAbility, simulate);
        }

        context.getLevel().playSound(null, context.getClickedPos(), SoundEvents.PUMPKIN_CARVE, SoundSource.BLOCKS, 1.0F, 1.0F);
        popResourceFromFace(context.getLevel(), context.getClickedPos(), context.getClickedFace(), new ItemStack(Items.ROTTEN_FLESH));
        return stripResult.get().withPropertiesOf(state);
    }
}
