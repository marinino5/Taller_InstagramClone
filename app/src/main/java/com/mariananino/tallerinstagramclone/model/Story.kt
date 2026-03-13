package com.mariananino.tallerinstagramclone.model

data class Story(
    val id: Int,
    val username: String,
    val profileImageUrl: String,
    val isSeen: Boolean = false
)