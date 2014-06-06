package net.minecraft.src.joakleymorecraft.nuclear;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.src.joakleymorecraft.mod_morecraft;
import sun.net.www.content.text.Generic;


public class PlutoniumOre extends Block
{
	public PlutoniumOre()
	{
		super(Material.rock);
		setHardness(25.0F);
		setCreativeTab(CreativeTabs.tabBlock);
		setHarvestLevel("pickaxe",3);
		setResistance(7.0F);
	}
	
	@Override
    public Item getItemDropped(int metadata, Random random, int fortune) {
        return mod_morecraft.Plutonium;
    }
	
}