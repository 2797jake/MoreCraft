package net.minecraft.src.joakleymorecraft.bricks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Green extends Block{


	public Green()
	{
		super(Material.rock);
		setHardness(2.0F);
		setCreativeTab(CreativeTabs.tabBlock);
		setHarvestLevel("pickaxe",0);
		setResistance(7.0F);
	}

}