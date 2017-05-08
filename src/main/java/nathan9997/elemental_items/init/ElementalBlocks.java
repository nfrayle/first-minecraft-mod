package nathan9997.elemental_items.init;

import nathan9997.elemental_items.Elemental_Items;
import nathan9997.elemental_items.Reference;
import nathan9997.elemental_items.blocks.BlockTest;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ElementalBlocks {

	public static Block skystone_ore;
	
	public static void init()
	{
		skystone_ore = new BlockTest(Material.iron).setUnlocalizedName("skystone_ore").setCreativeTab(Elemental_Items.tabElementalItems);;
	}
	
	public static void register()
	{
		GameRegistry.registerBlock(skystone_ore, skystone_ore.getUnlocalizedName().substring(5));
	}

public static void registerRenders()
{
	registerRender(skystone_ore);
}

public static void registerRender(Block block)
{
	Item item = Item.getItemFromBlock(block);
	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
}


}
