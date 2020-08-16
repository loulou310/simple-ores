package net.mcreator.simpleores.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.simpleores.SimpleOresModElements;

import java.util.Map;

@SimpleOresModElements.ModElement.Tag
public class AmethystArmorLeggingsTickEventProcedure extends SimpleOresModElements.ModElement {
	public AmethystArmorLeggingsTickEventProcedure(SimpleOresModElements instance) {
		super(instance, 82);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure AmethystArmorLeggingsTickEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.STRENGTH, (int) 3, (int) 1));
	}
}
