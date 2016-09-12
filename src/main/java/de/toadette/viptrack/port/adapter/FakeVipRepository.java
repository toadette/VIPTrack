package de.toadette.viptrack.port.adapter;

import android.content.Context;

import de.toadette.viptrack.domain.model.vip.Vip;
import de.toadette.viptrack.domain.model.vip.VipRepository;

public class FakeVipRepository implements VipRepository {

    private Context context;

    public FakeVipRepository(Context context) {

        this.context = context;
    }

    @Override
    public Vip getVipByUserName(String username) {
        return null;
    }
}
