package net.minecraft.src.joakleymorecraft.staffs;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;



public class EndermanStaff extends Item {

public EndermanStaff() {
this.setCreativeTab(CreativeTabs.tabCombat);
}
/**
* Called whenever this item is equipped and the right mouse button is
* pressed. Args: itemStack, world, entityPlayer
*/
public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
if (world.isRemote) {
return stack;
}
else {
MovingObjectPosition movingobjectposition =
this.getMovingObjectPositionFromPlayer(world, player, true);
if (movingobjectposition == null) {
return stack;
}
else {
if (movingobjectposition.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK) {
int i = movingobjectposition.blockX;
int j = movingobjectposition.blockY;
j++;
j++;
int k = movingobjectposition.blockZ;
EntityEnderman entity = spawnEnt(world, (
double) i, (double) j, (double) k);
if (!player.capabilities.isCreativeMode) {
--stack.
stackSize;
}
}
return stack;
}
}
}

/**
* Spawns the creature specified by the egg's type in the location specified
* by the last three parameters. Parameters: world, entityID, x, y, z.
*/
public static EntityEnderman spawnEnt(World world, double x, double y, double z) {
EntityEnderman entity = new EntityEnderman(world);
entity.setLocationAndAngles(x, y, z, MathHelper.wrapAngleTo180_float(world.rand.nextFloat() * 360.0F), 0.0F);
world.spawnEntityInWorld(entity);
return entity;
}
}