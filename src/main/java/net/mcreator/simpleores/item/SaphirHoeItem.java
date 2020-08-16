
package net.mcreator.simpleores.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.simpleores.itemgroup.MoreGemsToolsItemGroup;
import net.mcreator.simpleores.SimpleOresModElements;

@SimpleOresModElements.ModElement.Tag
public class SaphirHoeItem extends SimpleOresModElements.ModElement {
	@ObjectHolder("simple_ores:saphir_hoe")
	public static final Item block = null;
	public SaphirHoeItem(SimpleOresModElements instance) {
		super(instance, 33);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 2380;
			}

			public float getEfficiency() {
				return 16f;
			}

			public float getAttackDamage() {
				return 8f;
			}

			public int getHarvestLevel() {
				return 10;
			}

			public int getEnchantability() {
				return 70;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(SaphirGemItem.block, (int) (1)));
			}
		}, -3f, new Item.Properties().group(MoreGemsToolsItemGroup.tab)) {
		}.setRegistryName("saphir_hoe"));
	}
}
