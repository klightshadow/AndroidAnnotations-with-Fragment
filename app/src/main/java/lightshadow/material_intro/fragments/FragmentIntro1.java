package lightshadow.material_intro.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.heinrichreimersoftware.materialintro.app.SlideFragment;
import com.squareup.picasso.Picasso;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

import lightshadow.material_intro.R;

/**
 * Created by lightshadow on 2017/2/15.
 */

@EFragment(R.layout.fragment_intro_1)
public class FragmentIntro1 extends SlideFragment {
    @ViewById(R.id.iv_img1)
    ImageView imageView;

    @AfterViews
    void initView() {
        Picasso.with(getActivity().getApplicationContext()).load(R.mipmap.a083a2505).fit().into(imageView);
    }


//    @Nullable
//    @Override
//    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.fragment_intro_1, container, false);
//        imageView = (ImageView) view.findViewById(R.id.iv_img1);
//        Picasso.with(getActivity().getApplicationContext()).load(R.mipmap.a083a2505).fit().into(imageView);
//        return view;
//    }
}
