package de.toadette.viptrack.presentation;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.TextView;

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
        setContentView(R.layout.activity_start);
        ((VipTrackApplication) getApplication()).inject(this);
        init();
    }

    private void init() {
        try {
            Vip vipByUserName = vipRepository.getVipByUserId(1);
            TextView userNameTextView = (TextView) findViewById(R.id.userNameTextView);
            TextView postCountTextView = (TextView) findViewById(R.id.postsCountTextView);
            userNameTextView.setText(vipByUserName.getUsername());
            postCountTextView.setText(String.valueOf(vipByUserName.getPostsCount()));
        } catch (VipNotFoundException e) {
        }
    }

}