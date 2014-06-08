package net.minecraft.src.joakleymorecraft.staffs;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;



public class WolfStaff extends Item {

public WolfStaff() {
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
j += 2;
int k = movingobjectposition.blockZ;
EntityWolf entity = spawnEnt(world, (
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
public static EntityWolf spawnEnt(World world, double x, double y, double z) {
EntityWolf entity = new EntityWolf(world);
entity.setLocationAndAngles(x, y, z, MathHelper.wrapAngleTo180_float(world.rand.nextFloat() * 360.0F), 0.0F);
world.spawnEntityInWorld(entity);
return entity;
}
}