package com.example.viewpagerexam

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

private const val ARG_PARAM1 = "title"
private const val ARG_PARAM2 = "content"

/**
 * A simple [Fragment] subclass.
 * Use the [ScreenSlidePageFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ScreenSlidePageFragment : Fragment() {
    private var title: String? = null
    private var content: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            title = it.getString(ARG_PARAM1)
            content = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_screen_slide_page, container, false)
        rootView.findViewById<TextView>(R.id.textTitle).text = title
        rootView.findViewById<TextView>(R.id.textContent).text = content
        return rootView
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ScreenSlidePageFragment.
         */
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ScreenSlidePageFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}