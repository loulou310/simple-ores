
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
public class AmethystPickaxeItem extends SimpleOresModElements.ModElement {
	@ObjectHolder("simple_ores:amethyst_pickaxe")
	public static final Item block = null;
	public AmethystPickaxeItem(SimpleOresModElements instance) {
		super(instance, 67);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 3811;
			}

			public float getEfficiency() {
				return 19f;
			}

			public float getAttackDamage() {
				return 12f;
			}

			public int getHarvestLevel() {
				return 6;
			}

			public int getEnchantability() {
				return 98;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(AmethystGemItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(MoreGemsToolsItemGroup.tab)) {
		}.setRegistryName("amethyst_pickaxe"));
	}
}
