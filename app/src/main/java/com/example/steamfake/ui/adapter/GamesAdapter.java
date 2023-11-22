package com.example.steamfake.ui.adapter;

import android.content.Context;
import android.graphics.Paint;
import android.text.Spannable;
import android.text.Spanned;
import android.text.style.StrikethroughSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RemoteViews;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.steamfake.data.entity.Games;
import com.example.steamfake.databinding.CardDesignBinding;

import org.w3c.dom.Text;

import java.util.List;

public class GamesAdapter extends RecyclerView.Adapter<GamesAdapter.CardDesignHolder> {
    private List<Games> gamesList;
    private Context context;

    private TextView strikedPrice;


    public GamesAdapter(List<Games> gamesList, Context context) {
        this.gamesList = gamesList;
        this.context = context;
    }

    @NonNull
    @Override
    public CardDesignHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardDesignBinding binding = CardDesignBinding.inflate(LayoutInflater.from(context),parent,false);
        return new CardDesignHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CardDesignHolder holder, int position) {
        Games game = gamesList.get(position);
        CardDesignBinding g = holder.design;
        g.imageViewGame.setImageResource(context.getResources().getIdentifier(game.getImage(),"drawable",context.getPackageName()));

//        Log.e("Sonuç:","" + g.textViewPriceBefore.toString().getClass());
//        RemoteViews remoteViews = new RemoteViews();
//        remoteViews.setInt(g.textViewPriceBefore, "setPaintFlags", Paint.STRIKE_THRU_TEXT_FLAG | Paint.ANTI_ALIAS_FLAG);
//        g.textViewPriceBefore.setPaintFlags(g.textViewPriceBefore.getPaintFlags() &  ~Paint.STRIKE_THRU_TEXT_FLAG);

        g.textViewPriceBefore.setPaintFlags(g.textViewPriceBefore.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
        g.textViewPriceBefore.setText(game.getPrice_before());
        g.textViewDiscount.setText(game.getDiscount_amount());
        g.textViewPriceAfter.setText(game.getPrice());
    }

    @Override
    public int getItemCount() {
        return gamesList.size();
    }

    public class CardDesignHolder extends RecyclerView.ViewHolder{
        private CardDesignBinding design;

        public CardDesignHolder(CardDesignBinding design){
            super(design.getRoot());
            this.design = design;
        }
    }
}
