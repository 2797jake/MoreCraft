package net.minecraft.src.joakleymorecraft;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.src.joakleymorecraft.beryl.BerylAxeClass;
import net.minecraft.src.joakleymorecraft.beryl.BerylHoeClass;
import net.minecraft.src.joakleymorecraft.beryl.BerylPickaxeClass;
import net.minecraft.src.joakleymorecraft.beryl.BerylShovelClass;
import net.minecraft.src.joakleymorecraft.beryl.BerylSwordClass;
import net.minecraft.src.joakleymorecraft.beryl.BlockBerylOre;
import net.minecraft.src.joakleymorecraft.beryl.BerylIngot;
import net.minecraft.src.joakleymorecraft.bricks.Blue;
import net.minecraft.src.joakleymorecraft.bricks.Green;
import net.minecraft.src.joakleymorecraft.bricks.Purple;
import net.minecraft.src.joakleymorecraft.bricks.Yellow;
import net.minecraft.src.joakleymorecraft.marble.AzulCielo;
import net.minecraft.src.joakleymorecraft.marble.BlockMa;
import net.minecraft.src.joakleymorecraft.marble.Bucova;
import net.minecraft.src.joakleymorecraft.marble.ChillangoeBlue;
import net.minecraft.src.joakleymorecraft.marble.CoralRed;
import net.minecraft.src.joakleymorecraft.marble.Etowah;
import net.minecraft.src.joakleymorecraft.marble.GoldenJade;
import net.minecraft.src.joakleymorecraft.marble.Parian;
import net.minecraft.src.joakleymorecraft.marble.VerdeAntique;
import net.minecraft.src.joakleymorecraft.marble.VerdeGreen;
import net.minecraft.src.joakleymorecraft.morelights.Brightstone;
import net.minecraft.src.joakleymorecraft.morelights.Checkered;
import net.minecraft.src.joakleymorecraft.morelights.Electricity;
import net.minecraft.src.joakleymorecraft.morelights.Fireblock;
import net.minecraft.src.joakleymorecraft.morelights.LED;
import net.minecraft.src.joakleymorecraft.morelights.Lantern;
import net.minecraft.src.joakleymorecraft.morelights.Moonstone;
import net.minecraft.src.joakleymorecraft.morelights.Spectrum;
import net.minecraft.src.joakleymorecraft.morelights.Sunstone;
import net.minecraft.src.joakleymorecraft.nuclear.Plutonium;
import net.minecraft.src.joakleymorecraft.nuclear.PlutoniumOre;
import net.minecraft.src.joakleymorecraft.stonevarients.DarkCarvedStoneBrick;
import net.minecraft.src.joakleymorecraft.stonevarients.DarkStone;
import net.minecraft.src.joakleymorecraft.stonevarients.DarkStoneBrick;
import net.minecraft.src.joakleymorecraft.stonevarients.PaleCarvedStoneBrick;
import net.minecraft.src.joakleymorecraft.stonevarients.PaleStone;
import net.minecraft.src.joakleymorecraft.stonevarients.PaleStoneBrick;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
@Mod(modid = mod_morecraft.modid, version = mod_morecraft.version)
public class mod_morecraft
{
	public static final String modid = "joakley_morecraft";
	public static final String version = "1.0 MC1.7.2";
	

	
	public static OreGeneration EXPOreWorldGen = new OreGeneration();
	
	public static Block BerylOre;
	public static Block Brightstone;
	public static Block Checkered;
	public static Block Electricity;
	public static Block Fireblock;
	public static Block Lantern;
	public static Block LED;
	public static Block Moonstone;
	public static Block Sunstone;
	public static Block Spectrum;
	
	
	public static Block CoralRed;
	public static Block Bucova;
	public static Block GoldenJade;
	public static Block VerdeGreen;
	public static Block VerdeAntique;
	public static Block Etowah;
	public static Block Parian;
	public static Block Block;
	public static Block AzulCielo;
	public static Block ChillangoeBlue;
	
	
	public static Block Void;
	
	
	
	public static Block Lottery;
	
	
	
	
	public static Item BerylIngot;
	
	public static ToolMaterial BerylMaterial = EnumHelper.addToolMaterial("BerylMaterial", 4/*mines obsidian*/, 500/*max uses*/, 12F/*efficiency*/, 4/*damage*/, 22/*enchantability*/);
	
	public static Item BerylAxe = new BerylAxeClass(BerylMaterial).setUnlocalizedName("BerylAxe");
	
	public static Item BerylPickaxe = new BerylPickaxeClass(BerylMaterial).setUnlocalizedName("BerylPickaxe");
	
	public static Item BerylHoe = new BerylHoeClass(BerylMaterial).setUnlocalizedName("BerylHoe");

