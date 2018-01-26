package com.jtripled.endervator;

import com.jtripled.endervator.block.BlockEndervator;
import com.jtripled.endervator.event.EndervatorMessageHandler;
import com.jtripled.voxen.block.IBlockBase;
import com.jtripled.voxen.mod.RegistrationHandler;
import com.jtripled.voxen.mod.Registry;
import com.jtripled.voxen.network.MessageTeleport;
import net.minecraft.item.EnumDyeColor;
import net.minecraftforge.fml.relauncher.Side;

/**
 *
 * @author jtripled
 */
public class EndervatorRegistry implements Registry
{
    public static final IBlockBase BLACK_ENDERVATOR      = new BlockEndervator(EnumDyeColor.BLACK);
    public static final IBlockBase BLUE_ENDERVATOR       = new BlockEndervator(EnumDyeColor.BLUE);
    public static final IBlockBase BROWN_ENDERVATOR      = new BlockEndervator(EnumDyeColor.BROWN);
    public static final IBlockBase CYAN_ENDERVATOR       = new BlockEndervator(EnumDyeColor.CYAN);
    public static final IBlockBase GRAY_ENDERVATOR       = new BlockEndervator(EnumDyeColor.GRAY);
    public static final IBlockBase GREEN_ENDERVATOR      = new BlockEndervator(EnumDyeColor.GREEN);
    public static final IBlockBase LIGHT_BLUE_ENDERVATOR = new BlockEndervator(EnumDyeColor.LIGHT_BLUE);
    public static final IBlockBase LIME_ENDERVATOR       = new BlockEndervator(EnumDyeColor.LIME);
    public static final IBlockBase MAGENTA_ENDERVATOR    = new BlockEndervator(EnumDyeColor.MAGENTA);
    public static final IBlockBase ORANGE_ENDERVATOR     = new BlockEndervator(EnumDyeColor.ORANGE);
    public static final IBlockBase PINK_ENDERVATOR       = new BlockEndervator(EnumDyeColor.PINK);
    public static final IBlockBase PURPLE_ENDERVATOR     = new BlockEndervator(EnumDyeColor.PURPLE);
    public static final IBlockBase RED_ENDERVATOR        = new BlockEndervator(EnumDyeColor.RED);
    public static final IBlockBase SILVER_ENDERVATOR     = new BlockEndervator(EnumDyeColor.SILVER);
    public static final IBlockBase WHITE_ENDERVATOR      = new BlockEndervator(EnumDyeColor.WHITE);
    public static final IBlockBase YELLOW_ENDERVATOR     = new BlockEndervator(EnumDyeColor.YELLOW);
    
    @Override
    public void onRegisterBlocks(RegistrationHandler handler)
    {
        handler.registerBlock(BLACK_ENDERVATOR);
        handler.registerBlock(BLUE_ENDERVATOR);
        handler.registerBlock(BROWN_ENDERVATOR);
        handler.registerBlock(CYAN_ENDERVATOR);
        handler.registerBlock(GRAY_ENDERVATOR);
        handler.registerBlock(GREEN_ENDERVATOR);
        handler.registerBlock(LIGHT_BLUE_ENDERVATOR);
        handler.registerBlock(LIME_ENDERVATOR);
        handler.registerBlock(MAGENTA_ENDERVATOR);
        handler.registerBlock(ORANGE_ENDERVATOR);
        handler.registerBlock(PINK_ENDERVATOR);
        handler.registerBlock(PURPLE_ENDERVATOR);
        handler.registerBlock(RED_ENDERVATOR);
        handler.registerBlock(SILVER_ENDERVATOR);
        handler.registerBlock(WHITE_ENDERVATOR);
        handler.registerBlock(YELLOW_ENDERVATOR);
    }
    
    @Override
    public void onRegisterMessages(RegistrationHandler handler)
    {
        handler.registerMessage(EndervatorMessageHandler.class, MessageTeleport.class, Side.SERVER);
    }
}
