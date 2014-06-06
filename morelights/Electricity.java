package net.minecraft.src.joakleymorecraft.morelights;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;


public class Electricity extends Block
{
	public Electricity()
	{
		super(Material.glass);
		setHardness(3.0F);
		setCreativeTab(CreativeTabs.tabDecorations);
		setHarvestLevel("pickaxe",0);
		setResistance(3.0F);
		setLightLevel(1);
	}
	
}
