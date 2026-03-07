package nyeptos.scrapfactory.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import nyeptos.scrapfactory.entity.RamBlockEntity;

public class RamBlock extends BaseEntityBlock {

    public RamBlock(Properties properties){
        super(properties);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new RamBlockEntity(pos, state);
    }
}
