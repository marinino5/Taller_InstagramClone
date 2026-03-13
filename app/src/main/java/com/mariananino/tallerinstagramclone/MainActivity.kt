package com.mariananino.tallerinstagramclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.mariananino.tallerinstagramclone.ui.screens.FeedScreen
import com.mariananino.tallerinstagramclone.ui.theme.TallerInstagramCloneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TallerInstagramCloneTheme {
                FeedScreen()
            }
        }
    }
}