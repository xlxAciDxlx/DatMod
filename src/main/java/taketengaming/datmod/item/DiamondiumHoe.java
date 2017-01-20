package taketengaming.datmod.item;

import taketengaming.datmod.Materials;
import taketengaming.datmod.creativetab.CreativeTabs;
import taketengaming.tencore.item.ItemHoe;

/**
 * Created by Acid on 11/20/2016.
 */
public class DiamondiumHoe extends ItemHoe
{
	public DiamondiumHoe ()
	{
		super ( Materials.diamondium, "Diamondium Hoe" );

		setCreativeTab ( CreativeTabs.tools );
	}
}
