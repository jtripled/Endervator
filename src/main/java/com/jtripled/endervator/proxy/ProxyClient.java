package com.jtripled.endervator.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;

/**
 *
 * @author jtripled
 */
public class ProxyClient extends Proxy
{
    @Override
    public void registerItem(RegistryEvent.Register<Item> event, Item item)
    {
        super.registerItem(event, item);
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "normal"));
    }
}
