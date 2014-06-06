package net.minecraft.src.joakleymorecraft.morelights;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.World;


public class Lantern extends Block
{
	public Lantern()
	{
		super(Material.glass);
		setHardness(3.0F);
		setCreativeTab(CreativeTabs.tabDecorations);
		setHarvestLevel("pickaxe",0);
		setResistance(3.0F);
		setLightLevel(1);
	}
	
}
