package ru.thever4.lessons.lesson4_2

import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ru.thever4.lessons.lesson4_2.databinding.FragmentDayOfWeekBinding

class DayOfWeekFragment : Fragment() {

    private var binding: FragmentDayOfWeekBinding? = null
    private var adapter: DaysOfWeekAdapter = DaysOfWeekAdapter()

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding?.dayOfWeekRecyclerView) {
            this ?: return
            layoutManager = LinearLayoutManager(requireContext())
            adapter = this@DayOfWeekFragment.adapter
            addItemDecoration(createItemDecorator())
        }

        adapter.submitList(ScheduleDataStorage.scheduleFirstWeek)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDayOfWeekBinding.inflate(inflater, container, false)
        return binding?.root
    }

    private fun createItemDecorator() =
        DividerItemDecoration(requireContext(), RecyclerView.VERTICAL).apply {
            ContextCompat.getDrawable(requireContext(), R.drawable.chat_item_decorator)
                ?.let { this@apply.setDrawable(it) }
        }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            DayOfWeekFragment()
    }
}