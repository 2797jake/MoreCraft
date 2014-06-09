package net.minecraft.src.joakleymorecraft.Proxy;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy {

	public int addArmor(String armor){
		return RenderingRegistry.addNewArmourRendererPrefix(armor);
	}
}
