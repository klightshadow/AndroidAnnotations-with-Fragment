package lightshadow.material_intro;

import android.app.Fragment;
import android.os.Bundle;
import android.widget.ImageView;

import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.FragmentSlide;

import org.androidannotations.annotations.ViewById;

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
                .fragment(new FragmentIntro4())
                .build());
    }
}
