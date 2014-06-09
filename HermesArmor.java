package net.minecraft.src.joakleymorecraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class HermesArmor extends ItemArmor
{
	public HermesArmor(ArmorMaterial material, int armorType, String name)
	{
		super(material, 0, armorType);
		setUnlocalizedName(name);
		setCreativeTab(CreativeTabs.tabCombat);
		setTextureName(mod_morecraft.modid + ":" + getUnlocalizedName().substring(5));
	}


	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem() == mod_morecraft.HermesBoots)
		{
			return mod_morecraft.modid + ":models/armor/HermesArmor.png";
		}
		else
		{
			System.out.println("Invalid Item HermesBoots");
			return null;
		}
	}
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {
	  player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 25, 2));
	}
}