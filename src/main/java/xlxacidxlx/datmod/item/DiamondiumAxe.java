package xlxacidxlx.datmod.item;

import xlxacidxlx.datmod.Materials;

/**
 * Created by Acid on 11/1/2016.
 */
public class DiamondiumAxe extends BaseItemAxe {
	protected DiamondiumAxe() {
		super(Materials.diamondium, "Diamondium Axe", Materials.diamondium.getDamageVsEntity(), Materials.diamondium.getEfficiencyOnProperMaterial());
	}
}