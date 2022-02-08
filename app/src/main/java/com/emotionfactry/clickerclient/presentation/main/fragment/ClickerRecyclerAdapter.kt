package com.emotionfactry.clickerclient.presentation.main.fragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.emotionfactry.clickerclient.databinding.ListItemClickerBinding
import com.emotionfactry.clickerclient.domain.model.Counter

class ClickerRecyclerAdapter : RecyclerView.Adapter<ClickerHolder>() {

    private lateinit var _counterList: MutableList<Counter>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClickerHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ListItemClickerBinding.inflate(inflater, parent, false)
        return ClickerHolder(binding)
    }

    override fun onBindViewHolder(holder: ClickerHolder, position: Int) {
        holder.bind(_counterList[position])
    }

    override fun getItemCount(): Int {
        return _counterList.size
    }

    fun fillAdapter(counterList: MutableList<Counter>){
        _counterList = counterList
    }

}

class ClickerHolder(
    private val binding: ListItemClickerBinding
): RecyclerView.ViewHolder(binding.root) {
    private lateinit var counter: Counter

    fun bind(counter: Counter){
        binding.itemClickerTitle.setText(counter.title)
        binding.itemClickerSub.setText(counter.group?.title)
        binding.itemClickerCount.setText(counter.value.toString())
        counter.group?.color?.let { binding.itemClickerIcon.drawable.setTint(it) }
    }

}