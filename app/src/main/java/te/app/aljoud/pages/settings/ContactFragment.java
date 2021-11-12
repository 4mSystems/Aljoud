package te.app.aljoud.pages.settings;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;

import te.app.aljoud.R;
import te.app.aljoud.base.BaseFragment;
import te.app.aljoud.base.IApplicationComponent;
import te.app.aljoud.base.MyApplication;
import te.app.aljoud.databinding.FragmentContactsBinding;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.pages.settings.models.AboutResponse;
import te.app.aljoud.pages.settings.viewModels.SettingsViewModel;
import te.app.aljoud.utils.Constants;
import te.app.aljoud.utils.helper.AppHelper;

public class ContactFragment extends BaseFragment {

    private Context context;
    FragmentContactsBinding binding;
    @Inject
    SettingsViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_contacts, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        viewModel.about();
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe((LifecycleOwner) context, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            switch (((Mutable) o).message) {
                case Constants.ABOUT:
                    viewModel.setAboutMain(((AboutResponse) mutable.object).getData());
                    break;
                case Constants.WHATS:
                    AppHelper.openWhats(((Activity) context), viewModel.getAboutMain().getAboutData().getWhatsapp());
                    break;
                case Constants.FACEBOOK:
                    AppHelper.openBrowser(context, viewModel.getAboutMain().getAboutData().getFacebook());
                    break;
                case Constants.YOUTUBE:
                    AppHelper.openBrowser(context, viewModel.getAboutMain().getAboutData().getYoutube());
                    break;
            }

        });
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getRepository().setLiveData(viewModel.liveData);
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }
}
