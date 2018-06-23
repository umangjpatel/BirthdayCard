package io.github.umangjpatel.bdaycard;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import io.github.umangjpatel.bdaycard.databinding.ActivityCardBinding;

public class CardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCardBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_card);
        binding.setLifecycleOwner(this);
        CardViewModel cardViewModel = ViewModelProviders.of(this).get(CardViewModel.class);
        binding.setCardViewModel(cardViewModel);
    }
}
