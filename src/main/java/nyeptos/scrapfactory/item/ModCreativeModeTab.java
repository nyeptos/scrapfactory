package nyeptos.scrapfactory.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import nyeptos.scrapfactory.ScrapFactory;
import nyeptos.scrapfactory.block.ModBlocks;

public class ModCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ScrapFactory.MODID);

    public static final RegistryObject<CreativeModeTab> SCRAPFACTORY = CREATIVE_MODE_TABS
            .register("scrapfactory", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(ModItems.SCRAP.get()))
            .title(Component.translatable("creativetab.scrapfactory"))
            .displayItems((pParameters,pOutput) ->{
            pOutput.accept(ModItems.SCRAP.get());
            pOutput.accept(ModBlocks.DEBRIS.get());
    })
    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
