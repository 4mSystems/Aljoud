package te.app.aljoud.pages.installment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayoutMediator;

import te.app.aljoud.R;
import te.app.aljoud.base.BaseFragment;
import te.app.aljoud.base.IApplicationComponent;
import te.app.aljoud.base.MyApplication;
import te.app.aljoud.databinding.FragmentInstallmentBinding;
import te.app.aljoud.pages.installment.adapter.ViewPagerStateAdapter;

public class InstallmentFragment extends BaseFragment {
    FragmentInstallmentBinding installmentBinding;
    ViewPagerStateAdapter viewPagerStateAdapter;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        installmentBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_installment, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        setupPager();
        return installmentBinding.getRoot();
    }

    private void setupPager() {
        viewPagerStateAdapter = new ViewPagerStateAdapter(this);
        viewPagerStateAdapter.addItems(new PaidInstallmentFragment());
        viewPagerStateAdapter.addItems(new UnPaidInstallmentFragment());
        viewPagerStateAdapter.addItems(new LateInstallmentFragment());
        installmentBinding.pager.setOffscreenPageLimit(ViewPager2.OFFSCREEN_PAGE_LIMIT_DEFAULT);
        installmentBinding.pager.setAdapter(viewPagerStateAdapter);
        new TabLayoutMediator(installmentBinding.tabLayout, installmentBinding.pager,
                (tab, position) -> {
                    if (position == 0) {
                        tab.setText(getString(R.string.paid));
                        tab.setIcon(R.drawable.ic_paid);
                    } else if (position == 1) {
                        tab.setText(getString(R.string.unpaid));
                        tab.setIcon(R.drawable.ic_chat);
                    } else if (position == 2) {
                        tab.setText(getString(R.string.late));
                        tab.setIcon(R.drawable.ic_late);
                    }
                }
        ).attach();

    }

}
