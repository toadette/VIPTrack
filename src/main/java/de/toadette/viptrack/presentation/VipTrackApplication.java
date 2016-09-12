package de.toadette.viptrack.presentation;

import android.app.Application;
import dagger.ObjectGraph;

public class VipTrackApplication extends Application {
    private ObjectGraph graph;

    @Override
    public void onCreate() {
        super.onCreate();
        graph = ObjectGraph.create(new VipTrackModule(this));
    }

    public void inject(Object object) {
        graph.inject(object);
    }
}
