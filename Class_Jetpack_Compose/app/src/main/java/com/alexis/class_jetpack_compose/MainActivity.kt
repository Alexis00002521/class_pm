package com.alexis.class_jetpack_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.alexis.class_jetpack_compose.ui.theme.Class_Jetpack_ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
         Mymessage("PED")

        }
    }
}

@Composable
fun MyComponet(){

    MyList()

}

@Composable
fun MyList(){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)
            

    ){
        Mymessage(msg = "PDM S01")
        Mymessage(msg = "MIAU")
        Mymessage(msg = "Viaje en el timepo")
    }

}

@Composable
fun Mymessage(msg:String){
    Text(
        modifier = Modifier
            .padding(15.dp)
            .border(2.dp, Color.Green,shape = CircleShape)
            .background(Color.DarkGray),
        text = msg.repeat(10),
        fontSize = 16.sp,
        color = Color.Green,
        fontWeight = FontWeight.Bold,
        maxLines = 2,
        overflow = TextOverflow.Ellipsis
    )
}


@Preview(showBackground = true)
@Composable
fun MymessagePreview(){
        MyComponet()
}