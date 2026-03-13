package com.mariananino.tallerinstagramclone.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.Send
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.outlined.BookmarkAdd
import androidx.compose.material.icons.outlined.ChatBubble
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.mariananino.tallerinstagramclone.model.Post

@Composable
fun PostCard(post: Post) {
    var liked by remember { mutableStateOf(post.isLiked) }

    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            AsyncImage(
                model = post.profileImageUrl,
                contentDescription = "Foto de perfil",
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
            )

            Spacer(modifier = Modifier.width(8.dp))

            Text(
                text = post.username,
                fontWeight = FontWeight.Bold
            )
        }

        AsyncImage(
            model = post.imageUrl,
            contentDescription = "Imagen del post",
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(1f),
            contentScale = ContentScale.Crop
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 4.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row {
                IconButton(onClick = { liked = !liked }) {
                    Icon(
                        imageVector = if (liked) {
                            Icons.Filled.Favorite
                        } else {
                            Icons.Outlined.FavoriteBorder
                        },
                        contentDescription = "Like"
                    )
                }

                IconButton(onClick = { }) {
                    Icon(
                        imageVector = Icons.Outlined.ChatBubble,
                        contentDescription = "Comentario"
                    )
                }

                IconButton(onClick = { }) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Outlined.Send,
                        contentDescription = "Enviar"
                    )
                }
            }

            IconButton(onClick = { }) {
                Icon(
                    imageVector = Icons.Outlined.BookmarkAdd,
                    contentDescription = "Guardar"
                )
            }
        }

        Text(
            text = "${post.likes} Me gusta",
            modifier = Modifier.padding(horizontal = 12.dp),
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "${post.username} ${post.caption}",
            modifier = Modifier.padding(horizontal = 12.dp, vertical = 4.dp)
        )

        HorizontalDivider(
            modifier = Modifier.padding(top = 8.dp)
        )
    }
}