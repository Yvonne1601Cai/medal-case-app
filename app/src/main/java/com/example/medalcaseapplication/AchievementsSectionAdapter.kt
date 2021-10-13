package com.example.medalcaseapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.medalcaseapplication.databinding.AchievementSectionItemBinding


class AchievementsSectionAdapter(private val dataSet: Array<AchievementsSection>) :
    RecyclerView.Adapter<AchievementsSectionAdapter.ViewHolder>() {


    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */

    class ViewHolder(val binding: AchievementSectionItemBinding) : RecyclerView.ViewHolder(binding.root) {
        private val viewPool = RecyclerView.RecycledViewPool()
        fun bind(achievementsSection: AchievementsSection){
            binding.achievementSection = achievementsSection
            binding.achievementItemRecyclerview.setRecycledViewPool(viewPool)
            binding.achievementItemRecyclerview.adapter = AchievementListAdapter(achievementsSection.achievements)
            val achievedNum = getNumOfAchievedRecord(achievementsSection.achievements)
            val numOfAchievements = achievementsSection.achievements.size
            if(achievedNum < numOfAchievements){
                binding.achievementSectionHeaderProgress.text = "$achievedNum of $numOfAchievements"
            }
            binding.executePendingBindings()
        }

        fun getNumOfAchievedRecord(achievements: Array<Achievement>): Int{
            var achieved = 0
            for (achievement in achievements) {
                if(achievement.isAchieved){
                    achieved++
                }
            }
            return achieved
        }
    }

    // Create new views (invoked by the layout manager)

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val binding = AchievementSectionItemBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)
        return ViewHolder(binding)
    }

    // Replace the contents of a view (invoked by the layout manager)

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) = viewHolder.bind(dataSet[position])
    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = dataSet.size



}
