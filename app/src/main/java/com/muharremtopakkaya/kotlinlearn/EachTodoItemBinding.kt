package com.muharremtopakkaya.kotlinlearn

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class EachTodoItemBinding private constructor(private val view: View) {
    val root: View get() = view

    val todoTask: TextView = view.findViewById(R.id.todoEt)
    val editTask: ImageView = view.findViewById(R.id.todoNextBtn)
    val deleteTask: ImageView = view.findViewById(R.id.todoClose)

    companion object {
        fun inflate(

            from: LayoutInflater,
            parent: ViewGroup?,
            attachToParent: Boolean
        ): EachTodoItemBinding {
            val view = from.inflate(R.layout.each_todo_item, parent, attachToParent)
            return EachTodoItemBinding(view)
        }
    }
}
