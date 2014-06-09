package net.minecraft.src.joakleymorecraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class PowerPlateArmor extends ItemArmor
{
	public PowerPlateArmor(ArmorMaterial material, int armorType, String name)
	{
		super(material, 0, armorType);
		setUnlocalizedName(name);
		setCreativeTab(CreativeTabs.tabCombat);
		setTextureName(mod_morecraft.modid + ":" + getUnlocalizedName().substring(5));
	}


	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem() == mod_morecraft.PowerPlateChest)
		{
			return mod_morecraft.modid + ":models/armor/PowerPlateChest.png";
		}
		else
		{
			System.out.println("Invalid Item PowerPlate");
			return null;
		}
	}
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {
		player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 25, 4));
		}
}