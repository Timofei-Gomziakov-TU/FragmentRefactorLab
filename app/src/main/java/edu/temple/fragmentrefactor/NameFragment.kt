package edu.temple.fragmentrefactor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

class NameFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.name_fragment, container, false).apply {
            findViewById<Button>(R.id.changeButton).setOnClickListener {
                val name = findViewById<TextView>(R.id.nameEditText).text
                findViewById<TextView>(R.id.displayTextView).text = if (name.isNotBlank()) {
                "Hello, $name!"
            } else {
                "Please enter your name"
            }

            }
    }
    }
}