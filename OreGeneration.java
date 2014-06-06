package net.minecraft.src.joakleymorecraft;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class OreGeneration implements IWorldGenerator 
{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId)
		{
			case -1:
				generateInNether(world, random, chunkX*16, chunkZ*16);
				break;
			case 0:
				generateInOverworld(world, random, chunkX*16, chunkZ*16);
				break;
			case 1:
				generateInEnd(world, random, chunkX*16, chunkZ*16);
				break;
		}
	}

	private void generateInEnd(World world, Random random, int i, int j) {
		
	}

	private void generateInOverworld(World world, Random random, int i, int j) {
		
		for(int p = 0; p<10;p++) //x<NUMBER is rarity
		{
			int firstBlockXCoordd = i + random.nextInt(16);
			int firstBlockYCoordd = random.nextInt(64);//256, max y coordinate
			int firstBlockZCoordd = j + random.nextInt(16);
			
			(new WorldGenMinable(mod_morecraft.BerylOre, 4)).generate(world, random, firstBlockXCoordd, firstBlockYCoordd, firstBlockZCoordd);
		}
		
		
		
		
		for(int p = 0; p<6;p++) //x<NUMBER is rarity
		{
			int firstBlockXCoordd = i + random.nextInt(16);
			int firstBlockYCoordd = random.nextInt(64);//256, max y coordinate
			int firstBlockZCoordd = j + random.nextInt(16);
			
			(new WorldGenMinable(mod_morecraft.CoralRed, 20)).generate(world, random, firstBlockXCoordd, firstBlockYCoordd, firstBlockZCoordd);
		}
		
		
		
		for(int p = 0; p<6;p++) //x<NUMBER is rarity
		{
			int firstBlockXCoordd = i + random.nextInt(16);
			int firstBlockYCoordd = random.nextInt(64);//256, max y coordinate
			int firstBlockZCoordd = j + random.nextInt(16);
			
			(new WorldGenMinable(mod_morecraft.Bucova, 20)).generate(world, random, firstBlockXCoordd, firstBlockYCoordd, firstBlockZCoordd);
		}
		
		
		
		for(int p = 0; p<6;p++) //x<NUMBER is rarity
		{
			int firstBlockXCoordd = i + random.nextInt(16);
			int firstBlockYCoordd = random.nextInt(64);//256, max y coordinate
			int firstBlockZCoordd = j + random.nextInt(16);
			
			(new WorldGenMinable(mod_morecraft.GoldenJade, 20)).generate(world, random, firstBlockXCoordd, firstBlockYCoordd, firstBlockZCoordd);
		}
		
		
		for(int p = 0; p<6;p++) //x<NUMBER is rarity
		{
			int firstBlockXCoordd = i + random.nextInt(16);
			int firstBlockYCoordd = random.nextInt(64);//256, max y coordinate
			int firstBlockZCoordd = j + random.nextInt(16);
			
			(new WorldGenMinable(mod_morecraft.VerdeGreen, 20)).generate(world, random, firstBlockXCoordd, firstBlockYCoordd, firstBlockZCoordd);
		}
		
		
		for(int p = 0; p<6;p++) //x<NUMBER is rarity
		{
			int firstBlockXCoordd = i + random.nextInt(16);
			int firstBlockYCoordd = random.nextInt(64);//256, max y coordinate
			int firstBlockZCoordd = j + random.nextInt(16);
			
			(new WorldGenMinable(mod_morecraft.VerdeAntique, 20)).generate(world, random, firstBlockXCoordd, firstBlockYCoordd, firstBlockZCoordd);
		}
		
		
		for(int p = 0; p<6;p++) //x<NUMBER is rarity
		{
			int firstBlockXCoordd = i + random.nextInt(16);
			int firstBlockYCoordd = random.nextInt(64);//256, max y coordinate
			int firstBlockZCoordd = j + random.nextInt(16);
			
			(new WorldGenMinable(mod_morecraft.Etowah, 20)).generate(world, random, firstBlockXCoordd, firstBlockYCoordd, firstBlockZCoordd);
		}
		
		
		for(int p = 0; p<6;p++) //x<NUMBER is rarity
		{
			int firstBlockXCoordd = i + random.nextInt(16);
			int firstBlockYCoordd = random.nextInt(64);//256, max y coordinate
			int firstBlockZCoordd = j + random.nextInt(16);
			
			(new WorldGenMinable(mod_morecraft.Parian, 20)).generate(world, random, firstBlockXCoordd, firstBlockYCoordd, firstBlockZCoordd);
		}
		
		
		for(int p = 0; p<6;p++) //x<NUMBER is rarity
		{
			int firstBlockXCoordd = i + random.nextInt(16);
			int firstBlockYCoordd = random.nextInt(64);//256, max y coordinate
			int firstBlockZCoordd = j + random.nextInt(16);
			
			(new WorldGenMinable(mod_morecraft.Block, 20)).generate(world, random, firstBlockXCoordd, firstBlockYCoordd, firstBlockZCoordd);
		}
		
		
		for(int p = 0; p<6;p++) //x<NUMBER is rarity
		{
			int firstBlockXCoordd = i + random.nextInt(16);
			int firstBlockYCoordd = random.nextInt(64);//256, max y coordinate
			int firstBlockZCoordd = j + random.nextInt(16);
			
			(new WorldGenMinable(mod_morecraft.AzulCielo, 20)).generate(world, random, firstBlockXCoordd, firstBlockYCoordd, firstBlockZCoordd);
		}
		
		
		for(int p = 0; p<6;p++) //x<NUMBER is rarity
		{
			int firstBlockXCoordd = i + random.nextInt(16);
			int firstBlockYCoordd = random.nextInt(64);//256, max y coordinate
			int firstBlockZCoordd = j + random.nextInt(16);
			
			(new WorldGenMinable(mod_morecraft.ChillangoeBlue, 20)).generate(world, random, firstBlockXCoordd, firstBlockYCoordd, firstBlockZCoordd);
		}
		
		
		
		for(int p = 0; p<9;p++) //x<NUMBER is rarity
		{
			int firstBlockXCoordd = i + random.nextInt(16);
			int firstBlockYCoordd = random.nextInt(64);//256, max y coordinate
			int firstBlockZCoordd = j + random.nextInt(16);
			
			(new WorldGenMinable(mod_morecraft.Lottery, 4)).generate(world, random, firstBlockXCoordd, firstBlockYCoordd, firstBlockZCoordd);
		}
		
		for(int p = 0; p<9;p++) //x<NUMBER is rarity
		{
			int firstBlockXCoordd = i + random.nextInt(16);
			int firstBlockYCoordd = random.nextInt(64);//256, max y coordinate
			int firstBlockZCoordd = j + random.nextInt(16);
			
			(new WorldGenMinable(mod_morecraft.PlutoniumOre, 3)).generate(world, random, firstBlockXCoordd, firstBlockYCoordd, firstBlockZCoordd);
		}
	}

	private void generateInNether(World world, Random random, int i, int j) {
		
	}
	
}
