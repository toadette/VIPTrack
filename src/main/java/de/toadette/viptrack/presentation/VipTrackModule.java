package de.toadette.viptrack.presentation;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import de.toadette.viptrack.domain.model.vip.VipRepository;
import de.toadette.viptrack.port.adapter.FakeVipRepository;

@Module(injects = {
        StartActivity.class
})
public class VipTrackModule {


    @Provides
    @Singleton
    VipRepository provideVipRepository() {
        return new FakeVipRepository();
    }
}
