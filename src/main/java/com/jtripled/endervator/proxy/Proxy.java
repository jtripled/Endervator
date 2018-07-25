package com.jtripled.endervator.proxy;

import com.jtripled.endervator.Endervator;
import com.jtripled.endervator.network.EndervatorClientMessageHandler;
import com.jtripled.endervator.network.EndervatorMessage;
import com.jtripled.endervator.network.EndervatorServerMessageHandler;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

/**
 *
 * @author jtripled
 */
public class Proxy
{
    public void onPreInit(FMLPreInitializationEvent event)
    {
        
    }
    
    public void onInit(FMLInitializationEvent event)
    {
        Endervator.getNetwork().registerMessage(EndervatorServerMessageHandler.class, EndervatorMessage.class, 0, Side.SERVER);
        Endervator.getNetwork().registerMessage(EndervatorClientMessageHandler.class, EndervatorMessage.class, 1, Side.CLIENT);
    }
    
    public void onPostInit(FMLPostInitializationEvent event)
    {
        
    }
    
    public void registerItem(RegistryEvent.Register<Item> event, Item item)
    {
        event.getRegistry().register(item);
    }
    
    public void registerBlock(RegistryEvent.Register<Block> event, Block block)
    {
        event.getRegistry().register(block);
    }
}
