package com.example.steamfake.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.steamfake.R;
import com.example.steamfake.data.entity.Games;
import com.example.steamfake.databinding.FragmentMainPageBinding;
import com.example.steamfake.ui.adapter.GamesAdapter;

import java.util.ArrayList;


public class MainPageFragment extends Fragment {
    private FragmentMainPageBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMainPageBinding.inflate(inflater,container,false);

        binding.gamesRv.setLayoutManager(new LinearLayoutManager(requireContext()));

        ArrayList<Games> gamesList = new ArrayList<>();
        Games game1 = new Games(1,"Lies of P","lies_of_pie","$28.79 USD","-%20","$35.99");
        Games game2 = new Games(2,"Stellaris","stellaris","$7.19 USD","-%70","$23.99");
        Games game3 = new Games(3,"Call Of Duty","call_of_duty","$19.99 USD","-%67","$59.99");
        Games game4 = new Games(4,"F1 2023","f1_2023","$27.99 USD","-%60","$69.99");
        Games game5 = new Games(5,"Victoria","victoria","$14.99 USD","-%50","$29.99");
        Games game6 = new Games(6,"Remnant","remnant","$34.99 USD","-%30","$49.99");
        Games game7 = new Games(7,"Sekiro","sekiro","$29.99 USD","-%50","$59.99");

        gamesList.add(game1);
        gamesList.add(game2);
        gamesList.add(game7);
        gamesList.add(game3);
        gamesList.add(game4);
        gamesList.add(game5);
        gamesList.add(game6);

        GamesAdapter adapter = new GamesAdapter(gamesList,requireContext());
        binding.gamesRv.setAdapter(adapter);


        return binding.getRoot();
    }
}