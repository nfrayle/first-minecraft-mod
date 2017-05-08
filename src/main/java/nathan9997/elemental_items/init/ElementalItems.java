package nathan9997.elemental_items.init;

import nathan9997.elemental_items.Elemental_Items;
import nathan9997.elemental_items.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ElementalItems {
	public static Item skystone_gem;
	public static Item skystone_sword;
	
	public static void init(){
		skystone_gem = new Item().setUnlocalizedName("skystone_gem").setCreativeTab(Elemental_Items.tabElementalItems);
		skystone_sword = new Item().setUnlocalizedName("skystone_sword").setCreativeTab(Elemental_Items.tabElementalItems);;
	}
	
	public static void register()
	{
		GameRegistry.registerItem(skystone_gem, skystone_gem.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(skystone_sword, skystone_sword.getUnlocalizedName().substring(5));
	}
	public static void registerRenders()
	{
		registerRender(skystone_gem);
		registerRender(skystone_sword);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
