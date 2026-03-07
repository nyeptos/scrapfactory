package nyeptos.scrapfactory.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import nyeptos.scrapfactory.registry.ModBlockEntities;

public class RamBlockEntity extends BlockEntity {
    private byte value = 0;

    public RamBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.RAM.get(), pos, state);
    }
}
