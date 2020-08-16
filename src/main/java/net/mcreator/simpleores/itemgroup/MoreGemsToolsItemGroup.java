
package net.mcreator.simpleores.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.simpleores.item.RubyPickaxeItem;
import net.mcreator.simpleores.SimpleOresModElements;

@SimpleOresModElements.ModElement.Tag
public class MoreGemsToolsItemGroup extends SimpleOresModElements.ModElement {
	public MoreGemsToolsItemGroup(SimpleOresModElements instance) {
		super(instance, 86);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmore_gems_tools") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(RubyPickaxeItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
