package kz.uib.uiconstraintlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main_1.*
import kotlinx.android.synthetic.main.custom_toolbar.*

class MainActivity : AppCompatActivity() {


    private var muList: MutableList<Person> = mutableListOf()
    private lateinit var adapter: CustomAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_1)

        setSupportActionBar(toolbar)
        adapter = CustomAdapter()

        adapter.onClickListener = object: CustomAdapter.OnItemClickListener{
            override fun onItemClick(person: Person) {
                Log.d("asds", person.name)
            }

            override fun onImageClick(image: Int) {
                Log.d("asds", ""+image)
            }

            override fun onItemmLongClickListener(name: String) {
                Toast.makeText(applicationContext, "Added", Toast.LENGTH_LONG).show()
            }
        }




        recyclerView.adapter = adapter

        muList = initList()
        adapter.listOfItem = initList()




    }


    private fun initList():MutableList<Person>{
        val list = ArrayList<Person>()
        list.add(Person("Ali", "student"))
        list.add(Person("Akl", "student")) 
        list.add(Person("Ghh", "student"))
        list.add(Person("Student", "teacher"))
        list.add(Person("John", "student"))
        list.add(Person("Robert", "student"))
        list.add(Person("Robert2", "student"))
        list.add(Person("Robert3", "student"))
        list.add(Person("Robert4", "student"))

        return list
    }



    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)

        return super.onCreateOptionsMenu(menu)
    }


    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item?.itemId){
            R.id.settings -> {
                Toast.makeText(this, "Added", Toast.LENGTH_LONG).show()
                adapter.listOfItem.add(Person("Aseke", "boss"))
                adapter.notifyDataSetChanged()
                return true
            }
            R.id.settings1 ->{
                Toast.makeText(this, "Bye", Toast.LENGTH_LONG).show()
                return true
            }
            android.R.id.home ->{
                Toast.makeText(this, "onBackPressed()", Toast.LENGTH_LONG).show()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
