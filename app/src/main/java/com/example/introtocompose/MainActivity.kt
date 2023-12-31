package com.example.introtocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.introtocompose.ui.theme.IntroToComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IntroToComposeTheme {
                // A surface container using the 'background' color from the theme
MyApp()
            }
        }
    }
}

@Composable
fun MyApp(){
    Surface(
        //modifiers to modify widget properties
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth(),

        color = MaterialTheme.colorScheme.primary
    ) {

    }
}

// composable for the circle composable


@Preview(

    showBackground = true)
@Composable
fun GreetingPreview() {
    IntroToComposeTheme {

    }
}