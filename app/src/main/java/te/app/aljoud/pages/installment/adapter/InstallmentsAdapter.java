package te.app.aljoud.pages.installment.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import te.app.aljoud.R;
import te.app.aljoud.databinding.ItemInstallmentBinding;
import te.app.aljoud.pages.installment.models.InstallmentData;
import te.app.aljoud.pages.installment.viewModels.ItemInstallmentViewModel;

public class InstallmentsAdapter extends RecyclerView.Adapter<InstallmentsAdapter.ViewHolder> {
    public List<InstallmentData> installmentDataList;
    private Context context;
    public MutableLiveData<InstallmentData> onSelected = new MutableLiveData<>();

    public InstallmentsAdapter() {
        this.installmentDataList = new ArrayList<>();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_installment,
                parent, false);
        this.context = parent.getContext();
        return new ViewHolder(itemView);
    }

    @SuppressLint("RecyclerView")
    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        InstallmentData installmentData = installmentDataList.get(position);
        ItemInstallmentViewModel installmentUiState = new ItemInstallmentViewModel(installmentData);
        installmentUiState.getLiveData().observe(((LifecycleOwner) context), o -> {
            onSelected.setValue(installmentData);
        });
        holder.setViewModel(installmentUiState);
    }


    public void update(@NotNull List<InstallmentData> dataList) {
        this.installmentDataList.clear();
        installmentDataList.addAll(dataList);
        notifyDataSetChanged();
    }


    @Override
    public void onViewAttachedToWindow(@NotNull ViewHolder holder) {
        super.onViewAttachedToWindow(holder);
        holder.bind();
    }

    @Override
    public void onViewDetachedFromWindow(@NotNull ViewHolder holder) {
        super.onViewDetachedFromWindow(holder);
        holder.unbind();
    }

    @Override
    public int getItemCount() {
        return installmentDataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ItemInstallmentBinding binding;

        ViewHolder(View itemView) {
            super(itemView);
            bind();
        }


        void bind() {
            if (binding == null) {
                binding = DataBindingUtil.bind(itemView);
            }
        }

        void unbind() {
            if (binding != null) {
                binding.unbind();
            }
        }

        void setViewModel(ItemInstallmentViewModel itemViewModels) {
            if (binding != null) {
                binding.setItemViewModel(itemViewModels);
            }
        }
    }
}
