package net.minecraft.src.joakleymorecraft.beryl;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.src.joakleymorecraft.mod_morecraft;

public class BerylPickaxeClass extends ItemPickaxe 
{

	public BerylPickaxeClass(ToolMaterial p_i45327_1_) {
		super(p_i45327_1_);
		setCreativeTab(CreativeTabs.tabTools);
		setTextureName(mod_morecraft.modid + ":" + "BerylPickaxe");
	}



}
