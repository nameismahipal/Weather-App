package com.androidcitizen.www.weatherapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.androidcitizen.www.weatherapp.databinding.FragmentFutureWeatherListBinding

class FutureWeatherFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val binding = DataBindingUtil.inflate<FragmentFutureWeatherListBinding>(inflater,
                    R.layout.fragment_future_weather_list,
                    container, false)

        return binding.root
    }

}
