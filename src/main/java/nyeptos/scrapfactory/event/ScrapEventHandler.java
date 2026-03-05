package nyeptos.scrapfactory.event;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.event.entity.player.PlayerDestroyItemEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import nyeptos.scrapfactory.item.ModItems;

public class ScrapEventHandler {

    @SubscribeEvent
    public static void onToolBroken(PlayerDestroyItemEvent event) {
        Player player = event.getEntity();
        if (player.level().isClientSide) return;

        ItemStack brokenStack = event.getOriginal();

        if(brokenStack.getItem() instanceof TieredItem tieredItem) {

            Tier tier = tieredItem.getTier();
            int dropCount = 1;
            var scrapToDrop = ModItems.SCRAP.get();

            if(tier == Tiers.DIAMOND || tier == Tiers.NETHERITE) {
                dropCount = 5;
            } else if(tier == Tiers.IRON) {
                dropCount = 3;
            } else {
                dropCount = 1;
            }

            player.drop(new ItemStack(scrapToDrop, dropCount), true);
        }
    }
}
