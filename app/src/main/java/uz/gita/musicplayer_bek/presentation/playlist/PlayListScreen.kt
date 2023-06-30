package uz.gita.musicplayer_bek.presentation.playlist

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import uz.gita.musicplayer_bek.navigation.AppScreen
import uz.gita.musicplayer_bek.ui.theme.MusicPlayerTheme

class PlayListScreen: AppScreen() {
    @Composable
    override fun Content() {
        MusicPlayerTheme {
            Surface(modifier = Modifier.fillMaxSize()) {
                PlayListScreenContent()
            }
        }
    }
}

@Composable
fun PlayListScreenContent(){

}