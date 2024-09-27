package com.inc.eva.manchkin

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.inc.eva.manchkin.databinding.ListItemPlayersBinding


class PlayersAdapter : RecyclerView.Adapter<PlayerViewHolder>() {

    val items = mutableListOf<Player>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayerViewHolder {
        return PlayerViewHolder(
            ListItemPlayersBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: PlayerViewHolder, position: Int) {
        holder.bind(items[position])
    }

    fun addItem(player: Player) {
        items.add(0, player)
        notifyItemChanged(0)
    }
}

class PlayerViewHolder(private val binding: ListItemPlayersBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bind(item: Player) {
        binding.tvPlayerName.text = item.name
    }
}