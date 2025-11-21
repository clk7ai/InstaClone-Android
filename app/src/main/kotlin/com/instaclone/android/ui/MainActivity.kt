package com.instaclone.android.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.instaclone.android.ui.theme.InstaCloneTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InstaCloneTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen() {
    val selectedTab = remember { mutableStateOf(0) }
    
    Scaffold(
        bottomBar = {
            NavigationBar {
                NavigationBarItem(
                    selected = selectedTab.value == 0,
                    onClick = { selectedTab.value = 0 },
                    label = { Text("Feed") },
                    icon = { Text("🏠") }
                )
                NavigationBarItem(
                    selected = selectedTab.value == 1,
                    onClick = { selectedTab.value = 1 },
                    label = { Text("Explore") },
                    icon = { Text("🔍") }
                )
                NavigationBarItem(
                    selected = selectedTab.value == 2,
                    onClick = { selectedTab.value = 2 },
                    label = { Text("Post") },
                    icon = { Text("➕") }
                )
                NavigationBarItem(
                    selected = selectedTab.value == 3,
                    onClick = { selectedTab.value = 3 },
                    label = { Text("Messages") },
                    icon = { Text("💬") }
                )
                NavigationBarItem(
                    selected = selectedTab.value == 4,
                    onClick = { selectedTab.value = 4 },
                    label = { Text("Profile") },
                    icon = { Text("👤") }
                )
            }
        }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            contentAlignment = Alignment.Center
        ) {
            when (selectedTab.value) {
                0 -> FeedScreen()
                1 -> ExploreScreen()
                2 -> CreatePostScreen()
                3 -> MessagesScreen()
                4 -> ProfileScreen()
            }
        }
    }
}

@Composable
fun FeedScreen() {
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Feed - Your Instagram Feed")
    }
}

@Composable
fun ExploreScreen() {
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Explore - Discover new content")
    }
}

@Composable
fun CreatePostScreen() {
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Create - Share your moment")
    }
}

@Composable
fun MessagesScreen() {
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Messages - Your conversations")
    }
}

@Composable
fun ProfileScreen() {
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Profile - Your Profile")
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    InstaCloneTheme {
        MainScreen()
    }
}
