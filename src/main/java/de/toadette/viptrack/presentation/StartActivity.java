package de.toadette.viptrack.presentation;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import javax.inject.Inject;

import de.toadette.viptrack.R;
import de.toadette.viptrack.domain.model.vip.Vip;
import de.toadette.viptrack.domain.model.vip.VipNotFoundException;
import de.toadette.viptrack.domain.model.vip.VipRepository;


public class StartActivity extends FragmentActivity {


    @Inject
    VipRepository vipRepository;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        ((VipTrackApplication) getApplication()).inject(this);
        init();
    }

    private void init() {
        try {
            Vip vipByUserName = vipRepository.getVipByUserId(1);
        } catch (VipNotFoundException e) {
        }
    }

}