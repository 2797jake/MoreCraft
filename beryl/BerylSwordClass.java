package net.minecraft.src.joakleymorecraft.beryl;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;
import net.minecraft.src.joakleymorecraft.mod_morecraft;

public class BerylSwordClass extends ItemSword
{

	public BerylSwordClass(ToolMaterial p_i45327_1_) {
		super(p_i45327_1_);
		setCreativeTab(CreativeTabs.tabCombat);
		setTextureName(mod_morecraft.modid + ":" + "SwordPickaxe");
	}



}
