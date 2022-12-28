package com.example.spinner_7_dey

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class SpinnerAdapter(context: Context, list: List<String>) :
    ArrayAdapter<String>(context, 0, list) {
    private var layoutInflater = LayoutInflater.from(context)

    @SuppressLint("ViewHolder", "InflateParams")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        return layoutInflater.inflate(R.layout.spinner_background_item, null, true)
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
        var cv = convertView
        if (cv == null)
            cv = layoutInflater.inflate(R.layout.menu_spinner_item, parent, false)
        return view(cv!!, position)
    }

    private fun view(view: View, position: Int): View {
        val title: String = getItem(position) ?: return view
        val titleTextView = view.findViewById<TextView>(R.id.tv_title_spinnerAdapter)
        titleTextView.text = title
        return view
    }
}