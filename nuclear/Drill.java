package net.minecraft.src.joakleymorecraft.nuclear;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.src.joakleymorecraft.mod_morecraft;

public class Drill extends ItemPickaxe 
{

	public Drill(ToolMaterial p_i45327_1_) {
		super(p_i45327_1_);
		setCreativeTab(CreativeTabs.tabTools);
		setTextureName(mod_morecraft.modid + ":" + "Drill");
	}



}
