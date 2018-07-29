package com.jtripled.endervator;

import com.jtripled.endervator.item.ItemBlockEndervator;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 *
 * @author jtripled
 */
@Mod.EventBusSubscriber
public class EndervatorItems
{
    public static final ItemBlockEndervator BLACK_ENDERVATOR_ITEM = new ItemBlockEndervator(EndervatorBlocks.BLACK_ENDERVATOR);
    public static final ItemBlockEndervator BLUE_ENDERVATOR_ITEM = new ItemBlockEndervator(EndervatorBlocks.BLUE_ENDERVATOR);
    public static final ItemBlockEndervator BROWN_ENDERVATOR_ITEM = new ItemBlockEndervator(EndervatorBlocks.BROWN_ENDERVATOR);
    public static final ItemBlockEndervator CYAN_ENDERVATOR_ITEM = new ItemBlockEndervator(EndervatorBlocks.CYAN_ENDERVATOR);
    public static final ItemBlockEndervator GRAY_ENDERVATOR_ITEM = new ItemBlockEndervator(EndervatorBlocks.GRAY_ENDERVATOR);
    public static final ItemBlockEndervator GREEN_ENDERVATOR_ITEM = new ItemBlockEndervator(EndervatorBlocks.GREEN_ENDERVATOR);
    public static final ItemBlockEndervator LIGHT_BLUE_ENDERVATOR_ITEM = new ItemBlockEndervator(EndervatorBlocks.LIGHT_BLUE_ENDERVATOR);
    public static final ItemBlockEndervator LIME_ENDERVATOR_ITEM = new ItemBlockEndervator(EndervatorBlocks.LIME_ENDERVATOR);
    public static final ItemBlockEndervator MAGENTA_ENDERVATOR_ITEM = new ItemBlockEndervator(EndervatorBlocks.MAGENTA_ENDERVATOR);
    public static final ItemBlockEndervator ORANGE_ENDERVATOR_ITEM = new ItemBlockEndervator(EndervatorBlocks.ORANGE_ENDERVATOR);
    public static final ItemBlockEndervator PINK_ENDERVATOR_ITEM = new ItemBlockEndervator(EndervatorBlocks.PINK_ENDERVATOR);
    public static final ItemBlockEndervator PURPLE_ENDERVATOR_ITEM = new ItemBlockEndervator(EndervatorBlocks.PURPLE_ENDERVATOR);
    public static final ItemBlockEndervator RED_ENDERVATOR_ITEM = new ItemBlockEndervator(EndervatorBlocks.RED_ENDERVATOR);
    public static final ItemBlockEndervator SILVER_ENDERVATOR_ITEM = new ItemBlockEndervator(EndervatorBlocks.SILVER_ENDERVATOR);
    public static final ItemBlockEndervator WHITE_ENDERVATOR_ITEM = new ItemBlockEndervator(EndervatorBlocks.WHITE_ENDERVATOR);
    public static final ItemBlockEndervator YELLOW_ENDERVATOR_ITEM = new ItemBlockEndervator(EndervatorBlocks.YELLOW_ENDERVATOR);
    
    @SubscribeEvent
    public static void onRegisterItems(RegistryEvent.Register<Item> event)
    {
        register(event, BLACK_ENDERVATOR_ITEM);
        register(event, BLUE_ENDERVATOR_ITEM);
        register(event, BROWN_ENDERVATOR_ITEM);
        register(event, CYAN_ENDERVATOR_ITEM);
        register(event, GRAY_ENDERVATOR_ITEM);
        register(event, GREEN_ENDERVATOR_ITEM);
        register(event, LIGHT_BLUE_ENDERVATOR_ITEM);
        register(event, LIME_ENDERVATOR_ITEM);
        register(event, MAGENTA_ENDERVATOR_ITEM);
        register(event, ORANGE_ENDERVATOR_ITEM);
        register(event, PINK_ENDERVATOR_ITEM);
        register(event, PURPLE_ENDERVATOR_ITEM);
        register(event, RED_ENDERVATOR_ITEM);
        register(event, SILVER_ENDERVATOR_ITEM);
        register(event, WHITE_ENDERVATOR_ITEM);
        register(event, YELLOW_ENDERVATOR_ITEM);
    }
    
    private static void register(RegistryEvent.Register<Item> event, Item item)
    {
        Endervator.getProxy().registerItem(event, item);
    }
}
