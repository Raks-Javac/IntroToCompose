package com.example.introtocompose

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier


// a simple composable function to display age
@Composable
fun ShowAge(

    age: Int = 12){

    Text(text = age.toString())
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Box(
        contentAlignment = Alignment.Center
    ) {

        Column {

            Text(
                text = "Hello $name!",
                modifier = modifier
            )
            ShowAge(

                32)


        }
    }
}
