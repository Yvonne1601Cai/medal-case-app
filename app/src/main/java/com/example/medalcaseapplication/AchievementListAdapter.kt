package com.example.medalcaseapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.medalcaseapplication.databinding.AchievementItemBinding

class AchievementListAdapter(private val dataSet: Array<Achievement>) :
    RecyclerView.Adapter<AchievementListAdapter.ViewHolder>() {

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    class ViewHolder(val binding: AchievementItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(achievement: Achievement){
            binding.achievement = achievement
            binding.executePendingBindings()
        }
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val binding = AchievementItemBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)
        return ViewHolder(binding)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) = viewHolder.bind(dataSet[position])

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = dataSet.size

}
