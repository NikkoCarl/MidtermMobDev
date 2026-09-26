package com.example.midtermmobdev

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DriverProfileScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF181818))
            .padding(16.dp)
    ) {

        Text(
            text = " <- Driver profile",
            color = Color.White,
            fontSize = 24.sp
        )

        Spacer(modifier = Modifier.height(30.dp))

        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Box(
                modifier = Modifier
                    .size(90.dp)
                    .clip(CircleShape)
                    .background(Color(0xFF003366)),
                contentAlignment = Alignment.Center
            ) {

                Text(
                    text = "Jr",
                    color = Color(0xFF4C9AFF),
                    fontSize = 50.sp
                )
            }

            Spacer(modifier = Modifier.height(15.dp))

            Text(
                text = "Jomari Reyes",
                color = Color.White,
                fontSize = 23.sp
            )

            Text(
                text = "Truck driver * Fleet 3",
                color = Color.LightGray
            )

            Spacer(modifier = Modifier.height(25.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {

                ProfileStat("142", "deliveries")
                ProfileStat("4.9", "rating")
                ProfileStat("3 yrs", "tenure")
            }
        }

        Spacer(modifier = Modifier.height(30.dp))

        ProfileInfo("\uD83D\uDCDE Contact", "+63 917 000 1234")
        ProfileInfo("\uD83E\uDEAA License", "Prof. Level 2")
        ProfileInfo("\uD83C\uDFE0 Base", "Angeles City")
    }
}

@Composable
fun ProfileStat(
    number: String,
    label: String
) {

    Card(
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFF101010)
        )
    ) {

        Column(
            modifier = Modifier.padding(15.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = number,
                color = Color.White,
                fontSize = 20.sp
            )

            Text(
                text = label,
                color = Color.LightGray
            )
        }
    }
}

@Composable
fun ProfileInfo(
    title: String,
    value: String
) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 15.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {

        Text(
            text = title,
            color = Color.White
        )

        Text(
            text = value,
            color = Color.LightGray
        )
    }
}