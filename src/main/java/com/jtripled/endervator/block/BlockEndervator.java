package com.jtripled.endervator.block;

import com.jtripled.voxen.block.BlockBase;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumDyeColor;

/**
 *
 * @author jtripled
 */
public final class BlockEndervator extends BlockBase
{
    public BlockEndervator(EnumDyeColor color)
    {
        super(color.getName() + "_endervator", Material.ROCK, MapColor.getBlockColor(color));
        this.setTab(CreativeTabs.TRANSPORTATION);
        this.setHardness(20.0f);
        this.setResistance(100.0f);
        this.setSoundType(SoundType.STONE);
        this.setItem();
    }
}
