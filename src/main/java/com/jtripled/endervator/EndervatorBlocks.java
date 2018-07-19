package com.jtripled.endervator;

import com.jtripled.endervator.block.BlockEndervator;
import net.minecraft.block.Block;
import net.minecraft.item.EnumDyeColor;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 *
 * @author jtripled
 */
@Mod.EventBusSubscriber
public class EndervatorBlocks
{
    public static final Block BLACK_ENDERVATOR      = new BlockEndervator(EnumDyeColor.BLACK);
    public static final Block BLUE_ENDERVATOR       = new BlockEndervator(EnumDyeColor.BLUE);
    public static final Block BROWN_ENDERVATOR      = new BlockEndervator(EnumDyeColor.BROWN);
    public static final Block CYAN_ENDERVATOR       = new BlockEndervator(EnumDyeColor.CYAN);
    public static final Block GRAY_ENDERVATOR       = new BlockEndervator(EnumDyeColor.GRAY);
    public static final Block GREEN_ENDERVATOR      = new BlockEndervator(EnumDyeColor.GREEN);
    public static final Block LIGHT_BLUE_ENDERVATOR = new BlockEndervator(EnumDyeColor.LIGHT_BLUE);
    public static final Block LIME_ENDERVATOR       = new BlockEndervator(EnumDyeColor.LIME);
    public static final Block MAGENTA_ENDERVATOR    = new BlockEndervator(EnumDyeColor.MAGENTA);
    public static final Block ORANGE_ENDERVATOR     = new BlockEndervator(EnumDyeColor.ORANGE);
    public static final Block PINK_ENDERVATOR       = new BlockEndervator(EnumDyeColor.PINK);
    public static final Block PURPLE_ENDERVATOR     = new BlockEndervator(EnumDyeColor.PURPLE);
    public static final Block RED_ENDERVATOR        = new BlockEndervator(EnumDyeColor.RED);
    public static final Block SILVER_ENDERVATOR     = new BlockEndervator(EnumDyeColor.SILVER);
    public static final Block WHITE_ENDERVATOR      = new BlockEndervator(EnumDyeColor.WHITE);
    public static final Block YELLOW_ENDERVATOR     = new BlockEndervator(EnumDyeColor.YELLOW);
    
    @SubscribeEvent
    public static void onRegisterBlocks(RegistryEvent.Register<Block> event)
    {
        event.getRegistry().register(BLACK_ENDERVATOR);
        event.getRegistry().register(BLUE_ENDERVATOR);
        event.getRegistry().register(BROWN_ENDERVATOR);
        event.getRegistry().register(CYAN_ENDERVATOR);
        event.getRegistry().register(GRAY_ENDERVATOR);
        event.getRegistry().register(GREEN_ENDERVATOR);
        event.getRegistry().register(LIGHT_BLUE_ENDERVATOR);
        event.getRegistry().register(LIME_ENDERVATOR);
        event.getRegistry().register(MAGENTA_ENDERVATOR);
        event.getRegistry().register(ORANGE_ENDERVATOR);
        event.getRegistry().register(PINK_ENDERVATOR);
        event.getRegistry().register(PURPLE_ENDERVATOR);
        event.getRegistry().register(RED_ENDERVATOR);
        event.getRegistry().register(SILVER_ENDERVATOR);
        event.getRegistry().register(WHITE_ENDERVATOR);
        event.getRegistry().register(YELLOW_ENDERVATOR);
    }
}
