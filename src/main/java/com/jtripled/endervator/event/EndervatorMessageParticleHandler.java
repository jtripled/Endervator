package com.jtripled.endervator.event;

import com.jtripled.voxen.network.MessageParticle;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

/**
 *
 * @author jtripled
 */
public class EndervatorMessageParticleHandler implements IMessageHandler<MessageParticle, IMessage>
{
    @Override
    public IMessage onMessage(MessageParticle message, MessageContext context)
    {
        EntityPlayerSP player = Minecraft.getMinecraft().player;
        World world = player.world;
        BlockPos pos = message.getPos();
        EnumParticleTypes particle = message.getParticle();
        
        if (player.getDistanceSq(pos) < 50.0f)
        {
            for (int j = 0; j < 32; ++j)
            {
                world.spawnParticle(particle, pos.getX(), pos.getY() + world.rand.nextDouble() * 2.0D, pos.getZ(), world.rand.nextGaussian(), 0.0D, world.rand.nextGaussian());
            }
        }
        
        return null;
    }
}
