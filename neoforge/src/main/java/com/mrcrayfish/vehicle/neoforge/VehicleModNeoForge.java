package com.mrcrayfish.vehicle.neoforge;

import com.mrcrayfish.vehicle.Reference;
import com.mrcrayfish.vehicle.VehicleMod;
import net.neoforged.fml.common.Mod;

@Mod(Reference.MOD_ID)
public final class VehicleModNeoForge {

    public VehicleModNeoForge() {
        // Run our common setup.
        VehicleMod.init();
    }
}
