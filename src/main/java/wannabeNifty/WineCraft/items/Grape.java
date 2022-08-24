package wannabeNifty.WineCraft.items;

import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.EnchantedGoldenAppleItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.GlowLichenBlock;
import net.minecraft.world.level.block.SweetBerryBushBlock;

public class Grape extends Item {

    public Grape(Properties properties) {
        super(properties);
    }

    /*@Override
    public boolean isFoil(ItemStack p_41172_) {
        return true;
    }*/

    @Override
    public InteractionResult onItemUseFirst(ItemStack stack, UseOnContext context) {
        return super.onItemUseFirst(stack, context);
    }

}
