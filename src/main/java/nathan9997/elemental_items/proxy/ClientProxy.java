package nathan9997.elemental_items.proxy;

import nathan9997.elemental_items.init.ElementalBlocks;
import nathan9997.elemental_items.init.ElementalItems;

public class ClientProxy extends CommonProxy{
	@Override
	public void registerRenders() {
		ElementalBlocks.registerRenders();
		ElementalItems.registerRenders();
	}
	
	
}
