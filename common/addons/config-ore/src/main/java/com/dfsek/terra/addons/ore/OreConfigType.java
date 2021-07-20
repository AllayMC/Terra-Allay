package com.dfsek.terra.addons.ore;

import com.dfsek.terra.addons.ore.ores.Ore;
import com.dfsek.terra.api.TerraPlugin;
import com.dfsek.terra.api.config.ConfigFactory;
import com.dfsek.terra.api.config.ConfigPack;
import com.dfsek.terra.api.config.ConfigType;
import com.dfsek.terra.api.registry.OpenRegistry;
import com.dfsek.terra.api.util.reflection.TypeKey;

import java.util.function.Supplier;

public class OreConfigType implements ConfigType<OreTemplate, Ore> {
    private final OreFactory factory = new OreFactory();
    private final ConfigPack pack;
    public static final TypeKey<Ore> ORE_TYPE_TOKEN = new TypeKey<>(){};

    public OreConfigType(ConfigPack pack) {
        this.pack = pack;
    }

    @Override
    public OreTemplate getTemplate(ConfigPack pack, TerraPlugin main) {
        return new OreTemplate();
    }

    @Override
    public ConfigFactory<OreTemplate, Ore> getFactory() {
        return factory;
    }

    @Override
    public TypeKey<Ore> getTypeClass() {
        return ORE_TYPE_TOKEN;
    }

    @Override
    public Supplier<OpenRegistry<Ore>> registrySupplier(ConfigPack pack) {
        return this.pack.getRegistryFactory()::create;
    }
}
