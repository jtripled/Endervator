package com.jtripled.endervator.event;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

/**
 *
 * @author jtripled
 */
public class EndervatorClientMessageHandler implements IMessageHandler<EndervatorMessage, IMessage>
{
    @Override
    public IMessage onMessage(EndervatorMessage message, MessageContext context)
    {
        EntityPlayerSP player = Minecraft.getMinecraft().player;
        World world = player.world;
        EnumParticleTypes particle = EnumParticleTypes.PORTAL;
        double x = message.getX();
        double z = message.getZ();
        double y1 = message.getY1();
        double y2 = message.getY2();
        
        for (int j = 0; j < 32; ++j)
        {
            world.spawnParticle(particle, x, y1 + 1 + world.rand.nextDouble() * 2.0D, z, world.rand.nextGaussian(), 0.0D, world.rand.nextGaussian());
        }
        
        for (int j = 0; j < 32; ++j)
        {
            world.spawnParticle(particle, x, y2 + 1 + world.rand.nextDouble() * 2.0D, z, world.rand.nextGaussian(), 0.0D, world.rand.nextGaussian());
        }
        
        return null;
    }
}
