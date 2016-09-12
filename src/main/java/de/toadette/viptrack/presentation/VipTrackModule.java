package de.toadette.viptrack.presentation;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import de.toadette.viptrack.domain.model.vip.VipRepository;
import de.toadette.viptrack.port.adapter.FakeVipRepository;

@Module(injects = {
        StartActivity.class
})
public class VipTrackModule {
    private Context context;

    public VipTrackModule(Context context) {
        this.context = context;
    }


    @Provides
    @Singleton
    VipRepository provideVipRepository() {
        return new FakeVipRepository(context);
    }
}
