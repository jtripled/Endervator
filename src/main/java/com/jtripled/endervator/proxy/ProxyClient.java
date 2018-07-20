package com.jtripled.endervator.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

/**
 *
 * @author jtripled
 */
public class ProxyClient extends Proxy
{
    @Override
    public void registerItemRenderer(Item item, String variant)
    {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), variant));
    }
}