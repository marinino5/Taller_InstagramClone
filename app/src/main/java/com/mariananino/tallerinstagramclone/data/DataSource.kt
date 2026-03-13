package com.mariananino.tallerinstagramclone.data

import com.mariananino.tallerinstagramclone.model.Post
import com.mariananino.tallerinstagramclone.model.Story

object DataSource {

    val stories = listOf(
        Story(
            id = 1,
            username = "maria",
            profileImageUrl = "https://picsum.photos/seed/story1/200/200",
            isSeen = false
        ),
        Story(
            id = 2,
            username = "juan",
            profileImageUrl = "https://picsum.photos/seed/story2/200/200",
            isSeen = true
        ),
        Story(
            id = 3,
            username = "sofia",
            profileImageUrl = "https://picsum.photos/seed/story3/200/200",
            isSeen = false
        ),
        Story(
            id = 4,
            username = "carlos",
            profileImageUrl = "https://picsum.photos/seed/story4/200/200",
            isSeen = true
        ),
        Story(
            id = 5,
            username = "laura",
            profileImageUrl = "https://picsum.photos/seed/story5/200/200",
            isSeen = false
        )
    )

    val posts = listOf(
        Post(
            id = 1,
            username = "maria",
            profileImageUrl = "https://picsum.photos/seed/profile1/200/200",
            imageUrl = "https://picsum.photos/seed/post1/800/800",
            likes = 120,
            caption = "Mi primer post en Compose",
            isLiked = false
        ),
        Post(
            id = 2,
            username = "juan",
            profileImageUrl = "https://picsum.photos/seed/profile2/200/200",
            imageUrl = "https://picsum.photos/seed/post2/800/800",
            likes = 340,
            caption = "Probando LazyColumn",
            isLiked = true
        ),
        Post(
            id = 3,
            username = "sofia",
            profileImageUrl = "https://picsum.photos/seed/profile3/200/200",
            imageUrl = "https://picsum.photos/seed/post3/800/800",
            likes = 560,
            caption = "Feed estilo Instagram",
            isLiked = false
        )
    )
}