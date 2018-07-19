package com.jtripled.endervator.event;

import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

/**
 *
 * @author jtripled
 */
public class EndervatorMessage implements IMessage
{
    private double x;
    private double z;
    private int y1;
    private int y2;
    
    public EndervatorMessage()
    {
        
    }
    
    public EndervatorMessage(EndervatorMessage message)
    {
        this.x = message.x;
        this.z = message.z;
        this.y1 = message.y1;
        this.y2 = message.y2;
    }
    
    public EndervatorMessage(double x, double z, int y1, int y2)
    {
        this.x = x;
        this.z = z;
        this.y1 = y1;
        this.y2 = y2;
    }
    
    public double getX()
    {
        return x;
    }
    
    public double getZ()
    {
        return z;
    }
    
    public int getY1()
    {
        return y1;
    }
    
    public int getY2()
    {
        return y2;
    }

    @Override
    public void fromBytes(ByteBuf buf)
    {
        x = buf.readDouble();
        z = buf.readDouble();
        y1 = buf.readInt();
        y2 = buf.readInt();
    }

    @Override
    public void toBytes(ByteBuf buf)
    {
        buf.writeDouble(x);
        buf.writeDouble(z);
        buf.writeInt(y1);
        buf.writeInt(y2);
    }
}
