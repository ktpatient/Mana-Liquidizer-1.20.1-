package ms55.manaliquidizer;

import ms55.manaliquidizer.common.block.ModBlocks;
import ms55.manaliquidizer.common.fluid.ModFluids;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = ManaLiquidizer.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ManaItemGroup {

	public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ManaLiquidizer.MODID);

	public static final RegistryObject<CreativeModeTab> LIQUIDIZER_TAB = TABS.register("mana_liquidizer_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("itemGroup.liquidizer_tab")).icon(ModBlocks.BLOCK_ITEM_MANA_LIQUIDIZER.get()::getDefaultInstance).build());

	@SubscribeEvent
	public static void buildContents(BuildCreativeModeTabContentsEvent event) {
		if (event.getTab() == LIQUIDIZER_TAB.get()) {
			event.accept(ModBlocks.BLOCK_ITEM_MANA_LIQUIDIZER);
			event.accept(ModFluids.MANA_FLUID_BUCKET);
		}
	}

}
