package com.enes.ph_tester

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.*
import org.apache.http.conn.ConnectTimeoutException
import java.io.File

class FileAdapter(context: Context,
                  private val files: List<File>,
                  private val onClick: (File) -> Unit)
    :RecyclerView.Adapter<FileAdapter.FileViewHolder>() {

    private val inflater = LayoutInflater.from(context)

    override fun OnCreateViewHolder(parent: ViewGroup, viewType: Init):
    FileViewHolder{

        val view = inflater.inflate(R.layout.activity_first_srcreen,parent,false)
        val viewHolder = FileViewHolder(view)

        view.setOnClickListener{
            onClick(files[viewHolder.adapterPosition])
        }
        return viewHolder
    }

    override fun getItemCount():Int = files.size

    override fun onBindViewHolder(holder: FileViewHolder,position: Int){
        holder.fileName.text = files[position].name
    }

    class FileViewHolder(view : View): RecyclerView.ViewHolder(view){
        val fileName = view.findViewById<TextView>(R.id.fileName)
    }


}