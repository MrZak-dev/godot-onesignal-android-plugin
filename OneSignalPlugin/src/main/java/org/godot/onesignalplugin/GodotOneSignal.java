package org.godot.onesignalplugin;

import androidx.annotation.NonNull;


import com.onesignal.OneSignal;

import org.godotengine.godot.Godot;
import org.godotengine.godot.plugin.GodotPlugin;
import org.godotengine.godot.plugin.UsedByGodot;

import java.util.Objects;

public class GodotOneSignal extends GodotPlugin {
    private static final String TAG = "GodotOneSignal";


    public GodotOneSignal(Godot godot) {
        super(godot);
    }

    @NonNull
    @Override
    public String getPluginName() {
        return "GodotOneSignal";
    }

    @UsedByGodot
    public void init(String appKey , boolean debug) {
        // OneSignal Initialization
        if(debug){
            OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);
        }

        OneSignal.initWithContext(Objects.requireNonNull(getActivity()));
        OneSignal.setAppId(appKey);
    }
}
