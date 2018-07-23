package com.jtripled.endervator;

import com.jtripled.endervator.network.EndervatorClientMessageHandler;
import com.jtripled.endervator.network.EndervatorMessage;
import com.jtripled.endervator.network.EndervatorServerMessageHandler;
import com.jtripled.endervator.proxy.Proxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

/**
 *
 * @author jtripled
 */
@Mod(modid = Endervator.ID, name = Endervator.NAME, version = Endervator.VERSION, dependencies = Endervator.DEPENDS)
public class Endervator
{
    public static final String ID = "endervator";
    public static final String NAME = "Endervator";
    public static final String VERSION = "1.0";
    public static final String DEPENDS = "";
    
    @Mod.Instance(ID)
    public static Endervator INSTANCE;
    
    @SidedProxy(serverSide = "com.jtripled." + ID + ".proxy.ProxyServer", clientSide = "com.jtripled." + ID + ".proxy.ProxyClient")
    public static Proxy PROXY;
    
    public static final SimpleNetworkWrapper NETWORK = new SimpleNetworkWrapper(ID);
    
    public static Endervator getInstance()
    {
        return INSTANCE;
    }

    public static String getID()
    {
        return ID;
    }

    public static String getName()
    {
        return NAME;
    }

    public static String getVersion()
    {
        return VERSION;
    }
    
    public static Proxy getProxy()
    {
        return PROXY;
    }
    
    public static SimpleNetworkWrapper getNetwork()
    {
        return NETWORK;
    }
    
    @Mod.EventHandler
    public void onPreInit(FMLPreInitializationEvent event)
    {
        PROXY.registerInputHandler();
    }
    
    @Mod.EventHandler
    public void onInit(FMLInitializationEvent event)
    {
        NETWORK.registerMessage(EndervatorServerMessageHandler.class, EndervatorMessage.class, 0, Side.SERVER);
        NETWORK.registerMessage(EndervatorClientMessageHandler.class, EndervatorMessage.class, 1, Side.CLIENT);
    }
    
    @Mod.EventHandler
    public void onPostInit(FMLPostInitializationEvent event)
    {
        
    }
}
