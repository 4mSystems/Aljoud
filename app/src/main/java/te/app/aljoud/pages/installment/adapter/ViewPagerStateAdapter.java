package te.app.aljoud.pages.installment.adapter;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerStateAdapter extends FragmentStateAdapter {
    private final List<Fragment> pagers = new ArrayList<>();

    public ViewPagerStateAdapter(@NonNull Fragment fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return pagers.get(position);
    }

    @Override
    public int getItemCount() {
        return pagers.size();
    }

    public void addItems(Fragment fragment) {
        pagers.add(fragment);
    }
}
