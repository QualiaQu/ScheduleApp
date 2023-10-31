package ru.thever4.lessons.lesson4_2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.thever4.lessons.lesson4_2.databinding.DayOfWeekItemLayoutBinding

class DaysOfWeekAdapter : RecyclerView.Adapter<DaysOfWeekAdapter.ScheduleViewHolder>() {

    private val list: MutableList<Day> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ScheduleViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = DayOfWeekItemLayoutBinding.inflate(inflater, parent, false)
        return ScheduleViewHolder(binding)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ScheduleViewHolder, position: Int) {
        holder.bind(list[position])
    }

    fun submitList(list: List<Day>) {
        this.list.clear()
        this.list.addAll(list)
        notifyDataSetChanged() // Уведомляем адаптер о изменении данных
    }

    class ScheduleViewHolder(private val binding: DayOfWeekItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Day) {
            with(binding) {
                dayOfWeek.text = item.ofWeek.toString()
            }
        }
    }
}
