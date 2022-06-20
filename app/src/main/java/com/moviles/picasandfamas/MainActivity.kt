package com.moviles.picasandfamas

import android.os.Bundle
import android.view.Window
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.compose.PicasAndFamasTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            PicasAndFamasTheme {
                val systemUiController = rememberSystemUiController()
                systemUiController.setSystemBarsColor(
                    MaterialTheme.colorScheme.background
                )

                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = Destination.START.name){

                        composable(Destination.START.name){
                            StartScreen()
                        }
                        composable(Destination.GAME.name){
                            TODO("NOT IMPLEMENTED YET")
                        }
                        composable(Destination.ENTERINFORMATION.name){
                            TODO("NOT IMPLEMENTED YET")
                        }
                    }
                }
            }
        }
    }
}
