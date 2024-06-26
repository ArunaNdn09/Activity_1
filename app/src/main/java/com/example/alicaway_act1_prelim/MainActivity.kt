package com.example.alicaway_act1_prelim

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.alicaway_act1_prelim.ui.theme.Alicaway_ACT1_PrelimTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Alicaway_ACT1_PrelimTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greetings()
                }
            }
        }
    }
}

@Composable
fun Greetings() {
    Column(
    ) {

            Image(
                painter = painterResource(id = R.drawable.flowers),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxSize(0.3f)
                    .padding(),


            )
            Text(
                text = "The Big Bloom—How Flowering Plants Changed the World",
                modifier = Modifier
                    .padding(start = 16.dp, end = 16.dp, top = 20.dp, bottom = 16.dp)
                    .fillMaxWidth(),
                fontSize = 20.sp
            )
            Text(
                text = "In the summer of 1973 sunflowers appeared in my father's vegetable garden. They seemed to sprout overnight in a few rows he had lent that year to new neighbors from California. Only six years old at the time, I was at first put off by these garish plants. Such strange and vibrant flowers seemed out of place among the respectable beans, peppers, spinach, and other vegetables we had always grown. Gradually, however, the brilliance of the sunflowers won me over. Their fiery halos relieved the green monotone that by late summer ruled the garden. I marveled at birds that clung upside down to the shaggy, gold disks, wings fluttering, looting the seeds. Sunflowers defined flowers for me that summer and changed my view of the world.",
                modifier = Modifier
                    .padding(start = 16.dp, end = 16.dp, top = 25.dp)
                    .fillMaxWidth(),
                textAlign = TextAlign.Justify
            )
        }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Alicaway_ACT1_PrelimTheme {
        Greetings()
    }
}
