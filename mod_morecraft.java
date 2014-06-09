package net.minecraft.src.joakleymorecraft;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.src.joakleymorecraft.beryl.BerylAxeClass;
import net.minecraft.src.joakleymorecraft.beryl.BerylHoeClass;
import net.minecraft.src.joakleymorecraft.beryl.BerylIngot;
import net.minecraft.src.joakleymorecraft.beryl.BerylPickaxeClass;
import net.minecraft.src.joakleymorecraft.beryl.BerylShovelClass;
import net.minecraft.src.joakleymorecraft.beryl.BerylSwordClass;
import net.minecraft.src.joakleymorecraft.beryl.BlockBerylOre;
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
import net.minecraft.src.joakleymorecraft.nuclear.Drill;
import net.minecraft.src.joakleymorecraft.nuclear.Plutonium;
import net.minecraft.src.joakleymorecraft.nuclear.PlutoniumOre;
import net.minecraft.src.joakleymorecraft.staffs.BlazeStaff;
import net.minecraft.src.joakleymorecraft.staffs.ChickenStaff;
import net.minecraft.src.joakleymorecraft.staffs.CowStaff;
import net.minecraft.src.joakleymorecraft.staffs.CreeperStaff;
import net.minecraft.src.joakleymorecraft.staffs.EndermanStaff;
import net.minecraft.src.joakleymorecraft.staffs.HorseStaff;
import net.minecraft.src.joakleymorecraft.staffs.IronGolemStaff;
import net.minecraft.src.joakleymorecraft.staffs.LightStaff;
import net.minecraft.src.joakleymorecraft.staffs.OcelotStaff;
import net.minecraft.src.joakleymorecraft.staffs.PigStaff;
import net.minecraft.src.joakleymorecraft.staffs.SheepStaff;
import net.minecraft.src.joakleymorecraft.staffs.SkeletonStaff;
import net.minecraft.src.joakleymorecraft.staffs.SnowmanStaff;
import net.minecraft.src.joakleymorecraft.staffs.SpiderStaff;
import net.minecraft.src.joakleymorecraft.staffs.WolfStaff;
import net.minecraft.src.joakleymorecraft.staffs.ZombieStaff;
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
import net.minecraft.creativetab.CreativeTabs;
@Mod(modid = mod_morecraft.modid, version = mod_morecraft.version)
public class mod_morecraft
{
	public static final String modid = "joakley_morecraft";
	public static final String version = "1.0 MC1.7.2";
	/*@Instance(modid)
	public static SuperZombie instance;
	@SidedProxy(clientSide="net.minecraft.src.joakleymorecraft.proxy.ClientProxy", serverSide="net.minecraft.src.joakleymorecraft.proxy.CommonProxy")
	public static CommonProxy proxy;*/


/*@EventHandler
public static void PreLoad(FMLPreInitializationEvent PreEvent){
	SZEntity.mainRegistry();
}*/



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
	public static ToolMaterial DrillMaterial = EnumHelper.addToolMaterial("DrillMaterial", 4/*mines obsidian*/, 4000/*max uses*/, 15F/*efficiency*/, 2/*damage*/, 15/*enchantability*/);
	
	public static Item Drill = new Drill(DrillMaterial).setUnlocalizedName("Drill");
	
	public static Item LightStaff = new LightStaff().setUnlocalizedName("LightStaff").setTextureName(modid + ":LightStaff").setCreativeTab(CreativeTabs.tabMisc);
	public static Item BlazeStaff = new BlazeStaff().setUnlocalizedName("BlazeStaff").setTextureName(modid + ":BlazeStaff").setCreativeTab(CreativeTabs.tabMisc);
	public static Item CreeperStaff = new CreeperStaff().setUnlocalizedName("CreeperStaff").setTextureName(modid + ":CreeperStaff").setCreativeTab(CreativeTabs.tabMisc);

	public static Item EndermanStaff = new EndermanStaff().setUnlocalizedName("EndermanStaff").setTextureName(modid + ":EndermanStaff").setCreativeTab(CreativeTabs.tabMisc);

	public static Item IronGolemStaff = new IronGolemStaff().setUnlocalizedName("IronGolemStaff").setTextureName(modid + ":IronGolemStaff").setCreativeTab(CreativeTabs.tabMisc);
//
	public static Item PigStaff = new PigStaff().setUnlocalizedName("PigStaff").setTextureName(modid + ":PigStaff").setCreativeTab(CreativeTabs.tabMisc);
//
	public static Item SkeletonStaff = new SkeletonStaff().setUnlocalizedName("SkeletonStaff").setTextureName(modid + ":SkeletonStaff").setCreativeTab(CreativeTabs.tabMisc);
//
	public static Item SnowmanStaff = new SnowmanStaff().setUnlocalizedName("SnowmanStaff").setTextureName(modid + ":SnowmanStaff").setCreativeTab(CreativeTabs.tabMisc);
//
	public static Item SpiderStaff = new SpiderStaff().setUnlocalizedName("SpiderStaff").setTextureName(modid + ":SpiderStaff").setCreativeTab(CreativeTabs.tabMisc);
//
	public static Item ZombieStaff = new ZombieStaff().setUnlocalizedName("ZombieStaff").setTextureName(modid + ":ZombieStaff").setCreativeTab(CreativeTabs.tabMisc);
	public static Item ChickenStaff = new ChickenStaff().setUnlocalizedName("ChickenStaff").setTextureName(modid + ":ChickenStaff").setCreativeTab(CreativeTabs.tabMisc);

