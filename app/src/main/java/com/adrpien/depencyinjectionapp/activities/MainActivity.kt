 package com.adrpien.depencyinjectionapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.adrpien.depencyinjectionapp.R
import com.adrpien.depencyinjectionapp.human.DaggerHumanComponent
import com.adrpien.depencyinjectionapp.human.Human
import javax.inject.Inject

 /*
 How to:

 1. Create classes and their subclasses tree and add annotations
 2. Create component interface (HumanComponent):
    - create inject function
 3.
  */

 class MainActivity : AppCompatActivity() {

     @Inject
     lateinit var human: Human

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerHumanComponent.create()
        component.inject(this)

        human.isAlive()
    }
}