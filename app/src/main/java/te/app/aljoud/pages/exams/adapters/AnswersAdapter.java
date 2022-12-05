package te.app.aljoud.pages.exams.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import te.app.aljoud.R;
import te.app.aljoud.databinding.ItemAnswerBinding;
import te.app.aljoud.pages.exams.models.AnswersItem;
import te.app.aljoud.pages.exams.viewModels.ItemAnswerViewModel;
import te.app.aljoud.utils.helper.MovementHelper;


public class AnswersAdapter extends RecyclerView.Adapter<AnswersAdapter.ViewHolder> {
    List<AnswersItem> answersItemList;
    Context context;
    public MutableLiveData<AnswersItem> liveData = new MutableLiveData<>();
    public int selectedAnswer = 0;

    public AnswersAdapter() {
        this.answersItemList = new ArrayList<>();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_answer,
                parent, false);
        this.context = parent.getContext();
        return new ViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        AnswersItem categoriesData = answersItemList.get(position);
        ItemAnswerViewModel itemMenuViewModel = new ItemAnswerViewModel(categoriesData);
        itemMenuViewModel.getLiveData().observe((LifecycleOwner) MovementHelper.unwrap(context), o -> {
            selectedAnswer = categoriesData.getId();
            liveData.setValue(categoriesData);
            holder.itemMenuBinding.radio.setChecked(true);
            updateCorrectAnswer();
        });
        holder.itemMenuBinding.itemContainer.setBackground(ContextCompat.getDrawable(context, categoriesData.getItemBackground()));
        holder.itemMenuBinding.itemContainer.setEnabled(categoriesData.isEnabled());
        holder.setViewModel(itemMenuViewModel);
    }


    public void update(List<AnswersItem> dataList) {
        this.answersItemList.clear();
        answersItemList.addAll(dataList);
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
        return answersItemList.size();
    }

    public void updateCorrectAnswer() {
        List<AnswersItem> answersItems = new ArrayList<>(answersItemList);
        for (int i = 0; i < answersItems.size(); i++) {
            if (answersItems.get(i).getCorrect().equals("1"))
                answersItems.get(i).setItemBackground(R.drawable.corner_view_green);
            else
                answersItems.get(i).setItemBackground(R.drawable.corner_view_red);
            answersItems.get(i).setEnabled(false);
        }
        update(answersItems);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ItemAnswerBinding itemMenuBinding;

        ViewHolder(View itemView) {
            super(itemView);
            bind();
        }


        void bind() {
            if (itemMenuBinding == null) {
                itemMenuBinding = DataBindingUtil.bind(itemView);
            }
        }

        void unbind() {
            if (itemMenuBinding != null) {
                itemMenuBinding.unbind();
            }
        }

        void setViewModel(ItemAnswerViewModel itemViewModels) {
            if (itemMenuBinding != null) {
                itemMenuBinding.setItemViewModel(itemViewModels);
            }
        }
    }
}
