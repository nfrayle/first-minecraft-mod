package nathan9997.elemental_items;

import nathan9997.elemental_items.init.ElementalBlocks;
import nathan9997.elemental_items.init.ElementalItems;
import nathan9997.elemental_items.proxy.CommonProxy;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class Elemental_Items {
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final ElementalItemsTab tabElementalItems = new ElementalItemsTab("tabElementalItems");
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ElementalBlocks.init();
		ElementalBlocks.register();
		ElementalItems.init();
		ElementalItems.register();
	}
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		GameRegistry.addRecipe(new ItemStack(ElementalItems.skystone_sword), new Object[] {" s ", " s ", " t ", 's', ElementalItems.skystone_gem, 't', Items.stick  });
		proxy.registerRenders();
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
	
}