	public static Item CowStaff = new CowStaff().setUnlocalizedName("CowStaff").setTextureName(modid + ":CowStaff").setCreativeTab(CreativeTabs.tabMisc);
	public static Item WolfStaff = new WolfStaff().setUnlocalizedName("WolfStaff").setTextureName(modid + ":WolfStaff").setCreativeTab(CreativeTabs.tabMisc);
	public static Item HorseStaff = new HorseStaff().setUnlocalizedName("HorseStaff").setTextureName(modid + ":HorseStaff").setCreativeTab(CreativeTabs.tabMisc);
	public static Item OcelotStaff = new OcelotStaff().setUnlocalizedName("OcelotStaff").setTextureName(modid + ":OcelotStaff").setCreativeTab(CreativeTabs.tabMisc);
	public static Item SheepStaff = new SheepStaff().setUnlocalizedName("SheepStaff").setTextureName(modid + ":SheepStaff").setCreativeTab(CreativeTabs.tabMisc);

	public static Item DiaStick;
	
	public static Item Shield;
	public static Item HermesBoots;
	static ArmorMaterial HermesArmor = EnumHelper.addArmorMaterial("HermesMaterial", 20, new int[]{2, 6, 5, 2}, 20);
	public static Item PowerPlateChest;
	static ArmorMaterial PowerPlateArmor = EnumHelper.addArmorMaterial("PowerPlateMaterial", 20, new int[]{2, 6, 5, 2}, 20);
	public static Item ShadowShiv;
	public static ToolMaterial ShadowShivMaterial = EnumHelper.addToolMaterial("ShadowShivMaterial", 4/*mines obsidian*/, 2000/*max uses*/, 12F/*efficiency*/, 3/*damage*/, 25/*enchantability*/);

	public static Block ShadowCrystalOre;
	public static Block BloodCrystalOre;
	public static Block PowerCrystalOre;
	public static Item BloodCrystal;
	public static Item PowerCrystal;
	public static Item ShadowCrystal;
	//public static Item CDia;
	
	/*public static void registerEntity(Class entityClass, String name)
	{
		int entityID = EntityRegistry.findGlobalUniqueEntityId();
		long seed = name.hashCode();
		Random rand = new Random(seed);
		int PrimaryColor = rand.nextInt() * 16777215;
		int SecondaryColor = rand.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityClass, name, entityID);
		EntityRegistry.registerModEntity(entityClass, name, entityID, instance, 64, 1, true);
	}*/

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		//registerEntity(SuperZombie.class, "SuperZombie");
		HermesBoots = new HermesArmor(HermesArmor, 3, "HermesBoots");
		GameRegistry.registerItem(HermesBoots, "HermesBoots");
		
		PowerPlateChest = new PowerPlateArmor(PowerPlateArmor, 1, "PowerPlateChest");
		GameRegistry.registerItem(PowerPlateChest, "PowerPlateChest");
		
