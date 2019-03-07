package com.amnix.xtension

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.amnix.xtension.demo.R
import com.amnix.xtension.extensions.append
import com.amnix.xtension.logs.L
import java.util.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingPermission")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        L.d(listOf("One", "Two", "Three"))
        L.d(mapOf(1 to "One", 2 to "Two", 3 to "Three"))
        L.d(arrayOf("One", "Two", "Three"))
        L.d(setOf("One", "Two", "Three"))
        L.d(UUID.randomUUID().toString().append(UUID.randomUUID().toString()))
        L.e(UUID.randomUUID().toString())
        L.d("A Long String Is Here to Print to Log And Can Be Printed Easily")
        L.json("{ \"glossary\": { \"title\": \"example glossary\", \"GlossDiv\": { \"title\": \"S\", \"GlossList\": { \"GlossEntry\": { \"ID\": \"SGML\", \"SortAs\": \"SGML\", \"GlossTerm\": \"Standard Generalized Markup Language\", \"Acronym\": \"SGML\", \"Abbrev\": \"ISO 8879:1986\", \"GlossDef\": { \"para\": \"A meta-markup language, used to create markup languages such as DocBook.\", \"GlossSeeAlso\": [\"GML\", \"XML\"] }, \"GlossSee\": \"markup\" } } } } }")
    }
}
