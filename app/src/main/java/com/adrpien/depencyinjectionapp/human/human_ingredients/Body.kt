package com.adrpien.depencyinjectionapp.human.human_ingredients

import com.adrpien.depencyinjectionapp.human.human_ingredients.body_ingredients.Muscles
import com.adrpien.depencyinjectionapp.human.human_ingredients.body_ingredients.Nerves
import com.adrpien.depencyinjectionapp.human.human_ingredients.body_ingredients.Skeleton
import javax.inject.Inject

class Body @Inject constructor (
    private val skeleton: Skeleton,
    private val muscles: Muscles,
    private val nerves: Nerves
) {

}
