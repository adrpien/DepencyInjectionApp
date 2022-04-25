package com.adrpien.depencyinjectionapp.human

import android.util.Log
import com.adrpien.depencyinjectionapp.human.human_ingredients.Body
import com.adrpien.depencyinjectionapp.human.human_ingredients.Brain
import com.adrpien.depencyinjectionapp.human.human_ingredients.Heart
import javax.inject.Inject

class Human @Inject constructor(
    private val heart: Heart?,
    private val brain: Brain?,
    private val body: Body?) {


    fun isAlive(){
        if(heart != null && brain != null && body != null){
            Log.d("Tag", "Dagger mówił prawdę")
        } else {
            Log.d("Tag", "Dagger nas okłamał")
        }
    }
}