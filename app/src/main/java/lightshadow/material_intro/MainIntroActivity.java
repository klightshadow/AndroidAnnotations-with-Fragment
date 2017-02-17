package lightshadow.material_intro;

import android.os.Bundle;

import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.FragmentSlide;

import lightshadow.material_intro.fragments.FragmentIntro1_;
import lightshadow.material_intro.fragments.FragmentIntro2_;
import lightshadow.material_intro.fragments.FragmentIntro3;
import lightshadow.material_intro.fragments.FragmentIntro4_;

/**
 * Created by lightshadow on 2017/2/15.
 */

public class MainIntroActivity extends IntroActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addSlide(new FragmentSlide.Builder()
                .background(R.color.color1)
                .fragment(new FragmentIntro1_())
                .build());

        addSlide(new FragmentSlide.Builder()
                .background(R.color.color2)
                .fragment(new FragmentIntro2_())
                .build());

        addSlide(new FragmentSlide.Builder()
                .background(R.color.color3)
                .fragment(new FragmentIntro3())
                .build());

        addSlide(new FragmentSlide.Builder()
                .background(R.color.color4)
                .fragment(new FragmentIntro4_())
                .build());
    }
}
