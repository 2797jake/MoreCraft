package net.minecraft.src.joakleymorecraft.beryl;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.minecraft.src.joakleymorecraft.mod_morecraft;

public class BerylAxeClass extends ItemAxe 
{

	public BerylAxeClass(ToolMaterial p_i45327_1_) {
		super(p_i45327_1_);
		setCreativeTab(CreativeTabs.tabTools);
		setTextureName(mod_morecraft.modid + ":" + "BerylAxe");
	}



}
