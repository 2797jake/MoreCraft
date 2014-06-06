package net.minecraft.src.joakleymorecraft.stonevarients;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.World;

public class DarkCarvedStoneBrick extends Block{


	public DarkCarvedStoneBrick()
	{
		super(Material.rock);
		setHardness(1.5F);
		setCreativeTab(CreativeTabs.tabBlock);
		setHarvestLevel("pickaxe",0);
		setResistance(7.0F);
	}
}