package Layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Columnas(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .padding(vertical = 36.dp, horizontal = 8.dp)
            .background(color = androidx.compose.ui.graphics.Color.Yellow)
            .fillMaxSize()
    ) {
        Text(
            text = "Computacion Movil PAO 6",
            modifier = Modifier.padding(vertical = 50.dp, horizontal = 16.dp)
        )
        Text(
            text = "Integrantes:",
            modifier = Modifier.padding(vertical = 50.dp, horizontal = 16.dp)
        )
        Text(
            text = "Nhaily Barahona",
            modifier = Modifier.padding(vertical = 50.dp, horizontal = 16.dp)
        )
        Text(
            text = "Eilyn Barragan",
            modifier = Modifier.padding(vertical = 50.dp, horizontal = 16.dp)
        )
        Text(
            text = "Andres Viera",
            modifier = Modifier.padding(vertical = 50.dp, horizontal = 16.dp)
        )
    }

}