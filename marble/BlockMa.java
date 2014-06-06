package net.minecraft.src.joakleymorecraft.marble;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.World;

public class BlockMa extends Block{


	public BlockMa()
	{
		super(Material.rock);
		setHardness(2.0F);
		setCreativeTab(CreativeTabs.tabBlock);
		setHarvestLevel("pickaxe",0);
		setResistance(7.0F);
	}
}
