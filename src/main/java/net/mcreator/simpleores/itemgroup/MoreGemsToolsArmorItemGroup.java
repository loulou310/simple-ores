
package net.mcreator.simpleores.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.simpleores.item.RubySwordItem;
import net.mcreator.simpleores.SimpleOresModElements;

@SimpleOresModElements.ModElement.Tag
public class MoreGemsToolsArmorItemGroup extends SimpleOresModElements.ModElement {
	public MoreGemsToolsArmorItemGroup(SimpleOresModElements instance) {
		super(instance, 84);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmore_gems_tools_armor") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(RubySwordItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
