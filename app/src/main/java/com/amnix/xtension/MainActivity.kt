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
        L.d(UUID.randomUUID().toString().append(UUID.randomUUID().toString()))
        L.e(UUID.randomUUID().toString())
        L.d("A Very Long String Is Here, Dolore qui esse aliquip pariatur adipisicing dolore qui ea laborum ut in labore ex esse. Non labore esse minim ut minim ullamco nulla sint excepteur incididunt adipisicing exercitation veniam.")
        L.json("{ \"glossary\": { \"title\": \"example glossary\", \"GlossDiv\" { \"title\": \"S\", \"GlossList\": { \"GlossEntry\": { \"ID\": \"SGML\", \"SortAs\": \"SGML\", \"GlossTerm\": \"Standard Generalized Markup Language\", \"Acronym\": \"SGML\", \"Abbrev\": \"ISO 8879:1986\", \"GlossDef\": { \"para\": \"A meta-markup language, used to create markup languages such as DocBook.\", \"GlossSeeAlso\": [\"GML\", \"XML\"] }, \"GlossSee\": \"markup\" } } } } }")
    }
}
