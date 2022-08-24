package wannabeNifty.WineCraft.items;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import wannabeNifty.WineCraft.blocks.GrapeBlock;
import wannabeNifty.WineCraft.blocks.ModBlocks;
import wannabeNifty.WineCraft.reference.Reference;


public class ModItems {
    public static Grape GRAPE_ITEM;
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS , Reference.MODID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS , Reference.MODID);

    public static final RegistryObject<Item> Grape = ITEMS.register("grape", () ->
            new Grape(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));

   /* public static final RegistryObject<Block> Grape_Block = BLOCKS.register("grape_block", () ->
            new GrapeBlock(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH)));*/

    public static void registerItems(IEventBus bus) {
        ITEMS.register(bus);
    }

    public static RegistryObject<BlockItem> TEST_BUSH_BLOCK_ITEM = ITEMS.register("test_bush", () ->
            new BlockItem(ModBlocks.TEST_BUSH.get() , new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));

    public static RegistryObject<BlockItem> Grape_Block_Item = ITEMS.register("grape_block_item", () ->
            new BlockItem(ModBlocks.Grape_Block.get(), new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));
}
