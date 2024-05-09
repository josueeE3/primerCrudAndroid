package RecyclerViewHelpers

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import josue.hernandez.crudjosue1a.R

class ViewHolder (view: View): RecyclerView.ViewHolder(view){

    val textView: TextView = view.findViewById(R.id.txtProductoDato)
}