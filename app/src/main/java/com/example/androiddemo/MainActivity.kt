package com.example.androiddemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //..............................Swipable Views......................................

        val viewPager = findViewById<ViewPager2>(R.id.viewPager)

        val images = listOf(
            R.drawable.bob,
            R.drawable.patrick,
            R.drawable.micky,
            R.drawable.sponge,
        )

        val adapter : ViewPagerAdapter = ViewPagerAdapter(images)
        viewPager.adapter = adapter

        //viewPager.orientation = ViewPager2.ORIENTATION_VERTICAL //--> To swipe vertically


        //..............................Bottom Navigation Menu..............................
//        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
//
//        val firstFragment = FirstFragment()
//        val secondFragment = SecondFragment()
//        val thirdFragment = ThirdFragment()
//
//        setCurrentFragment(firstFragment)
//
//        bottomNavigationView.setOnNavigationItemReselectedListener {
//            when (it.itemId) {
//                R.id.myHome -> setCurrentFragment(firstFragment)
//                R.id.myMessage -> setCurrentFragment(secondFragment)
//                R.id.myProfile -> setCurrentFragment(thirdFragment)
//            }
//        }
//
//        bottomNavigationView.getOrCreateBadge(R.id.myMessage).apply {
//            number = 10
//            isVisible = true
//        }
//    }
//
//    private fun setCurrentFragment(fragment: Fragment) =
//        supportFragmentManager.beginTransaction().apply {
//            replace(R.id.flFragment, fragment)
//            commit()
//        }

        //...............................Fragments..............................
//        val btnFragment1 = findViewById<Button>(R.id.btnFragment1)
//        val btnFragment2 = findViewById<Button>(R.id.btnFragment2)
//
//        supportFragmentManager.beginTransaction().apply {
//            replace(R.id.flFragment,firstFragment)
//            commit()
//        }
//
//        btnFragment1.setOnClickListener{
//            supportFragmentManager.beginTransaction().apply {
//                replace(R.id.flFragment,firstFragment)
//                addToBackStack(null)
//                commit()
//            }
//        }
//        btnFragment2.setOnClickListener{
//            supportFragmentManager.beginTransaction().apply {
//                replace(R.id.flFragment,secondFragment)
//                addToBackStack(null)
//                commit()
//            }
//        }

    }
}