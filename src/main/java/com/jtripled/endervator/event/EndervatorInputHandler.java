package com.jtripled.endervator.event;

import com.jtripled.endervator.Endervator;
import com.jtripled.endervator.block.BlockEndervator;
import com.jtripled.voxen.network.MessageTeleport;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 *
 * @author jtripled
 */
@Mod.EventBusSubscriber
public class EndervatorInputHandler
{
    private static boolean lastSneaking;
    private static boolean lastJumping;
    
    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void onInput(InputEvent event)
    {
        EntityPlayer player = Minecraft.getMinecraft().player;
        boolean sneaking = player.isSneaking();
        boolean jumping = !player.onGround;
        boolean teleport = false;
        EnumFacing direction = null;
        if (lastSneaking != sneaking)
        {
            lastSneaking = sneaking;
            if (sneaking)
            {
                teleport = true;
                direction = EnumFacing.DOWN;
            }
        }
        if (lastJumping != jumping)
        {
            lastJumping = jumping;
            if (jumping)
            {
                teleport = true;
                direction = EnumFacing.UP;
            }
        }
        if (teleport)
        {
            World world = player.getEntityWorld();
            IBlockState fromState = null;
            BlockPos fromPos = new BlockPos(player.posX, player.posY + 0.5D, player.posZ);
            boolean elevator = false;
            for (int i = 0; i < 2; i++)
            {
                fromState = world.getBlockState(fromPos);
                if (fromState.getBlock() instanceof BlockEndervator)
                {
                    elevator = true;
                    break;
                }
                fromPos = fromPos.down();
            }
            if (elevator)
            {
                BlockPos.MutableBlockPos toPos = new BlockPos.MutableBlockPos(fromPos);
                IBlockState toState = null;
                Block fromBlock = fromState.getBlock();
                Block toBlock = null;
                do {
                    toPos.move(direction, 1);
                    if (Math.abs(toPos.getY() - fromPos.getY()) > 256) break;
                    toState = world.getBlockState(toPos);
                    toBlock = toState.getBlock();
                } while (toBlock != fromBlock
                        || toBlock.getMetaFromState(toState) != fromBlock.getMetaFromState(fromState));
                if (toBlock == fromBlock
                        && toBlock.getMetaFromState(toState) == fromBlock.getMetaFromState(fromState))
                {
                    Endervator.INSTANCE.getNetwork().sendToServer(new MessageTeleport(fromPos, toPos));
                }
            }
        }
    }
}
