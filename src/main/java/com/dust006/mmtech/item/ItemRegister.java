package com.dust006.mmtech.item;
import com.dust006.mmtech.MMTech;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
@SuppressWarnings("null")
public class ItemRegister {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MMTech.MODID);
    // Early game materials
    
    public static final DeferredItem<Item> WOOD_BRICK_FORM  = ITEMS.register("wood_brick_mold",() -> new Item(new Item.Properties()
    .stacksTo(1)
    ));
    public static final DeferredItem<Item> COMPRESSED_COKE_CLAY  = ITEMS.register("compressed_coke_clay",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BRICK_COKE_CLAY  = ITEMS.register("brick_coke_clay",() -> new Item(new Item.Properties()));
    // Circuits
    public static final DeferredItem<Item> CIRCUIT1 = ITEMS.register("circuit_t1",() -> new Item(new Item.Properties()));
    public static void register(IEventBus eventbus) {
        ITEMS.register(eventbus);
    }
} 