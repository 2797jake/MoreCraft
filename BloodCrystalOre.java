package net.minecraft.src.joakleymorecraft;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class BloodCrystalOre extends Block{


	public BloodCrystalOre()
	{
		super(Material.rock);
		setHardness(3.0F);
		setCreativeTab(CreativeTabs.tabBlock);
		setHarvestLevel("pickaxe",4);
		setResistance(7.0F);
	}
	
	@Override
    public Item getItemDropped(int metadata, Random random, int fortune) {
        return mod_morecraft.BloodCrystal;
    }
}