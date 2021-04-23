package com.moktar.expandablerecyclerview.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.moktar.expandablerecyclerview.listener.ExpandCollapseListener
import com.moktar.expandablerecyclerview.sample.adapter.CategoryAdapter
import com.moktar.expandablerecyclerview.sample.databinding.ActivityMainBinding
import com.moktar.expandablerecyclerview.sample.model.Category
import com.moktar.expandablerecyclerview.sample.model.CategoryList


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val adapter = CategoryAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
//        val view = binding.root
        setContentView(binding.root)
        val data = listOf(
            Category(
                "Almond Foods",
                listOf(
                    CategoryList(R.drawable.ic_ajoblanco, "Ajoblanco", "$200"),
                    CategoryList(R.drawable.ic_bethmaennchen, "Bethmaennchen", "$150"),
                    CategoryList(R.drawable.ic_calisson, "Calisson", "$300"),
                    CategoryList(R.drawable.ic_dacquoise, "Dacquoise", "$220"),
                    CategoryList(R.drawable.ic_friand, "Friand", "$210")
                )
            ),
            Category(
                "Bacon Dishes",
                listOf(
                    CategoryList(R.drawable.ic_angels_on_horseback, "Angels on Horseback", "$500"),
                    CategoryList(R.drawable.ic_baconbutty, "Baconbutty", "$130"),
                    CategoryList(R.drawable.ic_coddle, "Coddle", "$290"),
                    CategoryList(R.drawable.ic_hangtown_burger, "Hangtown Burger", "$235"),
                    CategoryList(R.drawable.ic_samgyeopsal_gui, "Samgyeopsal Gui", "$255")
                )
            ),
            Category(
                "Chickpea dishes",
                listOf(
                    CategoryList(R.drawable.ic_aquafaba, "Aquafaba", "$155"),
                    CategoryList(R.drawable.ic_hummus_from_the_nile, "Hummus From The Nile", "$188"),
                    CategoryList(R.drawable.ic_khaman, "Khaman", "$190"),
                    CategoryList(R.drawable.ic_msabbaha, "Msabbaha", "$360"),
                    CategoryList(R.drawable.ic_piatto_ciceri_e_tria, "Piatto Ciceri E Tria", "$368")
                )
            ),
            Category(
                "Eggplant Dishes",
                listOf(
                    CategoryList(R.drawable.ic_ajapsandali_georgian_eggplant_stew, "Ajapsandali Georgian Eggplant Stew", "$132"),
                    CategoryList(R.drawable.ic_bruschetta, "Bruschetta", "$144"),
                    CategoryList(R.drawable.ic_lasagne_stonesoup, "Lasagne Stonesoup", "$166"),
                    CategoryList(R.drawable.ic_malidjano_salata, "Malidjano Salata", "$422"),
                    CategoryList(R.drawable.ic_melanzane_alla_parmigiana, "Melanzane Alla Parmigiana", "$220")
                )
            ),
            Category(
                "Fruit Dishes",
                listOf(
                    CategoryList(R.drawable.ic_applecrisp, "Applecrisp", "$264"),
                    CategoryList(R.drawable.ic_bionico, "Bionico", "$215"),
                    CategoryList(R.drawable.ic_cherriesjubilee, "Cherriesjubilee", "$110"),
                    CategoryList(R.drawable.ic_es_campur, "Es Campur", "$700"),
                    CategoryList(R.drawable.ic_waldorf_salad, "Waldorf Salad", "$310")
                )
            ),
            Category(
                "Lamb Dishes",
                listOf(
                    CategoryList(R.drawable.ic_alinazik, "Alinazik", "$209"),
                    CategoryList(R.drawable.ic_chakapuli, "Chakapuli", "$280"),
                    CategoryList(R.drawable.ic_gheymeh, "Gheymeh", "$420"),
                    CategoryList(R.drawable.ic_hangikjot, "Hangikjot", "$330"),
                    CategoryList(R.drawable.ic_lamb_chops, "Lamb Chops", "$650")
                )
            )
        )


        binding.categoryListRv.setHasFixedSize(true)
        binding.categoryListRv.layoutManager = LinearLayoutManager(this)
        adapter.setExpandCollapseListener(object : ExpandCollapseListener {
            override fun onListItemExpanded(position: Int) {
            }

            override fun onListItemCollapsed(position: Int) {

            }

        })
        binding.categoryListRv.adapter = adapter
        adapter.setExpandableParentItemList(data)
    }
}