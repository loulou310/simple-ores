
package net.mcreator.simpleores.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.simpleores.item.RubyGemItem;
import net.mcreator.simpleores.SimpleOresModElements;

@SimpleOresModElements.ModElement.Tag
public class MoreGemsItemsItemGroup extends SimpleOresModElements.ModElement {
	public MoreGemsItemsItemGroup(SimpleOresModElements instance) {
		super(instance, 83);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmore_gems_items") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(RubyGemItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
