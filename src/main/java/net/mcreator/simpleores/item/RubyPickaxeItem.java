
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
public class RubyPickaxeItem extends SimpleOresModElements.ModElement {
	@ObjectHolder("simple_ores:ruby_pickaxe")
	public static final Item block = null;
	public RubyPickaxeItem(SimpleOresModElements instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1741;
			}

			public float getEfficiency() {
				return 14f;
			}

			public float getAttackDamage() {
				return 6f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 56;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(RubyGemItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(MoreGemsToolsItemGroup.tab)) {
		}.setRegistryName("ruby_pickaxe"));
	}
}
