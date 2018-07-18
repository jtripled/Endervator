package com.jtripled.endervator;

import com.jtripled.endervator.block.BlockEndervator;
import com.jtripled.endervator.event.EndervatorMessageParticleHandler;
import com.jtripled.endervator.event.EndervatorMessageTeleportHandler;
import com.jtripled.voxen.block.IBlockBase;
import com.jtripled.voxen.mod.RegistrationHandler;
import com.jtripled.voxen.mod.Registry;
import com.jtripled.voxen.network.MessageParticle;
import com.jtripled.voxen.network.MessageTeleport;
import com.jtripled.voxen.util.Color;
import net.minecraftforge.fml.relauncher.Side;

/**
 *
 * @author jtripled
 */
public class EndervatorRegistry implements Registry
{
    public static final IBlockBase BLACK_ENDERVATOR      = new BlockEndervator(Color.BLACK);
    public static final IBlockBase BLUE_ENDERVATOR       = new BlockEndervator(Color.BLUE);
    public static final IBlockBase BROWN_ENDERVATOR      = new BlockEndervator(Color.BROWN);
    public static final IBlockBase CYAN_ENDERVATOR       = new BlockEndervator(Color.CYAN);
    public static final IBlockBase GRAY_ENDERVATOR       = new BlockEndervator(Color.GRAY);
    public static final IBlockBase GREEN_ENDERVATOR      = new BlockEndervator(Color.GREEN);
    public static final IBlockBase LIGHT_BLUE_ENDERVATOR = new BlockEndervator(Color.LIGHT_BLUE);
    public static final IBlockBase LIME_ENDERVATOR       = new BlockEndervator(Color.LIME);
    public static final IBlockBase MAGENTA_ENDERVATOR    = new BlockEndervator(Color.MAGENTA);
    public static final IBlockBase ORANGE_ENDERVATOR     = new BlockEndervator(Color.ORANGE);
    public static final IBlockBase PINK_ENDERVATOR       = new BlockEndervator(Color.PINK);
    public static final IBlockBase PURPLE_ENDERVATOR     = new BlockEndervator(Color.PURPLE);
    public static final IBlockBase RED_ENDERVATOR        = new BlockEndervator(Color.RED);
    public static final IBlockBase SILVER_ENDERVATOR     = new BlockEndervator(Color.SILVER);
    public static final IBlockBase WHITE_ENDERVATOR      = new BlockEndervator(Color.WHITE);
    public static final IBlockBase YELLOW_ENDERVATOR     = new BlockEndervator(Color.YELLOW);
    
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
        handler.registerMessage(EndervatorMessageTeleportHandler.class, MessageTeleport.class, Side.SERVER);
        handler.registerMessage(EndervatorMessageParticleHandler.class, MessageParticle.class, Side.CLIENT);
    }
}
