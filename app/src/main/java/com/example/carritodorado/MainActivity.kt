package com.example.carritodorado

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    lateinit var navegation: BottomNavigationView
    private val mOnNavMenu = BottomNavigationView.OnNavigationItemSelectedListener {item ->

        when (item.itemId) {
            R.id.itemHome -> {
                supportFragmentManager.commit {
                    replace<HomeFragment>(R.id.fragmentContainer)
                    setReorderingAllowed(true)
                    addToBackStack("replacement")
                }
                return@OnNavigationItemSelectedListener true
            }

            R.id.itemSearch -> {
                supportFragmentManager.commit {
                    replace<SearchFragment>(R.id.fragmentContainer)
                    setReorderingAllowed(true)
                    addToBackStack("replacement")
                }
                return@OnNavigationItemSelectedListener true
            }


            R.id.itemCart -> {
                supportFragmentManager.commit {
                    replace<CartFragment>(R.id.fragmentContainer)
                    setReorderingAllowed(true)
                    addToBackStack("replacement")
                }
                return@OnNavigationItemSelectedListener true
            }

            R.id.itemAccount -> {
                supportFragmentManager.commit {
                    replace<AcountFragment>(R.id.fragmentContainer)
                    setReorderingAllowed(true)
                    addToBackStack("replacement")
                }
                return@OnNavigationItemSelectedListener true
            }

        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        navegation=findViewById(R.id.navMenu)
        navegation.setOnNavigationItemSelectedListener(mOnNavMenu)


        supportFragmentManager.commit {
            replace<HomeFragment>(R.id.fragmentContainer)
            setReorderingAllowed(true)
            addToBackStack("replacement")
        }
    }
}