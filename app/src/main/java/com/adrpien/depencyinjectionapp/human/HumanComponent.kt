package com.adrpien.depencyinjectionapp.human

import com.adrpien.depencyinjectionapp.activities.MainActivity
import dagger.Component

@Component
interface HumanComponent {

    fun inject(activity: MainActivity){
    }

}