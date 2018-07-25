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
        Endervator.getProxy().registerBlock(event, BLACK_ENDERVATOR);
        Endervator.getProxy().registerBlock(event, BLUE_ENDERVATOR);
        Endervator.getProxy().registerBlock(event, BROWN_ENDERVATOR);
        Endervator.getProxy().registerBlock(event, CYAN_ENDERVATOR);
        Endervator.getProxy().registerBlock(event, GRAY_ENDERVATOR);
        Endervator.getProxy().registerBlock(event, GREEN_ENDERVATOR);
        Endervator.getProxy().registerBlock(event, LIGHT_BLUE_ENDERVATOR);
        Endervator.getProxy().registerBlock(event, LIME_ENDERVATOR);
        Endervator.getProxy().registerBlock(event, MAGENTA_ENDERVATOR);
        Endervator.getProxy().registerBlock(event, ORANGE_ENDERVATOR);
        Endervator.getProxy().registerBlock(event, PINK_ENDERVATOR);
        Endervator.getProxy().registerBlock(event, PURPLE_ENDERVATOR);
        Endervator.getProxy().registerBlock(event, RED_ENDERVATOR);
        Endervator.getProxy().registerBlock(event, SILVER_ENDERVATOR);
        Endervator.getProxy().registerBlock(event, WHITE_ENDERVATOR);
        Endervator.getProxy().registerBlock(event, YELLOW_ENDERVATOR);
    }
}
