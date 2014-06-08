package net.minecraft.src.joakleymorecraft.beryl;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.src.joakleymorecraft.mod_morecraft;
import net.minecraft.world.World;

public class BerylSwordClass extends ItemSword
{

	public BerylSwordClass(ToolMaterial p_i45327_1_) {
		super(p_i45327_1_);
		setCreativeTab(CreativeTabs.tabCombat);
		setTextureName(mod_morecraft.modid + ":" + "SwordPickaxe");
	}
	/*
	 * public void onCreated(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
        {
        par1ItemStack.addEnchantment(Enchantment.NAMEOFENCHANTMENT, LEVEL);
        
        }
	 */


}
