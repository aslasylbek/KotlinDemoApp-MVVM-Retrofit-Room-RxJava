package kz.uib.uiconstraintlayout

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.OrientationEventListener
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_view.view.*

class CustomAdapter() :
    RecyclerView.Adapter<CustomAdapter.MyViewHolder>() {

    var listOfItem: MutableList<Person> = mutableListOf()

    var onClickListener: OnItemClickListener? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)
        Log.d("OnCreate" , "asd")
        return MyViewHolder(view)

    }

    override fun getItemCount(): Int {
        return listOfItem.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val person = listOfItem.get(position)
        Log.d("OnBind" , "asd")


        with(holder) {
            tvDate.text = person.name
            tvTitle.text = person.name
            tvSub.text = person.status
            tvIView.setImageResource(R.mipmap.ic_launcher)
            tvIView.setOnClickListener {
                onClickListener?.onImageClick(123123)
            }
            itemView.setOnLongClickListener {
                onClickListener?.onItemmLongClickListener(person.name)
                return@setOnLongClickListener  true
            }
            itemView.setOnClickListener {
                onClickListener?.onItemClick(person)
            }
        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvTitle: TextView = view.tvTitle
        val tvSub: TextView = view.tvSubTitle
        val tvDate: TextView = view.tvDate
        val tvIView: ImageView = view.imageView
    }

    interface OnItemClickListener{
        fun onItemClick(person: Person)
        fun onItemmLongClickListener(name:String)
        fun onImageClick(image: Int)
    }
}