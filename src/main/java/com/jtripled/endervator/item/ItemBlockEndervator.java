package com.jtripled.endervator.item;

import com.jtripled.endervator.block.BlockEndervator;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;

/**
 *
 * @author jtripled
 */
public final class ItemBlockEndervator extends ItemBlock
{
    public ItemBlockEndervator(BlockEndervator block)
    {
        super(block);
        this.setUnlocalizedName(block.getUnlocalizedName());
        this.setRegistryName(block.getRegistryName());
        this.setCreativeTab(CreativeTabs.TRANSPORTATION);
    }
}
