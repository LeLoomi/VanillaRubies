package net.leloomi.vanillarubies.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.leloomi.vanillarubies.VanillaRubies;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup
{
    public static final ItemGroup RUBIES = FabricItemGroupBuilder.build(
            new Identifier(VanillaRubies.MOD_ID, "rubiesgroup"), () -> new ItemStack(ModItems.RUBY_GEM));
}
