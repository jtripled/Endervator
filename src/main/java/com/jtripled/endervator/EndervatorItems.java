package com.jtripled.endervator;

import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
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
    public static final Item BLACK_ENDERVATOR_ITEM = (new ItemBlock(EndervatorBlocks.BLACK_ENDERVATOR)).setRegistryName(EndervatorBlocks.BLACK_ENDERVATOR.getRegistryName()).setUnlocalizedName(EndervatorBlocks.BLACK_ENDERVATOR.getUnlocalizedName());
    public static final Item BLUE_ENDERVATOR_ITEM = (new ItemBlock(EndervatorBlocks.BLUE_ENDERVATOR)).setRegistryName(EndervatorBlocks.BLUE_ENDERVATOR.getRegistryName()).setUnlocalizedName(EndervatorBlocks.BLUE_ENDERVATOR.getUnlocalizedName());
    public static final Item BROWN_ENDERVATOR_ITEM = (new ItemBlock(EndervatorBlocks.BROWN_ENDERVATOR)).setRegistryName(EndervatorBlocks.BROWN_ENDERVATOR.getRegistryName()).setUnlocalizedName(EndervatorBlocks.BROWN_ENDERVATOR.getUnlocalizedName());
    public static final Item CYAN_ENDERVATOR_ITEM = (new ItemBlock(EndervatorBlocks.CYAN_ENDERVATOR)).setRegistryName(EndervatorBlocks.CYAN_ENDERVATOR.getRegistryName()).setUnlocalizedName(EndervatorBlocks.CYAN_ENDERVATOR.getUnlocalizedName());
    public static final Item GRAY_ENDERVATOR_ITEM = (new ItemBlock(EndervatorBlocks.GRAY_ENDERVATOR)).setRegistryName(EndervatorBlocks.GRAY_ENDERVATOR.getRegistryName()).setUnlocalizedName(EndervatorBlocks.GRAY_ENDERVATOR.getUnlocalizedName());
    public static final Item GREEN_ENDERVATOR_ITEM = (new ItemBlock(EndervatorBlocks.GREEN_ENDERVATOR)).setRegistryName(EndervatorBlocks.GREEN_ENDERVATOR.getRegistryName()).setUnlocalizedName(EndervatorBlocks.GREEN_ENDERVATOR.getUnlocalizedName());
    public static final Item LIGHT_BLUE_ENDERVATOR_ITEM = (new ItemBlock(EndervatorBlocks.LIGHT_BLUE_ENDERVATOR)).setRegistryName(EndervatorBlocks.LIGHT_BLUE_ENDERVATOR.getRegistryName()).setUnlocalizedName(EndervatorBlocks.LIGHT_BLUE_ENDERVATOR.getUnlocalizedName());
    public static final Item LIME_ENDERVATOR_ITEM = (new ItemBlock(EndervatorBlocks.LIME_ENDERVATOR)).setRegistryName(EndervatorBlocks.LIME_ENDERVATOR.getRegistryName()).setUnlocalizedName(EndervatorBlocks.LIME_ENDERVATOR.getUnlocalizedName());
    public static final Item MAGENTA_ENDERVATOR_ITEM = (new ItemBlock(EndervatorBlocks.MAGENTA_ENDERVATOR)).setRegistryName(EndervatorBlocks.MAGENTA_ENDERVATOR.getRegistryName()).setUnlocalizedName(EndervatorBlocks.MAGENTA_ENDERVATOR.getUnlocalizedName());
    public static final Item ORANGE_ENDERVATOR_ITEM = (new ItemBlock(EndervatorBlocks.ORANGE_ENDERVATOR)).setRegistryName(EndervatorBlocks.ORANGE_ENDERVATOR.getRegistryName()).setUnlocalizedName(EndervatorBlocks.ORANGE_ENDERVATOR.getUnlocalizedName());
    public static final Item PINK_ENDERVATOR_ITEM = (new ItemBlock(EndervatorBlocks.PINK_ENDERVATOR)).setRegistryName(EndervatorBlocks.PINK_ENDERVATOR.getRegistryName()).setUnlocalizedName(EndervatorBlocks.PINK_ENDERVATOR.getUnlocalizedName());
    public static final Item PURPLE_ENDERVATOR_ITEM = (new ItemBlock(EndervatorBlocks.PURPLE_ENDERVATOR)).setRegistryName(EndervatorBlocks.PURPLE_ENDERVATOR.getRegistryName()).setUnlocalizedName(EndervatorBlocks.PURPLE_ENDERVATOR.getUnlocalizedName());
    public static final Item RED_ENDERVATOR_ITEM = (new ItemBlock(EndervatorBlocks.RED_ENDERVATOR)).setRegistryName(EndervatorBlocks.RED_ENDERVATOR.getRegistryName()).setUnlocalizedName(EndervatorBlocks.RED_ENDERVATOR.getUnlocalizedName());
    public static final Item SILVER_ENDERVATOR_ITEM = (new ItemBlock(EndervatorBlocks.SILVER_ENDERVATOR)).setRegistryName(EndervatorBlocks.SILVER_ENDERVATOR.getRegistryName()).setUnlocalizedName(EndervatorBlocks.SILVER_ENDERVATOR.getUnlocalizedName());
    public static final Item WHITE_ENDERVATOR_ITEM = (new ItemBlock(EndervatorBlocks.WHITE_ENDERVATOR)).setRegistryName(EndervatorBlocks.WHITE_ENDERVATOR.getRegistryName()).setUnlocalizedName(EndervatorBlocks.WHITE_ENDERVATOR.getUnlocalizedName());
    public static final Item YELLOW_ENDERVATOR_ITEM = (new ItemBlock(EndervatorBlocks.YELLOW_ENDERVATOR)).setRegistryName(EndervatorBlocks.YELLOW_ENDERVATOR.getRegistryName()).setUnlocalizedName(EndervatorBlocks.YELLOW_ENDERVATOR.getUnlocalizedName());
    
    @SubscribeEvent
    public static void onRegisterItems(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().register(BLACK_ENDERVATOR_ITEM);
        event.getRegistry().register(BLUE_ENDERVATOR_ITEM);
        event.getRegistry().register(BROWN_ENDERVATOR_ITEM);
        event.getRegistry().register(CYAN_ENDERVATOR_ITEM);
        event.getRegistry().register(GRAY_ENDERVATOR_ITEM);
        event.getRegistry().register(GREEN_ENDERVATOR_ITEM);
        event.getRegistry().register(LIGHT_BLUE_ENDERVATOR_ITEM);
        event.getRegistry().register(LIME_ENDERVATOR_ITEM);
        event.getRegistry().register(MAGENTA_ENDERVATOR_ITEM);
        event.getRegistry().register(ORANGE_ENDERVATOR_ITEM);
        event.getRegistry().register(PINK_ENDERVATOR_ITEM);
        event.getRegistry().register(PURPLE_ENDERVATOR_ITEM);
        event.getRegistry().register(RED_ENDERVATOR_ITEM);
        event.getRegistry().register(SILVER_ENDERVATOR_ITEM);
        event.getRegistry().register(WHITE_ENDERVATOR_ITEM);
        event.getRegistry().register(YELLOW_ENDERVATOR_ITEM);
        
        Endervator.getProxy().registerItemRenderer(BLACK_ENDERVATOR_ITEM, "normal");
        Endervator.getProxy().registerItemRenderer(BLUE_ENDERVATOR_ITEM, "normal");
        Endervator.getProxy().registerItemRenderer(BROWN_ENDERVATOR_ITEM, "normal");
        Endervator.getProxy().registerItemRenderer(CYAN_ENDERVATOR_ITEM, "normal");
        Endervator.getProxy().registerItemRenderer(GRAY_ENDERVATOR_ITEM, "normal");
        Endervator.getProxy().registerItemRenderer(GREEN_ENDERVATOR_ITEM, "normal");
        Endervator.getProxy().registerItemRenderer(LIGHT_BLUE_ENDERVATOR_ITEM, "normal");
        Endervator.getProxy().registerItemRenderer(LIME_ENDERVATOR_ITEM, "normal");
        Endervator.getProxy().registerItemRenderer(MAGENTA_ENDERVATOR_ITEM, "normal");
        Endervator.getProxy().registerItemRenderer(ORANGE_ENDERVATOR_ITEM, "normal");
        Endervator.getProxy().registerItemRenderer(PINK_ENDERVATOR_ITEM, "normal");
        Endervator.getProxy().registerItemRenderer(PURPLE_ENDERVATOR_ITEM, "normal");
        Endervator.getProxy().registerItemRenderer(RED_ENDERVATOR_ITEM, "normal");
        Endervator.getProxy().registerItemRenderer(SILVER_ENDERVATOR_ITEM, "normal");
        Endervator.getProxy().registerItemRenderer(WHITE_ENDERVATOR_ITEM, "normal");
        Endervator.getProxy().registerItemRenderer(YELLOW_ENDERVATOR_ITEM, "normal");
    }
}
