package xyz.iwolfking.woldsvaults.datagen;

import blusunrize.immersiveengineering.api.EnumMetals;
import blusunrize.immersiveengineering.api.tool.conveyor.IConveyorType;
import blusunrize.immersiveengineering.common.blocks.wooden.TreatedWoodStyles;
import blusunrize.immersiveengineering.common.register.IEBlocks;
import blusunrize.immersiveengineering.common.register.IEItems;
import com.buuz135.functionalstorage.FunctionalStorage;
import com.buuz135.functionalstorage.item.StorageUpgradeItem;
import com.progwml6.ironchest.common.block.IronChestsBlocks;
import com.progwml6.ironchest.common.item.IronChestsItems;
import com.simibubi.create.AllBlocks;
import com.simibubi.create.AllItems;
import ironfurnaces.IronFurnaces;
import ironfurnaces.init.Registration;
import irongenerators.init.IrongeneratorsModBlocks;
import mcjty.rftoolsstorage.RFToolsStorage;
import mcjty.rftoolsstorage.modules.craftingmanager.CraftingManagerModule;
import mcjty.rftoolsstorage.modules.modularstorage.ModularStorageModule;
import mcjty.rftoolsstorage.modules.scanner.StorageScannerModule;
import mekanism.common.registries.MekanismBlocks;
import mekanism.common.registries.MekanismItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.ForgeRegistries;
import shadows.hostilenetworks.Hostile;
import xyz.iwolfking.vhapi.api.datagen.boxes.AbstractModBoxProvider;
import xyz.iwolfking.vhapi.api.loaders.box.MappedWeightedProductEntryConfigLoader;
import xyz.iwolfking.vhapi.api.loaders.box.lib.MappedWeightedProductEntryConfig;
import xyz.iwolfking.woldsvaults.WoldsVaults;

public class ModModBoxProvider extends AbstractModBoxProvider {
    protected ModModBoxProvider(DataGenerator generator) {
        super(generator, WoldsVaults.MOD_ID);
    }

