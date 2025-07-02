package com.example.swasthasanchar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.swasthasanchar.pages.*
import com.example.swasthasanchar.ui.theme.SwasthaSancharTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SwasthaSancharTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = "sign_in"
                    ) {
                        composable("sign_in") { SignInPage(navController) }
                        composable("home") { HomePage(navController) }
                        composable("registration") { RegistrationPage(navController) }
                        composable("create") { CreatePage(navController) }
                        composable("profile") { ProfilePage(navController) }
                    }
                }
            }
        }
    }
}

