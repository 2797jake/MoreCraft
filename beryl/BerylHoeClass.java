package net.minecraft.src.joakleymorecraft.beryl;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;
import net.minecraft.src.joakleymorecraft.mod_morecraft;

public class BerylHoeClass extends ItemHoe
{

	public BerylHoeClass(ToolMaterial p_i45327_1_) {
		super(p_i45327_1_);
		setCreativeTab(CreativeTabs.tabTools);
		setTextureName(mod_morecraft.modid + ":" + "BerylHoe");
	}



}
