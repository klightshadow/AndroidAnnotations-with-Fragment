package lightshadow.material_intro.fragments;

import android.webkit.WebView;
import android.widget.Button;

import com.heinrichreimersoftware.materialintro.app.SlideFragment;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

import lightshadow.material_intro.R;

/**
 * Created by lightshadow on 2017/2/15.
 */

@EFragment(R.layout.fragment_intro_4)
public class FragmentIntro4 extends SlideFragment {

//    @ViewById(R.id.iv_img4)
//    ImageView imageView;

    boolean isConfirm = false;

    @ViewById(R.id.wv_terms)
    WebView webView;

    @ViewById(R.id.btn_termsConfirm)
    Button termsConfirm;

    @ViewById(R.id.btn_termsReject)
    Button termsReject;

    @AfterViews
    void initViews() {
        webView.loadUrl("http://www.fitobe.com/zh-Hant/terms_content.html");
    }

    @Override
    public boolean canGoForward() {
        return isConfirm;
    }

    @Click(R.id.btn_termsConfirm)
    void clickTermsConfirm() {
        isConfirm = true;
    }

    //    @Nullable
//    @Override
//    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.fragment_intro_4, container, false);
//        imageView = (ImageView)view.findViewById(R.id.iv_img4);
//        Picasso.with(getActivity().getApplicationContext()).load(R.mipmap.dsc02473).fit().into(imageView);
//        return view;
//    }
}
