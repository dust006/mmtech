package com.dust006.mmtech.events;

import com.dust006.mmtech.MMTech;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.ModifyDefaultComponentsEvent;

@EventBusSubscriber(modid = MMTech.MODID)
public class MiscEvents {
    @SubscribeEvent
    public static void modifyComponents(ModifyDefaultComponentsEvent event) {
        
    }
}
