package com.example.tasktrack

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TaskAdapter(private val tasks: List<Task>) :
    RecyclerView.Adapter<TaskAdapter.TaskViewHolder>() {

    class TaskViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val cbDone: CheckBox = itemView.findViewById(R.id.cbDone)
        val tvTitle: TextView = itemView.findViewById(R.id.tvTaskTitle)
        val tvCourse: TextView = itemView.findViewById(R.id.tvTaskCourse)
        val tvPriority: TextView = itemView.findViewById(R.id.tvTaskPriority)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_task_today, parent, false)
        return TaskViewHolder(view)
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        val task = tasks[position]
        holder.tvTitle.text = task.title
        holder.tvCourse.text = task.course
        holder.tvPriority.text = task.priority
        holder.cbDone.isChecked = false
    }

    override fun getItemCount(): Int = tasks.size
}
