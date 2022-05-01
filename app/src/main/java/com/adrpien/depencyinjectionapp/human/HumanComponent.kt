package com.adrpien.depencyinjectionapp.human

import com.adrpien.depencyinjectionapp.activities.MainActivity
import com.adrpien.depencyinjectionapp.human.human_ingredients.body_ingredients.NervesModule
import dagger.Component

@Component(modules = [NervesModule::class])
interface HumanComponent {

    fun inject(activity: MainActivity){
    }

}