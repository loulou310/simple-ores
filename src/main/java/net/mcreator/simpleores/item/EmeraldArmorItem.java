
package net.mcreator.simpleores.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.simpleores.procedures.EmeraldArmorBootsTickEventProcedure;
import net.mcreator.simpleores.SimpleOresModElements;

@SimpleOresModElements.ModElement.Tag
public class EmeraldArmorItem extends SimpleOresModElements.ModElement {
	@ObjectHolder("simple_ores:emerald_armorhelmet")
	public static final Item helmet = null;
	@ObjectHolder("simple_ores:emerald_armorbody")
	public static final Item body = null;
	@ObjectHolder("simple_ores:emerald_armorlegs")
	public static final Item legs = null;
	@ObjectHolder("simple_ores:emerald_armorboots")
	public static final Item boots = null;
	public EmeraldArmorItem(SimpleOresModElements instance) {
		super(instance, 45);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 90;
			}

			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{12, 36, 30, 12}[slot.getIndex()];
			}

			public int getEnchantability() {
				return 54;
			}

			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Items.EMERALD, (int) (1)));
			}

			@OnlyIn(Dist.CLIENT)
			public String getName() {
				return "emerald_armor";
			}

			public float getToughness() {
				return 0f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "simple_ores:textures/models/armor/emerald_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("emerald_armorhelmet"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "simple_ores:textures/models/armor/emerald_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("emerald_armorbody"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "simple_ores:textures/models/armor/emerald_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("emerald_armorlegs"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "simple_ores:textures/models/armor/emerald_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}

			@Override
			public void onArmorTick(ItemStack itemstack, World world, PlayerEntity entity) {
				int x = (int) entity.getPosX();
				int y = (int) entity.getPosY();
				int z = (int) entity.getPosZ();
				{
					java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("entity", entity);
					EmeraldArmorBootsTickEventProcedure.executeProcedure($_dependencies);
				}
			}
		}.setRegistryName("emerald_armorboots"));
	}
}
