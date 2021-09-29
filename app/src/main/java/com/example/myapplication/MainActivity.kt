package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Jeon = Person("BIGJEON1", 25)

        with(Jeon){
            println(Name)
        }
        /*val Programmer = Jeon.let {
            it.Name = "Me"
            it.Age = 5
            it
        }*/


        val Change = Jeon.apply {
            this.Name = "Jeon"
            this.Age = 26
        }
        val AgeUp = Change.run {
            ++Age
        }

        val Check = Jeon.also {
            it.Age = 12
            it.Name = "Check"
        }

        val RunCheck = kotlin.run {
            val Name = "Run"
            val Age = 12
            Person(Name, Age)
        }
        //println("${Programmer}")
    }
}