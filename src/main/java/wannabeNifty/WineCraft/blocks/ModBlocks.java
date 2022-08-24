package wannabeNifty.WineCraft.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import wannabeNifty.WineCraft.reference.Reference;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS , Reference.MODID);

    public static RegistryObject<TEST_BUSH> TEST_BUSH = BLOCKS.register("test_bush", () ->
            new TEST_BUSH(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH)));
    public static RegistryObject<GrapeBlock> Grape_Block = BLOCKS.register("grape_block", () ->
            new GrapeBlock(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH)));


}
