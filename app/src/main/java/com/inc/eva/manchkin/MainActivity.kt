package com.inc.eva.manchkin

import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.GridLayoutManager
import com.inc.eva.manchkin.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding
        get() = ActivityMainBinding::inflate

    val adapter by lazy { PlayersAdapter() }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.listPlayers.adapter = adapter
        binding.listPlayers.layoutManager = GridLayoutManager(this, 2)

        binding.btnAddPlayer.setOnClickListener{
            adapter.addItem(Player(binding.tvPlayerName.text.toString()))
        }
    }


}

