package net.minecraft.src.joakleymorecraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class Shield extends Item
{
	public Shield() {
        maxStackSize = 64;
        setUnlocalizedName("ItemBerylIngot");
        setCreativeTab(CreativeTabs.tabMaterials);
}
	@Override
	public void onUpdate(ItemStack stack, World world, Entity entity, int par4, boolean par5) {
	  super.onUpdate(stack, world, entity, par4, par5);
	  EntityPlayer player = (EntityPlayer) entity;
	  ItemStack equipped = player.getCurrentEquippedItem();
	  if(equipped == stack) {
		   player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));
		   player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));

	  }
	}
}

/*	@Override
	public void onUpdate(ItemStack stack, World world, Entity entity, int par4, boolean par5) {
	  super.onUpdate(stack, world, entity, par4, par5);
	  EntityPlayer player = (EntityPlayer) entity;
	  ItemStack equipped = player.getCurrentEquippedItem();
	  if(equipped == stack) {
		   player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 5, 0));
		   player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));
		   player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));

	  }
	}*/