    @Override
    public void registerConfigs() {
        add("immersive_engineering", builder -> {
            builder.addModBox("Immersive Engineering", productEntryListBuilder -> {
               productEntryListBuilder.add(IEBlocks.MetalDecoration.ENGINEERING_LIGHT.asItem(), 1, 4, null, 25);
               productEntryListBuilder.add(IEBlocks.MetalDecoration.ENGINEERING_RS.asItem(), 1, 4, null, 20);
               productEntryListBuilder.add(IEBlocks.MetalDecoration.ENGINEERING_HEAVY.asItem(), 1, 4, null, 10);
               productEntryListBuilder.add(IEBlocks.MetalDevices.FLUID_PUMP.asItem(), 1, 1, null, 10);
               productEntryListBuilder.add(IEBlocks.Metals.STORAGE.get(EnumMetals.STEEL).asItem(), 1, 3, null, 20);
               productEntryListBuilder.add(IEBlocks.MetalDevices.FLUID_PIPE.asItem(), 8, 16, null, 15);
               productEntryListBuilder.add(IEBlocks.MetalDevices.CAPACITOR_LV.asItem(), 1, 1, null, 20);
               productEntryListBuilder.add(IEBlocks.MetalDevices.CAPACITOR_MV.asItem(), 1, 1, null, 10);
               productEntryListBuilder.add(IEBlocks.MetalDevices.CAPACITOR_HV.asItem(), 1, 1, null, 5);
               productEntryListBuilder.add(IEBlocks.MetalDevices.TESLA_COIL.asItem(), 1, 1, null, 5);
               productEntryListBuilder.add(IEBlocks.MetalDevices.CLOCHE.asItem(), 1, 1, null, 5);
               productEntryListBuilder.add(IEBlocks.WoodenDevices.WOODEN_BARREL.asItem(), 2, 2, null, 20);
               productEntryListBuilder.add(IEBlocks.WoodenDecoration.TREATED_WOOD.get(TreatedWoodStyles.HORIZONTAL).asItem(), 16, 32, null, 25);
            });
        });

        add("iron_mods", builder -> {
            builder.addModBox("Oops, All Iron Mods", productEntryListBuilder -> {
                productEntryListBuilder.add(IronChestsBlocks.COPPER_CHEST.get().asItem(), 1, 1, null, 75);
                productEntryListBuilder.add(IronChestsBlocks.IRON_CHEST.get().asItem(), 1, 1, null, 50);
                productEntryListBuilder.add(IronChestsBlocks.GOLD_CHEST.get().asItem(), 1, 1, null, 25);
                productEntryListBuilder.add(IronChestsBlocks.DIAMOND_CHEST.get().asItem(), 1, 1, null, 10);
                productEntryListBuilder.add(IronChestsBlocks.CRYSTAL_CHEST.get().asItem(), 1, 1, null, 10);
                productEntryListBuilder.add(IronChestsBlocks.OBSIDIAN_CHEST.get().asItem(), 1, 1, null, 5);
                productEntryListBuilder.add(Registration.IRON_FURNACE.get().asItem(), 1, 1, null, 25);
                productEntryListBuilder.add(Registration.GOLD_FURNACE.get().asItem(), 1, 1, null, 15);
                productEntryListBuilder.add(Registration.DIAMOND_FURNACE.get().asItem(), 1, 1, null, 5);
                productEntryListBuilder.add(Registration.OBSIDIAN_FURNACE.get().asItem(), 1, 1, null, 1);
                productEntryListBuilder.add(IrongeneratorsModBlocks.GOLD_GENERATOR.get().asItem(), 1, 1, null, 25);
                productEntryListBuilder.add(IrongeneratorsModBlocks.DIAMOND_GENERATOR.get().asItem(), 1, 1, null, 10);
                productEntryListBuilder.add(IrongeneratorsModBlocks.OBSIDIAN_GENERATOR.get().asItem(), 1, 1, null, 5);
                productEntryListBuilder.add(IrongeneratorsModBlocks.IRON_GENERATOR.get().asItem(), 1, 1, null, 35);
            });
        });

        add("sophisticated_storage", builder -> {
            builder.addModBox("Sophisticated Storage", productEntryListBuilder -> {
                productEntryListBuilder.add(net.p3pp3rf1y.sophisticatedstorage.init.ModItems.BASIC_TO_IRON_TIER_UPGRADE.get(), 1, 1, null, 30);
                productEntryListBuilder.add(net.p3pp3rf1y.sophisticatedstorage.init.ModItems.BASIC_TO_GOLD_TIER_UPGRADE.get(), 1, 1, null, 20);
                productEntryListBuilder.add(net.p3pp3rf1y.sophisticatedstorage.init.ModItems.BASIC_TO_DIAMOND_TIER_UPGRADE.get(), 1, 1, null, 10);
                productEntryListBuilder.add(net.p3pp3rf1y.sophisticatedstorage.init.ModItems.BASIC_TO_NETHERITE_TIER_UPGRADE.get(), 1, 1, null, 5);
                productEntryListBuilder.add(net.p3pp3rf1y.sophisticatedstorage.init.ModItems.STACK_UPGRADE_TIER_2.get(), 2, 2, null, 60);
                productEntryListBuilder.add(net.p3pp3rf1y.sophisticatedstorage.init.ModItems.STACK_UPGRADE_TIER_3.get(), 1, 2, null, 20);
                productEntryListBuilder.add(net.p3pp3rf1y.sophisticatedstorage.init.ModItems.STACK_UPGRADE_TIER_4.get(), 1, 2, null, 5);
                productEntryListBuilder.add(net.p3pp3rf1y.sophisticatedstorage.init.ModItems.VOID_UPGRADE.get(), 1, 1, null, 30);
                productEntryListBuilder.add(net.p3pp3rf1y.sophisticatedstorage.init.ModItems.COMPRESSION_UPGRADE.get(), 1, 1, null, 30);
                productEntryListBuilder.add(net.p3pp3rf1y.sophisticatedstorage.init.ModItems.HOPPER_UPGRADE.get(), 1, 1, null, 30);
                productEntryListBuilder.add(net.p3pp3rf1y.sophisticatedstorage.init.ModItems.FEEDING_UPGRADE.get(), 1, 1, null, 10);
                productEntryListBuilder.add(net.p3pp3rf1y.sophisticatedstorage.init.ModItems.CRAFTING_UPGRADE.get(), 1, 1, null, 10);
                productEntryListBuilder.add(net.p3pp3rf1y.sophisticatedstorage.init.ModItems.JUKEBOX_UPGRADE.get(), 1, 1, null, 5);
                productEntryListBuilder.add(net.p3pp3rf1y.sophisticatedstorage.init.ModItems.AUTO_SMELTING_UPGRADE.get(), 1, 1, null, 5);
                productEntryListBuilder.add(net.p3pp3rf1y.sophisticatedstorage.init.ModItems.MAGNET_UPGRADE.get(), 1, 1, null, 15);
                productEntryListBuilder.add(net.p3pp3rf1y.sophisticatedstorage.init.ModItems.ADVANCED_MAGNET_UPGRADE.get(), 1, 1, null, 15);
                productEntryListBuilder.add(net.p3pp3rf1y.sophisticatedstorage.init.ModItems.ADVANCED_HOPPER_UPGRADE.get(), 1, 1, null, 15);
                productEntryListBuilder.add(net.p3pp3rf1y.sophisticatedstorage.init.ModBlocks.CONTROLLER.get().asItem(), 1, 1, null, 5);
                productEntryListBuilder.add(net.p3pp3rf1y.sophisticatedstorage.init.ModBlocks.STORAGE_LINK.get().asItem(), 1, 1, null, 10);
            });
        });

        add("rftools_storage", builder -> {
            builder.addModBox("RFTools Storage", productEntryListBuilder -> {
                productEntryListBuilder.add(StorageScannerModule.STORAGE_SCANNER_ITEM.get(), 1, 1, null, 10);
                productEntryListBuilder.add(ModularStorageModule.MODULAR_STORAGE_ITEM.get(), 1, 1, null, 50);
                productEntryListBuilder.add(ModularStorageModule.STORAGE_MODULE0.get(), 1, 1, null, 200);
                productEntryListBuilder.add(ModularStorageModule.STORAGE_MODULE1.get(), 1, 1, null, 100);
                productEntryListBuilder.add(ModularStorageModule.STORAGE_MODULE3.get(), 1, 1, null, 25);
            });
        });

        add("functional_storage", builder -> {
            builder.addModBox("Functional Storage", productEntryListBuilder -> {
                productEntryListBuilder.add(FunctionalStorage.COMPACTING_DRAWER.getKey().get().asItem(), 1, 1, null, 10);
                productEntryListBuilder.add(FunctionalStorage.FLUID_DRAWER_1.getKey().get().asItem(), 1, 1, null, 10);
                productEntryListBuilder.add(FunctionalStorage.DRAWER_CONTROLLER.getKey().get().asItem(), 1, 1, null, 1);
                productEntryListBuilder.add(FunctionalStorage.CONTROLLER_EXTENSION.getKey().get().asItem(), 1, 1, null, 5);
                productEntryListBuilder.add(FunctionalStorage.COLLECTOR_UPGRADE.get(), 1, 1, null, 5);
                productEntryListBuilder.add(FunctionalStorage.PULLING_UPGRADE.get(), 1, 1, null, 5);
                productEntryListBuilder.add(FunctionalStorage.VOID_UPGRADE.get(), 1, 1, null, 5);
                productEntryListBuilder.add(FunctionalStorage.ENDER_DRAWER.getKey().get().asItem(), 1, 1, null, 4);
                productEntryListBuilder.add(FunctionalStorage.STORAGE_UPGRADES.get(StorageUpgradeItem.StorageTier.COPPER).get(), 1, 1, null, 40);
                productEntryListBuilder.add(FunctionalStorage.STORAGE_UPGRADES.get(StorageUpgradeItem.StorageTier.GOLD).get(), 1, 1, null, 20);
                productEntryListBuilder.add(FunctionalStorage.STORAGE_UPGRADES.get(StorageUpgradeItem.StorageTier.DIAMOND).get(), 1, 1, null, 10);
                productEntryListBuilder.add(FunctionalStorage.STORAGE_UPGRADES.get(StorageUpgradeItem.StorageTier.NETHERITE).get(), 1, 1, null, 5);
                productEntryListBuilder.add(FunctionalStorage.FRAMED_COMPACTING_DRAWER.getKey().get().asItem(), 1, 1, null, 10);
            });
        });

        add("hostile_neural_networks", builder -> {
            builder.addModBox("Hostile Neural Networks", productEntryListBuilder -> {
                productEntryListBuilder.add(Hostile.Items.EMPTY_PREDICTION, 32, 64, null, 120);
                productEntryListBuilder.add(Hostile.Items.BLANK_DATA_MODEL, 1, 1, null, 60);
                productEntryListBuilder.add(Hostile.Blocks.SIM_CHAMBER.asItem(), 1, 1, null, 5);
                productEntryListBuilder.add(Hostile.Blocks.LOOT_FABRICATOR.asItem(), 1, 1, null, 5);
            });
        });

        add("create", builder -> {
            builder.addModBox("Create", productEntryListBuilder -> {
                productEntryListBuilder.add(AllBlocks.ROTATION_SPEED_CONTROLLER.get().asItem(), 1, 1, null, 5);
                productEntryListBuilder.add(AllItems.POTATO_CANNON.get().asItem(), 1, 1, null, 3);
                productEntryListBuilder.add(AllItems.WAND_OF_SYMMETRY.get().asItem(), 1, 1, null, 2);
            });
        });

        add("mekanism", builder -> {
            builder.addModBox("Mekanism", productEntryListBuilder -> {
                productEntryListBuilder.add(MekanismBlocks.ULTIMATE_ENERGY_CUBE.asItem(), 1, 1, null, 3);
                productEntryListBuilder.add(MekanismBlocks.STEEL_BLOCK.asItem(), 4, 8, null, 15);
                productEntryListBuilder.add(MekanismItems.FLAMETHROWER.get(), 1, 1, null, 2);
                productEntryListBuilder.add(MekanismItems.ULTIMATE_TIER_INSTALLER.get(), 1, 1, null, 2);
                productEntryListBuilder.add(MekanismItems.ATOMIC_ALLOY.get(), 2, 8, null, 5);
                productEntryListBuilder.add(MekanismItems.REINFORCED_ALLOY.get(), 4, 12, null, 20);
                productEntryListBuilder.add(MekanismItems.INFUSED_ALLOY.get(), 16, 16, null, 35);
                productEntryListBuilder.add(MekanismItems.FREE_RUNNERS.get(), 1, 1, null, 2);
            });
        });

    }

}
