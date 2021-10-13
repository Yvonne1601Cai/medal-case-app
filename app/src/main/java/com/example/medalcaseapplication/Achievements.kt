package com.example.medalcaseapplication

import android.content.res.Resources

fun personalRecords(resources: Resources):Array<Achievement>{
    return arrayOf(
        Achievement(
            id = 1,
            name = resources.getString(R.string.personal_record_1_name),
            image = R.drawable.longest_run,
            isAchieved = true,
            record = "00:00"
        ),
        Achievement(
            id = 2,
            name = resources.getString(R.string.personal_record_2_name),
            image = R.drawable.highest_elevation,
            isAchieved = true,
            record = "2095 ft"
        ),
        Achievement(
            id = 3,
            name = resources.getString(R.string.personal_record_3_name),
            image = R.drawable.fastest_5k,
            isAchieved = true,
            record = "00:00"
        ),
        Achievement(
            id = 4,
            name = resources.getString(R.string.personal_record_4_name),
            image = R.drawable.fastest_10k,
            isAchieved = true,
            record = "00:00:00"
        ),
        Achievement(
            id = 5,
            name = resources.getString(R.string.personal_record_5_name),
            image = R.drawable.fastest_half_marathon,
            isAchieved = true,
            record = "00:00"
        ),
        Achievement(
            id = 6,
            name = resources.getString(R.string.personal_record_6_name),
            image = R.drawable.fastest_marathon,
            isAchieved = false
        )
    )

}
fun virtualRaces(resources: Resources): Array<Achievement>{
    return arrayOf(
        Achievement(
            id = 7,
            name = resources.getString(R.string.virtual_races_1_name),
            image = R.drawable.virtual_half_marathon_race,
            isAchieved = true,
            record = "00:00"
        ),
        Achievement(
            id = 8,
            name = resources.getString(R.string.virtual_races_2_name),
            image = R.drawable.tokyo_kakone_ekiden,
            isAchieved = true,
            record = "00:00:00"
        ),
        Achievement(
            id = 9,
            name = resources.getString(R.string.virtual_races_3_name),
            image = R.drawable.virtual_10k_race,
            isAchieved = true,
            record = "00:00:00"
        ),
        Achievement(
            id = 10,
            name = resources.getString(R.string.virtual_races_4_name),
            image = R.drawable.hakone_ekiden,
            isAchieved = true,
            record = "00:00:00"
        ),
        Achievement(
            id = 11,
            name = resources.getString(R.string.virtual_races_5_name),
            image = R.drawable.mizuno_singapore_ekiden,
            isAchieved = true,
            record = "23:07"
        ),
        Achievement(
            id = 12,
            name = resources.getString(R.string.virtual_races_6_name),
            image = R.drawable.virtual_5k_race,
            isAchieved = true,
            record = "00:00:00"
        )
    )
}