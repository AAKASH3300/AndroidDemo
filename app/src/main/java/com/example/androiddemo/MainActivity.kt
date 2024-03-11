package com.example.androiddemo

import android.icu.text.Transliterator.Position
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator


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

//        viewPager.orientation = ViewPager2.ORIENTATION_VERTICAL //--> To swipe vertically

//        viewPager.beginFakeDrag()  //--> To swipe or drag contents automatically
//        viewPager.fakeDragBy(-10f)
//        viewPager.endFakeDrag()

        //..............................Tab Layout..............................
        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)
        TabLayoutMediator(tabLayout, viewPager) { tab,position ->
            tab.text = "Tab ${position + 1}"
        }.attach() //connect tablayout with viewpager

        tabLayout.addOnTabSelectedListener(object: TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                Toast.makeText(this@MainActivity,"Selected ${tab?.text}",Toast.LENGTH_SHORT).show()
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                Toast.makeText(this@MainActivity,"UnSelected ${tab?.text}",Toast.LENGTH_SHORT).show()

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
                Toast.makeText(this@MainActivity,"Reselected ${tab?.text}",Toast.LENGTH_SHORT).show()

            }
        })

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