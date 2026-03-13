package com.mariananino.tallerinstagramclone.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.mariananino.tallerinstagramclone.data.DataSource
import com.mariananino.tallerinstagramclone.ui.components.PostCard
import com.mariananino.tallerinstagramclone.ui.components.StoriesRow

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FeedScreen() {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text("Instagram") }
            )
        }
    ) { paddingValues ->

        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = paddingValues
        ) {
            item {
                StoriesRow(stories = DataSource.stories)
            }

            items(DataSource.posts) { post ->
                PostCard(post = post)
            }
        }
    }
}