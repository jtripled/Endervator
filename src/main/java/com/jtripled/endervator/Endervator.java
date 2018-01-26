package com.jtripled.endervator;

import com.jtripled.voxen.mod.ModBase;
import com.jtripled.voxen.mod.Registry;
import com.jtripled.voxen.network.Network;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 *
 * @author jtripled
 */
@Mod(modid = Endervator.ID, name = Endervator.NAME, version = Endervator.VERSION)
@Mod.EventBusSubscriber
public class Endervator extends ModBase
{
    @Mod.Instance(Endervator.ID)
    public static Endervator INSTANCE;
    
    public static Registry REGISTRY;
    
    public static final String ID = "endervator";
    public static final String NAME = "Endervator";
    public static final String VERSION = "1.0";
    
    public static final Network NETWORK = new Network(ID);

    @Override
    public String getID()
    {
        return ID;
    }

    @Override
    public String getName()
    {
        return NAME;
    }

    @Override
    public String getVersion()
    {
        return VERSION;
    }
    
    @Override
    public Network getNetwork()
    {
        return NETWORK;
    }
    
    @Override
    public Registry getRegistry()
    {
        return REGISTRY;
    }
    
    @Mod.EventHandler
    public void onPreInit(FMLPreInitializationEvent event)
    {
        REGISTRY = new EndervatorRegistry();
        preInit(event);
    }
    
    @Mod.EventHandler
    public void onInit(FMLInitializationEvent event)
    {
        init(event);
    }
    
    @Mod.EventHandler
    public void onPostInit(FMLPostInitializationEvent event)
    {
        postInit(event);
    }
}
