package com.example.mobile_pt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mobile_pt.planner.PlannerActivity
import kotlinx.android.synthetic.main.activity_chat.*
import org.jetbrains.anko.startActivity

class ChatActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)

        BottomList_Diet_c.setOnClickListener{
            startActivity<FoodActivity>()
        }
        BottomList_Planner_c.setOnClickListener{
            startActivity<PlannerActivity>()
        }
        BottomList_Member_c.setOnClickListener{
            startActivity<TrainerListActivity>()
        }
    }
}