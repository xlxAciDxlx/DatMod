package taketengaming.datmod.creativetab;

import net.minecraft.item.Item;
import taketengaming.datmod.DatMod;
import taketengaming.datmod.register.Items;

/**
 * Created by Acid on 10/26/2016.
 */
public class Tools extends net.minecraft.creativetab.CreativeTabs
{
	public Tools ()
	{
		super ( getNextID (), DatMod.MODID + "_tools" );
	}

	@Override
	public Item getTabIconItem ()
	{
		return Items.diamondiumSword;
	}
}