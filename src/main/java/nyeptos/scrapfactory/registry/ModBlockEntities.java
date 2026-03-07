package nyeptos.scrapfactory.registry;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import nyeptos.scrapfactory.entity.RamBlockEntity;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =  DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, "scrapfactory");

    public static final RegistryObject<BlockEntityType<RamBlockEntity>> RAM = BLOCK_ENTITIES.register("ram", () -> BlockEntityType.Builder.of(RamBlockEntity::new, ModBlocks.RAM_BLOCK.get()).build(null));

    public static void register (IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
