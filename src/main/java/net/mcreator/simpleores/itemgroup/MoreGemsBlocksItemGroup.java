
package net.mcreator.simpleores.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.simpleores.block.RubyOreBlockBlock;
import net.mcreator.simpleores.SimpleOresModElements;

@SimpleOresModElements.ModElement.Tag
public class MoreGemsBlocksItemGroup extends SimpleOresModElements.ModElement {
	public MoreGemsBlocksItemGroup(SimpleOresModElements instance) {
		super(instance, 85);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmore_gems_blocks") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(RubyOreBlockBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
