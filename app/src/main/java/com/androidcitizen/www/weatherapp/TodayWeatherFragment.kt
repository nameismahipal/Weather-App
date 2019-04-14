package com.androidcitizen.www.weatherapp


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.androidcitizen.www.weatherapp.databinding.FragmentTodayWeatherBinding

class TodayWeatherFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val binding = DataBindingUtil.inflate<FragmentTodayWeatherBinding>(inflater,
                            R.layout.fragment_today_weather,
                            container, false)

        return binding.root
    }
}