	public static Item BerylSword = new BerylSwordClass(BerylMaterial).setUnlocalizedName("BerylSword");
	
	public static Item BerylShovel = new BerylShovelClass(BerylMaterial).setUnlocalizedName("BerylShovel");
	
	
	
	public static net.minecraft.block.Block Clover;
	
	public static Block DarkCarvedStoneBrick;
	public static Block DarkStoneBrick;
	public static Block DarkStone;
	public static Block PaleStone;
	public static Block PaleCarvedStoneBrick;
	public static Block PaleStoneBrick;
	public static Block Vacant;
	
	public static Block Green;
	public static Block Blue;
	public static Block Purple;
	public static Block Yellow;
	
	
	public static Block PlutoniumOre;
	
	public static Item Plutonium;
	

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{

		
		
		
		BerylOre = new BlockBerylOre().setBlockName("BerylOre").setBlockTextureName(modid + ":" + "BerylOre");
		GameRegistry.registerBlock(BerylOre, "BerylOre");
	
		BerylIngot = new BerylIngot().setUnlocalizedName("BerylIngot").setTextureName("joakley_morecraft:BerylIngot");
		GameRegistry.registerItem(BerylIngot, "BerylIngot");
		GameRegistry.addSmelting(mod_morecraft.BerylOre, new ItemStack(mod_morecraft.BerylIngot), 0.1f);
	
		
		BerylAxe = new BerylAxeClass(BerylMaterial).setUnlocalizedName("BerylAxe").setTextureName("joakley_morecraft:BerylAxe");
		GameRegistry.registerItem(BerylAxe,  "BerylAxe");
		GameRegistry.addRecipe(new ItemStack(BerylAxe, 1), new Object [] {
			"XX ",
			"XI ",
			" I "
			,'X', BerylIngot, 'I', Item.itemRegistry.getObject("stick")});

		
		BerylPickaxe = new BerylPickaxeClass(BerylMaterial).setUnlocalizedName("BerylPickaxe").setTextureName("joakley_morecraft:BerylPickaxe");
		GameRegistry.registerItem(BerylPickaxe,  "BerylPickaxe");
		GameRegistry.addRecipe(new ItemStack(BerylPickaxe, 1), new Object [] {
			"XXX",
			" I ",
			" I "
			,'X', BerylIngot, 'I', Item.itemRegistry.getObject("stick")});
		
		
		BerylHoe = new BerylHoeClass(BerylMaterial).setUnlocalizedName("BerylHoe").setTextureName("joakley_morecraft:BerylHoe");
		GameRegistry.registerItem(BerylHoe,  "BerylHoe");
		GameRegistry.addRecipe(new ItemStack(BerylHoe, 1), new Object [] {
			"XX ",
			" I ",
			" I "
			,'X', BerylIngot, 'I', Item.itemRegistry.getObject("stick")});
		
		BerylSword = new BerylSwordClass(BerylMaterial).setUnlocalizedName("BerylSword").setTextureName("joakley_morecraft:BerylSword");
		GameRegistry.registerItem(BerylSword,  "BerylSword");
		GameRegistry.addRecipe(new ItemStack(BerylSword, 1), new Object [] {
			" X ",
			" X ",
			" I "
			,'X', BerylIngot, 'I', Item.itemRegistry.getObject("stick")});
		
		BerylShovel = new BerylShovelClass(BerylMaterial).setUnlocalizedName("BerylShovel").setTextureName("joakley_morecraft:BerylShovel");
		GameRegistry.registerItem(BerylShovel,  "BerylShovel");
		GameRegistry.addRecipe(new ItemStack(BerylShovel, 1), new Object [] {
			" X ",
			
			" I ",
			" I "
			,'X', BerylIngot, 'I', Item.itemRegistry.getObject("stick")});
	
		Spectrum = new Spectrum().setBlockName("Spectrum").setBlockTextureName(modid + ":" + "spectrum");
		GameRegistry.registerBlock(Spectrum, "Spectrum");
		GameRegistry.addRecipe(new ItemStack(Spectrum, 1), new Object [] {
			" I ",
			"PXE",
			" Y "
			,'X', Blocks.glowstone, 'I', Item.getItemById(348), 'Y', Item.getItemById(341), 'E', Item.getItemById(368), 'P', Item.getItemById(375)});
		
		
		Sunstone = new Sunstone().setBlockName("Sunstone").setBlockTextureName(modid + ":" + "Sunstone");
		GameRegistry.registerBlock(Sunstone, "Sunstone");
		GameRegistry.addRecipe(new ItemStack(Sunstone, 1), new Object [] {
			" I ",
			"IXI",
			" I "
			,'X', Blocks.glowstone, 'I', Item.itemRegistry.getObject("torch")});
		
		
		
		
		Moonstone = new Moonstone().setBlockName("Moonstone").setBlockTextureName(modid + ":" + "Moonstone");
		GameRegistry.registerBlock(Moonstone, "Moonstone");
		GameRegistry.addRecipe(new ItemStack(BerylShovel, 1), new Object [] {
			" X ",
			"XIX",
			" X "
			,'X', Item.getItemById(348), 'I', Item.itemRegistry.getObject("coal")});
		
		
		
		
		LED = new LED().setBlockName("LED").setBlockTextureName(modid + ":" + "LED");
		GameRegistry.registerBlock(LED, "LED");
		GameRegistry.addShapelessRecipe(new ItemStack(mod_morecraft.LED), Blocks.glowstone, Item.getItemById(264));
		
		
		
		Lantern = new Lantern().setBlockName("Lantern").setBlockTextureName(modid + ":" + "Lantern");
		GameRegistry.registerBlock(Lantern, "Lantern");
		GameRegistry.addRecipe(new ItemStack(Lantern, 1), new Object [] {
			" X ",
			"XIX",
			" X "
			,'X', Item.getItemById(265), 'I', Blocks.glowstone});
		
		
		
		Fireblock = new Fireblock().setBlockName("Fireblock").setBlockTextureName(modid + ":" + "Fireblock");
		GameRegistry.registerBlock(Fireblock, "Fireblock");
		GameRegistry.addRecipe(new ItemStack(BerylShovel, 1), new Object [] {
			" X ",
			"XIX",
			" X "
			,'X', Blocks.netherrack, 'I', Blocks.glowstone});
		
		
		
		
		
		Electricity = new Electricity().setBlockName("Electricity").setBlockTextureName(modid + ":" + "Electricity");
		GameRegistry.registerBlock(Electricity, "Electricity");
		GameRegistry.addRecipe(new ItemStack(BerylShovel, 1), new Object [] {
			" X ",
			"OIO",
			"   "
			,'X', Item.getItemById(264), 'I', Blocks.glowstone, 'O', Item.getItemById(348)});
		
		
		
		Checkered = new Checkered().setBlockName("Checkered").setBlockTextureName(modid + ":" + "checkered");
		GameRegistry.registerBlock(Checkered, "Checkered");
		GameRegistry.addRecipe(new ItemStack(BerylShovel, 1), new Object [] {
			" I ",
			"OXO",
			" I "
			,'X', Blocks.glowstone, 'I', Item.getItemById(331), 'O', Item.getItemById(348)});
		
		
		
		
		Brightstone = new Brightstone().setBlockName("Brightstone").setBlockTextureName(modid + ":" + "brightstone");
		GameRegistry.registerBlock(Brightstone, "Brightstone");
		GameRegistry.addRecipe(new ItemStack(BerylShovel, 1), new Object [] {
			" I ",
			" X ",
			" I "
			,'X', Blocks.glowstone, 'I', Item.getItemById(331)});
		
		
		
		
		
		
		
		CoralRed = new CoralRed().setBlockName("CoralRed").setBlockTextureName(modid + ":" + "CRM");
		GameRegistry.registerBlock(CoralRed, "CoralRed");
		GameRegistry.registerWorldGenerator(EXPOreWorldGen, 1);
		
		Bucova = new Bucova().setBlockName("Bucova").setBlockTextureName(modid + ":" + "BM");
		GameRegistry.registerBlock(Bucova, "Bucova");
		GameRegistry.registerWorldGenerator(EXPOreWorldGen, 1);
		
		GoldenJade = new GoldenJade().setBlockName("GoldenJade").setBlockTextureName(modid + ":" + "GJM");
		GameRegistry.registerBlock(GoldenJade, "GoldenJade");
		GameRegistry.registerWorldGenerator(EXPOreWorldGen, 1);
		
		VerdeGreen = new VerdeGreen().setBlockName("VerdeGreen").setBlockTextureName(modid + ":" + "VGM");
		GameRegistry.registerBlock(VerdeGreen, "VerdeGreen");
		GameRegistry.registerWorldGenerator(EXPOreWorldGen, 1);
		
		VerdeAntique = new VerdeAntique().setBlockName("VerdeAntique").setBlockTextureName(modid + ":" + "VAM");
		GameRegistry.registerBlock(VerdeAntique, "VerdeAntique");
		GameRegistry.registerWorldGenerator(EXPOreWorldGen, 1);
		
		Etowah = new Etowah().setBlockName("Etowah").setBlockTextureName(modid + ":" + "EM");
		GameRegistry.registerBlock(Etowah, "Etowah");
		GameRegistry.registerWorldGenerator(EXPOreWorldGen, 1);
		
		
		Parian = new Parian().setBlockName("Parian").setBlockTextureName(modid + ":" + "PM");
		GameRegistry.registerBlock(Parian, "Parian");
		GameRegistry.registerWorldGenerator(EXPOreWorldGen, 1);
		
		
		Block = new BlockMa().setBlockName("Block").setBlockTextureName(modid + ":" + "BM2");
		GameRegistry.registerBlock(Block, "Block");
		GameRegistry.registerWorldGenerator(EXPOreWorldGen, 1);
		
		AzulCielo = new AzulCielo().setBlockName("AzulCielo").setBlockTextureName(modid + ":" + "ACM");
		GameRegistry.registerBlock(AzulCielo, "AzulCielo");
		GameRegistry.registerWorldGenerator(EXPOreWorldGen, 1);
		
		
		ChillangoeBlue = new ChillangoeBlue().setBlockName("ChillangoeBlue").setBlockTextureName(modid + ":" + "CBM");
		GameRegistry.registerBlock(ChillangoeBlue, "ChillangoeBlue");
		GameRegistry.registerWorldGenerator(EXPOreWorldGen, 1);
		
		
		
		Lottery = new Lottery().setBlockName("Lottery").setBlockTextureName(modid + ":" + "Lottery");
		GameRegistry.registerBlock(Lottery, "Lottery");
		GameRegistry.registerWorldGenerator(EXPOreWorldGen, 1);
		
		
		
		Clover = new CloverBlock(0).setBlockName("Clover").setBlockTextureName(modid + ":" + "Clover");
		GameRegistry.registerBlock(Clover, "Clover");
		
		
		Vacant = new Vacant().setBlockName("Vacant").setBlockTextureName(modid + ":" + "Vacant");
		GameRegistry.registerBlock(Vacant, "Vacant");
		
		Void = new Void().setBlockName("Void").setBlockTextureName(modid + ":" + "Void");
		GameRegistry.registerBlock(Void, "Void");
		
		DarkStone = new DarkStone().setBlockName("DarkStone").setBlockTextureName(modid + ":" + "DarkStone");
		GameRegistry.registerBlock(DarkStone, "DarkStone");
		
		DarkStoneBrick = new DarkStoneBrick().setBlockName("DarkStoneBrick").setBlockTextureName(modid + ":" + "DarkStoneBrick");
		GameRegistry.registerBlock(DarkStoneBrick, "DarkStoneBrick");
		
		DarkCarvedStoneBrick = new DarkCarvedStoneBrick().setBlockName("DarkCarvedStoneBrick").setBlockTextureName(modid + ":" + "DarkCarvedStoneBrick");
		GameRegistry.registerBlock(DarkCarvedStoneBrick, "DarkCarvedStoneBrick");
		
		PaleStone = new PaleStone().setBlockName("PaleStone").setBlockTextureName(modid + ":" + "PaleStone");
		GameRegistry.registerBlock(PaleStone, "PaleStone");
		
		PaleStoneBrick = new PaleStoneBrick().setBlockName("PaleStoneBrick").setBlockTextureName(modid + ":" + "PaleStoneBrick");
		GameRegistry.registerBlock(PaleStoneBrick, "PaleStoneBrick");
		
		PaleCarvedStoneBrick = new PaleCarvedStoneBrick().setBlockName("PaleCarvedStoneBrick").setBlockTextureName(modid + ":" + "PaleCarvedStoneBrick");
		GameRegistry.registerBlock(PaleCarvedStoneBrick, "PaleCarvedStoneBrick");
		
		
		
		
		
		Green = new Green().setBlockName("Green").setBlockTextureName(modid + ":" + "GreenBrick");
		GameRegistry.registerBlock(Green, "Green");
		Blue = new Blue().setBlockName("Blue").setBlockTextureName(modid + ":" + "BlueBrick");
		GameRegistry.registerBlock(Blue, "Blue");
		Yellow = new Yellow().setBlockName("Yellow").setBlockTextureName(modid + ":" + "YellowBrick");
		GameRegistry.registerBlock(Yellow, "Yellow");
		Purple = new Purple().setBlockName("Purple").setBlockTextureName(modid + ":" + "PurpleBrick");
		GameRegistry.registerBlock(Purple, "Purple");
		
		
		
		
		PlutoniumOre = new PlutoniumOre().setBlockName("PlutoniumOre").setBlockTextureName(modid + ":" + "PlutoniumOre");
		GameRegistry.registerBlock(PlutoniumOre, "PlutoniumOre");
		GameRegistry.registerWorldGenerator(EXPOreWorldGen, 1);
		
		
		
		Plutonium = new Plutonium().setUnlocalizedName("Plutonium").setTextureName("joakley_morecraft:Plutonium");
		GameRegistry.registerItem(Plutonium, "Plutonium");

;
}
	
	


	@EventHandler
	public void init(FMLInitializationEvent event)
	{

	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{

	}
	

}
