package net.minecraft.src.joakleymorecraft;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class Lottery extends Block{


	public Lottery()
	{
		super(Material.rock);
		setHardness(3.0F);
		setCreativeTab(CreativeTabs.tabBlock);
		setHarvestLevel("pickaxe",0);
		setResistance(7.0F);
	}
	
	@Override
    public Item getItemDropped(int metadata, Random random, int fortune) {
		int rand = 263 + (int)(Math.random() * ((266 - 263) + 1));
        return Item.getItemById(rand);
    }
}
