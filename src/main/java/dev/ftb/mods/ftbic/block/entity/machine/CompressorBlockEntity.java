package dev.ftb.mods.ftbic.block.entity.machine;

import dev.ftb.mods.ftbic.block.FTBICElectricBlocks;
import dev.ftb.mods.ftbic.recipe.RecipeCache;
import dev.ftb.mods.ftbic.util.CachedItemProcessingResult;
import net.minecraft.world.item.Item;

public class CompressorBlockEntity extends SimpleRecipeMachineBlockEntity {
	public CompressorBlockEntity() {
		super(FTBICElectricBlocks.COMPRESSOR.blockEntity.get());
		energyCapacity = 8000;
		energyUse = 20;
	}

	@Override
	public CachedItemProcessingResult getResult(RecipeCache cache, Item item) {
		return cache.getCompressingResult(level, item);
	}
}