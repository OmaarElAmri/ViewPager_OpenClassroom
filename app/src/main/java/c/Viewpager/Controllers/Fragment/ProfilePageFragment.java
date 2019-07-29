package c.Viewpager.Controllers.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import c.Viewpager.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProfilePageFragment extends Fragment {


    public static ProfilePageFragment newInstance() {
        return (new ProfilePageFragment());
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile_page, container, false);
    }

}
