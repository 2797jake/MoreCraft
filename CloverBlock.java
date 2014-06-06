package net.minecraft.src.joakleymorecraft;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import java.util.List;


import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class CloverBlock extends BlockBush
{
    private static final String[][] flower_names = new String[][] {{"Clover"}};
    public static final String[] names = new String[] {"blueFlower"};
    public static final String[] dandelion = new String[] {"dandelion"};
    @SideOnly(Side.CLIENT)
    private IIcon[] icon;
    private int metadata;

    public CloverBlock(int par1)
    {
        super(Material.plants);
        this.metadata = par1;
        this.setCreativeTab(CreativeTabs.tabDecorations);
        this.setStepSound(Block.soundTypeGrass);
    }

    /**
     * Gets the block's texture. Args: side, meta
     */
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int par1, int par2)
    {
        if (par2 >= this.icon.length)
        {
            par2 = 0;
        }

        return this.icon[par2];
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister par1)
    {
        this.icon = new IIcon[flower_names[this.metadata].length];

        for (int i = 0; i < this.icon.length; ++i)
        {
            this.icon[i] = par1.registerIcon(mod_morecraft.modid + ":mod_plants/" + flower_names[this.metadata][i]);
        }
    }

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    public int damageDropped(int par1)
    {
        return par1;
    }

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item par1, CreativeTabs par2, List par3)
    {
        for (int i = 0; i < this.icon.length; ++i)
        {
            par3.add(new ItemStack(par1, 1, i));
        }
    }

    public static Block getBlock(String par1)
    {
        String[] astring = dandelion;
        int i = astring.length;
        int j;
        String s1;

        for (j = 0; j < i; ++j)
        {
            s1 = astring[j];

            if (s1.equals(par1))
            {
                return mod_morecraft.Clover;
            }
        }

        astring = names;
        i = astring.length;

        for (j = 0; j < i; ++j)
        {
            s1 = astring[j];

            if (s1.equals(par1))
            {
                return mod_morecraft.Clover;
            }
        }

        return null;
    }

    public static int func_149856_f(String par1)
    {
        int i;

        for (i = 0; i < dandelion.length; ++i)
        {
            if (dandelion[i].equals(par1))
            {
                return i;
            }
        }

        for (i = 0; i < names.length; ++i)
        {
            if (names[i].equals(par1))
            {
                return i;
            }
        }

        return 0;
    }
}