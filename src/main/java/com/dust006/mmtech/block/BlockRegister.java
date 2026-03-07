package com.dust006.mmtech.block;

import com.dust006.mmtech.MMTech;
import com.dust006.mmtech.item.ItemRegister;
import java.util.function.Supplier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.state.BlockBehaviour;
public class BlockRegister {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MMTech.MODID);

    @SuppressWarnings("null")
    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> blockToReturn = BLOCKS.register(name, block);
        registerBlockItem(name, blockToReturn);
        return blockToReturn;
    }
    @SuppressWarnings("null")
    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ItemRegister.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
    @SuppressWarnings("null")
    public static final DeferredBlock<Block> BRICKS_COKE = registerBlock("bricks_coke",
        () -> new Block(BlockBehaviour.Properties.of()
            .strength(4f)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)
    ));
    @SuppressWarnings("null")
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
