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
    public static final BlockEndervator BLACK_ENDERVATOR      = new BlockEndervator(EnumDyeColor.BLACK);
    public static final BlockEndervator BLUE_ENDERVATOR       = new BlockEndervator(EnumDyeColor.BLUE);
    public static final BlockEndervator BROWN_ENDERVATOR      = new BlockEndervator(EnumDyeColor.BROWN);
    public static final BlockEndervator CYAN_ENDERVATOR       = new BlockEndervator(EnumDyeColor.CYAN);
    public static final BlockEndervator GRAY_ENDERVATOR       = new BlockEndervator(EnumDyeColor.GRAY);
    public static final BlockEndervator GREEN_ENDERVATOR      = new BlockEndervator(EnumDyeColor.GREEN);
    public static final BlockEndervator LIGHT_BLUE_ENDERVATOR = new BlockEndervator(EnumDyeColor.LIGHT_BLUE);
    public static final BlockEndervator LIME_ENDERVATOR       = new BlockEndervator(EnumDyeColor.LIME);
    public static final BlockEndervator MAGENTA_ENDERVATOR    = new BlockEndervator(EnumDyeColor.MAGENTA);
    public static final BlockEndervator ORANGE_ENDERVATOR     = new BlockEndervator(EnumDyeColor.ORANGE);
    public static final BlockEndervator PINK_ENDERVATOR       = new BlockEndervator(EnumDyeColor.PINK);
    public static final BlockEndervator PURPLE_ENDERVATOR     = new BlockEndervator(EnumDyeColor.PURPLE);
    public static final BlockEndervator RED_ENDERVATOR        = new BlockEndervator(EnumDyeColor.RED);
    public static final BlockEndervator SILVER_ENDERVATOR     = new BlockEndervator(EnumDyeColor.SILVER);
    public static final BlockEndervator WHITE_ENDERVATOR      = new BlockEndervator(EnumDyeColor.WHITE);
    public static final BlockEndervator YELLOW_ENDERVATOR     = new BlockEndervator(EnumDyeColor.YELLOW);
    
    @SubscribeEvent
    public static void onRegisterBlocks(RegistryEvent.Register<Block> event)
    {
        register(event, BLACK_ENDERVATOR);
        register(event, BLUE_ENDERVATOR);
        register(event, BROWN_ENDERVATOR);
        register(event, CYAN_ENDERVATOR);
        register(event, GRAY_ENDERVATOR);
        register(event, GREEN_ENDERVATOR);
        register(event, LIGHT_BLUE_ENDERVATOR);
        register(event, LIME_ENDERVATOR);
        register(event, MAGENTA_ENDERVATOR);
        register(event, ORANGE_ENDERVATOR);
        register(event, PINK_ENDERVATOR);
        register(event, PURPLE_ENDERVATOR);
        register(event, RED_ENDERVATOR);
        register(event, SILVER_ENDERVATOR);
        register(event, WHITE_ENDERVATOR);
        register(event, YELLOW_ENDERVATOR);
    }
    
    private static void register(RegistryEvent.Register<Block> event, Block block)
    {
        Endervator.getProxy().registerBlock(event, block);
    }
}
