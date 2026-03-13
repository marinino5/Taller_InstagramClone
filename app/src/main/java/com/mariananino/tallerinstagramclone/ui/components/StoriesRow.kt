package com.mariananino.tallerinstagramclone.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.mariananino.tallerinstagramclone.model.Story

@Composable
fun StoriesRow(stories: List<Story>) {
    LazyRow(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        contentPadding = PaddingValues(horizontal = 12.dp, vertical = 8.dp)
    ) {
        items(stories) { story ->
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                OutlinedCard(
                    shape = CircleShape,
                    border = BorderStroke(
                        width = 2.dp,
                        color = if (story.isSeen) Color.Gray else Color.Magenta
                    )
                ) {
                    AsyncImage(
                        model = story.profileImageUrl,
                        contentDescription = "Story de ${story.username}",
                        modifier = Modifier
                            .size(70.dp)
                            .clip(CircleShape)
                    )
                }

                Spacer(modifier = Modifier.height(4.dp))

                Text(text = story.username)
            }
        }
    }
}