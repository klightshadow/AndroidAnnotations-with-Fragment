package lightshadow.material_intro;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.heinrichreimersoftware.materialintro.app.SlideFragment;
import com.squareup.picasso.Picasso;

/**
 * Created by lightshadow on 2017/2/15.
 */

public class FragmentIntro4 extends SlideFragment {
    ImageView imageView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_intro_4, container, false);
        imageView = (ImageView)view.findViewById(R.id.iv_img4);
        Picasso.with(getActivity().getApplicationContext()).load(R.mipmap.dsc02473).fit().into(imageView);
        return view;
    }
}
