package xlxacidxlx.datmod.item;

import net.minecraft.inventory.EntityEquipmentSlot;
import xlxacidxlx.datmod.Materials;
import xlxacidxlx.datmod.base.ItemArmor;

/**
 * Created by Acid on 11/20/2016.
 */
public class RedstoneLeggings extends ItemArmor {
	/**
	 * Constructs the Redstone Leggings
	 */
	public RedstoneLeggings() {
		super(Materials.redstoneArmor, EntityEquipmentSlot.LEGS, "Redstone Leggings");
	}
}