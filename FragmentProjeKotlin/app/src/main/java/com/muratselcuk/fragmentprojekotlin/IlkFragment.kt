package com.muratselcuk.fragmentprojekotlin

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class IlkFragment : Fragment() {
      override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

          val viewGroup=inflater.inflate(R.layout.fragment_ilk,container,false)

        return viewGroup
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
    }


}
