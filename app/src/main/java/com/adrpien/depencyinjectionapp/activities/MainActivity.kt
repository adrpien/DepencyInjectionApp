 package com.adrpien.depencyinjectionapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.adrpien.depencyinjectionapp.R
import com.adrpien.depencyinjectionapp.human.DaggerHumanComponent
import com.adrpien.depencyinjectionapp.human.Human
import javax.inject.Inject

 /*
 How to:
 1. Create dependecies
 2. Apply plugin 'kotlin-kapt'
 3. Create classes and their subclasses tree and add annotations (@Inject) - wstrzykiwanie konstruktora
 4. Create lateinit var class you want to create by injection and add annotation
 5. Create component interface (HumanComponent)
    Interfejs, który bedzie zaimplementowany przez Daggera i użyty do wstrzyknięcia zależności.
    W momencie kompilacji, Dagger zaimplementuje ten interfejs,
    i staje się elementem odpowiedzialnym za wstrzykiwanie zależności.
    - Add @Component annotation
    - create inject function (activity must be an argument)
      funkcja musi przyjmować naszą aktywność jako argument, ponieważ to do niej będziemy wstrzykiwać.
      Możesz stworzyć kilka funkcji, o różnych parametrach (aktywnościach)
 6. Inject  using inject method

Co jeśli nie masz dostępu do klasy, jest ona w zewnętrznej bibliotece
i nie możesz jej oznaczyć @Inject?W takim przypadku należy:
 1. Utworz klase classNameModule i dodaj annotacje @Module
    - utwórz funkcję providesClassName i oznacz ją annotacją @Provides,
      funkcja musi zwracać obiekt className
      Ten moduł będzie odpowiedzialny za dostarczanie obiektu className,
      jesli dagger nie potrafiłby stworzyć className zwyczajnie.
      HumanComponent musi wiedzieć że ten moduł należy do niego, w celu w interfejsie HumanComponent
      należy oznaczyć wszystkie moduły, które mają być wykorzystywane dla tego komponentu.
Dagger nie wspiera wstrzykiwania w prywatne pola :)

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