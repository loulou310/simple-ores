
package net.mcreator.simpleores.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.simpleores.itemgroup.MoreGemsToolsItemGroup;
import net.mcreator.simpleores.SimpleOresModElements;

@SimpleOresModElements.ModElement.Tag
public class SaphirPickaxeItem extends SimpleOresModElements.ModElement {
	@ObjectHolder("simple_ores:saphir_pickaxe")
	public static final Item block = null;
	public SaphirPickaxeItem(SimpleOresModElements instance) {
		super(instance, 29);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
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
		}, 1, -3f, new Item.Properties().group(MoreGemsToolsItemGroup.tab)) {
		}.setRegistryName("saphir_pickaxe"));
	}
}
