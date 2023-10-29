package ru.thever4.lessons.lesson4_2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.thever4.lessons.lesson4_2.databinding.SheduleItemLayoutBinding

class DaysAdapter : RecyclerView.Adapter<DaysAdapter.ChatViewHolder>() {

    private val list: MutableList<Day> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = SheduleItemLayoutBinding.inflate(inflater, parent, false)
        return ChatViewHolder(binding)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ChatViewHolder, position: Int) {
        holder.bind(list[position])
    }

    fun submitList(list: List<Day>) {
        this.list.clear()
        this.list.addAll(list)
        notifyDataSetChanged() // Уведомляем адаптер о изменении данных
    }

    class ChatViewHolder(private val binding: SheduleItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Day) {
            with(binding) {
                dayOfWeek.text = item.ofWeek.toString()
                // startsWith.text = item.startsWith.toString()
                // Отобразите данные для уроков (lessons), если это необходимо
                 lessonName.text = item.lessons[0].name
                 lecturerName.text = item.lessons[0].lecturer
                 cabinetNumber.text = item.lessons[0].cabinet
            }
        }
    }
}
