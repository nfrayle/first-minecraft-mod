package nathan9997.elemental_items;

import nathan9997.elemental_items.init.ElementalItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ElementalItemsTab extends CreativeTabs{

	public ElementalItemsTab(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return ElementalItems.skystone_sword;
	}

}
