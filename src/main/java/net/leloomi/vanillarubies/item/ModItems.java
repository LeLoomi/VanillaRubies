package net.leloomi.vanillarubies.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.leloomi.vanillarubies.VanillaRubies;
import net.leloomi.vanillarubies.item.custom.ModAxeItem;
import net.leloomi.vanillarubies.item.custom.ModHoeItem;
import net.leloomi.vanillarubies.item.custom.ModPickaxeItem;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems
{
    //ITEMS
    public static final Item RUBY_GEM = registerItem("ruby_gem",
            new Item(new FabricItemSettings().group(ModItemGroup.RUBIES)));

    //TOOLS
    public static final Item RUBY_SWORD = registerItem("ruby_sword",
            new SwordItem(ModToolMaterials.RUBY, 4, 1f,
                    new FabricItemSettings().group(ModItemGroup.RUBIES)));

    public static final Item RUBY_AXE = registerItem("ruby_axe",
            new ModAxeItem(ModToolMaterials.RUBY, 6, 1f,
                    new FabricItemSettings().group(ModItemGroup.RUBIES)));

    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe",
            new ModPickaxeItem(ModToolMaterials.RUBY, 0, 0.5f,
                    new FabricItemSettings().group(ModItemGroup.RUBIES)));

    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel",
            new ShovelItem(ModToolMaterials.RUBY, 0, 0f,
                    new FabricItemSettings().group(ModItemGroup.RUBIES)));

    public static final Item RUBY_HOE = registerItem("ruby_hoe",
            new ModHoeItem(ModToolMaterials.RUBY, 0, 3f,
                    new FabricItemSettings().group(ModItemGroup.RUBIES)));

    //ARMOR
    public static final Item RUBY_HELMET = registerItem("ruby_helmet",
            new ArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.RUBIES)));

    public static final Item RUBY_CHESTPLATE = registerItem("ruby_chestplate",
            new ArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.RUBIES)));

    public static final Item RUBY_LEGGINGS = registerItem("ruby_leggings",
            new ArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.RUBIES)));

    public static final Item RUBY_BOOTS = registerItem("ruby_boots",
            new ArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.RUBIES)));



    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registry.ITEM, new Identifier(VanillaRubies.MOD_ID, name), item);
    }

    public static void registerModItems()
    {
        VanillaRubies.LOGGER.debug(VanillaRubies.MOD_ID + ": Registering Items...");
    }
}