		ShadowShiv = new ShadowShiv(ShadowShivMaterial).setUnlocalizedName("ShadowShiv").setTextureName("joakley_morecraft:ShadowShiv");
		GameRegistry.registerItem(ShadowShiv,  "ShadowShiv");
		
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
			,'X', BerylIngot, 'I', Items.stick});

		
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
		
		
		Drill = new Drill(DrillMaterial).setUnlocalizedName("Drill").setTextureName("joakley_morecraft:Drill");
		GameRegistry.registerItem(Drill,  "Drill");
		
		
		GameRegistry.addRecipe(new ItemStack(Drill, 1), new Object [] {
			"TOO",
			"IPO",
			"TIT"
			,'O', Blocks.obsidian, 'P', Plutonium, 'I', Item.getItemById(265), 'T', Items.diamond});
		
		
		
		
		GameRegistry.registerItem(LightStaff, "LightStaff");
		GameRegistry.registerItem(BlazeStaff, "BlazeStaff");
		GameRegistry.registerItem(CreeperStaff, "CreeperStaff");
		GameRegistry.registerItem(EndermanStaff, "EndermanStaff");
		GameRegistry.registerItem(IronGolemStaff, "IronGolemStaff");
		GameRegistry.registerItem(PigStaff, "PigStaff");
		GameRegistry.registerItem(SkeletonStaff, "SkeletonStaff");
		GameRegistry.registerItem(SnowmanStaff, "SnowmanStaff");
		GameRegistry.registerItem(SpiderStaff, "SpiderStaff");
		GameRegistry.registerItem(ZombieStaff, "ZombieStaff");
		GameRegistry.registerItem(ChickenStaff, "ChickenStaff");
		GameRegistry.registerItem(CowStaff, "CowStaff");
		GameRegistry.registerItem(WolfStaff, "WolfStaff");
		GameRegistry.registerItem(HorseStaff, "HorseStaff");
		GameRegistry.registerItem(OcelotStaff, "OcelotStaff");
		GameRegistry.registerItem(SheepStaff, "SheepStaff");
		
		
		
		DiaStick = new DiaStick().setUnlocalizedName("DiaStick").setTextureName("joakley_morecraft:DiaStick");
		GameRegistry.registerItem(DiaStick,  "DiaStick");
		GameRegistry.addShapelessRecipe(new ItemStack(DiaStick), new ItemStack(Items.diamond, 1),new ItemStack(Items.diamond, 1),new ItemStack(Items.diamond, 1));
		/*CDia = new CDia().setUnlocalizedName("CDia").setTextureName("joakley_morecraft:CDia");
		GameRegistry.registerItem(CDia, "CDia");
		GameRegistry.addShapelessRecipe(new ItemStack(CDia), new ItemStack(Items.diamond),new ItemStack(Items.diamond),new ItemStack(Items.diamond),new ItemStack(Items.diamond));*/
		Shield = new Shield().setUnlocalizedName("Shield").setTextureName("joakley_morecraft:Shield");
		GameRegistry.registerItem(Shield,  "Shield");
		GameRegistry.addShapelessRecipe(new ItemStack(DiaStick), new ItemStack(Items.diamond, 1),new ItemStack(Items.diamond, 1),new ItemStack(Items.diamond, 1));

		
		
		PowerCrystalOre = new PowerCrystalOre().setBlockName("PowerCrystalOre").setBlockTextureName(modid + ":" + "PowerCrystalOre");
		GameRegistry.registerBlock(PowerCrystalOre, "PowerCrystalOre");
		GameRegistry.registerWorldGenerator(EXPOreWorldGen, 1);
		
		BloodCrystalOre = new BloodCrystalOre().setBlockName("BloodCrystalOre").setBlockTextureName(modid + ":" + "BloodCrystalOre");
		GameRegistry.registerBlock(BloodCrystalOre, "BloodCrystalOre");
		GameRegistry.registerWorldGenerator(EXPOreWorldGen, 1);
		
		ShadowCrystalOre = new ShadowCrystalOre().setBlockName("ShadowCrystalOre").setBlockTextureName(modid + ":" + "ShadowCrystalOre");
		GameRegistry.registerBlock(ShadowCrystalOre, "ShadowCrystalOre");
		GameRegistry.registerWorldGenerator(EXPOreWorldGen, 1);
		
		
		ShadowCrystal = new BerylIngot().setUnlocalizedName("ShadowCrystal").setTextureName("joakley_morecraft:ShadowCrystal");
		GameRegistry.registerItem(ShadowCrystal, "ShadowCrystal");
		GameRegistry.addShapelessRecipe(new ItemStack(ShadowShiv), new ItemStack(Items.stick), new ItemStack(ShadowCrystal));

		BloodCrystal = new BerylIngot().setUnlocalizedName("BloodCrystal").setTextureName("joakley_morecraft:BloodCrystal");
		GameRegistry.registerItem(BloodCrystal, "BloodCrystal");
		GameRegistry.addShapelessRecipe(new ItemStack(HermesBoots), new ItemStack(Items.leather),new ItemStack(Items.leather),new ItemStack(Items.leather),new ItemStack(Items.leather), new ItemStack(BloodCrystal));

		PowerCrystal = new BerylIngot().setUnlocalizedName("PowerCrystal").setTextureName("joakley_morecraft:PowerCrystal");
		GameRegistry.registerItem(PowerCrystal, "PowerCrystal");
		GameRegistry.addShapelessRecipe(new ItemStack(PowerPlateChest), new ItemStack(Items.iron_ingot),new ItemStack(Items.iron_ingot),new ItemStack(Items.iron_ingot),new ItemStack(Items.iron_ingot),new ItemStack(Items.iron_ingot),new ItemStack(Items.iron_ingot),new ItemStack(Items.iron_ingot), new ItemStack(PowerCrystal));

		
		GameRegistry.addShapelessRecipe(new ItemStack(Shield), new ItemStack(Blocks.obsidian),new ItemStack(Blocks.obsidian),new ItemStack(Blocks.obsidian),new ItemStack(Blocks.obsidian),new ItemStack(Items.diamond),
				new ItemStack(Items.diamond),new ItemStack(Items.diamond),new ItemStack(Items.diamond),new ItemStack(Items.iron_ingot));

		
		//proxy.registerRenderers();
		
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
