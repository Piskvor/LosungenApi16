package de.reiss.android.losungen.main.viewpager

import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import de.reiss.android.losungen.App
import de.reiss.android.losungen.DaysPositionUtil
import de.reiss.android.losungen.main.content.LosungFragmentNoCards
import de.reiss.android.losungen.main.content.LosungFragmentWithCards
import de.reiss.android.losungen.preferences.AppPreferences

open class ViewPagerAdapter(fragmentManager: FragmentManager)
    : FragmentStatePagerAdapter(fragmentManager) {

    private val appPreferences: AppPreferences by lazy {
        App.component.appPreferences
    }

    override fun getCount() = DaysPositionUtil.DAYS_OF_TIME

    override fun getItem(position: Int) =
            if (appPreferences.showCards()) {
                if (appPreferences.showCards()) {
                    LosungFragmentWithCards.createInstance(position)
                } else {
                    LosungFragmentWithCards.createInstance(position)
                }
            } else {
                LosungFragmentNoCards.createInstance(position)
            }

}
