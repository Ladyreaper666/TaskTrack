package com.example.tasktrack

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var taskRecyclerView: RecyclerView
    private lateinit var focusTitleText: TextView
    private lateinit var focusCourseText: TextView
    private lateinit var focusDueText: TextView
    private lateinit var headerDateText: TextView
    private lateinit var headerSummaryText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Header views
        headerDateText = findViewById(R.id.tvDate)
        headerSummaryText = findViewById(R.id.tvSummary)

        // Focus card views
        focusTitleText = findViewById(R.id.tvFocusTitle)
        focusCourseText = findViewById(R.id.tvFocusCourse)
        focusDueText = findViewById(R.id.tvFocusDue)

        // RecyclerView
        taskRecyclerView = findViewById(R.id.rvTodayTasks)

        // FAB
        val fabAdd: FloatingActionButton = findViewById(R.id.fabAddTask)

        // Set header date
        val today = LocalDate.now()
        val formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy")
        headerDateText.text = today.format(formatter)

        // Dummy data
        val tasks = listOf(
            Task("Read Chapter 3", "ENG 201", "Tonight 11:59 PM", "High"),
            Task("Lab Report Draft", "BIO 101", "Tomorrow 5:00 PM", "Medium"),
            Task("Quiz Review", "CS 110", "Friday 2:00 PM", "Low")
        )

        // Summary text
        headerSummaryText.text = "You have ${tasks.size} tasks today"

        // Set focus task (first one for now)
        val focusTask = tasks.first()
        focusTitleText.text = focusTask.title
        focusCourseText.text = focusTask.course
        focusDueText.text = focusTask.dueTime

        // RecyclerView setup
        taskRecyclerView.layoutManager = LinearLayoutManager(this)
        taskRecyclerView.adapter = TaskAdapter(tasks)

        // FAB click
        fabAdd.setOnClickListener {
            Snackbar.make(it, "Add Task clicked (Week 3: open AddTaskActivity)", Snackbar.LENGTH_SHORT).show()
        }

        // Bottom nav clicks (placeholder)
        findViewById<TextView>(R.id.navHome).setOnClickListener {
            Snackbar.make(it, "Home tapped", Snackbar.LENGTH_SHORT).show()
        }
        findViewById<TextView>(R.id.navCourses).setOnClickListener {
            Snackbar.make(it, "Courses tapped (future screen)", Snackbar.LENGTH_SHORT).show()
        }
        findViewById<TextView>(R.id.navSettings).setOnClickListener {
            Snackbar.make(it, "Settings tapped (future screen)", Snackbar.LENGTH_SHORT).show()
        }
    }
}
