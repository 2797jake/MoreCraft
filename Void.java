package net.minecraft.src.joakleymorecraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.World;

public class Void extends Block{


	public Void()
	{
		super(Material.glass);
		setHardness(.5F);
		setCreativeTab(CreativeTabs.tabBlock);
		setHarvestLevel("pickaxe",0);
		setResistance(7.0F);
	}
}