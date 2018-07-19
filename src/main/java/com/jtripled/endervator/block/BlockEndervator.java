package com.jtripled.endervator.block;

import com.jtripled.endervator.Endervator;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.util.ResourceLocation;

/**
 *
 * @author jtripled
 */
public final class BlockEndervator extends Block
{
    public static final String NAME = "endervator";
    
    public BlockEndervator(EnumDyeColor color)
    {
        super(Material.ROCK, MapColor.getBlockColor(color));
        this.setUnlocalizedName(color.getName() + "_" + NAME);
        this.setRegistryName(new ResourceLocation(Endervator.ID, color.getName() + "_" + NAME));
        this.setCreativeTab(CreativeTabs.TRANSPORTATION);
        this.setHardness(20.0f);
        this.setResistance(100.0f);
        this.setSoundType(SoundType.STONE);
    }
}
