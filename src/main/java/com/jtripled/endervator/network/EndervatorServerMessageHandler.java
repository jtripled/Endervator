package com.jtripled.endervator.network;

import com.jtripled.endervator.Endervator;
import com.jtripled.endervator.block.BlockEndervator;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.NetworkRegistry.TargetPoint;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

/**
 *
 * @author jtripled
 */
public class EndervatorServerMessageHandler implements IMessageHandler<EndervatorMessage, IMessage>
{
    @Override
    public IMessage onMessage(EndervatorMessage message, MessageContext context)
    {
        EntityPlayerMP player = context.getServerHandler().player;
        BlockPos from = new BlockPos(message.getX(), message.getY1(), message.getZ());
        BlockPos to = new BlockPos(message.getX(), message.getY2(), message.getZ());
        World world = player.world;
        
        // Elevators must be on the same x and z.
        if ((from.getX() != to.getX()) || (from.getZ() != to.getZ()))
            return null;
        
        // Distance between elevators must be > 2 blocks.
        if (Math.abs(from.getY() - to.getY()) < 3)
            return null;
        
        // Player must be close to the elevator.
        if (player.getDistanceSq(from) > 9.0D)
            return null;
        
        IBlockState fromState = world.getBlockState(from);
        IBlockState toState = world.getBlockState(to);
        
        // Must be two air blocks above the destination elevator.
        if (world.getBlockState(to.up()).getBlock() != Blocks.AIR || world.getBlockState(to.up().up()).getBlock() != Blocks.AIR)
            return null;
        
        // Both from and to blocks must be elevators.
        if (!(fromState.getBlock() instanceof BlockEndervator) || !(toState.getBlock() instanceof BlockEndervator))
            return null;
        
        // Elevators must match.
        if (fromState.getBlock() != toState.getBlock())
            return null;
        
        double x = to.getX() - from.getX() + player.posX;
        double y = to.getY() - from.getY() + player.posY;
        double z = to.getZ() - from.getZ() + player.posZ;
        
        player.setPositionAndUpdate(message.getX(), message.getY2() + 1, message.getZ());
        player.world.playSound((EntityPlayer)null, message.getX(), message.getY1(), message.getZ(), SoundEvents.ENTITY_ENDERPEARL_THROW, SoundCategory.NEUTRAL, 0.5F, 0.4F);
        player.world.playSound((EntityPlayer)null, message.getX(), message.getY2(), message.getZ(), SoundEvents.ENTITY_ENDERPEARL_THROW, SoundCategory.NEUTRAL, 0.5F, 0.4F);
        
        Endervator.getNetwork().sendToAllAround(new EndervatorMessage(message), new TargetPoint(world.provider.getDimension(), message.getX(), message.getY1(), message.getZ(), 256));
        
        return null;
    }
}
