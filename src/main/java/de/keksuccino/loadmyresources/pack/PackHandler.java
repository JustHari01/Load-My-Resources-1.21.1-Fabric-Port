package de.keksuccino.loadmyresources.pack;

import de.keksuccino.loadmyresources.LoadMyResources;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackLocationInfo;
import net.minecraft.server.packs.PackSelectionConfig;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.repository.PackCompatibility;
import net.minecraft.server.packs.repository.PackSource;
import net.minecraft.world.flag.FeatureFlags;
import java.io.File;
import java.util.List;
import java.util.Optional;

public class PackHandler {

    public static final String PACK_NAME = "loadmyresources.hiddenpack";
    public static final int PACK_FORMAT = 34;
    public static final String PACK_DESCRIPTION = "LMR Resources";
    public static final ResourceLocation DUMMY_PACK_META = ResourceLocation.fromNamespaceAndPath("loadmyresources", "dummy.pack.mcmeta");

    public static File resourcesDirectory = new File(LoadMyResources.getGameDirectory(), "resources/");

    public static void init() {

        if (LoadMyResources.config != null) {
            resourcesDirectory = new File(LoadMyResources.getGameDirectory(), LoadMyResources.config.getOrDefault("resource_path", "resources/"));
        } else {
            LoadMyResources.LOGGER.error("[LOAD MY RESOURCES] ERROR: Config not loaded! Can't get resource path! Path set to default 'resources/'!");
        }

        LoadMyResources.LOGGER.info("[LOAD MY RESOURCES] PackHandler initialized! Resources path set to: " + resourcesDirectory.getAbsolutePath());

    }

    public static void prepareResourcesFolder() {

        if (!resourcesDirectory.isDirectory()) {
            resourcesDirectory.mkdirs();
        }

    }

    public static Pack createPack(Pack.ResourcesSupplier resources) {
        PackLocationInfo location = new PackLocationInfo(PACK_NAME, Component.literal(PACK_NAME), PackSource.DEFAULT, Optional.empty());
        Pack.Metadata metadata = new Pack.Metadata(Component.literal(PACK_DESCRIPTION), PackCompatibility.COMPATIBLE, FeatureFlags.VANILLA_SET, List.of());
        PackSelectionConfig selectionConfig = new PackSelectionConfig(true, Pack.Position.TOP, true);
        return new Pack(location, resources, metadata, selectionConfig);
    }

}


