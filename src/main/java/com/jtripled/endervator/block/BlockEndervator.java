package com.jtripled.endervator.block;

import com.jtripled.voxen.block.BlockColored;
import com.jtripled.voxen.util.Color;
import com.jtripled.voxen.util.Tab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

/**
 *
 * @author jtripled
 */
public final class BlockEndervator extends BlockColored
{
    public BlockEndervator(Color color)
    {
        super("endervator", Material.ROCK, color);
        this.setTab(Tab.TRANSPORTATION);
        this.setHardness(20.0f);
        this.setResistance(100.0f);
        this.setSoundType(SoundType.STONE);
        this.setItem();
    }
}
