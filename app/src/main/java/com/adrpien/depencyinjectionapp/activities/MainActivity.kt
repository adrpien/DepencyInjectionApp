 package com.adrpien.depencyinjectionapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.adrpien.depencyinjectionapp.R
import com.adrpien.depencyinjectionapp.human.DaggerHumanComponent
import com.adrpien.depencyinjectionapp.human.Human
import javax.inject.Inject

 /*
 How to:

 1. Add dependecies in build.gradle
 2. Create classes and their subclasses tree and add annotations
 3. Create component interface (HumanComponent):
    - create inject function
 4.
  */

 class MainActivity : AppCompatActivity() {

     @Inject
     lateinit var human: Human

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Using dependecies injection
        // DaggerHumanComponent will be unresolved until compilation
        val component = DaggerHumanComponent.create()
        component.inject(this)

        human.isAlive()
    }
}