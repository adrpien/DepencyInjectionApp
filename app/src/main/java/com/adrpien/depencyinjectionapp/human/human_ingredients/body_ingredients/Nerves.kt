package com.adrpien.depencyinjectionapp.human.human_ingredients.body_ingredients

import dagger.Module
import dagger.Provides
import javax.inject.Inject


class Nerves(){

}

@Module
class NervesModule {
    @Provides
    fun providesNerves(): Nerves{
        return Nerves()
    }
}
