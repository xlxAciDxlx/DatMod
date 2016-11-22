package xlxacidxlx.datmod.item;

import net.minecraft.inventory.EntityEquipmentSlot;
import xlxacidxlx.datmod.Materials;
import xlxacidxlx.datmod.base.ItemArmor;

/**
 * Created by Acid on 11/20/2016.
 */
public class IroniumHelmet extends ItemArmor {
	/**
	 * Constructs the Ironium Helmet
	 */
	public IroniumHelmet() {
		super(Materials.ironiumArmor, EntityEquipmentSlot.HEAD, "Ironium Helmet");
	}
}
