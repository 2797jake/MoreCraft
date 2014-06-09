package net.minecraft.src.joakleymorecraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.src.joakleymorecraft.mod_morecraft;
import net.minecraft.world.World;

public class ShadowShiv extends ItemSword
{

	public ShadowShiv(ToolMaterial p_i45327_1_) {
		super(p_i45327_1_);
		setCreativeTab(CreativeTabs.tabCombat);
		setTextureName(mod_morecraft.modid + ":" + "BerylAxe");
	}
	
	@Override
	public void onUpdate(ItemStack stack, World world, Entity entity, int par4, boolean par5) {
	  super.onUpdate(stack, world, entity, par4, par5);
	  EntityPlayer player = (EntityPlayer) entity;
	  ItemStack equipped = player.getCurrentEquippedItem();
	  if(equipped == stack) {
	   player.addPotionEffect(new PotionEffect(Potion.invisibility.id, 25, 0));
	  }
	}
}
