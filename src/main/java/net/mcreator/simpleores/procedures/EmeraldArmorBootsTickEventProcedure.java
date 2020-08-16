package net.mcreator.simpleores.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.simpleores.SimpleOresModElements;

import java.util.Map;

@SimpleOresModElements.ModElement.Tag
public class EmeraldArmorBootsTickEventProcedure extends SimpleOresModElements.ModElement {
	public EmeraldArmorBootsTickEventProcedure(SimpleOresModElements instance) {
		super(instance, 50);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure EmeraldArmorBootsTickEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 3, (int) 1));
	}
}
