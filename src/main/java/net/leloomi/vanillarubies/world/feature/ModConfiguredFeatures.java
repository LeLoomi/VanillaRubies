package net.leloomi.vanillarubies.world.feature;

import net.leloomi.vanillarubies.VanillaRubies;
import net.leloomi.vanillarubies.block.ModBlocks;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures
{
    public static final List<OreFeatureConfig.Target> OVERWORLD_RUBY_ORES = List.of(

            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.RUBY_ORE.getDefaultState()),

            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    ModBlocks.RUBY_ORE_DEEPSLATE.getDefaultState())
    );

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> RUBY_ORE =
            ConfiguredFeatures.register("ruby_ore", Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_RUBY_ORES, 9));



    public static void registerConfiguredFeatures()
    {
        VanillaRubies.LOGGER.debug(VanillaRubies.MOD_ID + ": Registering ModConfiguredFeatures...");
    }
}
