package net.minecraft.src.joakleymorecraft.beryl;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.World;


public class BlockBerylOre extends Block
{
	public BlockBerylOre()
	{
		super(Material.rock);
		setHardness(3.0F);
		setCreativeTab(CreativeTabs.tabBlock);
		setHarvestLevel("pickaxe",1);
		setResistance(7.0F);
	}
	
}
