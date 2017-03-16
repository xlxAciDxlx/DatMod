package taketengaming.datmod.item;

import net.minecraft.inventory.EntityEquipmentSlot;
import taketengaming.datmod.Materials;
import taketengaming.datmod.creativetab.CreativeTabs;
import taketengaming.tencore.item.ItemArmor;

/**
 * Created by Acid on 11/20/2016.
 */
public class ItemEmeraldiLeggings extends ItemArmor
{
	public ItemEmeraldiLeggings ()
	{
		super ( Materials.emeraldiArmor, EntityEquipmentSlot.LEGS, "Emeraldi Leggings" );

		this.setCreativeTab ( CreativeTabs.armors );
	}
}