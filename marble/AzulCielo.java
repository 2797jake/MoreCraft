package net.minecraft.src.joakleymorecraft.marble;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class AzulCielo extends Block{


	public AzulCielo()
	{
		super(Material.rock);
		setHardness(2.0F);
		setCreativeTab(CreativeTabs.tabBlock);
		setHarvestLevel("pickaxe",0);
		setResistance(7.0F);
	}

}
