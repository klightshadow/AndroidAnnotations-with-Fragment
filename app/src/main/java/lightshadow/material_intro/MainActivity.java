package lightshadow.material_intro;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.heinrichreimersoftware.materialintro.view.InkPageIndicator;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;

import java.util.ArrayList;
import java.util.List;

import lightshadow.material_intro.adapters.ViewPagerAdapters;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    @ViewById(R.id.btn_startIntro)
    Button startIntro;

    @ViewById(R.id.vp_select)
    ViewPager viewPager;

    @ViewById(R.id.vp_indicator)
    InkPageIndicator inkPageIndicator;

    @ViewById(R.id.btn_ok)
    Button ok;

    @AfterViews
    void initViews() {
        getLayoutInflater();
        final LayoutInflater layoutInflater = LayoutInflater.from(this);

        View view1 = layoutInflater.inflate(R.layout.view_select_1, null);
        View view2 = layoutInflater.inflate(R.layout.view_select_2, null);

        List<View> views = new ArrayList<>();
        views.add(view1);
        views.add(view2);

        viewPager.setAdapter(new ViewPagerAdapters(views));
        inkPageIndicator.setViewPager(viewPager);

    }

    @Click(R.id.btn_startIntro)
    void clickStartIntro() {
        Intent intent = new Intent(this, MainIntroActivity.class);
        startActivity(intent);
    }

    @Click(R.id.btn_ok)
    void clickOK() {
//        showToast();
        Toast.makeText(this, String.valueOf(viewPager.getCurrentItem()), Toast.LENGTH_SHORT).show();
    }
}
