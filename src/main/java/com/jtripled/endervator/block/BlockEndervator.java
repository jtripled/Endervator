package com.jtripled.endervator.block;

import com.jtripled.endervator.Endervator;
import com.jtripled.voxen.block.BlockBase;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

/**
 *
 * @author jtripled
 */
public final class BlockEndervator extends BlockBase
{
    public static final Queue<Vec3d> TELEPORTS = new LinkedList<>();
    
    public BlockEndervator(EnumDyeColor color)
    {
        super(Endervator.INSTANCE, color.getName() + "_endervator", Material.ROCK, MapColor.getBlockColor(color));
        this.setTab(CreativeTabs.TRANSPORTATION);
        this.setHardness(20.0f);
        this.setResistance(100.0f);
        this.setSoundType(SoundType.STONE);
        this.setItem();
    }
    
    @Override
    public void randomDisplayTick(IBlockState state, World world, BlockPos pos, Random rand)
    {
        Vec3d loc = TELEPORTS.poll();
        while (loc != null)
        {
            for (int j = 0; j < 32; ++j)
            {
                world.spawnParticle(EnumParticleTypes.PORTAL, loc.x, loc.y + world.rand.nextDouble() * 2.0D, loc.z, world.rand.nextGaussian(), 0.0D, world.rand.nextGaussian());
            }
            loc = TELEPORTS.poll();
        }
    }
}
