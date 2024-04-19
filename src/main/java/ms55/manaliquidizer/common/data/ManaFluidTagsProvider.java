package ms55.manaliquidizer.common.data;

import ms55.manaliquidizer.ManaLiquidizer;
import ms55.manaliquidizer.common.fluid.ModFluids;
import ms55.manaliquidizer.common.tags.ManaTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.FluidTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ManaFluidTagsProvider extends FluidTagsProvider {
	public ManaFluidTagsProvider(DataGenerator generatorIn, CompletableFuture<HolderLookup.Provider> p_256600_, @Nullable ExistingFileHelper existingFileHelper) {
		super(generatorIn.getPackOutput(),p_256600_, ManaLiquidizer.MODID,existingFileHelper);
	}

	@Override
	protected void addTags(HolderLookup.Provider p_256366_) {
		tag(ManaTags.MANA_FLUID).add(ModFluids.MANA_FLUID_STILL.get(), ModFluids.MANA_FLUID_FLOWING.get());
	}
}